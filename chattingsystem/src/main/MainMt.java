package main;

import java.util.Scanner;

import chatting.Management;
import chatting.chatFilter;
import chatting.chatFilterAct;

public class MainMt {


	private static Scanner sc = new Scanner(System.in);
	
	private static int menu() {
		System.out.println("======수신인을 선택하세요======");
		System.out.println("1: 고객");
		System.out.println("2: 상담사");
		System.out.println("0: 종료");
		System.out.println("선택 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public static void main(String[] args) {
		chatFilter filter = new chatFilterAct();
		Management management = new Management(filter);
		
		
		 System.out.println("상담 채팅을 시작합니다. ('exit' 입력 시 종료)");
		 
//		 management.printRecentMessages();
		 
		 	while(true) {
		 		String sender, receiver;
		 		switch(menu()) {
		 		case 0 : // 종료
		 			System.out.println("채팅을 종료합니다.");
		 			System.out.println("===============================");
		 			break;
		 		
		 		case 1 : // 고객
		 			sender = "고객";
	                receiver = "상담사";
	                break;
		 		case 2 : // 상담사
		 			sender = "상담사";
	                receiver = "고객";
	                break;
		 		default :
		 			System.out.println("잘못 선택했습니다.");
		 		}
		 		
		 		while (true) {
		 			System.out.print(sender + " : ");
		 			
		 		}
		 		
		 		
		 	}

//	        while (true) {
//	            System.out.print("\n말할 사람 선택 (1: 사용자, 2: 상담사, 0: 종료) → ");
//	            int choice = sc.nextInt();
//	            sc.nextLine(); // 버퍼 비우기
//
//	            
//	            if (choice == 0) {
//	                System.out.println("채팅을 종료합니다.");
//	                break;
//	            }
//
//	            String sender, receiver;
//
//	            if (choice == 1) { // 사용자가 말할 차례
//	                sender = "User";
//	                receiver = "Counselor";
//	            } else if (choice == 2) { // 상담사가 말할 차례
//	                sender = "Counselor";
//	                receiver = "User";
//	            } else {
//	                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
//	                continue;
//	            }
//
//	            while (true) {
//	                System.out.print(sender + " : ");
//	                String message = sc.nextLine();
//
//	                if (message.equalsIgnoreCase("exit")) {
//	                    System.out.println("채팅을 종료합니다.");
//	                    return;
//	                }
//
//	                management.sentMessage(sender, receiver, message);
//
//	                System.out.print("1: 계속, 2: 대기 ");
//	                int more = sc.nextInt();
//	                sc.nextLine();
//	                if (more == 2) break;
//	            }
//	        }
	}

}
