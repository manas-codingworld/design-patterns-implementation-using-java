package com.myapp.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class TestSingleton {
	
	static DBSingleton instance1=null;
	static DBSingleton instance2=null;
	public static void main(String[] args) {

		Runnable task1=()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance1=DBSingleton.getInstance();
		};

		Runnable task2=()->{
			instance2=DBSingleton.getInstance();
		};
		
		Thread t1=new Thread(task1);
		Thread t2=new Thread(task2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//checking thread-safe
		System.out.println(instance1==instance2);
		
		long startTime=System.currentTimeMillis();
		Connection connection=instance1.getConnection();
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
		try {         
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startTime=System.currentTimeMillis();
		Connection connection1=instance2.getConnection();
		endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
		try {         
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(connection1==connection);//false
	}

}
