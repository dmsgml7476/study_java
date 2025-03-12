package chatting;

import java.util.ArrayList;

public class chatFilterAct implements chatFilter{
	private static final ArrayList<String> badword = new ArrayList<>();
	static {
	    badword.add("비속어1");
	    badword.add("비속어2");
	}
	
	@Override
	public boolean filter(String sendMessage) {
		for (String words : badword) {
			if (sendMessage.contains(words)) {
				System.out.println("비적절한 언어 사용감지 바른 언어를 사용해주세요.");
				return true; 
			}
		}
		return false;
	}
	
}
