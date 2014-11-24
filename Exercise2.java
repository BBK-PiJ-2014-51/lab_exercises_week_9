class Exercise2{
	public static void main(String[] args) {
		//ex2.1 tests
				System.out.println("Ex2.1 tests");
				IntSet tree = new TreeIntSet(50);
				tree.add(25);
				tree.add(26);
				tree.add(77);
				tree.add(91);
				tree.add(13);
				tree.add(44);
				tree.add(56);
				tree.add(77);
				tree.containsVerbose(26);
				tree.containsVerbose(77);
				System.out.println("");
	}
}