package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService{

	@Override
	public List<String> getByLanguage(String language) {
		if(language.equals("Telugu")) {
			return Arrays.asList("love","jiban","nani");
		}
		else if(language.equals("Hindi")) {
			return Arrays.asList("sanam","dhoom","krish");
		
	}
		else if(language.equals("English")) {
			return Arrays.asList("tangals","fire","shaktiman");
			
	}else
		return Arrays.asList("tangals","fire","shaktiman");
		
}

}