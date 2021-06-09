package generic;

/*
 * @author Shweta
 * Program is to  find the maximum from the given Integer
 * 
 */

public class CheckMaximum {
	
	//generic method maximum to check n return max number
	
	public static <E extends Comparable<E>> E maximum(E i, E j, E k) {
		E max = i; //assuming i as max
		if(j.compareTo(max) > 0 ) { //comparing max to j
			max = j;
		}
		if(k.compareTo(max) > 0 ) { //comparing max to k
			max = k;
		}
		
		return max; //returns max value
	}
	
	public static void main(String[] args) {
		//calling method maximum from main method
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
	}
}
