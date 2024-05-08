public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.debug("Stack length: " + stack.length());
        stack.debug("Stack is empty: " + stack.isEmpty());
        stack.debug();

        stack.debug("Attempt to pop a value from an empty stack...");
        stack.pop();
        stack.debug();

        stack.debug("Attempting to peek at an empty stack");
        stack.peek();
        stack.debug();

        stack.debug("Attempting to add value 1 to the stack...");
        stack.push("1");
        stack.dump();
        stack.debug();

        stack.debug("Attempting to peek at a stack with a single value");
        stack.peek();
        stack.debug();

        stack.debug("Attempting to add values 4, 2, 0, Yes!, No :'(");
        stack.push(new String[] {"4", "2", "0", "Yes!", "No :'("});
        stack.dump();
        stack.debug();

        stack.debug("Attempting to peek at a stack with multiple values");
        stack.peek();
        stack.debug();

        stack.debug("Stack length: " + stack.length());
        stack.debug("Stack is empty: " + stack.isEmpty());
        stack.debug();

        stack.debug("Attempting to pop the first value off the top of the stack...");
        stack.debug("Stack length: " + stack.length());
        stack.pop();
        stack.debug("Stack length: " + stack.length());
        stack.dump();

    } // end main

} // end class