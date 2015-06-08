package view;

import java.util.Scanner;

import main.Constant;
import main.Constant.EEvent;
import main.Constant.EStudentView;

public class CStudentView extends CView {
	
	@Override
	public EEvent show(Scanner scanner, String title) {
		// TODO Auto-generated method stub
		System.out.println("["+title+"]");
		for (EStudentView eView: EStudentView.values()) {
			System.out.println(eView.getEventID().ordinal() + "." + eView.getTitle());
		}
		System.out.print(Constant.MENUSELECTION+": ");
		EEvent selection = EEvent.values()[scanner.nextInt()];
		return selection;
	}

}
