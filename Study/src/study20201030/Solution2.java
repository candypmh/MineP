package study20201030;

import java.util.ArrayList;
import java.util.Arrays;

/*
 
제일 작은 수 제거하기
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.  => 중복되는 수가 있단 뜻임?

입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
 
 
    public int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}
 
 1. 중복수 주의 -> sort하고 각각 비교했을때 arr[n]==arr[0]이면 삭제 -> 작은수를 가장 비교후에 마지막에 삭제해야하는듯   ->근데 조건에서는 중복수 신경안써도된댔는데
 2. 빈배열 -> 2-1.sort하고 처음부터 끝까지 arr[n]==arr[0]이면 삭제하고 arr.length()== 0이면 return -1
            2-2.sort하고 arr.length() == 1 이면 arr[i] 삭제하고  return -1
 
 https://programmers.co.kr/learn/courses/30/lessons/12935
 
 */


//다좋은데 정렬을해서 넣는 바람에 원본에서 최솟값 잘라서 내야하는데
//정렬된게 제출되다보니 빠꾸먹음 ^^;; 그래서 solution3에다가 다시 작업했다

public class Solution2 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,3,1,1};
//		int[] arr = {1,1,1,1};
//		int[] arr = {1};
		
		ArrayList<Integer> arrlst = new ArrayList<Integer>();
		int[] answer = new int[arrlst.size()]; //여기에 배열크기선언해봤자 의미없는게, 어레이리스트에 아직 값이 아무것도 안들어가서 크기가 없음...
		
		
		Arrays.sort(arr);
		System.out.println("배열:"+Arrays.toString(arr)); //[1, 1, 2, 3, 3, 4]
		
		for(int i = 0; i < arr.length; i++) { //중복수
			//배열을 만들고 거기다가 안같은 수만 넣음 되것네..
			if(arr[0] != arr[i]) {
				arrlst.add(arr[i]); //[2.3.3.4]
			
			}
		}
		
		
		System.out.println("어레이:"+arrlst.toString()); //[1, 1, 2, 3, 3, 4]
		
		
		
		if(arrlst.size() == 0 || arrlst.size() == 1) {  //빈배열1,2
			arrlst.add(-1);
			answer= new int[1];
			answer[0] = -1;
			System.out.println("빈1 or 2:"+Arrays.toString(answer)); //[2, 3, 3, 4]
			
		}
		
		
 
		answer= new int[arrlst.size()];   //재선언하고 에러사라지고 -> 여기로 위치옮기니까 [2,3,3,4]나옴
		//어레이리스트에 값이 들어가서 size가 생겼기 때문임...
		
		
		for(int i = 0; i < arrlst.size(); i++) {  //ArrayList -> int[]
//			intarr[i] = (int) answer.get(i);
			
			
			
			/*
			intarr = new int[answer.size()];    -> 여기다 하니까 아래처럼 뜸
 
 
			흠:[2, 0, 0, 0]
			2
			흠:[0, 3, 0, 0]
			3
			흠:[0, 0, 3, 0]
			3
			흠:[0, 0, 0, 4]
			*/
			
			
			
			
			
			answer[i] = arrlst.get(i);
			
			
			System.out.println("흠:"+Arrays.toString(answer));
			System.out.println(arrlst.get(i));
		}
		
		

//		
//		for(Integer i : answer) {
//			System.out.println("i:"+i);
//			intarr = (int)i;
//		}
//		
//		System.out.println("마지막:"+Arrays.toString(intarr));

		
		
		


	}

}

/*
 import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        //int[] answer = {};
    
        ArrayList answer = new ArrayList();
		Arrays.sort(arr);
		
		
		for(int i = 0; i < arr.length; i++) { 
			if(arr[0] != arr[i]) {
				answer.add(arr[i]);
			}
		}
		

		if(answer.size() == 0) {  
			answer.add(-1);
			
		}else if(answer.size() == 1) {  
			answer.add(-1);
		}
		
        
        return answer;
        
    }
}*/
