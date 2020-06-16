package muno;

public class twoconsective {
	public boolean hasTwoConsecutive() {
	    ListNode current = front;
	    
	    if (front == null) {
	        return false;
	    } else {
	    
	        while (current.next != null) {
	            if (current.data + 1 == current.next.data) {
	                return true;
	            }
	            current = current.next;
	        }
	        
	        return false;
	    }
	}


}
