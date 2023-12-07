public class CodeWar{
	public static void main(String[] args){
		int[] input = {3,4,5,6,7};
		System.out.println(Arrays.toString(squareList(input)));
	}
	
	public static int[] squareList(int[] input){
		int[] squaredList = new int[input.length];
		for(int index = 0; index < input.length; index++){
		squaredList[index] = input[index] * input[index];
		}
	return squaredList;
	}
}