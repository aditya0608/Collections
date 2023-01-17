package com.aditya.map.problems;

/**
 * The problem aims at solving the ransom note find in a magazine
 * Given :
 * 1.Magazine : which has characters which can be used to form a ransom Note
 * 2.Ransom Note : this has to be formed with the help of characters in the magazine,the characters in the magazine can be used only once
 *
 * SOLUTION:
 * We can store the count of all chars in the magazine
 * Now we can traverse the ransom note characters one by one,if the character has count>0,then the next character is checked and so on..
 * else false is returned
 * After the characters count is count to be >0 ,it's count id decreased since chars in magazine can be used only once.
 *
 * Time Complexity O(Math.max(Length between ransom and magazine))
 * Space complexity O(Number of characters in english alphabet)
 *
 */
public class RansomNote {


    public static void main(String[] args) {

        boolean result=findRansomeNote("aaaa","aaa");
        System.out.println(result);
    }
    public static boolean findRansomeNote(String ransomNote,String magazine)
    {
        int[]count=new int[26];

        for(Character ele:magazine.toCharArray())
        {
            count[ele-'a']+=1;
        }

        for(Character ele:ransomNote.toCharArray())
        {
            if(count[ele-'a']<=0) return false;
            else
            {
                count[ele-'a']-=1;
            }
        }
        return true;

    }
}
