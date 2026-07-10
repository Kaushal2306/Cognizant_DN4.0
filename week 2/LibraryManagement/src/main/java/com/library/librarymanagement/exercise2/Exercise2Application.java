package com.library.librarymanagement.exercise2;

import com.library.librarymanagement.exercise2.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exercise2Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise2.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.addBook();
    }
}