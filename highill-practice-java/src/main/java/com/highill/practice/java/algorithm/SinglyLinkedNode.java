package com.highill.practice.java.algorithm;

public class SinglyLinkedNode {
	
	private int data;
	
	private SinglyLinkedNode next;
	
	public SinglyLinkedNode() {
		data = 0;
	}
	
	public SinglyLinkedNode(int data) {
		this.data = data;
	}
	
	public SinglyLinkedNode(int data, SinglyLinkedNode next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SinglyLinkedNode getNext() {
		return next;
	}

	public void setNext(SinglyLinkedNode next) {
		this.next = next;
	}
	
	public SinglyLinkedNode init(int[] valueArray) {
		SinglyLinkedNode head = null;
		if(valueArray != null && valueArray.length > 0) {
			SinglyLinkedNode preNode = null;
			for(int size = 0; size < valueArray.length; size++) {
				SinglyLinkedNode node = new SinglyLinkedNode(valueArray[size]);
				if(preNode != null) {
					preNode.setNext(node);
				}
				preNode = node;
				if(size == 0) {
					head = node;
				}
			}
		}
		return head;
	}
	
	public SinglyLinkedNode reserver(SinglyLinkedNode head) {
		long startTimeMillis = System.currentTimeMillis();
		SinglyLinkedNode newHead = null;
		if(head != null && head.getNext() != null ) {
			SinglyLinkedNode n1 = head;
			SinglyLinkedNode n2 = head.getNext();
			SinglyLinkedNode temp = null;
			while(n2 != null) {
				temp = n2.getNext();
				n2.setNext(n1);
				n1 = n2;
				n2 = temp;
			}
			
			// head.getNext().setNext(null);
			head.setNext(null);
			newHead = n1;
		}
		long finishTimeMillis = System.currentTimeMillis();
		long usedTimeMillis = finishTimeMillis - startTimeMillis;
		System.out.println("----- reserve usedTimeMillis: " + usedTimeMillis + ",    usedSecond: " + (usedTimeMillis / 1000));
		return newHead;
	}
	
	public void print() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(data);
		SinglyLinkedNode printNode = next;
		while(printNode != null) {
			stringBuffer.append(" -> " );
			stringBuffer.append(printNode.getData());
			printNode = printNode.getNext();
		}
		System.out.println("head -> end is: [" + stringBuffer.toString() + "]");
	}

	@Override
    public String toString() {
	    return "SinglyLinkedNode [data=" + data + ", next=" + next.data + "]";
    }
	
	
	

}
