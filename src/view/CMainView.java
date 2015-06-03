package view;

import java.util.Scanner;

import main.Constant.EEvent;

public class CMainView extends CView {

	@Override
	public EEvent show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[학사관리 시스템]");
		System.out.println("1.로그임");
		System.out.println("2.회원가입");
		System.out.println("0.종료");
		System.out.print("메뉴선택: ");

		EEvent selection = EEvent.values()[scanner.nextInt()];
		return selection;
	}

}
