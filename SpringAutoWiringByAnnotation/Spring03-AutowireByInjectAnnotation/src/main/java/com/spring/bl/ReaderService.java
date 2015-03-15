package com.spring.bl;

import javax.inject.Inject;
import javax.inject.Named;

public class ReaderService {

	private Reader reader;

	ReaderService() {

	}

	@Inject
	@Named("freader")
	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public void readData() {
		reader.read();
	}

}
