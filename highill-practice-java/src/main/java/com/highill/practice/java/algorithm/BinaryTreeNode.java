package com.highill.practice.java.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeNode {

	private String value;

	private BinaryTreeNode leftSubTreeNode;

	private BinaryTreeNode rightSubTreeNode;

	public BinaryTreeNode(String value) {
		this.value = value;
	}

	public BinaryTreeNode(String value, BinaryTreeNode leftSubTreeNode, BinaryTreeNode rightSubTreeNode) {
		this.value = value;
		this.leftSubTreeNode = leftSubTreeNode;
		this.rightSubTreeNode = rightSubTreeNode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BinaryTreeNode getLeftSubTreeNode() {
		return leftSubTreeNode;
	}

	public void setLeftSubTreeNode(BinaryTreeNode leftSubTreeNode) {
		this.leftSubTreeNode = leftSubTreeNode;
	}

	public BinaryTreeNode getRightSubTreeNode() {
		return rightSubTreeNode;
	}

	public void setRightSubTreeNode(BinaryTreeNode rightSubTreeNode) {
		this.rightSubTreeNode = rightSubTreeNode;
	}

	public static BinaryTreeNode insert(String value, BinaryTreeNode treeRoot) {
		// BinaryTreeNode binaryTree = null;
		if (value != null) {
			if (treeRoot == null) {
				treeRoot = new BinaryTreeNode(value);
			} else {
				int compareResult = value.compareTo(treeRoot.getValue());
				if (compareResult < 0) {
					BinaryTreeNode binaryTree = insert(value, treeRoot.getLeftSubTreeNode());
					treeRoot.setLeftSubTreeNode(binaryTree);
				} else if (compareResult > 0) {
					BinaryTreeNode binaryTree = insert(value, treeRoot.getRightSubTreeNode());
					treeRoot.setRightSubTreeNode(binaryTree);
				} else {
					System.out.println("value " + value + " is duplicate value. ");
				}
			}
		}
		return treeRoot;
	}

	public static BinaryTreeNode binaryTreeFromArray(String[] valueArray) {
		BinaryTreeNode binaryTree = null;
		if (valueArray != null && valueArray.length > 0) {
			for (String value : valueArray) {
				binaryTree = insert(value, binaryTree);
			}
		}
		return binaryTree;
	}

	public static List<String> rootLeftRightRecursion(BinaryTreeNode rootTree) {
		ArrayList<String> valueList = new ArrayList<String>();
		rootLeftRightRecursionNode(rootTree, valueList);
		System.out.println("-----rootLeftRightRecursion: " + valueList);
		return valueList;
	}

	private static void rootLeftRightRecursionNode(BinaryTreeNode treeNode, ArrayList<String> valueList) {
		if (treeNode != null && valueList != null) {
			valueList.add(treeNode.getValue());
			rootLeftRightRecursionNode(treeNode.getLeftSubTreeNode(), valueList);
			rootLeftRightRecursionNode(treeNode.getRightSubTreeNode(), valueList);
		}
	}

	public static List<String> leftRootRightRecursion(BinaryTreeNode rootTree) {
		List<String> valueList = new ArrayList<String>();
		leftRootRightRecursionNode(rootTree, valueList);
		System.out.println("-----leftRootRightRecursion: " + valueList);
		return valueList;
	}

	private static void leftRootRightRecursionNode(BinaryTreeNode treeNode, List<String> valueList) {
		if (treeNode != null && valueList != null) {
			leftRootRightRecursionNode(treeNode.getLeftSubTreeNode(), valueList);
			valueList.add(treeNode.getValue());
			leftRootRightRecursionNode(treeNode.getRightSubTreeNode(), valueList);
		}
	}

	public static List<String> leftRightRootRecursion(BinaryTreeNode rootTree) {
		List<String> valueList = new ArrayList<String>();
		leftRightRootRecursionNode(rootTree, valueList);
		System.out.println("-----leftRightRootRecursion: " + valueList);
		return valueList;
	}

	private static void leftRightRootRecursionNode(BinaryTreeNode treeNode, List<String> valueList) {
		if (treeNode != null && valueList != null) {
			leftRightRootRecursionNode(treeNode.getLeftSubTreeNode(), valueList);
			leftRightRootRecursionNode(treeNode.getRightSubTreeNode(), valueList);
			valueList.add(treeNode.getValue());
		}
	}

	public static List<String> rootLeftRightStack(BinaryTreeNode rootTree) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		List<String> valueList = new ArrayList<String>();
		if (rootTree != null) {
			stack.push(rootTree);
			while (!stack.empty()) {
				BinaryTreeNode currentTree = stack.pop();
				valueList.add(currentTree.getValue());
				if (currentTree.getRightSubTreeNode() != null) {
					stack.push(currentTree.getRightSubTreeNode());
				}
				if (currentTree.getLeftSubTreeNode() != null) {
					stack.push(currentTree.getLeftSubTreeNode());
				}
			}
		}
		System.out.println("-----rootLeftRightStack: " + valueList);
		return valueList;
	}

	public static List<String> leftRootRightStack(BinaryTreeNode rootTree) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		List<String> valueList = new ArrayList<String>();
		if (rootTree != null) {
			BinaryTreeNode currentNode = rootTree;
			while (currentNode != null || !stack.empty()) {
				while (currentNode != null) {
					stack.add(currentNode);
					currentNode = currentNode.getLeftSubTreeNode();
				}
				currentNode = stack.peek();
				stack.pop();
				valueList.add(currentNode.getValue());
				currentNode = currentNode.getRightSubTreeNode();

			}
		}
		System.out.println("-----leftRootRight: " + valueList);
		return valueList;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [value=" + value + ", leftSubTreeNode value="
		        + (leftSubTreeNode == null ? null : leftSubTreeNode.getValue()) + ", rightSubTreeNode value="
		        + (rightSubTreeNode == null ? null : rightSubTreeNode.getValue()) + "]";
	}

}
