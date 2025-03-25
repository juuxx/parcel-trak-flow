package org.example.parcel.service;

import static java.time.DayOfWeek.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DeliveryDatePolicy {
	public static LocalDate calculate(LocalDateTime reservedAt) {
		DayOfWeek day = reservedAt.getDayOfWeek();
		boolean isMorning = reservedAt.toLocalTime().isBefore(LocalTime.NOON);

		if ((day == SATURDAY || day == SUNDAY) || !isMorning) {
			return reservedAt.toLocalDate().plusDays(1); // 평일 다음 날 배송
		} else {
			return reservedAt.toLocalDate(); // 당일 배송
		}
	}
}
