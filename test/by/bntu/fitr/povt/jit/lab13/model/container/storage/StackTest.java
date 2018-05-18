/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.lab13.model.container.storage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Святослав
 */
public class StackTest {

    public StackTest() {
    }
/*
    @Test
    public void testContains1() {
        Stack<Integer> stack = new Stack<>();
        Integer integer1 = 1;
        stack.push(integer1);
        assertTrue(stack.contains(integer1));
    }

    @Test
    public void testContains2() {
        Stack<Integer> stack = new Stack<>();
        Integer integer1 = 1;
        Integer integer2 = 2;
        Integer integer3 = 3;
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        assertTrue(stack.contains(integer1));
        assertTrue(stack.contains(integer2));
        assertTrue(stack.contains(integer3));
    }

    @Test
    public void testContains3() {
        Stack<Integer> stack = new Stack<>();
        Integer integer1 = 1;
        Integer integer2 = 2;

        stack.push(integer1);
        stack.push(integer2);
        assertTrue(stack.contains(integer1));
        assertTrue(stack.contains(integer2));

        assertFalse(stack.contains(new Integer(2)));
    }

    @Test
    public void testContains4() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertFalse(stack.contains(new Integer(2)));
    }

    @Test
    public void testContainsEquals1() {
        Stack<Integer> stack = new Stack<>();
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(2);

        stack.push(integer1);
        stack.push(integer2);
        assertTrue(stack.containsEquals(1));
        assertTrue(stack.containsEquals(2));

        assertTrue(stack.containsEquals(new Integer(1)));
        assertTrue(stack.containsEquals(new Integer(2)));
    }

    @Test
    public void testContainsEquals2() {
        Stack<Integer> stack = new Stack<>();
        assertFalse(stack.containsEquals(0));
        assertFalse(stack.containsEquals(10));
        assertFalse(stack.containsEquals(20));
    }

    @Test
    public void testCount1() {
        Stack<Integer> stack = new Stack<>();
        assertEquals(stack.count(), 0);
    }

    @Test
    public void testCount2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        assertEquals(stack.count(), 5);
    }

    @Test
    public void testCount3() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        assertNotEquals(stack.count(), 0);
    }

    @Test
    public void testCount4() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        assertEquals(stack.count(), 2);
    }

    @Test
    public void testCount5() {
        Stack<Integer> stack = new Stack<>();
        assertNotEquals(stack.count(), 1);
        assertNotEquals(stack.count(), -1);
        assertNotEquals(stack.count(), -2);
    }

    @Test
    public void testPush1() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        assertTrue(stack.containsEquals(10));
        assertTrue(stack.containsEquals(20));
        assertTrue(stack.containsEquals(30));
        assertTrue(stack.containsEquals(40));
        assertTrue(stack.containsEquals(50));
        assertEquals(stack.pop().intValue(), 50);
        assertEquals(stack.pop().intValue(), 40);
        assertEquals(stack.pop().intValue(), 30);
        assertEquals(stack.pop().intValue(), 20);
        assertEquals(stack.pop().intValue(), 10);
    }

    @Test
    public void testPush2() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.push(50);
        assertFalse(stack.containsEquals(0));
        assertFalse(stack.containsEquals(10));
        assertFalse(stack.containsEquals(20));
    }

    @Test
    public void testPop1() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(stack.pop().intValue(), 30);
        assertEquals(stack.pop().intValue(), 20);
    }

    @Test
    public void testPop2() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        assertEquals(stack.pop().intValue(), 10);
    }

    @Test(expected = StackIsEmptyException.class)
    public void testPopFail1() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.pop();
    }

    @Test(expected = StackIsEmptyException.class)
    public void testPopFail2() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.pop();
        stack.pop();
    }

    @Test
    public void testSearch1() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        assertEquals(stack.search(0), -1);
    }

    @Test
    public void testSearch2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        assertEquals(stack.search(10), 0);
    }

    @Test
    public void testSearch3() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(stack.search(20), 0);
        assertEquals(stack.search(10), 1);
    }

    @Test
    public void testSearch4() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        assertEquals(stack.search(40), 0);
        assertEquals(stack.search(30), 1);
        assertEquals(stack.search(20), 2);
        assertEquals(stack.search(10), 3);
    }

    @Test
    public void testSearch5() throws StackIsEmptyException {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        assertEquals(stack.search(40), 0);
        assertEquals(stack.search(30), 1);
        assertEquals(stack.search(20), 2);
        assertEquals(stack.search(10), 3);
        stack.pop();
        assertEquals(stack.search(30), 0);
        assertEquals(stack.search(20), 1);
        assertEquals(stack.search(10), 2);
        stack.pop();
        assertEquals(stack.search(20), 0);
        assertEquals(stack.search(10), 1);
        stack.pop();
        assertEquals(stack.search(10), 0);
        stack.pop();
        assertEquals(stack.search(10), -1);
    }
*/

}
