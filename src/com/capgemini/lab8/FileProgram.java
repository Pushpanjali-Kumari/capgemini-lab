package com.capgemini.lab8;

import java.io.File;

public class FileProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File source = new File("D:\\capgeminiJA17\\LabBook_Programs\\src\\com\\capgemini\\lab8\\source.txt");
		File target = new File("D:\\capgeminiJA17\\LabBook_Programs\\src\\com\\capgemini\\lab8\\target.txt");
		CopyDataThread copyDataThread = new CopyDataThread(source, target);
		copyDataThread.start();
	}
}
