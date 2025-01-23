package org.example;


import java.util.LinkedList;

public class Main {
    public static boolean checkForPalindrome(String input) {
        String standartInput = input.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        LinkedList<Character> charlist =new LinkedList<>();

        for(char c :standartInput.toCharArray()){
            charlist.add(c);
        }
        while (charlist.size()>1){
            if(!charlist.pollFirst().equals(charlist.pollLast())){
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while(decimal > 0){
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal / 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int digit : binaryList){
            stringBuilder.append(digit);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));

    }


}

