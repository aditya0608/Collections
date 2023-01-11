package com.aditya.list.problems;

import com.aditya.list.impl.ListService;
import com.aditya.list.impl.Node;

/**
 * The problem aims at finding the middle of the linkedList
 * APPROACH 1:
 * i) Find the length of the LinkedList
 * ii) Travel till middle-1 and return the middle value node
 *
 * APPROACH 2:
 * i) Use of slow and fast pointers
 * ii)Increment slow pointer by one and fast pointer by two till fast.next becomes null in case of even length and fast==null in case of odd length
 * iii) Now as soon as this condition is met return slow
 * iv) Core logic is Slow will always travel half the length as the fast pointer
 *
 * Time Complexity O(N)
 * Space Complexity O(1)
 */
public class FindMiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListService<Object> listService=new ListService<Object>();
        listService.addNode(1);
        listService.addNode(5);
        listService.addNode(6);
        listService.addNode(9);
        listService.addNode(10);
        listService.addNode(11);

        System.out.println(findMiddleOfTheLinkedList(listService.getHead()));
    }
    public static Node findMiddleOfTheLinkedList(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.getNext()!=null)
        {
            fast=fast.getNext().getNext();
            slow=slow.getNext();
        }
        return slow;
    }
}
