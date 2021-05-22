package com.capgemini.lab4;

//LAB 4 EXCERCISE 3
public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;

	public Video(int identificationNo, String title, int noOfCopies, int runtime, String director, String genre, int year) {
		super(identificationNo, title, noOfCopies);
		this.director = director;
		this.genre = genre;
		this.year = year;
		// TODO Auto-generated constructor stub
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void print()

	{
		System.out.println("Info about video ");
		super.print();
		System.out.println("Runtime is- " + super.getRuntime());
		System.out.println("Director is-" + director);
		System.out.println("Genre is-" + genre);
		System.out.println("year is- " + year);
	}

	@Override
	public String toString() {
		return super.toString() + director + genre + year;
	}

}
