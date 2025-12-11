package h2;

public class H2_main {
    public static void main(String[] args) {
		SimpleList myList = new SimpleList();
		myList.append(12);
		myList.append(45);
		myList.append(66);
		myList.append(12);
		myList.append(45);
		myList.append(60);
		
		myList.insertAfter(45, 4);
		
		myList.delete(45);
		
		Node hilf = myList.head.next;
		while (hilf != null) {
			System.out.print(hilf.value + "; ");
			hilf = hilf.next;
			
		}
		
		System.out.println("\n"+myList.findFirst(45).next.value);
	}
}
