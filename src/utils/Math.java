package utils;

public class Math {
	public static long factorial(int number) {
		if(number == 0) {
			return 1;
		}
		return number * factorial(number - 1); 
	}
	
	public static long factorialLoop(int number) {
		long a = 1;
		for (int i = number; i > 1; i--) {
			a = a * i;  
		}
		return a;
	}
	
}


