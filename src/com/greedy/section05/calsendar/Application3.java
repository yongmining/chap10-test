package com.greedy.section05.calsendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application3 {

	public static void main(String[] args) {
	
		/* 올 해 크리스마스는 무슨요일일까요? */
		
		/* 2023년 12월 25일 월요일*/
		Calendar calendar =  Calendar.getInstance();
		System.out.println(calendar);
		
		Calendar gregorianCalendar = new GregorianCalendar();
		System.out.println(gregorianCalendar);
		
		int year = 2023;
		int month = 11;
		int dayOfMonth = 25;
		
		Calendar cristmath = new GregorianCalendar(year, month, dayOfMonth);
		System.out.println(cristmath);
		
		java.util.Date date = new java.util.Date(cristmath.getTimeInMillis());
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth).getTimeInMillis());
		System.out.println(date2);
		
		int cristmathYear = cristmath.get(1);
		int cristmathMonth = cristmath.get(2);
		int cristmathDayOfMonth = cristmath.get(5);
		
		System.out.println(cristmathYear);
		System.out.println(cristmathMonth);
		System.out.println(cristmathDayOfMonth);
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
	
		System.out.println("year : " + cristmath.get(Calendar.YEAR));
		System.out.println("month : " + cristmath.get(Calendar.MONTH));
		System.out.println("date : " + cristmath.get(Calendar.DATE));
		
		System.out.println("dayOfWeek : " + cristmath.get(Calendar.DAY_OF_WEEK));
		
		String day = "";
		switch(cristmath.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY :
			day = "일요일";
			break;
		case Calendar.MONDAY :
			day = "월요일";
			break;
		case Calendar.WEDNESDAY :
			day = "화요일";
			break;
		case Calendar.TUESDAY :
			day = "수요일";
			break;
		case Calendar.THURSDAY :
			day = "목요일";
			break;
		case Calendar.FRIDAY :
			day = "금요일";
			break;
		case Calendar.SATURDAY :
			day = "토요일";
			break;
	
	}
	System.out.println("요일 : " + day); 
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEE");
	String result = sdf.format(new Date(cristmath.getTimeInMillis()));
	System.out.println(result);
		
		

	}

}
