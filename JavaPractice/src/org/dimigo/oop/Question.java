/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author      : 허고운
 * @version     : 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] questions= {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ","가장 좋아하는 과목은? "};
		String[] answers = {"빅뱅","조인성", "응용프로그래밍"};
		for (int i = 0; i < answers.length; i++) {
			System.out.println(i+1 + ". " + questions[i]);
			String answer = scanner.nextLine();
			System.out.println(answers[i].equals(answer) ? "정답입니다!" : "틀렸습니다!");
		}
		scanner.close();
		System.out.println("<<결과출력>>");
		for (int i = 0; i < answers.length; i++) {
			StringBuilder sb = new StringBuilder(questions[i]);
			sb.append(" ").append(answers[i]).append("입니다.");
			System.out.println(sb.toString());
		}
	}

}
