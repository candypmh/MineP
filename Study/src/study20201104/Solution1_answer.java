package study20201104;

import java.util.Arrays;

/*
하샤드 수

문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고,
18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

제한 조건
x는 1 이상, 10000 이하인 정수입니다.
입출력 예
arr	return
10	true   1+0 = 1   10/1
12	true   1+2 = 3   12/3
11	false  1+1 = 2   11/2
13	false  1+3 = 4   13/4
  
 
 */

public class Solution1_answer {
	public static void main(String[] args) {
		int x = 89; // 8+9 = 17 89/17 false
		solution(x);
	}
	
	
	
	
	
	
	
	
	//--------------------------------------------------
	  public static boolean solution(int x) {
		boolean answer = true;
		String temp = "" + x; // "89"
		int[] arr = new int[temp.length()];
		int sum = 0;//각 자리수의 합

		
		for (int i = 0; i < temp.length(); i++) {  //89 -> [8,9]로 배열에 넣기
			char ch = temp.charAt(i);
			arr[i] = Integer.parseInt(ch + "");
		}//[8,9]

		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		answer = (x % sum == 0) ? true : false;
		
	    return answer;
	}

}
