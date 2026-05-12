package com.ar.strings;

public class CapitalConverstion {
    public static void main(String[] args) {
        String FirstText = "my name is paramesh";
        System.out.println("with a small letter " +FirstText);
       // String ConvertText = FirstText.replaceAll()
        String[] words = FirstText.split(" ");
        for(String word : words){
            System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length()));
        }
    }
}
