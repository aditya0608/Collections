package com.aditya.list.problems;

import com.aditya.list.impl.Node;

public class ReverseLinkedList {

    public static void main(String[] args) {

    }
    public static Node reverseList(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node ahead=null;

        while(curr!=null)
        {
            ahead=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=ahead;
        }
        return  prev;
    }
}
// prev=null  curr=head  next=null

//

//prev,next=null  curr


//next=curr.next
//curr.next=prev
//prev=curr                   p ,n   c
//curr=next                        p   c  n
//                                        p  c=null  n=null
//5  -> 6  -> 7  ->null      null<-5 <-6<-7