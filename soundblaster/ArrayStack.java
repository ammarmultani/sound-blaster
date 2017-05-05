import java.util.EmptyStackException;

class ArrayStack implements DStack {
	double[] stack;
	int index;

	/**                  i 
     * 	[2],[3],[3],[3],[3],[ ],[ ],[ ],[ ],[ ],[ ]
     */
	public ArrayStack(){
		stack = new double[10];
		index = 0;
	}

	// resize stack array to be double its size
	private void resize(){
		double[] temp = new double[stack.length * 2];

		for (int i = 0; i < stack.length; i++) {
			temp[i] = stack[i];	
		}

		stack = temp;
	}

	/** 
     * is empty?
     */
    public boolean isEmpty(){
    	if (index == 0) {
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
    	stack[index] = d;
    	index++;

    	if (index >= stack.length) {
    		resize();
    	}
    }

    /**
     * pop
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */
    public double pop(){
    	if (isEmpty()) {
    		throw new EmptyStackException();
    	}

    	index--;
    	return stack[index];
    }

    /**
     * peek
     * @throws EmptyStackException if stack is empty
     */
    public double peek(){
    	if (isEmpty()) {
    		throw new EmptyStackException();
    	}
    	return stack[index-1];
    }

}