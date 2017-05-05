class ListNode {
	public double value;
	public ListNode next;
	public ListNode prev;


	/**  
	 *   F       L  
     * 	[2] <-> [3] <-> null
     */

	// ListNode node = ....;

	// while(node != Null){
	// 	System.out.println(node.value);
	// 	node = node.next;
	// }

	public ListNode(double value) {
		this.value = value;
		next = null;
		prev = null;
	}
}