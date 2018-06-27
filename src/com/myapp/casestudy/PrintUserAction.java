package com.myapp.casestudy;

public class PrintUserAction implements UserAction {
	
	private String textToPrint;
	
	public PrintUserAction(String textToPrint) {
		this.textToPrint=textToPrint;
	}

	@Override
	public void performAction() {
		System.out.println(textToPrint);

	}

	@Override
	public void undo() {
		System.out.println("undoprinting "+textToPrint);
	}

}
