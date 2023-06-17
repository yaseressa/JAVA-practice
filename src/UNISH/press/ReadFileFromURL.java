package UNISH.press;

import java.util.Scanner;
import java.io.*;

    public class ReadFileFromURL {
        public static void main(String[] args) {
            System.out.print("Enter a URL: ");
            String URLString = new Scanner(System.in).next();

            try {
                var url = new java.net.URL(URLString);
                java.io.File file = new File(String.valueOf(url));

                int count = 0;
                String v= null,line = null;
                Scanner input = new Scanner(url.openStream());
                while (input.hasNext()) {
                     line = input.nextLine();
                    count += line.length();
                    v += line;
                }
                System.out.println(file.length());

                System.out.println("The file size is " + count + " characters");
            } catch (java.net.MalformedURLException ex) {
                System.out.println("Invalid URL");
            } catch (java.io.IOException ex) {
                System.out.println("I/O Errors: no such file");
            }
        }
    }
