package CleanCode.task;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        double principal=sc.nextDouble();
        System.out.println("Enter time");
        double time=sc.nextDouble();
        System.out.println("Enter rate_of_interest");
        double rate_of_interest=sc.nextDouble();
        System.out.println("Enter area");
        double area=sc.nextDouble();
        Interest s =new Interest(principal,rate_of_interest,time);
        double simple_interest=s.simple_interest();
        System.out.println("Simple Interest : "+simple_interest);
        double compound_interest=s.compound_interest();
        System.out.println("Compound Interest : "+compound_interest);
        Construction con =new Construction(area);
        System.out.println("1.Standard House 2.Above Standard House 3.High Standard House 4.High Standard House and Fully Automated House/nEnter your choice: ");
        int choice=sc.nextInt();
        double cost=con.construction_cost(choice);
        System.out.println("Total Cost : "+cost);
        sc.close();
    }
}
