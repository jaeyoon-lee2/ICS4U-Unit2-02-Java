/*
* This class creates an integer stack.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-18
*/
// package ca.mths.unit2.unit02.java.mrCoxallStack;

import java.util.Stack;

public final class MrCoxallStack {
    // private MrCoxallStack() {
    //     // Prevent instantiation
    //     // Optional: throw an exception e.g. AssertionError
    //     // if this ever *is* called
    //     throw new IllegalStateException("Cannot be instantiated");
    // }

    /** create the stack as an ArrayList (array that grows as I need it!). */
    private static Stack<Integer> stack = new Stack<Integer>();

    /**
    * This method push an integer to the stack.
    * @param pushNumber
    */
    public void push(final int pushNumber) {
        this.stack.push(pushNumber);
    }

    /**
    * This method returns the last integer in the stack.
    * @return lastIntegerOfStack
    */
    public int peek() {
        return this.stack.get(this.stack.size() - 1);
    }

    /**
    * This method pops the top integer from the stack.
    * @return lastIntegerOfStack
    */
    public int pop() {
        int element = this.peek();
        this.stack.remove(this.stack.size() - 1);
        return element;
    }

    /**
    * This method prints out the list of items in the stack.
    */
    public void showStack() {
        System.out.print("\n");
        for (int index = 0; index < this.stack.size(); index++) {
            System.out.println(this.stack.get(index));
        }
        System.out.println("\n");
    }
}
