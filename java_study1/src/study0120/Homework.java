package study0120;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int appleBox = 20;
		int orangeBox = 15;
		int appleBoxnum = 11;
		int orangeBoxnum = 12;
		
	    int totalApple = appleBox * appleBoxnum;
	    int totalOrange = orangeBox * orangeBoxnum;
	    
	    int totalNum = totalApple + totalOrange;
	    
	    System.out.println("과일 총 개수 : " + totalNum);
	    
	    int totalNum2 = (appleBox * appleBoxnum) + (orangeBox * orangeBoxnum);
	    
	    System.out.println("과일 총 개수 : " + totalNum2);
	    
	    
	}

}
