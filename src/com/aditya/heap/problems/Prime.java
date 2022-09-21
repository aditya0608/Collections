package com.aditya.heap.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prime {
    static ArrayList<Integer> A=new ArrayList<Integer>();
    static int B=3;
    public static void main(String[] args) {
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(5);
        for (Integer ele:solve())
            System.out.println(ele+" ");

    }
    public static ArrayList<Integer> solve()
    {
            Queue<Pair> queue=new PriorityQueue<Pair>(new Custom());
            ArrayList<Integer> ans=new ArrayList<Integer>();
            for(int i=0;i<A.size()-1;i++)
            {
                for(int j=i+1;j<A.size();j++)
                {
                    queue.offer(new Pair(A.get(i),A.get(j),(double)A.get(i)/A.get(j)));
                }
            }
            int counter=0;
            while(counter<(B-1))
            {
                Pair temp=queue.poll();
                counter++;
            }
            Pair pair=queue.poll();
            ans.add(pair.p);
            ans.add(pair.q);
            return ans;
        }
    }
    class Custom implements Comparator<Pair>
    {
        @Override
        public int compare(Pair p1,Pair p2)
        {
            return (int)(p1.divide-p2.divide);
        }
    }
    class Pair{
        int p;
        int q;
        double divide;
        public Pair(int p,int q,double divide)
        {
            this.p=p;
            this.q=q;
            this.divide=divide;
        }
    }


