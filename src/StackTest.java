import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The Stack Test suite - used to perform tests on each function of the
 * custom Stack object in different states and with different arrangements.
 */
public class StackTest {

    /**
     * Creates an instance of the stack class in order to validate its implementation
     */
    private Stack stack;

    /**
     * Resets the Stack object that is being tested before running each test method
     */
    @BeforeEach
    public void resetStack() {
        // resets the stack
        stack = new Stack();

    } // end void

    /**
     * Tests to ensure that pushing an empty string to an empty stack will return null
     */
    @Test
    @DisplayName("Test push(String): Empty stack + empty string, dependent on peek()")
    public void testPushEmptyStringEmptyStack() {
        // arrange - not needed

        // act
        stack.push("");

        // assert
        assertNull(stack.peek());

    } // end void

    /**
     * Tests to ensure that pushing an empty string to a stack with one element will leave the stack unchanged
     */
    @Test
    @DisplayName("Test push(String): Single stack + empty string, dependent on peek()")
    public void testPushEmptyStringSingleStack() {
        // arrange
        stack.push("Value: 1");

        // act
        stack.push("");

        // assert
        assertEquals("Value: 1", stack.peek());

    } // end void

    /**
     * Tests to ensure that pushing an empty string to a stack with multiple elements will leave the stack unchanged
     */
    @Test
    @DisplayName("Test push(String): Multi stack + empty string, dependent on peek()")
    public void testPushEmptyStringMultiStack() {
        // arrange
        stack.push("Value: 3");
        stack.push("Value: 2");
        stack.push("Value: 1");

        // act
        stack.push("");

        // assert
        assertEquals("Value: 1", stack.peek());

    } // end void

    /**
     * Tests to ensure that pushing a non-empty string to an empty stack will return the passed value
     */
    @Test
    @DisplayName("Test push(String): Empty stack + non-empty string, dependent on peek()")
    public void testPushStringEmptyStack() {
        // arrange not needed

        // act
        stack.push("Value: 1");

        // assert
        assertEquals("Value: 1", stack.peek());

    } // end void

    /**
     * Tests to ensure that pushing multiple non-empty strings to an empty stack will return the most recently passed value
     */
    @Test
    @DisplayName("Test push(String): Empty stack + multiple non-empty strings, dependent on peek()")
    public void testPushStringsEmptyStack() {
        // arrange - not needed

        // act
        stack.push("Value: 3");
        stack.push("Value: 2");
        stack.push("Value: 1");

        // assert
        assertEquals("Value: 1", stack.peek());

    } // end void

    /**
     * Tests to ensure that pushing multiple non-empty strings to a non-empty stack will return the most recently passed value
     */
    @Test
    @DisplayName("Test push(String): Non-Empty stack + Multiple Values, dependent on peek()")
    public void testPushStringsNonEmptyStack() {
        // arrange
        stack.push("Value: 5");
        stack.push("Value: 4");

        // act
        stack.push("Value: 3");
        stack.push("Value: 2");
        stack.push("Value: 1");

        // assert
        assertEquals("Value: 1", stack.peek());

    } // end void

    /**
     * Tests to ensure that popping a value off an empty stack returns null
     */
    @Test
    @DisplayName("Test pop(): Pop stack functionality - empty list")
    public void testPopFunctionEmptyStack() {
        // arrange - not needed

        // act
        String actual = stack.pop();

        // assert
        assertNull(actual);

    } // end void

    /**
     * Tests to ensure that popping a value off a stack with one element returns null (since stack should be empty afterward)
     */
    @Test
    @DisplayName("Test pop(): Pop stack functionality - single value, dependent on peek()")
    public void testPopFunctionSingleStack() {
        // arrange
        stack.push("Value: 0");

        // act
        stack.pop();

        // assert
        assertNull(stack.peek());

    } // end void

    /**
     * Tests to ensure that popping a value off a stack with multiple elements returns the top element in the stack
     */
    @Test
    @DisplayName("Test pop(): Pop stack functionality - multiple values, dependent on peek()")
    public void testPopFunctionMultiStack() {
        // arrange
        stack.push("Value: 1");
        stack.push("Value: 0");

        // act
        stack.pop();

        // assert
        assertEquals("Value: 1", stack.peek());

    } // end void

    /**
     * Tests to ensure that the pop function returns the value that was popped off a stack containing a single element
     */
    @Test
    @DisplayName("Test pop(): Pop stack return value - single stack")
    public void testPopReturnSingleStack() {
        // arrange
        stack.push("Value: 1");

        // act
        String expected = "Value: 1";
        String actual = stack.pop();

        // assert
        assertEquals(expected, actual);

    } // end void

    /**
     * Tests to ensure that the pop function returns the value that was popped off a stack containing multiple items
     */
    @Test
    @DisplayName("Test pop(): Pop stack return value - multi stack")
    public void testPopReturnMultiStack() {
        // arrange
        stack.push("Value: 1");
        stack.push("Value: 2");

        // act
        String expected = "Value: 2";
        String actual = stack.pop();

        // assert
        assertEquals(expected, actual);

    } // end void

    /**
     * Tests to ensure that peeking at an empty stack returns null
     */
    @Test
    @DisplayName("Test peek(): Peek empty stack")
    public void testPeekEmptyStack() {
        // arrange - not needed

        // act
        String actual = stack.peek();

        // assert
        assertNull(actual);

    } // end void

    /**
     * Tests to ensure that peeking at a stack with a single element returns the heads value
     */
    @Test
    @DisplayName("Test peek(): Peek single-stack")
    public void testPeekSingleStack() {
        // arrange
        stack.push("Value: 1");

        // act
        String actual = stack.peek();

        // assert
        assertEquals("Value: 1", actual);

    } // end void

    /**
     * Tests to ensure that peeking at a stack with multiple elements returns the heads value
     */
    @Test
    @DisplayName("Test peek(): Peek multi-stack")
    public void testPeekMultiStack() {
        // arrange
        stack.push("Value: 2");
        stack.push("Value: 1");

        // act
        String actual = stack.peek();

        // assert
        assertEquals("Value: 1", actual);

    } // end void

    /**
     * Tests to ensure that checking for an empty stack returns true when performed on an empty stack
     */
    @Test
    @DisplayName("Test isEmpty(): Empty stack")
    public void testIsEmptyStack() {
        // arrange - not needed

        // act
        boolean actual = stack.isEmpty();

        // assert
        assertTrue(actual);

    } // end void

    /**
     * Tests to ensure that checking for an empty stack returns false when performed on a non-empty stack
     */
    @Test
    @DisplayName("Test isEmpty(): Non-empty stack")
    public void testIsNotEmptyStack() {
        // arrange
        stack.push("Value: 1");

        // act
        boolean actual = stack.isEmpty();

        // assert
        assertFalse(actual);

    } // end void

    /**
     * Tests to ensure that checking the stacks length returns 0 when performed on an empty stack
     */
    @Test
    @DisplayName("Test length(): Empty Stack")
    public void testLengthEmptyStack() {
        // arrange - not needed

        // act
        int actual = stack.length();

        // assert
        assertEquals(0, actual);

    } // end void

    /**
     * Tests to ensure that checking the stacks length returns 1 when performed on a stack with a single element
     */
    @Test
    @DisplayName("Test length(): Single Stack")
    public void testLengthSingleStack() {
        // arrange
        stack.push("Value: 1");

        // act
        int actual = stack.length();

        // assert
        assertEquals(1, actual);

    } // end void

    /**
     * Tests to ensure that checking the stacks length returns the correct length when performed on a stack with multiple elements
     */
    @Test
    @DisplayName("Test length(): Multi Stack")
    public void testLengthMultiStack() {
        // arrange
        stack.push("Value: 3");
        stack.push("Value: 2");
        stack.push("Value: 1");

        // act
        int actual = stack.length();

        // assert
        assertEquals(3, actual);

    } // end void

    /**
     * Tests to ensure that checking the stacks length after popping a value off it returns the correct length
     */
    @Test
    @DisplayName("Test length(): Popped stack")
    public void testLengthPoppedStack() {
        // arrange
        stack.push("Value: 1");
        stack.push("Value: 2");

        // act
        stack.pop();
        int actual = stack.length();

        // assert
        assertEquals(1, actual);

    } // end void

    /**
     * Tests to ensure that dumping an empty stack returns null
     */
    @Test
    @DisplayName("Test dump(): Empty stack")
    public void testDumpEmptyStack() {
        // arrange - not needed

        // act
        String actual = stack.dump();

        // assert
        assertNull(actual);

    } // end void

    /**
     * Tests to ensure that dumping a stack with a single element returns the correct string value
     */
    @Test
    @DisplayName("Test dump(): Single stack")
    public void testDumpSingleStack() {
        // arrange
        stack.push("Value: 1");

        // act
        String expected = "Value: 1 -> ";
        String actual = stack.dump();

        // assert
        assertEquals(expected, actual);

    } // end void

    /**
     * Tests to ensure that dumping a stack with multiple elements returns the correct string value
     */
    @Test
    @DisplayName("Test dump(): Multi stack")
    public void testDumpMultiStack() {
        // arrange
        stack.push("Value: 3");
        stack.push("Value: 2");
        stack.push("Value: 1");

        // act
        String expected = "Value: 1 -> Value: 2 -> Value: 3 -> ";
        String actual = stack.dump();

        // assert
        assertEquals(expected, actual);

    } // end void

    /**
     * Tests to ensure that dumping a stack with a single element returns the correct string value after being popped
     */
    @Test
    @DisplayName("Test dump(): Single stack popped")
    public void testDumpSingleStackPopped() {
        // arrange
        stack.push("Value: 0");

        // act
        stack.pop();
        String actual = stack.dump();

        // assert
        assertNull(actual);

    } // end void

    /**
     * Tests to ensure that dumping a stack with multiple elements returns the correct string value after being popped
     */
    @Test
    @DisplayName("Test dump(): Multi stack popped")
    public void testDumpMultiStackPopped() {
        // arrange
        stack.push("Value: 2");
        stack.push("Value: 1");
        stack.push("Value: 0");

        // act
        stack.pop();
        String expected = "Value: 1 -> Value: 2 -> ";
        String actual = stack.dump();

        // assert
        assertEquals(expected, actual);

    } // end void

} // end class
