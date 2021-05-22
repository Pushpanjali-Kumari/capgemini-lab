package com.capgemini.lab4;

//LAB 4 EXCERCISE 3
public class JournalPaper extends WrittenItem {
	private int yearOfPublish;

	public JournalPaper(int identificationNo, String title, int noOfCopies, String author, int yearofPublish) {
		super(identificationNo, title, noOfCopies,author);
		// TODO Auto-generated constructor stub
		this.yearOfPublish=yearofPublish;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	@Override
	public String toString() {
		return super.toString() + yearOfPublish;

	}
	@Override
	public void print() {
		super.print();
		System.out.println("Year of Publish= "+yearOfPublish);
	}
}
	
