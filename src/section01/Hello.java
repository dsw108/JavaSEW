package section01;
/* 
 * 
 */

public class Hello {
	public static void main(String[] args) {
			// 한 줄 주석
		System.out.println("Hello,JAVA!!!");
		
		printNum(422);
	}
	
	/**
	 * JavaDoc 주석
	 * 공식적인 내용
	 * printNum - 입력받은 정수 출력
	 * @param num   
	 */
	
	public static void printNum(int num) {
		System.out.println("num: "+num);
	}
}
