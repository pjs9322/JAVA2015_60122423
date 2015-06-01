package view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import entity.VUser.EUserType;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView {
	
	public VUser login(Scanner scanner) {
		// input from keyboard using scanner
		VLogin vLogin = new VLogin();

		System.out.print("아이디 입력: ");
		String userId = scanner.next();		

		System.out.print("비밀번호 입력: ");
		String password = scanner.next();		
		vLogin.setUserID("id5");		
		vLogin.setPassword("pw5");
		
		VUser vUser = new VUser();;

		vUser.setName(userId);
		vUser.setUserID(userId);
		vUser.seteUsertype(EUserType.EProfessor);
		System.out.println("로그인 성공");
		return vUser;
	}

	@Override
	public int show(Scanner scanner) {
		// TODO Auto-generated method stub
		return 0;
	}
}
