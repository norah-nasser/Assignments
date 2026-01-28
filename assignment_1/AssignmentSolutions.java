package assignment_1;

import java.util.Arrays;

/**
 * Name: Norah Nasser
 * Major: AI – G2
 * Assignment 1 Solutions
 */

public class AssignmentSolutions {

    // 1. Clone an array
    public int[] q1_clone(int[] arr) {
        return arr.clone();
    }

    // 2. Remove a random element from an array
    public int[] q2_removeRandom(int[] arr) {
        if (arr.length == 0) return arr;
        int index = (int) (Math.random() * arr.length);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArr[j++] = arr[i];
        }
        return newArr;
    }

    // 3. Remove a specific element from an array
    public int[] q3_removeElement(int[] arr, int target) {
        return Arrays.stream(arr).filter(i -> i != target).toArray();
    }

    // 5. Concatenate two linked lists
    public void q5_concatenate(Node l1, Node l2) {
        if (l1 == null) return;
        Node temp = l1;
        while (temp.next != null) temp = temp.next;
        temp.next = l2;
    }

    // 8. Search in a linked list and return position
    public int q8_search(Node head, int val) {
        Node temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == val) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // 14. Search in a doubly linked list
    public boolean q14_searchDoubly(DNode head, int val) {
        DNode temp = head;
        while (temp != null) {
            if (temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }

    // 17. Search in a circular linked list
    public boolean q17_searchCircular(Node head, int val) {
        if (head == null) return false;
        Node temp = head;
        do {
            if (temp.data == val) return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }
}

// Node definitions
class Node {
    int data;
    Node next;
}

class DNode {
    int data;
    DNode next;
    DNode prev;
}