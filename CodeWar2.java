public class CodeWar2{
	public static void main(String[] args){
		String[] inputList = {"ale", "apple", "monkey", "plea"};
		String inputWord = "abpcplea";
	}
	
	public static String longestWord(String[] list, String word){
		String longestWord = "";
		for(int index = 0;index < list.length; index++){
			if(wordContains(list[index].matches(word)){
				if(list[index].length() > longestWord.length()) longestWord = list[index];
			}	
		}
		return longestWord;
	}

	public static void wordContains(String compareWord,String word){
		
		
	}
}