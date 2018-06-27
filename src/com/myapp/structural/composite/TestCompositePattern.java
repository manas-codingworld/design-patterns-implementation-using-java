package com.myapp.structural.composite;

public class TestCompositePattern {

	public static void main(String[] args) {
		
		Menu mainMenu=new Menu("Main","/main");
		MenuItem safetyMenuItem=new MenuItem("Safety","/safety");
		mainMenu.add(safetyMenuItem);
		System.out.println("123456:"+mainMenu.toString());
		Menu claimsSubMenu=new Menu("Claims","/claims");
		mainMenu.add(claimsSubMenu);
		System.out.println("dwnd122:"+claimsSubMenu.toString());
		MenuItem personalClaimsMenu=new MenuItem("Personal","/personal");
		claimsSubMenu.add(personalClaimsMenu);
		System.out.println("abcdef:"+mainMenu.toString());
	}

}
