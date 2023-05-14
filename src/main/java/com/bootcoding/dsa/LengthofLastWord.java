package com.bootcoding.dsa;

public class LengthofLastWord
{
    public static void main(String[] args)
    {
        LengthofLastWord lengthofLastWord = new LengthofLastWord();
        lengthofLastWord.lengthOfLastWord("Hello World");
    }
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String last = words[words.length-1];
        System.out.println(last);
        int lastLen = last.length();
        System.out.println(lastLen);

        return lastLen;
    }
}
