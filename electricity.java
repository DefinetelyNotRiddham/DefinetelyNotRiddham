import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Maharashtra Electricity Board");
        System.out.println("Please enter your name:");
        String n = sc.next();
        System.out.println("Please enter the amount of units of electricity you have consumed this month:");
        double d= sc.nextDouble(),tariff=0;
        if(d<=200)
        tariff=d*3.80;
        else if(d<=300)
        tariff=(d-200)*4.40 + 200*3.80;
        else if(d<=400)
        tariff = (d-300)*5.10 + (300-200)*4.4 + 200*3.80;
        else if(d>400)
        tariff = (d-400)*5.80 + (400-300)*5.10 + (300-200)*4.40 + 200*3.80;
        System.out.println("\tWelcome to Maharshtra Electricity Board");
        System.out.println("\tName of Customer:\t   "+n);
        System.out.println("\tElectricity consumed:\t   "+d+" Units");
        System.out.println("\tTotal Bill of Customer:\t        "+tariff);
    }
}
