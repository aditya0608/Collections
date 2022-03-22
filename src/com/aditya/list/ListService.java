package com.aditya.list;

public class ListService<T> {

    private static Node head=null;
    private static Node tail=null;
    private static boolean  result=true;
    public Node getHead()
    {
        return head;
    }
    public static Node set(int index,int value)
    {
        Node temp=get(index);
        temp.setData(value);
        return temp;

    }
    public static Node get(int index)
    {
        Node temp=head;
        int counter=0;
            if(index>=getSize())
                throw new ArrayIndexOutOfBoundsException();
            while (counter<index) {
                temp = temp.getNext();
                counter++;
            }
        return temp;
    }
    public static int getSize()
    {
        Node temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.getNext();
            size++;
        }
        return size;
    }
    public Node addNode(T data)
    {
        try {
            if (null == head) {
                Node node = new Node(data);
                tail = node;
                head=node;
            } else {
                    Node temp=head;
                    while(null!=temp.getNext())
                    {
                        temp=(temp.getNext());
                    }
                    temp.setNext(new Node(data));
            }
        }
        catch (Exception ex)
        {
            System.out.println("Exception occured "+ ex);
            result=false;
        }
        return head;
    }
    public static Node deleteNode()
    {
        Node temp=head;
        Node prev=head;
        while(temp.getNext()!=null) {
            prev=temp;
            temp = temp.getNext();
        }
        if(prev.equals(temp))
            head=null;
        prev.setNext(null);
        return head;
    }
}
