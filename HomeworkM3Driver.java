import java.util.*;

public class HomeworkM3Driver {

	public static void main(String[] args) {
/*		
		System.out.println("******TESTING QUESTION 40: REMOVE DUPLICATES FROM BAG");
		BagInterface<String> wordBag = new ArrayBag<>();
		wordBag.add("hi");
		wordBag.add("hello");
		wordBag.add("hi");
		wordBag.add("bye");
		wordBag.add("hi");
		wordBag.add("bye");
		wordBag.add("howdy");
		wordBag.add("HELLO");
		wordBag.add("hi");
		removeDuplicates(wordBag);
		System.out.println("The contents of the bag should be (in ANY order- the order might not match): \n[hello, hi, bye, howdy, HELLO]");
		System.out.println(Arrays.toString(wordBag.toArray()));

		
		System.out.println("\n******TESTING QUESTION 41: CREATING SHORT STRING LIST");
		ListInterface<String> wordList = new AList<>();
		wordList.add("ape");
		wordList.add("dog");
		wordList.add("cockroach"); 
		wordList.add("baboon");
		wordList.add("frog");
		wordList.add("spider");
		wordList.add("cat");
		ListInterface<String> shortWordList = createShortWordList(wordList,4);
		System.out.println("The contents of the list should be (in THIS ORDER): \n[ape, dog, cat]");
		System.out.println(Arrays.toString(shortWordList.toArray()));

		System.out.println("\n******TESTING QUESTION 42: FINDING LAST POSITION");
		List<String> itemList = new ArrayList<>();
		itemList.add("adam");
		itemList.add("frank");
		itemList.add("betty");
		itemList.add("sue");
		itemList.add("sam");
		itemList.add("frank");
		itemList.add("sue");
		itemList.add("terry");
		itemList.add("adam");
		itemList.add("frank");
		System.out.println("The index should be: \n9\n" + lastPosition(itemList, "frank"));
		System.out.println(Arrays.toString(itemList.toArray()));
*/		
		System.out.println("\n******TESTING QUESTION 43: LIST COMPARISON");
		List<Integer> numList1 = new ArrayList<Integer>();
		numList1.add(1);
		numList1.add(3);
		numList1.add(1);
		numList1.add(5);
		numList1.add(7);
		ListInterface<Integer> numList2 = new AList<Integer>();
		numList2.add(1);
		numList2.add(3);
		numList2.add(1);
		numList2.add(5);
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));
		numList2.add(7);
		System.out.println("Equivalent should be: \ntrue\n" + equivalentLists(numList1, numList2));
		numList2.add(8);
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));
		numList1.add(8);
		numList1.add(10);
		System.out.println("Equivalent should be: \nfalse\n" + equivalentLists(numList1, numList2));

/*	
		System.out.println("\n******TESTING EXTRA CREDIT QUESTION 44: MOVE THE MINIMUM TO THE FRONT");
		ListInterface<Integer> numberList = new AList<Integer>();
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[]\n" + Arrays.toString(numberList.toArray()));
		numberList.add(4);
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[4]\n" + Arrays.toString(numberList.toArray()));
		numberList.add(3);
		numberList.add(1);
		numberList.add(5);
		numberList.add(7);
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[1, 4, 3, 5, 7]\n" + Arrays.toString(numberList.toArray()));
		numberList.add(0);
		prioritizeMinimumValue(numberList);
		System.out.println("The list should contain: \n[0, 1, 4, 3, 5, 7]\n" + Arrays.toString(numberList.toArray()));

*/
	}

	public static void removeDuplicates(BagInterface<String> wordBag) {

		BagInterface<String> tempBag = new ArrayBag<String>();

		while(!wordBag.isEmpty()){
			String word = wordBag.remove();
			tempBag.add(word);

			while(wordBag.contains(word)){
				wordBag.remove(word);
			}

		}		

		while(!tempBag.isEmpty()){
			wordBag.add(tempBag.remove());
		}
	}
	
	public static ListInterface<String> createShortWordList(ListInterface<String> wordList, int length) {

		ListInterface<String> shortList = new AList<String>();

		for (int i=1; i<=wordList.getLength(); i++){

			String word = wordList.getEntry(i);

			if (word.length() < length)

				shortList.add(word);				
		}			

		return shortList;
	}

	public static int lastPosition(List<String> wordList, String targetWord){
		int index = -1;
		for (int i = 0; i<wordList.size();i++){
			if (wordList.get(i).equals(targetWord))
				index = i;}
		return index;		
	}
//	public static int lastPosition(List<String> wordList, String targetWord) {
//
//		int lastPosition=-1;
//		int count = 0;
//
//		if (!wordList.isEmpty()){
//
//			while(wordList.contains(targetWord)){
//
//				lastPosition= wordList.indexOf(targetWord);
//
//				for( int i= lastPosition; i < wordList.size(); i++){
//
//					if (wordList.get(i).equals(targetWord)){
//						count++;
//						lastPosition = i;
//					}
//
//				}
//				if(count >1)
//					return lastPosition;
//			}
//			return lastPosition;
//
//		}
//		else
//			return lastPosition;
//
//	}
	
	public static boolean equivalentLists(List<Integer> numberList, ListInterface<Integer> numberListInterface) {

		if (Integer.compare(numberList.size(),numberListInterface.getLength()) != 0)	
			return false;

		else if (numberList.size() >= 0){		
			int i=0; 
			while(i< numberList.size()){
				if( numberList.get(i).equals(numberListInterface.getEntry(i+1)))
					i++;
				else 
					return false;
			}
			return true;
		}
		else
			return false;
	}
	
	public static void prioritizeMinimumValue(ListInterface<Integer> numberList) {
		if(!numberList.isEmpty()){
			int minimum = numberList.getEntry(1);
			int position = 1;
			for (int i=2; i<=numberList.getLength(); i++){
				if(minimum > numberList.getEntry(i)){
					minimum = numberList.getEntry(i);
					position = i;
				}	
			}
			int temp = numberList.getEntry(position);
			numberList.remove(position);
			numberList.add(1, temp);
		}			
	}
}
