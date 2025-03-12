package review;

import java.util.ArrayList;
import java.util.Collections;


public class Management {
	
	private ArrayList<Review> reviews;
	private ReviewFilter filter;
	
	public Management (ReviewFilter filter1) {
		this.reviews = new ArrayList<>();
		this.filter = filter1;
	}
	
	public void sortReviews() {
//        Collections.sort();  // 최신순 정렬인데 최신순없음 = 주석.
        System.out.println("정렬완료");
    }
	
	public boolean addReview(String comment, int rating) {
		
		if (rating < 1 || rating > 5) {
			System.out.println("별점은 1~5 사이의 값만 가능");
			return false;
		}
		if (filter.filter(comment)) {
			System.out.println("비속어 발견!!!!!!!!!!!");
			return false;
		}
		reviews.add(new Review(comment, rating));
		System.out.println("정상적으로 업로드 되었다");
		return true;
	}

}
