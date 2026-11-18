import java.util.Scanner;
public class scanner
{
public static void main (String[]args){
    Scanner cs = new Scanner(System.in);
    System.out.println("Make a choice between A and B");
    String x = cs.nextLine();
    String y = x.toLowerCase();
    if(y.contains("a")){System.out.println("Ok, let's start with group A.");}
    else if(y.contains("b")){System.out.println("OK, let's start with group B.");}
    else{System.out.println("Please do not print anything other than \"A\" and \"B\". Exit and try again.");}
    cs.close();
}
}
