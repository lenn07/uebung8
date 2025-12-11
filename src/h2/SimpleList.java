package h2;

import java.lang.runtime.TemplateRuntime;
import java.security.Timestamp;

public class SimpleList {
    Node head;
    public SimpleList() {
		head = new Node(Integer.MIN_VALUE);
		head.next = null;
	}
    
    public Node getFirst() {
		if(head.next!=null) {
			return head.next;
		}
        return null;
	}
    
    public Node getLast() {
		Node temp = head;
        while(temp.next!=null) {
        	temp = temp.next;
        }
        if(temp != head) {
        	return temp;    	
        }
        return null;
	}
    
    public void append(int newValue) {
    	Node newNode = new Node(newValue);
    	if(head.next != null) {
    	    getLast().next = newNode;
    	}else {
			head.next = newNode;
		}
    }
    
    public Node findFirst(int value) {
    	Node temp = head.next;
    	while(temp != null && temp.value != value) {
    		temp = temp.next;
    	}
    	return temp;
    }
}
