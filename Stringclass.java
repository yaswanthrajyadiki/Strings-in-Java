
/**
 * Write a description of class String here.
 * 
 * @author (Yaswanth) 
 * @version (08-08-2015)
 */
import java.lang.String;
//import java.api;
public class Stringclass
{
    private String htmlString;
    private String hyperLink;
    public Stringclass()
    {
        htmlString="<html><a href=\"www.google.com\"> <a href=\"www.youtube.com\"> </html>";
    }
   
    public static void main(String args[])
    {
      Stringclass str=new Stringclass();
      int a=str.htmlString.indexOf("<a href");
      a+=9;
      System.out.println("Index of first hyperlink is: "+a);
      int a1=str.htmlString.indexOf("\">",a);
      str.hyperLink=str.htmlString.substring(a,a1);
      System.out.println("First hyperlink is: "+str.hyperLink);
      
    }
}
