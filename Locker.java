package com.service;

import com.model.User;

public interface Locker {
	
	User regUser ();
	void login(User u);
	void logout ();
	

}
