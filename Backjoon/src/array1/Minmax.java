package array1;

import java.util.Arrays;
import java.util.Scanner;

//최소, 최대

/*
 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N이 주어진다.
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1 
5
20 10 35 30 7

예제 출력 1 

최소 최대 
 7 35
 */

/*
 1. 일단 입력하는건 냅두고
 2. 배열에 넣고
 3. 정렬하고
 4. 출력만 최대 최소 <-이 형식이면 됨
 	arr[0]+ " " +arr[n-1]
 
 */


//내일 열시반 머리 커트!!미용실!!!!
public class Minmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		정렬하고 넣으면 되지않나...출력만 공백넣어서 하면되는거네
		
		System.err.println("arr:"+ Arrays.toString(arr));
		
		//---------------------------------------------------
		//시간초과남 ^^...
//		for (int j = 0; j < arr.length; j++) {
//			for (int i = 0; i < arr.length - 1; i++) {
//				if (arr[i] > arr[i + 1]) {
//					temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//				System.out.println("arr:" + Arrays.toString(arr));
//			}
//		}
		//---------------------------------------------------
		 Arrays.sort(arr); 
		 System.out.println(arr[0]+" "+arr[n-1]);
	}
}
