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

//arr를 두개만들어야겠네
public class Solution3 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 3, 1, 1 }; // -> 4,3,2,3이 나와야함
//		int[] arr = {1,1,1,1};
//		int[] arr = {1};

		int[] arrtemp = new int[arr.length]; // 정렬복제용
		ArrayList<Integer> arrlst = new ArrayList<Integer>();
		int[] answer = null; // 답제출용

		for (int i = 0; i < arr.length; i++) { // 배열복제
			arrtemp[i] = arr[i];
		}

		System.out.println("복제: " + Arrays.toString(arrtemp));
		// -----------------------------------------------------------------
		Arrays.sort(arrtemp);// 복제한 배열 정렬
		int min = arrtemp[0]; // 0번째방이 가장작은값
		System.out.println("배열: " + Arrays.toString(arrtemp)); // [1, 1, 2, 3, 3, 4]
		// -----------------------------------------------------------------

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arrtemp[0]) {
				arrlst.add(arr[i]); // 어레이리스트에 최솟값이 아닌애들만 집어넣기
			}
			
			
			if (arrlst.size() == 0) { // 빈배열1,2(만약 모든수가 최솟값과 같거나 애초부터 최솟값 한개만 있었을 경우)
				arrlst.add(-1);
			}

		}

		answer = new int[arrlst.size()]; // 어레이리스트 사이즈만큼 answer사이즈 선언

		for (int i = 0; i < answer.length; i++) { // 어레이리스트 값들을 answer에다가 그대로 집어넣음
			answer[i] = arrlst.get(i);
		}

		System.out.println("어레이리스트:" + arrlst.toString());
		System.out.println("과연: " + Arrays.toString(answer));

		// -------------------------------------------------------- 끝
		// ---------------------------------------------------------
	
	}

}

