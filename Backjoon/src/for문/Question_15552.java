package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

//15552번 빠른 A+B

/*
 Java를 사용하고 있다면, Scanner와 System.out.println 대신 
 BufferedReader와 BufferedWriter를 사용할 수 있다. 
 BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다. 
  
입력
첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

출력
각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

예제 입력 1 
5
1 1
12 34
5 500
40 60
1000 1000

예제 출력 1 
2
46
505
100
2000 
  
  
1.코드를 왜 이렇게 짰을까?
2.try-catch를 사용하여 예외처리 한 이유
3.buffer 사용법
  
 */
public class Question_15552 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {

			int num = Integer.parseInt(br.readLine());
			if (num > 1000000) {
				System.out.println("입력값이 1000000이 넘었습니다.");
				return;
			}

			for (int i = 0; i < num; i++) {
				String[] word = br.readLine().split(" ");

				if (Integer.parseInt(word[0]) <= 1 || Integer.parseInt(word[0]) >= 1000
						|| Integer.parseInt(word[1]) <= 1 || Integer.parseInt(word[1]) >= 1000) {

					System.out.println("더해지는 숫자는 1~1000까지의 숫자입니다.");
					return;
				}

				bw.write(Integer.parseInt(word[0]) + Integer.parseInt(word[1]) + "\n");
			}

			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
