package nyc.c4q.m47bell;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/22/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class HttpTest {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter URL:");
            String input = scanner.nextLine();
            URL url = HTTP.stringToURL(input);
            String document = HTTP.get(url);

           /* if (isHTML(document)) {
                System.out.println("This is a HTML document");
            } else {
                System.err.println("Not a HTML document");
            }
*/
            System.out.println("Enter word: ");
            String word = scanner.next();
            System.out.println(result(document,word));
    }

    public static boolean isHTML (String string) {
            if (string.startsWith("<!doctype html>")) {
                return true;
            } else if (string.startsWith("<!DOCTYPE html>")) {
                return true;
            } else {
                return false;
            }
    }

    public static int result(String document, String word){
        Scanner read = new Scanner(document);
        int count=0;

      while(read.hasNext()){
          String findWord=read.next();
          if(findWord.contains(word)) {
              count += 1;
          }
          else if(findWord.equalsIgnoreCase(word)){
              count++;
          }
          else if((findWord.contains(word+"'"))){
              count++;
          }
          else {
              continue;
          }

      }
        return count;

    }


}














