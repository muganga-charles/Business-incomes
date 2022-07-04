
/**
 * muk
 */

import java.util.Scanner;

public class number1_prtii {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int daily_tax=1000;
        int rent;
        System.out.print("enter the rent:");
        rent=input.nextInt();
        System.out.print("enter the number Of Days In That Month:");
        int numberOfDaysInThatMonth=input.nextInt();
        rent=rent/numberOfDaysInThatMonth;
        System.out.println("\n saloon_business;");
        System.out.println("enter the price of the hair cut");
        int price=input.nextInt();
        System.out.println("enter the number of customers received");
        int customers=input.nextInt();
        System.out.print("\nThe net income is:"+business_2(rent, daily_tax, price, customers));
    
        System.out.println("\ntimber_business");
        System.out.println("enter the number of timber pices sold on a particular day");
        int timber=input.nextInt();
        System.out.println("enter the price each of timber pice");
        int each_timber=input.nextInt();
        System.out.print("\nThe net income is "+business_1(rent, daily_tax, timber, each_timber));
        
        int total=(business_1(rent, daily_tax, timber, each_timber)+business_2(rent, daily_tax, price, customers))*numberOfDaysInThatMonth;
        System.out.printf("\nThe daily net income for both the businesses is %d \n",(total/numberOfDaysInThatMonth));
        System.out.printf("\nThe total net income for both the businesses is %d for a given month",total);
     
        
    }
    public static int business_1(int rent ,int daily_tax,int timber,int each_timber){
        //int net_income=timber*each_timber-(rent+daily_tax);
        return timber*each_timber-(rent+daily_tax);

    }
    public static int business_2(int rent ,int daily_tax,int price,int customers){
        //int net_income=price*customers-(rent+daily_tax);
        
        return price*customers-(rent+daily_tax);

    }
}
