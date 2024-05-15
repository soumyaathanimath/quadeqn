/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadeqn;
import java.lang.*;
import java.util.*;


/**
 *
 * @author dell1
 */
public class Quadeqn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
       
       int a,b,c;
       double r1,r2;
       
       System.out.println("Enter the values of a ,b and c");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       
       r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
       r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
       
       System.out.println("Roots are "+r1+" "+r2 );
    }
    
}
