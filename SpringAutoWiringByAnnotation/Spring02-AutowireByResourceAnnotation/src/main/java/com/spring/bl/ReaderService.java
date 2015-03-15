package com.spring.bl;

import javax.annotation.Resource;

public class ReaderService {

	private Reader reader;

	ReaderService() {

	}

	@Resource(name = "dreader")
	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public void readData() {
		reader.read();
	}

}
