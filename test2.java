import java.util.*;

public class test2 {
	public static void removeDuplicates(BagInterface<String> wordBag){
		BagInterface<String> tempBag = new ArrayBag<>();

		while(!wordBag.isEmpty()){
			String word = wordBag.remove();
			tempBag.add(word);
			int count = wordBag.getFrequencyOf(word);
			for (int i=count; i>=1;i--){
				wordBag.remove(word);
				tempBag.add(word);
			}
		}
		while(!tempBag.isEmpty())
			wordBag.add(tempBag.remove());
	}
	
	public static ListInterface<String> createShortWordList(ListInterface<String> wordList, int length){
		ListInterface<String> shortList = new AList<String>();
		for (int i = 1; i<=wordList.getLength();i++)
			if (wordList.getEntry(i).length()<=length)
				shortList.add(wordList.getEntry(i));
		return shortList;
	}
	
	public static int lastPosition(List<String> wordList, String targetWord){
		int index = -1;
		for (int i = 0; i<wordList.size();i++){
			if (wordList.get(i).equals(targetWord))
				index = i;}
		return index;		
	}

	public static boolean equivalentLists(List<Integer> numberList, ListInterface<Integer> numberListInterface){
		boolean equal = true;
		while (equal){
			for (int i = 0; i<numberList.size(); i++)
				if (numberList.get(i)!=numberListInterface.getEntry(i+1));
			equal = false;			
		}return equal;
	}

}
