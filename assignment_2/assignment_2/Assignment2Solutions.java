package assignment_2;

import java.util.*;

/**
 * Name: Norah Nasser
 * Major: ai – G2
 * Assignment 2 Solutions
 */

public class Assignment2Solutions {

    // 1. Reverse a string using Stack
    public String q1_reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return reversed.toString();
    }

    // 2. Sort a stack using only another Stack
    public void q2_sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        while (!tempStack.isEmpty()) stack.push(tempStack.pop());
    }

    // 3. Reverse the order of elements in a queue
    public void q3_reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) stack.push(queue.poll());
        while (!stack.isEmpty()) queue.add(stack.pop());
    }

    // 4. Priority queue: smallest element is dequeued first
    public void q4_priorityQueueSmallest() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        // Smallest (5) will be out first
        System.out.println("Dequeued: " + pq.poll());
    }

    // 5. Merge two sorted queues into a single sorted queue
    public Queue<Integer> q5_mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) merged.add(q1.poll());
            else merged.add(q2.poll());
        }
        while (!q1.isEmpty()) merged.add(q1.poll());
        while (!q2.isEmpty()) merged.add(q2.poll());
        return merged;
    }
}