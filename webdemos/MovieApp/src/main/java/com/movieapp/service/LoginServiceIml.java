package com.movieapp.service;

import java.util.stream.Stream;
import java.util.Arrays;

public class LoginServiceIml implements ILoginService {
	String [] usernames= {"munu","sona","kuna","rona","mona"};

	@Override
	public boolean ValidateUsername(String username,String  password) {
		 return Stream.of(usernames)
				 .filter(str->str.equals(username)&& password.equals("admin123"))
				 .findAny()
				 .isPresent();
		
	}

}
