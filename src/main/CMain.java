package main;

import java.sql.SQLException;
import java.util.Scanner;

import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import control.CLoginControl;
import entity.VUser;
import entity.VUser.EUserType;
import DAOs.IDAO;
import DAOs.MySQL;

public class CMain {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in); 
		CMainView mainView = new CMainView();
		
		int selection = mainView.show(scanner);

		while (selection != 0) {
			switch (selection) {
			case 0: 
				System.out.println("�α׾ƿ�");
				break;
			case 1: 
				CLoginView loginView = new CLoginView();
				VUser vUser = loginView.login(scanner);
				if (vUser.geteUsertype()==EUserType.EProfessor) {
					CProfessorView professorView = new CProfessorView();
					selection = professorView.show(scanner);
				}
				break;
			case 2: 
				System.out.println("�л�ȭ��");
				selection = 1;
				break;
			case 3: 
				System.out.println("���°���");
				selection = 1;
				break;
			case 4: 
				System.out.println("������ȸ");
				selection = 1;
				break;
			case 5: 
				System.out.println("�����Է�");
				selection = 1;
				break;
			case 6: 
				System.out.println("������ȸ");
				selection = 1;
				break;
			case 7: 
				System.out.println("");
				break;
			case 8: 
				System.out.println("");
				break;
			case 9: 
				System.out.println("");
				break;
			default:
				break;
			}
		}
		scanner.close();
	}
}
