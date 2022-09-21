package com.aditya.array.problems;

import java.util.ArrayList;

public class MaxSubArray {
    static ArrayList<Integer> A=new ArrayList<Integer>();
    public static void main(String[] args) {
        A.add(-1469348094);
        A.add(1036140795 );
        A.add( 2040651434);
        A.add( -317097467);
        A.add(1376710097);
        A.add( 1330573317);
        A.add( 1687926652);

        maxset();
    }
        public static ArrayList<Integer> maxset() {

            ArrayList<Integer> ans=new ArrayList<Integer>();
            ArrayList<Integer> sumList=new ArrayList<Integer>();
            long max=-1;
            long sum=0;
            for(int i=0;i<A.size();i++)
            {
                if(A.get(i)>=0)
                {
                    sum=sum+A.get(i);
                    sumList.add(A.get(i));
                }
                else
                {
                    if(sum>max) {
                        max = sum;
                        ans.removeAll(ans);
                        for (Integer ele : sumList)
                            ans.add(ele);
                        int size=sumList.size();
                        for (int j = 0; j < size; j++)
                            sumList.remove(0);
                    }
                    sum=0;
                }
            }


            return ans;
        }
    }



