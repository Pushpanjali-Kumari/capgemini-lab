package com.capgemini.lab4;

//LAB 4 EXCERCISE 3
public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int identificationNo, String title, int noOfCopies, String author) {
		super(identificationNo, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
		System.out.println("Author is- " + author);
	}
}
