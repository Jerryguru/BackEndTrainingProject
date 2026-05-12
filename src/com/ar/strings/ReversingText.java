package com.ar.strings;

public class ReversingText {
    public static void main(String[] args) {
        String str1 = " Paramesh is Going to Hyderabad";

        System.out.println("Original String  :: " + str1);
        String output = "";
          String[] words = str1.split(" ");
          for(String word : words){
              String revword = "";
              for(int i = word.length() -1; i >= 0; i--){
                  revword = revword + word.charAt(i);
              }
              output = output + revword+" ";

          }
        System.out.println("Reverse String :: " +output);

    }
}
