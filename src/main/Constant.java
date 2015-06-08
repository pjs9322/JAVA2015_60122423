package main;

import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import view.CStudentView;
import view.CView;

public class Constant {
	public static enum EEvent {
		eLogout("�α׾ƿ�", null),
		eSignIn("�α���", new CLoginView()),
		eSignUp("ȸ�����", null),
		eMain("����ȭ��", new CMainView()),
		eProfessor("����ȭ��", new CProfessorView()),
		eStudent("�л�ȭ��", new CStudentView()),
		eCreateClass("���°���", null),
		eGetClass("���°˻�", null),
		eSetGrade("�����Է�", null),
		eGetGradeP("������ȸ", null),
		eRegisterClass("������û", null),
		eGetGrade("������ȸ", null);
		
		private String title;
		private CView view;
		public String getTitle() {return title;}
		public CView getView() {return view;}
		
		private EEvent(String title, CView view) {
			this.title = title;
			this.view = view;
		}

	}
	public enum EMainView {
		eView1(EEvent.eSignIn, "�α���"),
		eView2(EEvent.eSignUp, "ȸ������"),
		eView3(EEvent.eLogout, "����");
		
		private EEvent eventID;
		public EEvent getEventID() {return eventID;}
		private String title;
		public String getTitle() {return title;}

		private EMainView(EEvent eventID, String title) {
			this.eventID = eventID;
			this.title = title;
		}
	}
	public enum EStudentView {
		eView1(EEvent.eRegisterClass, "������û"),
		eView2(EEvent.eGetGrade, "������ȸ"),
		eView3(EEvent.eLogout, "�α׾ƿ�");
		
		private EEvent eventID;
		public EEvent getEventID() {return eventID;}
		private String title;
		public String getTitle() {return title;}

		private EStudentView(EEvent eventID, String title) {
			this.eventID = eventID;
			this.title = title;
		}
	}
	public final static String MENUSELECTION = "�޴�����";
}
