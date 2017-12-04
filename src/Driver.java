import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;

public class Driver {
	public static void main(String[] args) {
		double number = 15.4;
		System.out.println(Math.factorial((int)number));
		
		Puppy p1 = new Puppy("Joey");
		Puppy p2 = new Puppy("Chandler");
		Puppy p3 = new Puppy("Ross");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		
		System.out.println(Puppy.numberOfPuppies);	
		
		int[] array = new int[] { 9, 20, 3, 44, 88, 300}; 
		ArrayUtils.reverse(array);
		System.out.println(ArrayUtils.stringifyArray(array));
	}
}
