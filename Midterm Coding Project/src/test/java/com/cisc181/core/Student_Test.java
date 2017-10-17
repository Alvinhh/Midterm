package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {
	private static ArrayList<Course>course = new ArrayList<Course>(3);
	private static ArrayList<Semester>semester = new ArrayList<Semester>(2);
	private static ArrayList<Section>sections = new ArrayList<Section>(2);
	private static ArrayList<Student>students = new ArrayList<Student>(10);
	private static ArrayList<Enrollment>enrollment = new ArrayList<Enrollment>(2);
	private static Student ex1,ex2,ex3,ex4,ex5;
	
	public static Date date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		return date.getTime();
		}
	
	@BeforeClass
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
}