/**
 * Creates a new Stack object - A list with a FILO order structure.
 */
public class Stack {
    /**
     * The Node class - Used to construct a Node object which stores the value of each
     * element in the stack as well as the Node object that it is pointing to (next element).
     */
    public static class Node {

        /**
         * The string value that this node holds
         */
        private String value;

        /**
         * The node that this node is pointing to
         */
        private Node next;

        /**
         * Constructs a new node using the passed String as its value.
         */
        public Node(String str) {
            value = str;
            next = null;

        } // end constructor

        /**
         * Overrides the default toString() method to return the details of this node
         * @return An informative string containing the details of this node
         */
        @Override
        public String toString() {
            return "Node value: " + value;

        } // end string

    } // end class

    /**
     * Enables/disables debugging messages for developer testing - designed only to be toggled via hard coding.
     */
    final boolean debugging = true;

    /**
     * The first node in this list
     */
    Node head;

    /**
     * Constructs a new stack that takes store string values
     */
    public Stack() {
        head = null;

    } // end constructor

    /**
     * Adds the passed item to the top of the stack
     * @param str The String value being added to the top of the stack
     */
    public void push(String str) {
        // ensures the passed string is not empty
        if (str.trim().isEmpty()) {
            System.out.println("Error pushing value onto stack, passed string was empty!");
            return;

        } // end if

        // stores the existing head before overwriting it
        Node oldHead = head;
        // creates a node using the passed value to replace the existing head
        head = new Node(str.trim());
        // attaches the existing stack to the new head
        head.next = oldHead;

        debug("Successfully pushed value \"" + str + "\" onto the stack!");

    } // end void

    /**
     * ~ METHOD NOT DESIGNED FOR ASSESSMENT ~
     *
     * Adds an array of String values to this stack. Each element of the array will be added to the top of the stack, starting with the 0th item in the array.
     * @param strArray The array of Strings to add to this stack
     */
    void push(String[] strArray) {
        if (strArray.length == 0) {
            debug("Unable to add array of values, the passed array was empty!");
            return;

        } // end if

        for (String str : strArray)
            push(str);

        debug("Successfully added " + strArray.length + " items to the stack!");

    } // end void

    /**
     * Removes and returns the item at the top of the stack
     * @return The first item in the list as a String
     */
    public String pop() {
        // ensures there is a value at the head of the stack before popping it
        if (head == null) {
            debug("Unable to pop values from an empty list!");
            return null;

        } // end if

        // stores the value that is being popped
        String value = head.value;
        // replaces the first value in the stack with its next value (if any exists)
        head = (head.next == null ? null : head.next);

        debug("Successfully popped value \"" + value + "\" off the top of the stack");
        return value;

    } // end void

    /**
     * Returns the value of the first item in the list
     * @return A String value replicating that of the first item in the list
     */
    public String peek() {
        if (head == null) {
            debug("Unable to peek at an empty list!");
            return null;

        } // end if

        debug("Successfully peeked at value \"" + head.value + "\" on the top of the stack!");
        return head.value;

    } // end void

    /**
     * Checks if this list is currently empty or not
     * @return A boolean value that is true if the list is empty, else returns false
     */
    public boolean isEmpty() {
        // if the head is null, this list must be empty
        return head == null;

    } // end boolean

    /**
     * Returns the length of this list
     * @return An integer value denoting the length of this list (i.e., the number of nodes/elements)
     */
    public int length() {
        Node current = head;
        int length = 0;

        // iterates through the list and counts each node/element to determine the length of this list
        while (current != null) {
            length++;
            // moves to next node
            current = current.next;

        } // end while

        return length;

    } // end int

    /**
     * Prints the content of this stack to standard output. If the list is empty, "null" will be printed instead.
     * @return The content of this stack as String values with arrows denoting their pointers
     */
    public String dump() {
        debug("Attempting to print stack...");

        if (head != null) {
            Node current = head;
            // defines a string builder to store stack contents
            StringBuilder list = new StringBuilder();

            // iterates through each node in the stack
            while (current != null) {
                // uses the string builder to append the current value with a pointer symbol
                list.append(current.value).append(" -> ");
                // sets current node to the node its pointing at
                current = current.next;

            } // end while

            // prints the stacks content to the console
            System.out.println(list);
            return list.toString();

        } else {
            // if the list is empty, prints "null" to the console
            System.out.println("null");
            return null;

        }// end if

    } // end void

    /**
     * ~ METHOD NOT DESIGNED FOR ASSESSMENT ~
     *
     * Prints a debug message if debugging mode is enabled (for developer use only)
     * @param msg The debug message to print to the console
     */
    void debug(String msg){
        if (debugging)
            System.out.println(msg);

    } // end void

    /**
     * ~ METHOD NOT DESIGNED FOR ASSESSMENT ~
     *
     * Prints an empty line to the console if debugging mode is enabled (for developer use only)
     */
    void debug() {
        debug("");

    } // end void

} // end class