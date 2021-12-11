package main;

public class FizzBuzz {

	public String convertNumber(int number) {
		String message = "";
		if(number % 5 == 0 && number % 7 == 0) {
			message = "FizzBuzz";
		}else if(number % 5 == 0) {
			message = "Fizz";
		}else if(number % 7 == 0) {
			message = "Buzz";
		}
		return message;
	}
}
