package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import main.Constant.EEvent;
import control.CControl;
import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import entity.VUser.EUserType;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView {
	
	public CLoginView() {
		this.setControl(new CLoginControl());
	}
	
	public EEvent show(Scanner scanner, String title) {
		// input from keyboard using scanner
		VLogin vLogin = new VLogin();

		System.out.print("아이디 입력: ");
		String userId = scanner.next();

		System.out.print("비밀번호 입력: ");
		String password = scanner.next();
		vLogin.setUserID("id5");		
		vLogin.setPassword("pw5");
		
		VUser vUser;
		EEvent selection = null;

		try {
			vUser = ((CLoginControl) this.getControl()).login(vLogin);
			System.out.println("로그인 성공");
			if (vUser.geteUsertype()==EUserType.EProfessor) {
				selection = EEvent.eProfessor;
			} else if (vUser.geteUsertype()==EUserType.EStudent) {
				selection = EEvent.eStudent;
			}
		} catch (UserIDNotFoundException | PasswordNotMatchException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return selection;
	}
}
