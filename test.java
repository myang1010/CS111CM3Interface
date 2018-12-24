import java.util.*;

public class test {

	public static void main(String[] args){
		
		List<String> wordList = new ArrayList<String>();		
		wordList.add("sun");
		wordList.add("tree");
		wordList.add("bird"); 
		wordList.add("ocean");
		for(String word : wordList) { 
		     System.out.println();
		}
		
		
		
//		BagInterface<String> wordBag = new ArrayBag<String>();
//		wordBag.add("bird");
//		wordBag.add("tree");
//		wordBag.add("bird"); 
//		while(wordBag.contains("bird")) {     
//		     wordBag.remove("bird"); 
//		}

//		ListInterface<String> wordList = new AList<String>();
//		wordList.add("apple");
//		wordList.add("banana");
//		wordList.add("carrot"); 
//		wordList.add("watermelon");
//		for(int i=1; i<=wordList.getLength(); i++) {
//		     wordList.remove(i);
//		}
//		System.out.println(wordList.isEmpty());
//		
	}
}
