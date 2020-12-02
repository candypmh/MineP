package string;
/*
 
문제
영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 
이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

입력
첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 
이 문자열의 길이는 1,000,000을 넘지 않는다. 
단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.

출력
첫째 줄에 단어의 개수를 출력한다.
  
  
  ex) The Curious Case of Benjamin Button -> 6
   	  Mazatneunde Wae Teullyeoyo -> 3
   	  Teullinika Teullyeotzi -> 2
  
 */

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

public class WordCount_answer {
	public static void main(String[] args) {

//		String s = "The Curious Case of Benjamin Button";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim(); // 문자열 맨앞, 맨뒤의 공백 제거
		s = s.replace(" ", "."); // 공백을 .으로 치환
		
		System.out.println("s:" + "<" + s + ">");
		
		int cnt = 0;
		
//		boolean tf = false;

		
		for(int i = 0; i < s.length();i++) {
			char chr = s.charAt(i);
			
			if(chr + "" == ".") {
				cnt++;
				String[] arr = s.split(".");
				System.out.println("맞다:"+Arrays.toString(arr));
			}
			
			if(cnt == 0) {
				System.out.println("아니다"+ 1);
			}
			
			
			
		}
		
		
		
		
		
		
//		 arr = s.split(".");
		
		//한단어일때 어케하지.....
		//if(s.charAt(i) == 
		
//		System.out.println("악:"+Arrays.toString(s));

		// " " -> 이거 하나만 들어왔을때를 생각해야함
//		if(s.equals(" ")) {
//			System.out.println(s.length);
//			System.out.println(s);
//			System.out.println("으악:"+Arrays.toString(s));
//		}

//		}else if(s.length == 1) {
//			System.out.println(s.length);
//			System.out.println("아악:"+Arrays.toString(s));
//		}

		// 한단어만 들어올때도 있나?->상관X

		// " "
		// " a"가 들어올때도 있나?
		// "a "
		// " a "

	}
}
