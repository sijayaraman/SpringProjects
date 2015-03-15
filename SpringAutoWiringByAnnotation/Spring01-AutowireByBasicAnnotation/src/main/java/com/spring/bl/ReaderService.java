package com.spring.bl;

import org.springframework.beans.factory.annotation.Autowired;

public class ReaderService {

	private Reader reader;

	ReaderService() {

	}
	
	@Autowired
	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public void readData() {
		reader.read();
	}

}
