package com.console;

import com.model.Book;

public class ConsoleMain {
	public static void main(String[] args) {
		Book book =new Book();
		book.setId("003456700");
		book.setName("book");
		//紧急分支修复
		System.out.println(book.getName());
		System.err.println("人为冲突");
	}
}
