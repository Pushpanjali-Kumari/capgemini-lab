package com.capgemini.lab4;

//LAB 4 EXCERCISE 3
public class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD(int identificationNo, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(identificationNo, title, noOfCopies);
		// TODO Auto-generated constructor stub
		this.artist = artist;
		this.genre = genre;
		
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void print()

	{
		super.print();
		System.out.println("Artist is " + artist);
		System.out.println("Genre is " + genre);

	}

	@Override
	public String toString() {
		return super.toString() + artist + genre;
	}

}
