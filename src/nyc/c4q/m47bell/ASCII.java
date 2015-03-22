package nyc.c4q.m47bell;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/22/15.
 * Access Code 2-1
 * Marbella Vidals
 */

public class ASCII {

    //converting char to ASCII
    public static void main(String[] args) {
    /* String greeting = "Hello, World!";

        for (int i = 0; i < greeting.length(); ++i) {
        // char c = greeting.charAt(i);

        // int code = (int) c;

        //Prints out whether a character is an uppercase letter
        System.out.println("char " + c + " = " + code);
        System.out.println("\nUppercase t/f?:");
        System.out.println(isUppercaseLetter('c'));
        System.out.println("\nLowercase t/f?:");
        System.out.println(isLowercaseLetter('c'));
    */
        Scanner input = new Scanner(System.in);
        System.out.println(rot13Encode("Hello, world!"));


    }

    //Write a method that determines whether a character is an uppercase letter.
    public static boolean isUppercaseLetter(char c) {

      return   c >= 65 && c <= 90;
    }

    public static boolean isLowercaseLetter(char c) {

        return   c >= 97 && c <= 122;
    }


    //Rot 13 Encoder

    public static String rot13Encode(String string) {

        String result= "";
        for(int i=0;i < string.length();++i){
            char c = string.charAt(i);
            if (isLowercaseLetter(c)){
                int code = (int) c +13;
                if (code > 122){
                    code -=26;
                    result += (char) code;
                }
            }
            else if (isUppercaseLetter(c)){
                int code = (int) c +13;
                if (code > 90){
                    code -= 26;
                    result += (char) code;
                }
                result +=c;
            }
            else {
                result+=c;
            }

        }
        return result;

    }


}




