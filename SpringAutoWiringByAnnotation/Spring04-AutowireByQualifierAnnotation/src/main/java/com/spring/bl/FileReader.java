package com.spring.bl;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("freader")
public class FileReader implements Reader {

	public void read() {
		System.out.println("THis is File Reader");

	}

}
