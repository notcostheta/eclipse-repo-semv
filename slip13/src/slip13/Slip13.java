package slip13;

// copy one file into another file
/*
 * Kaustubh Bhiwsankar TEB04
 */

import java.io.*;
class Slip13
{
public static void main(String args[]) throws Exception
{	
FileReader fr = new FileReader("Slip13.java");
FileWriter fw = new FileWriter("slip11.java");
int c;
while((c = fr.read())!=-1)
{
    fw.write((char)c);
    System.out.print((char)c);
}
             System.out.println("1 File get Copied....");
fr.close();
fw.close();
}	
}