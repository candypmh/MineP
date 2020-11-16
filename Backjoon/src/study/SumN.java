package study;

import java.util.Scanner;

/*
정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
작성해야 하는 함수는 다음과 같다.  
 
Java: long sum(int[] a); (클래스 이름: Test)
a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합
  
 */
public class SumN {
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//
//	int[] a = new int[n];
//	for(int i = 0; i < n; i++) {
//		a[i] = sc.nextInt();
//	}
	
		int[] a = {23,6,66,4,1};
		System.out.println(sum(a));
	}
	//------------------------------------------------
	public static long sum(int[] a) {
		long temp = 0;
		
		for(int i = 0; i < a.length; i++) {
			temp += a[i];
		}
		
		System.out.println("temp:"+ temp);
		
		return temp;
	}
	

}
