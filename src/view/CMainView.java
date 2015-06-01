package view;

import java.util.Scanner;

public class CMainView extends CView {

	@Override
	public int show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[학사관리 시스템]");
		System.out.println("1.로그임");
		System.out.println("2.회원가입");
		System.out.println("0.종료");
		System.out.print("메뉴선택: ");

		int selection = scanner.nextInt();
		return selection;
	}

}
