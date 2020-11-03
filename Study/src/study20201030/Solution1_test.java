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
 
//https://programmers.co.kr/learn/courses/30/lessons/12932
 
 
 */

public class Solution1_test {

	public static void main(String[] args) {
		
		//1. String
		
		long n = 12345;
		String temp = String.valueOf(n);  //temp = "12345"
		int[] answer = new int[temp.length()];//5
		
		String[] strarr = new String[temp.length()];//한자씩 담을 용도 {1,2,3,4,5}
		char str; //한자씩 자를 매개체
		
		
		for(int i = temp.length()-1; i >= 0; i--) { //index 43210
			str = temp.charAt(i); //5,4,3,2,1
			strarr[temp.length()-1-i] = String.valueOf(str); //{5,4,3,2,1} 이렇게 집어넣기
		}
		
		for(int i = 0; i <strarr.length; i++) {
			answer[i] = Integer.parseInt(strarr[i]); // String배열을 int배열에 넣기
		}
		
	}

}
