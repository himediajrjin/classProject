package chapter04.exam;

public class Exam03 {

	public static void main(String[] args) {
		
		// 두수의 큰수를 찾아 출력하고 두수 의 차를 출력하자
		
		
		
		int num1 = 250;
		int num2 = 100;
		
		int big = 0 ; // 큰수를 저장
		int diff = 0; // 두수의 차이값을 저장
		
		// 큰수 -> 두수를 비교해서 판별
		// big = num1>num2 ? num1 : num2;
		if(num1>num2) {
			big = num1;
		} else {
			big = num2;
		}

		// 두수의 차 -> 두수의 큰수와 작은 수를 구해서 큰수에서 작은수를 빼 준다!
		// diff = num1>num2 ? num1-num2 : num2-num1;
		if(num1>num2) {
			diff = num1-num2;
		} else {
			diff = num2-num1;
		}
		
		System.out.println("큰수 : " + big);
		System.out.println("두 수의 차 : " + diff);

	}

}









