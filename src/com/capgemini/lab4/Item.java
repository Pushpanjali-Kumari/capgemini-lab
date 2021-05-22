package com.capgemini.lab4;

//LAB 4 EXCERCISE 3
public abstract class Item {
	private int identificationNo;
	private String title;
	private int noOfCopies;

	public Item(int identificationNo, String title, int noOfCopies) {
		super();
		this.identificationNo = identificationNo;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	public int getIdentificationNo() {
		return identificationNo;
	}

	public void setIdentificationNo(int identificationNo) {
		this.identificationNo = identificationNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Item {identificationNo=" + identificationNo + ", title=" + title + ", noOfCopies=" + noOfCopies
				+ "}";
	}

	public void addItem() {
		noOfCopies++;
	}

	public void checkIn() {
		noOfCopies = noOfCopies + 1;
	}

	public void checkOut() {
		noOfCopies = noOfCopies - 1;
	}

	public void print() {
		System.out.println("Unique Identification number " + identificationNo);
		System.out.println("Title " + title);
		System.out.println("Number of copies are " + noOfCopies);
	}
}
