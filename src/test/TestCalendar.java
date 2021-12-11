package test;

import java.util.GregorianCalendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {2000, 2004, 2008, 2012, 2016})
	public void Should_return_true(int year) {
		Calendar calendar = new Calendar(year);
		Assertions.assertTrue(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2001, 2005, 2007, 2013, 2021})
	public void Should_return_false(int year) {
		Calendar calendar = new Calendar(year);
		Assertions.assertFalse(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {214, -2024, 6829, 12, 3259})
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar calendarGregorian = new GregorianCalendar();
		Calendar calendar = new Calendar(year);
		if(year > 0) {
			Assertions.assertEquals(calendarGregorian.isLeapYear(year), calendar.isLeapYear());
		}else {
			Assertions.assertFalse(calendar.isLeapYear());
		}
	}

	@ParameterizedTest
	@ValueSource(ints = {-2008, 0, Integer.MIN_VALUE})
	public void Should_return_false_if_year_is_negative_or_null(int year) {
		Calendar calendar = new Calendar(year);
		Assertions.assertFalse(calendar.isLeapYear());
	}
}
