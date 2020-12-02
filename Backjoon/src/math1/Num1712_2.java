package math1;

import java.util.Arrays;
import java.util.Scanner;

//1712손익분기점
/*
 월드전자는 노트북을 제조하고 판매하는 회사이다. 
 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.

노트북 가격이 C만원으로 책정되었다고 한다. 
일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 
최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.

A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
 */
//고정비용 A만원(1번)
//가변비용 B만원/ 1대 노트북 생산하는데 드는비용(n번)
//A+B =총비용

//노트북가격 :C만원 -> 총수입(판매비용)
//c가 a+b보다 많아져 이익발생하는 지점: 손익분기점	

//첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.
//첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.

/*
		1000 70 170 -> 11
		3 2 1 -> -1 
 */

public class Num1712_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] array = input.split(" ");

		long a = Integer.parseInt(array[0]);
		long b = Integer.parseInt(array[1]);
		long c = Integer.parseInt(array[2]); // 총수입
		int cnt = 1;

		/*
		 * long ab = 0; //총비용 a+b
		 * 
		 * 
		 * System.out.println("배열:"+Arrays.toString(array)); for(int i = 0; i < 100;
		 * i++) { ab = a + (b*i);
		 * 
		 * if(ab < c*i) { System.out.println(i); break; }else { System.out.println(-1);
		 * break; }
		 * 
		 * }//for
		 */

		while (true) {
			// System.out.println(-1);
			if (c <= b) { //왜지????
				System.out.println(-1);
				break;
			} else {

				if (a + (b * cnt) < c * cnt) {
					System.out.println(cnt);
					break;
				} else {
					cnt++;
				}

			}

		}

	}

}
