package review;

import java.util.ArrayList;

public class FilterDetail implements ReviewFilter {
	
	private static final ArrayList<String> badword = new ArrayList<>();
	static {
	    badword.add("비속어1");
	    badword.add("비속어2");
	}

	
	@Override
	public boolean filter(String comment) {
		for (String words : badword) {
			if (comment.contains(words))
				return true; 
		}
		return false;
	}
	
	
	

}
