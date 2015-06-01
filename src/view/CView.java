package view;

import java.util.Scanner;

import control.CControl;

public abstract class CView {
	// association
	private CControl control;
	public CControl getControl() {return control;}
	public void setControl(CControl control) {this.control = control;}
	
	public abstract int show(Scanner scanner);
}
