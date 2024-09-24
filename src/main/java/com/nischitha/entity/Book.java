package com.nischitha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookDetails")
public class Book {
 
	@Id
	private Integer bookId;
	
	@Column(name="book_Name", nullable=false, unique=true,  length=200)
	private String bookName;
	
	@Column(name="book_Price", nullable=false, unique=true,  length=200)
	private Double bookPrice;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
}
