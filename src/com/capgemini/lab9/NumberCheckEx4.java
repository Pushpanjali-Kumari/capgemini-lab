package com.capgemini.lab9;
/**
 * 
 * @author Pushpanjali
 *
 */
public class NumberCheckEx4 {
	  private int num;
	  
/**
 * default constructor
 */
	public NumberCheckEx4() {
		super();
	}
/**
 * 
 * @param num
 */
	public NumberCheckEx4(int num) {
		super();
		this.num = num;
	}
/**
 * 
 * @return num
 */
	public int getNum() {
		return num;
	}
/**
 * 
 * @param num
 */
	public void setNum(int num) {
		this.num = num;
	}

    /** 
     * 
     * @param n
     * @return check if num is bigger than the input value n
     */
    boolean isBigger(int n) {
        return num > n;
    }
}
