package collection4;

public class LinkList {
	private Node head;
	private Node tail;
	
	public void add(int data) {
		Node temp = new Node(data);
		
		if(head == null) // 첫번째 노드 만들어지면 동작
			head=temp;
		else { //두번째부터 동작
			tail.setLink(temp);
		}
		
		tail=temp;
	}
	public void view() {  // 링크드리스트 전체 출력
		Node move = head;
		while(move!=null){
			System.out.println(move);
			move=move.getLink();
		}
			
	}
}
