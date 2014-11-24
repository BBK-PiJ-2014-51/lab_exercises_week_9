
public class IntegerTreeNode{
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	IntegerTreeNode(int newNumber){
		value = newNumber;
		left = null;
		right = null;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public int getMin(){
		return (left == null) ? value : left.getMin() ;
	}
	
	public int getMax(){
		return (right == null) ? value : right.getMax() ;
	}

}