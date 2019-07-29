package com.zensar.spring.instruments;
/*
 * Author: SHIVAM SHUKLA
 * Creation Date: 27th Jul'19 05:30 PM
 * Modified Date: 27th Jul'19 05:30 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is used to represent an instrument Guitar
 */
public class Guitar implements Instrument {

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("VANDE MATRAM....");
	}
	public void tune() {
		System.out.println("Guitar ");
	}
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println(" Guitar is clean ");
	}
}
