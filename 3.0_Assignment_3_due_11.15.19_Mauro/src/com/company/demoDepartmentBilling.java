package com.company;
import java.util.Scanner;

//main class here!*****
public class demoDepartmentBilling {
    public static void main(String[] args) {
        //variables
        ////need to fill these variables up
         double totalAmount, computeDiscount, totalBill, clothingtax;


        System.out.println("\n \n -----------------Groceries receipt----------------");
        Item itembread = new Item();
        itembread.Item("Bread", 11,2, 0.0, 1.5, 0);

        //printing values for Bread
        System.out.println("Printing  name of item...   "+ itembread.getName());
        System.out.println("Printing item code...       "+ itembread.getItemCode());
        System.out.println("Printing unit #...          "+ itembread.getUnits());
        System.out.println("Printing discount amount... "+ itembread.getcomputediscount() +"%");
        System.out.println("Printing price...           $"+ itembread.getprice());
        System.out.println("Printing tax amount...      $"+ itembread.getcomputetax());


        Item itemApples = new Item();
        itemApples.Item("Apples",12,6,0.1,0.75,0);

        //printing values for Apples
        System.out.println("\n\nPrinting  name of item...   "+ itemApples.getName());
        System.out.println("Printing item code...       "+ itemApples.getItemCode());
        System.out.println("Printing unit #...          "+ itemApples.getUnits());
        System.out.println("Printing discount amount... "+ itemApples.getcomputediscount() +"%");
        System.out.println("Printing price...           $"+ itemApples.getprice());
        System.out.println("Printing tax amount...      $"+ itemApples.getcomputetax());

//-----------------------------------

        System.out.println("\n\n-----------------Clothing items-------------------");

        Clothing clothingJeans = new Clothing();
       clothingJeans.Clothing(21,"Jeans",1,35,"Levis",0.0);

       System.out.println("Printing item code...       "+ clothingJeans.getItemCode());
       System.out.println("Printing name of item...    "+ clothingJeans.getName());
       System.out.println("Printing unit #...          "+ clothingJeans.getUnits());
       System.out.println("Printing price...           $"+ clothingJeans.getPrice());
       System.out.println("Printing brand...           "+ clothingJeans.getBrand());
       System.out.println("Printing discount...        "+ clothingJeans.getDiscount()+"%");


        Clothing clothingDress = new Clothing();
        clothingDress.Clothing(22,"Dress",2,25,"Izod",10.0);

        System.out.println("\n\nPrinting item code...       "+ clothingDress.getItemCode());
        System.out.println("Printing name of item...    "+ clothingDress.getName());
        System.out.println("Printing unit #...          "+ clothingDress.getUnits());
        System.out.println("Printing price...          $"+ clothingDress.getPrice());
        System.out.println("Printing brand...           "+ clothingDress.getBrand());
        System.out.println("Printing discount...        "+ clothingDress.getDiscount()+"%");


    }//end of main

}//end of item002
