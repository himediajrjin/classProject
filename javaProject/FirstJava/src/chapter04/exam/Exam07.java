package chapter04.exam;

public class Exam07 {

	public static void main(String[] args) {
		
		// 1~100 까지 출력
		
		int cnt = 1;
		
		while(cnt <= 100) {
			System.out.println(cnt++);
			//cnt++;
		}
		
		System.out.println("--------------------");
		
		do {
			//cnt--;
			System.out.println(--cnt);	
		} while(cnt>1);

	}

}





