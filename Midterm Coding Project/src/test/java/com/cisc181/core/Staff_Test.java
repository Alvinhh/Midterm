package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static Staff ex1,ex2,ex3,ex4,ex5;
	ArrayList<Staff>staffs = new ArrayList<Staff>(5);
	public static Date date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		return date.getTime();
		}
	
	@BeforeClass
	public static void setup() {
		
		ex1 = new Staff("A", "B", "C", date(1995,9,3), "Newark",
				"(111)-111-1111", "ABC@gmail.com", "9 to 12", 5, 4000, date(2010,5,1), eTitle.MR);
		ex2 = new Staff("D", "E", "F", date(1970,3,9), "Newark",
				"(222)-222-2222", "DEF@gmail.com", "9 to 12", 4, 8000, date(1995,6,30), eTitle.MRS);
		ex3 = new Staff("G", "H", "I", date(1969,6,15), "Newark",
				"(333)-333-333", "GHI@gmail.com", "9 to 12", 3, 7000, date(1990,5,18), eTitle.MR);
		ex4 = new Staff("J", "K", "L", date(1995,2,25), "Newark",
				"(444)-444-4444", "JKL@gmial.com", "9 to 12", 2, 5000, date(2013,4,30), eTitle.MS);
		ex5 = new Staff("M", "N", "O", date(1994,9,28), "Nwark",
				"(555)-555-555", "MNO@gmial.com", "9 to 12", 1, 6000, date(2014,2,6), eTitle.MR);
		
	}
	
	@Test
	public void testofsalary() {
		int avg = (int) ((ex1.getSalary() + ex2.getSalary() + ex3.getSalary() + ex4.getSalary() + ex5.getSalary())/5);
		assertEquals(avg,6000); 
		
	}	

	@Test
	public void DOBExceptiontest() throws PersonException {
		Staff ex1 = new Staff("A", "B", "C", date(1995,9,4), "Newark",
			"(111)-111-111", "ABC@gmial.com", "9 to 12", 5, 4000, date(2018,5,1), eTitle.MR);
	}
	
	@Test
	public void phoneExceptiontest() throws PersonException {
		Staff ex1 = new Staff("A", "B", "C", date(1995,9,3), "Newark",
				"(111)-111-111", "ABC@gmial.com", "9 to 12", 5, 4000, date(2010,5,1), eTitle.MR);
	}

}
