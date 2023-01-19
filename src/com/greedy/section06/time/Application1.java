package com.greedy.section06.time;

import java.time.LocalTime;

public class Application1 {

	public static void main(String[] args) {
		/* time 패지는 JDK 1.8에서 추가된 기능이다. 
		 * Date, Calendar가 가지고 있는 단점을 해소하기 위해서 탄생되었다.
		 * 
		 * time 패키지의 하위 패키지
		 * java.time
		 * ㄴjava.time.chrono : ISO-8601에 정으된 달력 시스템을 위한 클래스들을 제공한다.
		 * ㄴjava.time.format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
		 * ㄴjava.time.temporal : 날짜와 시간 필드와 단위 관련 클래스 제공
		 * ㄴjava.time.zone : 시간대에 관련된 기능 제공
		 * 
		 * LocalTime, LocalDate, LocalDateTime, ZonedDateTime
		 * */
		
		LocalTime timeNow = LocalTime.now();
		
		System.out.println("timeNow : " + timeNow);
	}

}
