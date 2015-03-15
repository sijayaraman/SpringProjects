package com.spring.bl;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("dreader")
public class DatabaseReader implements Reader {

	public void read() {
		System.out.println("This is Database Reader");

	}

}
