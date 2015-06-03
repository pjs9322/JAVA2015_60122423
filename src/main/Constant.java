package main;

import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import view.CStudentView;
import view.CView;

public class Constant {
	public static enum EEvent {
		eLogout(null),
		eSignIn(new CLoginView()),
		eSignUp(null),
		eMain(new CMainView()),
		eProfessor(new CProfessorView()),
		eStudent(new CStudentView()),
		eCreateClass(null),
		eGetClass(null),
		eSetGrade(null),
		eGetGradeP(null),
		eRegisterClass(null),
		eGetGrade(null);
		
		private CView view;
		public CView getView() {return view;}
		
		private EEvent(CView view) {
			this.view = view;
		}
	}
}
