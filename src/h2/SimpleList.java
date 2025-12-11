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
    
    public boolean insertAfter(int preValue, int newValue) {
        Node stelleNode = findFirst(preValue);
    	if(stelleNode!=null) {
    		Node newNode = new Node(newValue);
    		newNode.next = stelleNode.next;
    		stelleNode.next = newNode;
    		return true;
    	}
    	return false;
    }
    
    public boolean delete(int value) {
    	if(value != Integer.MIN_VALUE) {
    		Node stelleNode = findFirst(value);
    		if(stelleNode!=null) {
    			Node tempNode = head;
    			while(tempNode.next!=stelleNode) {
    				tempNode = tempNode.next;
    			}
    			tempNode.next = tempNode.next.next;
    			return true;
    		}
    		return false;
    	}
    	return false;
    }
}
