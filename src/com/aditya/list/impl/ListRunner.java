package com.aditya.list.impl;

import com.aditya.list.problems.ReverseLinkedList;

public class ListRunner{
    public static void main(String[] args) {
        ListService<Object> listService=new ListService<Object>();
        listService.addNode("Aditya");
        listService.addNode(5);
        listService.addNode(6);
        listService.addNode(9);
        listService.addNode(10);
        //System.out.println(ListService.set(1,2));
        //ListService.deleteNode();
        //Node temp=ListService.deleteNode();
        //System.out.println(ListService.getSize());
        //System.out.println(ListService.get(2));
        Node temp=listService.getHead();
        Node tempReverse=ReverseLinkedList.reverseList(temp);
        while (tempReverse!=null) {
            System.out.println("Data "+ tempReverse.getData()+"=> "+tempReverse);
            tempReverse=tempReverse.getNext();
        }






    }
}
