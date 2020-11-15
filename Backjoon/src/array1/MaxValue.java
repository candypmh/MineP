package array1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
	/*
	  9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오. 예를 들어,
	   서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 
	   이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	  
	   첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다. 
	   1. 첫째 줄에 최댓값을 출력하고,
	   2. 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
	   
      3 29 38 12 57 74 40 85 61 
      85 8
	  
	 */
	public static void main(String[] args) {
		//아 정렬한 배열이면 안되지...
		int[] num = new int[9];
		int[] temp = new int[num.length];
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < 9; i++) { 
			num[i] = sc.nextInt(); //num에 값입력
			temp[i] = num[i]; //max구하기위한 정렬용 배열
		}

		
		Arrays.sort(temp); //정렬
		max = temp[temp.length-1];
		
		System.out.println("num:"+ Arrays.toString(num));
		System.out.println("temp:"+ Arrays.toString(temp));
		
		//인덱스 구하기
		for(int i = 0; i < num.length; i++) {
			if(num[i] == temp[temp.length-1]) {
				index = i;
			}
		}
		
		System.out.println("max:"+ max);
		System.out.println("index:"+ index + 1); //몇번째 수인데 구한게 index라서 +1 해줘야 함
	}
}
