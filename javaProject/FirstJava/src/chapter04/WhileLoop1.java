package chapter04;

public class WhileLoop1 {
	
	public static void main(String[] args) {
		
		
		// A 를 5000번 출력
		
//		System.out.println("A");
//		System.out.println("A");
//		System.out.println("A");
//		System.out.println("A");
//		System.out.println("A");
		
		int num = 5 ; // 초기식, 반복문의 조건에사 용하는 변수, 카운팅( 1씩 증가)
		
		while(num < 5) {
			System.out.println("A : " + num);
			
			num++; // num = num + 1 , num += 1
		}
		
	}

}
