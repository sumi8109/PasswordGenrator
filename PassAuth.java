package com.service;

import java.security.SecureRandom;
import java.util.Scanner;

import com.model.User;

public class PassAuth implements Locker{
	Scanner s = new Scanner (System.in);
	
	@Override
	public User regUser() {
		User u= new User ();
		
		System.out.println("Enter your id: ");
		u.setId(s.nextInt());
		
		System.out.println("Enter your name: ");
		u.setName(s.next()+s.nextLine());
		
		System.out.println("Enter your mob no: ");
		u.setMob(s.nextLong());
		
		System.out.println("Enter your email: ");
		u.setEmail(s.next());
		
		System.out.println("Enter your user name: ");
		u.setUserName(s.next());
		
		u.setPass(passGen());
		return u;
	}

	@Override
	public void login(User u) {
		System.out.println("Enter your Username or Email ");
		String inp1=s.next();
		
		if ( inp1.equals(u.getUserName()) || inp1.equals(u.getEmail())) {
		System.out.println("Enter your password: ");
		String pass=s.next();
		
		  if (pass.equals(u.getPass())){
			  System.out.println("Login Succesfully !!!");
			   }
		  else {
				System.out.println("Incorrect password");   
			   }
		  }else {
			  System.out.println("Enter valid Credaentials");
		  }
		}

	@Override
	public void logout() {
		System.out.println("Logged out ... !!!");
		System.exit(0);
		
	}
	public static String passGen() {
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase=upperCase.toLowerCase();
		String number="123456789";
		String splChar="!@#$%^&*";
		String allChar=upperCase+lowerCase+number+splChar;
		StringBuffer sf=new StringBuffer(8);
		SecureRandom sr=new SecureRandom ();
		
		for (int i=0;i<8;i++) {
			sf.append(allChar.charAt(sr.nextInt(allChar.length())));
		}
		
		return sf.toString();
		
	}
	

}
