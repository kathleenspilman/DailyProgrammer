/*
Create a program that will ask the users name, age, and reddit username. 
have it tell them the information back, in the format:
your name is (blank), you are (blank) years old, and your username is (blank)

*/

 import java.util.Scanner;
 public class question1{
           public static void main (String args[]){
                   String name, username;
                   int age = 0; 
                   String reddit = null;
                   Boolean flag = false;
                   Scanner in = new Scanner(System.in);
 
                  System.out.printf ("\tPlease provide your name: ");
                  name = in.nextLine(); 

                  System.out.printf ("\tPlease provide your reddit username: ");
                  reddit = in.next();

                  System.out.printf ("Thank you %s (A.K.A %s) for providing your age of %d.\n", name, reddit, age);
          }
  }
