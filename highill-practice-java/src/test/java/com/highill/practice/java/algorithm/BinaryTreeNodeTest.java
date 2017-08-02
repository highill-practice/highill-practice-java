package com.highill.practice.java.algorithm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class BinaryTreeNodeTest {
	
	@Test
	public void binaryTree() {
		String[] valueArray = new String[]{"d", "c", "a", "b", "m", "n", "o", "p"};
		
		BinaryTreeNode binaryTreeNode = BinaryTreeNode.binaryTreeFromArray(valueArray);
		System.out.println("-----binaryTreeNode: " + binaryTreeNode);
		
		BinaryTreeNode.rootLeftRightRecursion(binaryTreeNode);
		BinaryTreeNode.leftRootRightRecursion(binaryTreeNode);
		BinaryTreeNode.leftRightRootRecursion(binaryTreeNode);
		
		BinaryTreeNode.rootLeftRightStack(binaryTreeNode);
		BinaryTreeNode.leftRootRightStack(binaryTreeNode);
	}

}
