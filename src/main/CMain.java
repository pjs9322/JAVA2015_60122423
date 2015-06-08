package main;

import java.util.Scanner;

import main.Constant.EEvent;
import view.CView;

public class CMain {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in); 
		
		EEvent selection = EEvent.eMain;

		while (selection != EEvent.eLogout) {
			CView view = selection.getView();
			selection = view.show(scanner, selection.getTitle());
		}
		scanner.close();
	}
}
