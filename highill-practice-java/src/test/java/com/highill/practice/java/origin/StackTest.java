package com.highill.practice.java.origin;

import java.util.Stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class StackTest {

	@Test
	public void stackMethod() {
		Stack<String> stack = new Stack<String>();
		printStack(stack);

		stack.add("a");
		stack.add("b");
		printStack(stack);

		stack.push("c1");
		stack.push("c2");
		stack.push("c3");
		printStack(stack);

		String pop1 = stack.pop();
		String pop2 = stack.pop();
		String peek1 = stack.peek();
		String peek2 = stack.peek();
		System.out.println("-----pop1: " + pop1);
		System.out.println("-----pop2: " + pop2);
		System.out.println("-----peek1: " + peek1);
		System.out.println("-----peek2: " + peek2);
		printStack(stack);

		String pop = stack.pop();
		while (pop != null) {
			System.out.println("-----pop: " + pop);
			if (stack.size() > 0) {
				pop = stack.pop();
			} else {
				pop = null;
			}
		}
	}

	private void printStack(Stack<?> stack) {
		System.out.println("-----stack: " + stack);
	}

}
