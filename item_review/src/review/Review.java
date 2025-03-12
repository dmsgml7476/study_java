package review;



public class Review implements Comparable<Review>{
	
	// 저장할 변수
	
	private String comment;
	private int rating;
	
	public Review(String comment, int rating) {
		this.comment=comment;
		this.rating=rating;
	}

	public String getComment() {
		return comment;
	}

	public int getRating() {
		return rating;
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
