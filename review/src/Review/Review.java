package Review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Review implements Filter{
	private String comment;
	private int rating;
	

	
    @Override
    public void filterBadWords(String comment) {
    	System.out.println("욕설 주의 욕설 필터");
    }

    
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}

	@Override
	public int compareTo(Review o) {
		return 0;
	}
	
    


}
