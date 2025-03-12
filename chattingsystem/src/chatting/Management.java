package chatting;

import java.util.ArrayList;


import DAO.chatDAO;

public class Management implements chat{
	
	private ArrayList<chatting> chatlist;
	private chatFilter filter;
	private chatDAO dao;
	private boolean isUserTurn = true;
	private static final int MAX_MESSAGES = 10; 

	
	public void printRecentMessages() {
	    ArrayList<chatting> recentChats = dao.getRecentMessages(5); // 최신 메시지 5개 불러오기

	    System.out.println("==== 최신 메시지 ====");
	    for (chatting chat : recentChats) {
	        System.out.println(chat.getSender() + " → " + chat.getReceiver() + " : " + chat.getMessage());
	    }
	}

	
	public Management (chatFilter filter) {
		this.chatlist = new ArrayList<>();
		this.filter = filter;	
	    this.dao = new chatDAO();
	}
	
	public Management () {
		chatlist= new ArrayList<>();
		
	}
	
	
	@Override
	public void sentMessage (String sender, String receiver, String msg) {
		if (filter.filter(msg)) {
            return;
        }
		
		int messageCount = dao.getMessageCount();
		
		 if (messageCount >= MAX_MESSAGES) {
		        System.out.println("DB에서 개수셈 삭제");
		        dao.deleteOldestMessage(); // DB에서 삭제
		    }
		
	   

        chatting newChat = new chatting(sender, receiver, msg);
        chatlist.add(newChat); // 채팅 리스트에 추가
        dao.saveData(newChat); // DB 저장
        
        System.out.println("\n==== 상담 채팅 내역 ====");
        printRecentMessages();

//        System.out.println(sender + " → " + receiver + " : " + msg);
	}
	
//	@Override
//	public void receiveMessage() {
//		System.out.println("받은 메세지" + sentMsg
//				);
//
//	}

}
