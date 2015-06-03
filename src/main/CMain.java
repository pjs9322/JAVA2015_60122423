package main;

import java.sql.SQLException;
import java.util.Scanner;

import main.Constant.EEvent;
import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import view.CStudentView;
import view.CView;
import control.CLoginControl;
import entity.VUser;
import entity.VUser.EUserType;
import DAOs.IDAO;
import DAOs.MySQL;

public class CMain {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in); 
		
		EEvent selection = EEvent.eMain;

		while (selection != EEvent.eLogout) {
			CView view = selection.getView();
			selection = view.show(scanner);
		}
		scanner.close();
	}
}
