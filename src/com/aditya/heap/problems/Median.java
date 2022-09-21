package com.aditya.heap.problems;

import java.util.ArrayList;

public class Median {
    static ArrayList<Integer> A=new ArrayList<>();
    public static void main(String[] args) {
        A.add(1);
        A.add(2);
        A.add(4);
        A.add(5);
        A.add(3);

        for(Integer ele:solve(A))
            System.out.println(ele);
    }
        public static ArrayList<Integer> solve(ArrayList<Integer> A) {

            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<A.size();i++)
            {
                int idx=(i+1)/2;
                if((i+1)%2==0)
                    ans.add(A.get(idx-1));
                else
                    ans.add(A.get(idx));
            }
            return ans;
        }
    }

