package delfy;

public class AClass {

	private int i;

	public AClass(int j) {
		if (j < 0)
			throw new IllegalArgumentException();

		i = j;
	}

	public int getValue(){
		if(i<5)
			i++;
		
		return i;
	}
	
}
