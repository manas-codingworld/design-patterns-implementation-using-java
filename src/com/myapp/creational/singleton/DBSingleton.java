package com.myapp.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {
	
	private static DBSingleton instance=null;
	private Connection connection=null;
	
	private DBSingleton(){
		
	}
	
	public static DBSingleton getInstance(){
		if(instance==null){
			synchronized (DBSingleton.class) {
				if(instance==null){
					instance=new DBSingleton();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection(){
		try {
			if(connection==null|| connection.isClosed()){
				synchronized (DBSingleton.class) {
					try {
						connection=DriverManager.getConnection("jdbc:derby:memory:javadb;create=true");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return connection;
	}
}
