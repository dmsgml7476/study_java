package Review;

import java.util.ArrayList;
import java.util.Collections;

public class Management extends Review {
    private ArrayList<Review> reviews;
	
    public Management() {
        this.reviews = new ArrayList<>();
    }
    
    public void addReview(Review review) {
    	if (review.getRating() < 1 || review.getRating()>5) {
    		System.out.println("오류: 평점은 1~5 사이여야한다.");
    		return;
    	}
    	review.getRating();
    	reviews.add(review);
//    	Collections.sort(reviews);

    }
    
	public void sort() {
		System.out.println("정렬되었다!");
	}




}
