package Main;

import Review.Management;
import Review.Review;

public class MainMt {

	public static void main(String[] args) {
        Management management = new Management();

        // 유효한 리뷰 추가
        management.addReview(new Review("좋은 제품이에요!", 5));
        management.addReview(new Review("괜찮은 품질입니다.", 4));

        
        management.addReview(new Review("별로예요.", 0));  // 오류 메시지 출력
        management.addReview(new Review("최악이에요.", 6)); // 오류 메시지 출력
        
        management.sort();


 

	}
	

}
