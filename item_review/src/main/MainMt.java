package main;

import review.FilterDetail;
import review.Management;
import review.ReviewFilter;

public class MainMt {

	public static void main(String[] args) {
		ReviewFilter filter = new FilterDetail();
		
		Management management = new Management(filter);
		
		management.addReview("좋은데? 강추!", 5);
		management.addReview("비속어1 비추!", 1);
		management.addReview("만족스러움!", 4);
		
		management.addReview("굳굳 5점만점에 99점", 99);
		
		management.sortReviews();

	}

}
