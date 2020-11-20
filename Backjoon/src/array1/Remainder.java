package array1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//나머지
/*
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

예제 입력 1 
39
40
41
42
43
44
82
83
84
85

예제 출력 1 
6

 
39, 40, 41, 0, 1, 2, 40, 41, 0, 1이다. 서로 다른 값은 모두 6개가 있다.
 */

public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int cnt = 0;
		int answer = 0;
		
		
		Set<Integer> setarr = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i] % 42;
		}

//		System.out.println("arr2:"+Arrays.toString(arr2));

		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] == arr2[j])
					cnt++;

				System.out.println(arr2[i] + "/" + arr2[j] + "/" + cnt);
			}
		} // for

		
		answer = 10 - cnt;
		System.out.println(answer);
		
		//arr2:[39, 40, 41, 0, 1, 2, 40, 41, 0, 1]
		
		//대체 왜틀렸단건데..ㅡㅡ...이거 왜 에러나 ㅠ
		//2개이상일경우 생각하기ㅠㅠ/중복값 => set!!!!!!!!!!!!!
		
		
	}

}