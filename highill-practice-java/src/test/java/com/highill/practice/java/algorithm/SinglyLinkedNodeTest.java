package com.highill.practice.java.algorithm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class SinglyLinkedNodeTest {
	
	@Test
	public void reserve() {
		int[] valueArray = new int[]{1, 2, 5, 7, 8, 9, 10};
		
		SinglyLinkedNode head = new SinglyLinkedNode().init(valueArray);
		head.print();
		
		SinglyLinkedNode reserverHead = head.reserver(head);
		head.print();
		reserverHead.print();
	}

}
