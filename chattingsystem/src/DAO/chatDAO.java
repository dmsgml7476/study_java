package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import chatting.chatting;

public class chatDAO extends DBConnect {

	
	public ArrayList<chatting> getRecentMessages(int limit) {
	    ArrayList<chatting> chatList = new ArrayList<>();
	    String sql = "SELECT * FROM chatting_data ORDER BY id DESC LIMIT " + limit; // 최신순 정렬

	    try {
	        st = conn.createStatement();
	        rs = st.executeQuery(sql);

	        while (rs.next()) {
	            String sender = rs.getString("sender");
	            String receiver = rs.getString("receiver");
	            String message = rs.getString("message");
	            chatList.add(new chatting(sender, receiver, message));
	        }
	    } catch (SQLException e) {
	        System.out.println("최신 메시지 불러오기 실패");
	        e.printStackTrace();
	    }

	    return chatList;
	}
	
	
	public int getMessageCount() {
	    String sql = "SELECT COUNT(*) FROM chatting_data";
	    int count = 0;

	    try {
	        st = conn.createStatement();
	        rs = st.executeQuery(sql);
	        
	        if (rs.next()) {
	            count = rs.getInt(1);
	        }
	    } catch (SQLException e) {
	        System.out.println("메시지 개수 조회 실패");
	        e.printStackTrace();
	    }

	    return count;
	}

	public void saveData(chatting chat) {
		String sql = "insert into chatting_data (sender, receiver, message) values ('"+chat.getSender()+"', '"+chat.getReceiver()+"', '"+chat.getMessage()+"')";
		
		try {
			st = conn.createStatement()	;
			st.executeUpdate(sql);
			
		}catch(SQLException e) {
			System.out.println("저장실패");
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void deleteOldestMessage() {
		String sql = "DELETE FROM chatting_data ORDER BY id ASC LIMIT 1";

        try {
            st = conn.createStatement();
            int rowsAffected = st.executeUpdate(sql);
            
            if (rowsAffected > 0) {
                System.out.println("오래된 메시지 삭제 완료 (DB)");
            } else {
                System.out.println("삭제할 메시지가 없습니다.");
            }
        } catch (SQLException e) {
            System.out.println("삭제 실패");
            e.printStackTrace();
        }
    }
	


}


