package utils;

public class ArrayUtils {
	public static int[] reverse (int[] array) {
		int j;
		for (int i = 0; i < array.length/2; i++ ) {
			j = array.length - 1 - i;
			int temp = array[i]; 
		    array[i] = array[j];
		    array[j] = temp;
		}
		return array;
	}
	
	public static String stringifyArray(int[] array) {
		//Check if the array is empty, return ""
		if(array.length == 0) { 
			return "";
		}
		// We are assigning array[0] to "a" not to have "," at the beginning of the string
		String a = array[0] + "";
		for (int i = 1; i < array.length; i++ ) {
			a = a + "," + array[i];
		}
		return a;
	}
}
