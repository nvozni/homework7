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
		if(array.length == 0) { //in case of the array is empty
			return "";
		}
		String a = array[0] + "";
		// as we start from 1, we will not have array[0], so, in String, 
		//we should put array[0], we did it, as we did not want to have String a ="" after "" "," ]
		for (int i = 1; i < array.length; i++ ) {
			a = a + "," + array[i];
		}
		return a;
	}
}



	 
	
