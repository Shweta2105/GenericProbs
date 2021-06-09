package generic;


/*
 * @author Shweta
 * Program is to  find the maximum from the given Integer,double,String
 * 
 */

public class CheckMaximum<E extends Comparable<E>> {
	
	E i, j, k;
	
	
	public CheckMaximum(E i, E j, E k) {
		//constructor
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public CheckMaximum() {
		
	}

	public E maximum() {
		return (E) CheckMaximum.maximum(i, j, k);
		
	}

	//generic method maximum to check n return max number
	
	public static <E extends Comparable<E>> E maximum(E i, E j, E k) {
		E max = i; //assuming i as max
		if(j.compareTo(max) > 0 ) { //comparing max to j
			max = j;
		}
		if(k.compareTo(max) > 0 ) { //comparing max to k
			max = k;
		}
		printMax(i,j,k,max);
		
		return max; //returns max value
	}
	
	private static <E> void printMax(E i, E j, E k, E max) {
		System.out.printf("Max of %s,%s and %s is %s \n\n",i,j,j,max);
		
	}

	public static void main(String[] args) {
		//calling method maximum from main method
		Integer intx =7, inty = 10, intz = 5;
		Double dx = 3.6, dy = 1.4, dz = 9.5;
		String  s1 = "amrut", s2 = "pooja", s3 = "hari";
		CheckMaximum max= new CheckMaximum();
		
		max.maximum(intx,inty,intz);
		max.maximum(dx,dy,dz);
		max.maximum(s1,s2,s3);
		
		
	}
}
