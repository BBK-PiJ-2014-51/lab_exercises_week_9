public interface IntSortedList{
	
	//adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set.
	boolean add(int num); 
	
	//returns true if the number is in the list, false otherwise.
	boolean contains(int num);
	
	//returns a string with the values of the elements in the list separated by commas.
	String toString(); 
}