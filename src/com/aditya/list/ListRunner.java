package com.aditya.list;

public class ListRunner{
    public static void main(String[] args) {
        ListService<Object> listService=new ListService<Object>();
        listService.addNode("Aditya");
        listService.addNode(5);
        listService.addNode(6);
        //System.out.println(ListService.set(1,2));
        //ListService.deleteNode();
        //Node temp=ListService.deleteNode();
        //System.out.println(ListService.getSize());
        //System.out.println(ListService.get(2));
        Node temp=listService.getHead();
        while (temp!=null) {
            System.out.println(temp);
            temp=temp.getNext();
        }






    }
}
