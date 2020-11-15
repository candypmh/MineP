package array1;

import java.util.Scanner;

//숫자갯수
/*
세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
예를 들어 A = 150, B = 266, C = 427 이라면 
A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

입력
첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.

출력
첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

예제 입력 1 
150
266
427

예제 출력 1 
3
1
0
2
0
0
0
2
0
0 
 */

public class CountNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();

		String multi = (first * second * third) + "";

		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int num6 = 0;
		int num7 = 0;
		int num8 = 0;
		int num9 = 0;

		for (int i = 0; i < multi.length(); i++) {
			switch (multi.charAt(i)) {
			case '0': num0 ++;break;
			case '1': num1 ++;break;
			case '2': num2 ++;break;
			case '3': num3 ++;break;
			case '4': num4 ++;break;
			case '5': num5 ++;break;
			case '6': num6 ++;break;
			case '7': num7 ++;break;
			case '8': num8 ++;break;
			case '9': num9 ++;break;
			}
		}//for

		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
	}

}
