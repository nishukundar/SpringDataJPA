package com.nischitha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nischitha.entity.Book;
import com.nischitha.repository.BookRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		BookRepository bookRepo = context.getBean(BookRepository.class);
		
		Book b = new Book();
		b.setBookId(103);
		b.setBookName("SpringBoot");
		b.setBookPrice(19876.43);
		
		bookRepo.save(b);  //UPSERT method  Update + Insert //polymorphic behavior
	
	}

}
