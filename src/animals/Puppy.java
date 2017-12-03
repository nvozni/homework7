package animals;
public class Puppy {
	private String name;
	public static int numberOfPuppies = 0;
	public Puppy(String n) {
		this.name = n;
		Puppy.numberOfPuppies++;
	}
	
	public String getName() {
		return this.name;
	}
}