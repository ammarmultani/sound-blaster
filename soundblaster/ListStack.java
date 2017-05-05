import java.util.EmptyStackException;

class ListStack implements DStack {
	ListNode first;
	ListNode last;

	public ListStack(){
		first = null;
		last = null;
	}

	/** 
     * is empty?
     */
    public boolean isEmpty(){

    	if (last == null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    /**
     * push
     */
    public void push(double d){
    	if (first == null) {
    		first = new ListNode(d);
    		last = first;
    	}
    	else {
    		last.next = new ListNode(d);

    		last.next.prev = last;
    		last = last.next;
    	}
    }

    /**
     * pop
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */
    public double pop(){
    	if (this.isEmpty()) {
    		throw new EmptyStackException();
    	}

    	double value;

    	if (first == last) {
    		value = first.value;
    		first = null;
    		last = null;
    		return value;
    	}

    	value = last.value;
    	last = last.prev;
    	last.next = null;
    	return value;
    }

    /**
     * peek
     * @throws EmptyStackException if stack is empty
     */
    public double peek(){
    	if (this.isEmpty()) {
    		throw new EmptyStackException();
    	}
    	return last.value;
    }
}








