package com.user;

import java.util.Scanner;

import com.model.User;
import com.user.Test;

import com.service.Locker;
import com.service.PassAuth;

public class Test {

	public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       Locker pg = new PassAuth();
       User user=null;
       System.out.println("Welcome to PassAuth apkk ... !!!");
       
       
     
       while (true) {
    	   System.out.println("Enter your choice from below ....");
           System.out.println("1.Registeration \n2.Userj login \n3.Logout");
           int ch=s.nextInt();
    	   switch(ch) {
       case 1: 
    	   user = pg.regUser();
       System.out.println("Registration Succesfull...");
       System.out.println("Enter your password: "+ user.getPass());
       break;
       
       case 2:
    	   if(user!=null) {
    		   pg.login(user);
    		   }else {
    			   System.out.println("Register yourself first..");
    		   }
           break;
       case 3:
    	   pg.logout();
           break;
      default :
    	  System.out.println("Wrong Choice code ...");
          break;

       }

       
	}

}
}
