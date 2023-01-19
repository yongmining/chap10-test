package com.greedy.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {

	public static void main(String[] args) {
		 
		String timeNow = "14:05:10";
		String dateNow = "2022-10-12";
		
		LocalTime localTime = LocalTime.parse(timeNow);
		LocalDate localDate = LocalDate.parse(dateNow);
		LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);
		
		System.out.println(localTime);
		System.out.println(localDate);
		System.out.println(localDateTime);
		
		String timeNow2 = "14-05-10";
		String dateNow2 = "221005";
		
		LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
		LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
		
		System.out.println(localTime2);
		System.out.println(localDate2);
		
		String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-DD"));
		String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH시 mm분"));
		
		System.out.println(dateFormat);
		System.out.println(timeFormat);
		
		
	}
}
