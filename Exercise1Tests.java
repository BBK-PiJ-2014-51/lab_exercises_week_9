
class Exercise1Test{
	public static void main(String[] args) {
		//ex1.1 tests
		IntegerTreeNode tree = new IntegerTreeNode(50);
		tree.add(25);
		tree.add(26);
		tree.add(77);
		tree.add(91);
		tree.add(13);
		tree.add(44);
		tree.add(56);
		tree.add(77);
		System.out.println("Does tree contain 77? " + tree.contains(77));
		System.out.println("Minimum value in tree? " + tree.getMin());
		System.out.println("Max value in tree? " + tree.getMax());
		
		
	}
	
}