package view;

import java.util.Scanner;

import main.Constant.EEvent;
import control.CControl;

public abstract class CView {
	// association
	private CControl control;
	public CControl getControl() {return control;}
	public void setControl(CControl control) {this.control = control;}
	
	public abstract EEvent show(Scanner scanner, String title);
}
