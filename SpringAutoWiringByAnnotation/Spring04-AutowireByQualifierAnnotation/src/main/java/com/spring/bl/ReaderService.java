package com.spring.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ReaderService {

	private Reader reader;

	ReaderService() {

	}

	@Autowired
	@Qualifier("dreader")
	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public void readData() {
		reader.read();
	}

}
