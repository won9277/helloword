
public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] intArray = {10,20,30,40,50};
		double[] doubleArray = 
				ArrayUtils.intToDouble(intArray);

		int length = doubleArray.length;
		//for (int i = 0; i < length; i++) {
			//System.out.println(doubleArray[i]);
	//	}
		
		double[] doubleArray2 = {10.0,20.0,30.4,40.4};
		int[] intArray2 = ArrayUtils.DoubleToInt(doubleArray2); 
		int length2 = intArray2.length;
		//for (int i = 0; i < length2; i++) {
		//	System.out.println(intArray2[i]);
		//}

		
		
		int[] intArray9 = {10,20,30,40,50};
		int[] intArray92 = {10,20,30,40,50};
		
		int [] CONON = ArrayUtils.concat(intArray9, intArray92);
				
				for (int i = 0; i < CONON.length; i++) {
					System.out.println(CONON[i]);
					
				}
			
			
			
	}

}
