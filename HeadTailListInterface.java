/**
 * An interface for the ADT list. Entries in a list have positions that begin with 0. 
 * Entries can only be added to and removed from the beginning or end of the list.
 * Entries can be accessed in any position.
 * 
 * @author Ming King
 *
 */
public interface HeadTailListInterface<T> {
	
	/**
	 * Adds a new entry to the beginning of this list. Entries
	 * originally at and above position 1 are at the next higher
	 * position within the list. The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 * 
	 */
	public void addFront(T newEntry);
	
	/**
	 * Adds a new entry to the end of this list. Entries currently in the list
	 * are unaffected. The list's size is increased by 1.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 */
	public void addBack(T newEntry);
	
	/**
	 * Remove the first entry of this list. Entries originally at 
	 * positions higher than the first position are at the next lower
	 * position within the list, and the list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry.
	 * @throws IndexOutOfBoundsException if the list is empty.           
	 */
	public T removeFront();
	
	/**
	 * Remove the last entry of this list. Entries currently in the list
	 * are unaffected. The list's size is decreased by 1.
	 * 
	 * @return A reference to the removed entry.
	 * @throws IndexOutOfBoundsException if the list is empty. 
	 */
	public T removeBack();
	
	/**
	 * Retrieves the entry at a given position in this list.
	 * 
	 * @param position An integer that indicates the position of the desired entry.
	 * @return A reference to the indicated entry.
	 * @throws IndexOutOfBoundsException
	 *             if either givenPosition less than 0 or givenPosition greater than size().
	 */
	public T getEntry(int position);
	
	/**
	 * Retrieves all entries that are in this list in the order in which they
	 * occur in the list.
	 */
	public void display();
	
	/**
	 * Sees whether this list contains a given entry.
	 * 
	 * @param entry The object that is the desired entry.
	 * @return The index number of the desired entry in this list.
	 */
	public int contains (T entry);
	
	/**
	 * Sees whether this list is empty.
	 * 
	 * @return True if the list is empty, or false if not.
	 */
	public boolean isEmpty();
	
	/**
	 * Gets the number of entries in this list.
	 * 
	 * @return The integer number of entries currently in the list.
	 */
	public int size();
	
	/** Removes all entries from this list. */
	public void clear();

}// end HeadTailListInterface
