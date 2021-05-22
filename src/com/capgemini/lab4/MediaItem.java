package com.capgemini.lab4;

//LAB 4 EXCERCISE 3
public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int identificationNo, String title, int noOfCopies) {
		super(identificationNo, title, noOfCopies);
		// TODO Auto-generated constructor stub
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	@Override
	public String toString() {
		return super.toString() + runtime;

	}
	@Override
	public int getIdentificationNo() {
		return super.getIdentificationNo();
	}
	@Override
	public String getTitle() {
		return super.getTitle();
	}
	@Override
	public int getNoOfCopies() {
		return super.getNoOfCopies();
	}
	@Override
	public void print() {
		System.out.println("Info  ");
		super.print();
		System.out.println("Runtime is  " + runtime);

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
