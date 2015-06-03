package view;

import java.util.Scanner;

import main.Constant.EEvent;

public class CStudentView extends CView {

	@Override
	public EEvent show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[학생화면]");
		System.out.println("1.강좌개설");
		System.out.println("2.강좌조회");
		System.out.println("3.성적입력");
		System.out.println("4.성적조회");
		System.out.println("0.로그아웃");
		System.out.print("메뉴선택: ");

		EEvent selection = EEvent.values()[scanner.nextInt()];
		return selection;
	}

}
