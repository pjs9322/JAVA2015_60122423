package main;

import view.CLoginView;
import view.CMainView;
import view.CProfessorView;
import view.CStudentView;
import view.CView;

public class Constant {
	public static enum EEvent {
		eLogout("로그아웃", null),
		eSignIn("로그인", new CLoginView()),
		eSignUp("회원등록", null),
		eMain("메인화면", new CMainView()),
		eProfessor("교수화면", new CProfessorView()),
		eStudent("학생화면", new CStudentView()),
		eCreateClass("강좌개설", null),
		eGetClass("강좌검색", null),
		eSetGrade("성적입력", null),
		eGetGradeP("성적조회", null),
		eRegisterClass("수강신청", null),
		eGetGrade("성적조회", null);
		
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
		eView1(EEvent.eSignIn, "로그인"),
		eView2(EEvent.eSignUp, "회원가입"),
		eView3(EEvent.eLogout, "종료");
		
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
		eView1(EEvent.eRegisterClass, "수강신청"),
		eView2(EEvent.eGetGrade, "성적조회"),
		eView3(EEvent.eLogout, "로그아웃");
		
		private EEvent eventID;
		public EEvent getEventID() {return eventID;}
		private String title;
		public String getTitle() {return title;}

		private EStudentView(EEvent eventID, String title) {
			this.eventID = eventID;
			this.title = title;
		}
	}
	public final static String MENUSELECTION = "메뉴선택";
}
