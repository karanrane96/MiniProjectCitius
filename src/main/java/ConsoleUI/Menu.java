package ConsoleUI;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

      // do {
            System.out.println("Select a option from the menu");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Supplier");
            System.out.println("3. Show all Customers");
            System.out.println("4. Show all Suppliers");
            System.out.println("5. Export a Customer");
            System.out.println("6. Export a Supplier");
            System.out.println("0. Exit");
       // }  while(sc.nextInt()!=0);

       int a = sc.nextInt();

       switch (a)
       {
           case 1:
               AddCustomerConsoleScreen();
               break;
           case 2:
               AddSupplierConsoleScreen();
               break;
           case  3:
               System.out.println("Show all customers");
               break;
           case 4:
               System.out.println("Show all suppliers");
               break;
           case 5:
               System.out.println("Export a Customer");
               break;
           case 6:
               System.out.println("Export a Supplier");


       }


    }

    public static void AddCustomerConsoleScreen()
    {

    }

    public static void AddSupplierConsoleScreen()
    {

    }
}
