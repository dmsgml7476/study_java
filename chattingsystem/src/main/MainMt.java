package main;

import java.util.Scanner;
import chatting.Management;
import chatting.chatFilter;
import chatting.chatFilterAct;

public class MainMt {
    private static Scanner sc = new Scanner(System.in);
    
    private static int menu() {
        System.out.println("====== 수신인을 선택하세요 ======");
        System.out.println("1: 고객");
        System.out.println("2: 상담사");
        System.out.println("0: 종료");
        System.out.print("선택: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        chatFilter filter = new chatFilterAct();
        Management management = new Management(filter);

        System.out.println("상담 채팅을 시작합니다. ('exit' 입력 시 종료)");
        
        while (true) {
            int choice = menu();
            sc.nextLine(); // 버퍼 비우기

            String sender = null;
            String receiver = null;

            switch (choice) {
                case 0: // 종료
                    System.out.println("채팅을 종료합니다.");
                    return;
                case 1: // 고객
                    sender = "고객";
                    receiver = "상담사";
                    break;
                case 2: // 상담사
                    sender = "상담사";
                    receiver = "고객";
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
                    continue;
            }
            
            System.out.print(sender + " : ");
            String message = sc.nextLine();

            if (message.equalsIgnoreCase
            		("exit")) {
                System.out.println("채팅을 종료합니다.");
                return;
            }

            management.sentMessage(sender, receiver, message);
        }
    }
}