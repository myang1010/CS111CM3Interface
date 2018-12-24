/*Assume you have a class called Movie with instance data variables:

private String name;

private int releaseYear;

Assume this class will now implement the Comparable interface. 

Write the class header for this class.
Write the complete compareTo method using the following logic:
movies are ordered based first on name (ignoring capitalization) and then 
by year (e.g., only if two movies have the same name, then they will be ordered based on their year)
 * */


import java.util.*;

//public class Movie implements Comparable<Movie>{
//	private String name;
//	private int releaseYear;
//
//	public static void main(String[] args){
//		
//	}
//	
//	@Override
//	public int compareTo(Movie other){
//	
//		if (name.compareTo(other.name)==0){
//			
//			return Integer.compare(releaseYear, other.releaseYear);
//		}
//		else 
//			return name.compareTo(other.name);
//		}
// }
public class Movie implements Comparable<Movie>{
	private String name;
	private int releaseYear;

	@Override
	public int compareTo(Movie otherMovie){
		if (this.name.equalsIgnoreCase(otherMovie.name))
			return Integer.compare(this.releaseYear, otherMovie.releaseYear);
		else
			return(this.name.compareToIgnoreCase(otherMovie.name));
	}
}
/*
 * Write a complete method from the client perspective to remove duplicates from a bag of Strings.
The method header is:
public static void removeDuplicates(BagInterface<String> wordBag)
Notes:
You can use local objects of type BagInterface (initialized as ArrayBag).
For full credit, do not use another data structure, such as ArrayLIst or an array. Post any questions about what you can and cannot use inside th emethod.
For full credit, do not invoke the toArray() method on wordBag.
 * */		

	
