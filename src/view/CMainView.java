package view;

import java.util.Scanner;

public class CMainView extends CView {

	@Override
	public int show(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("[�л���� �ý���]");
		System.out.println("1.�α���");
		System.out.println("2.ȸ������");
		System.out.println("0.����");
		System.out.print("�޴�����: ");

		int selection = scanner.nextInt();
		return selection;
	}

}
