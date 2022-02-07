package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String s1 = "Programma";
        String s2 = "Hometask";
        System.out.println(s1.length());
        s1 = s1.toUpperCase();
        System.out.println(s1);

        s2 = s2.toLowerCase();
        System.out.println(s2);

        s1 = s1.replace("A", "O");
        System.out.println(s1);
        if (s1.equals(s2)) {
            System.out.println("same length");
        } else {
            System.out.println("different words");
int shift = 0;
            for(int i = 0;i<s1.length();i++){
                char letter = s1.charAt(i);
                if (letter >='a'&& letter <='z'){

                    if(letter>'z') {
                        letter = (char) (letter - 26);
                    }
                    System.out.println(s1);
                    } else if (letter<'a'){
                        letter = (char) (letter+26);
                    }
                }
                System.out.println(s2);
            }
String s3 ="  Windows  ";
        System.out.println(s3.trim());
        }

    }

