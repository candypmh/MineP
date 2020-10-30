package study20201030;

import java.util.Arrays;

/*
 
자연수 뒤집어 배열로 만들기
 
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.


입출력 예
n	return
12345	[5,4,3,2,1]
 
 
    public int[] solution(long n) {
        int[] answer = {};
        return answer;
    }
}
 
 
 
 */

public class Solution {

	public static void main(String[] args) {
		
		//1. String
		
		long n = 12345;
		String temp = String.valueOf(n);  //temp = "12345"'
		int[] answer = new int[temp.length()];
		
		System.out.println(temp);
		System.out.println("야:"+temp.length());
		
		String[] strarr = new String[temp.length()];
		char str;
		
		
		for(int i = temp.length()-1; i >= 0; i--) { //43210
			str = temp.charAt(i);
			
			System.out.println(str+",");
			
			strarr[temp.length()-1-i] = String.valueOf(str);
		}
		System.out.println(Arrays.toString(strarr));
		
		for(int i = 0; i <strarr.length; i++) {
			System.out.println(i);
			answer[i] = Integer.parseInt(strarr[i]);
			
			
			
		}
		
		System.out.println(Arrays.toString(answer));
	

	}

}
