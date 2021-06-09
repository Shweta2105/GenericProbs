package generic;

public class PrintArray <X , Y, Z> {
	X[] myXArray;
	Y[] myYArray;
	Z[] myZArray;
	
	public PrintArray(X[] myXArray, Y[] myYArray,Z[] myZArray) {
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;	
	}
	
	
	public static void main(String[] args) {
		Integer[] intArr = {4,6,12,65,9};
		Double[] DoubleArr = {8.0,3.2,9.5,7.5};
		Character[] CharArr= {'a','f','e','o'};
		toprint(intArr);
		toprint(DoubleArr);
		toprint(CharArr);
		new PrintArray<Integer, Double, Character>(intArr, DoubleArr, CharArr).toprint();
		
	}
	 private void toprint() {
		
		toprint(myXArray);
		toprint(myYArray);
		toprint(myZArray);
		
		
	}
	 
	 private static <E> void toprint(E[] a) {
		 for(E element : a) {
			 System.out.println(element);
		 }
	 }
	


}
