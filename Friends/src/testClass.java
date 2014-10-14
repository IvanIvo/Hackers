import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) throws IOException
	{
	    int i,j=0,repeat=0;
	    String output="",input;
	    char c=' ';
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter name ");
	    input=br.readLine();
	    System.out.println("entered String ->\""+input+"\"");
	    input=input.toLowerCase();

	    for(i=0;i<input.length();i++)
	    {
	        for(j=0;j<output.length();j++)
	        {
	            if(input.charAt(i)==output.charAt(j) || input.charAt(i)==c)
	            {
	                repeat=1;
	                break;
	            }
	        }
	        if(repeat!=1)
	        {
	            output=output+input.charAt(i);
	        }
	        repeat=0;
	    }

	    System.out.println("non-reepeated chars in name ->\""+output+"\"");

	    int count[]=new int[output.length()];
	    for(i=0;i<output.length();i++)
	    {
	        for(j=0;j<input.length();j++)
	        {
	            if(output.charAt(i)==input.charAt(j))
	                count[i]=count[i]+1;
	        }
	    }
	    for(i=0;i<output.length();i++)
	        System.out.println(output.charAt(i)+"- "+count[i]);
	}
}