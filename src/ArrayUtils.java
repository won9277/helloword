
public class ArrayUtils {
	public static double[] intToDouble(int[] src){
		
		int length = src.length;
		
		double []  doubleArray = new double[length];
		
		for (int i = 0; i < length; i++) {
			doubleArray [i] = src [i] ;
		}
		return doubleArray;
	}
	
	
public static int[] DoubleToInt(double[] src2){
		
		int length = src2.length;
		
		int []  intArray = new int[length];
		
		for (int i = 0; i < length; i++) {
			intArray [i] = (int)src2 [i] ;
		}
		return intArray;
	}
	
public static int[] concat(int src3[],int src4[]){
	
	int length1 = src3.length;
	int length2 = src4.length;
	int length = length1 + length2;
	
	
	int []  intCon = new int[length];
	
	for (int i = 0; i < length1; i++) {
		intCon [i] = src3 [i] ;
	}
	for (int i = length1; i < length; i++) {
		intCon [i] = src4 [i] ;
	}
	return intCon;
}
	
}
