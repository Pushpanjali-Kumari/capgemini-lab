package com.capgemini.lab4;
//LAB 4 EXCERCISE 3
public class Book extends WrittenItem {

	public Book(int identificationNo, String title, int noOfCopies,String author) {
		super(identificationNo, title, noOfCopies,author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Author of the book " + super.getAuthor());

	}

	@Override
	public void checkIn() {
		super.checkIn();
	}

	@Override
	public void checkOut() {
		super.checkOut();
	}

	@Override
	public void addItem() {
		super.addItem();
	}
}
