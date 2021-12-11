package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		Assertions.assertEquals(3, calculator.add(1, 2));
	}

	@ParameterizedTest
	@CsvSource({"10, 6"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		Assertions.assertEquals(valueOne + valueTwo, calculator.add(valueOne, valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		Assertions.assertEquals(4, calculator.sub(6, 2));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		Assertions.assertEquals(12, calculator.multiply(4, 3));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		Assertions.assertEquals(17, calculator.divide(34, 2));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			calculator.divide(Integer.MAX_VALUE, 0);
		});
	}
}
