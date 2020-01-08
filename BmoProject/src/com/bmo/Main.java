package com.bmo;

import java.util.Date;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main {

    // Driver code

  public static void main(String[] args) {


      int option = 0;
      while (option != 3)
      {
          option = showMenu();
          switch (option) {
              case 1:
                  linkListExecute();
                  break;
              case 2:
                  binaryExecute();
                  break;
              case 3:
                  exit(0);
              default:
                  System.out.println("Sorry, please enter valid Option");
          }
      }


  }


    public static int showMenu() {

        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Main Menu:");
        System.out.println("--------------");
        System.out.println("1.Execute LinkList  (5, 7, 11, 20, 27, 36, 36, 54) ==>>> ");
        System.out.println("2.Execute Binary Search ( int arr[] = { 2, 3, 4, 10, 40 }) search 10 ==>>>");
        System.out.println("3.Quit ==>>>");
        System.out.println("--------------");
        System.out.println("Enter your choice:");
        option = keyboard.nextInt();

        return option;
    }

    public static void linkListExecute(){

        Long startTime = null, endTime = null, timediffrence = null;
        startTime = new Date().getTime();
        System.out.println("inserting a values start time ::" + startTime);
        SortLinkList objsort = new SortLinkList();

        NodeSort nl1 = objsort.add(5);
        NodeSort nl2 = objsort.add(7);
        NodeSort nl3 = objsort.add(11);
        NodeSort nl4 = objsort.add(20);
        NodeSort nl5 = objsort.add(27);
        NodeSort nl6 = objsort.add(36);
        NodeSort nl8 = objsort.add(54);
        NodeSort nl9 = objsort.add(36); // Checking sorting

        NodeSort NodeSort = nl5;

        NodeSort finalsort = objsort.sort(NodeSort);
        while (finalsort != null) {
            System.out.print(finalsort.getValue().toString() + ",");
            finalsort = finalsort.getNext();
        }
        endTime = new Date().getTime();
        System.out.println("");
        System.out.println("Sorting a link List values End time ::" + endTime);
        timediffrence = endTime - startTime;
        System.out.println("Execution time in millisecond ::" + timediffrence);
    }

  public static void binaryExecute() {
      Long startTime = null, endTime = null, timediffrence = null;
      startTime = new Date().getTime();
      System.out.println("inserting a values start time ::" + startTime);
      BinarySearch ob = new BinarySearch();
      int arr[] = {2, 3, 4, 10, 40};
      int n = arr.length;
      int x = 10;
      int result = ob.binarySearch(arr, x);
      if (result == -1)
          System.out.println("Element not present");
      else
          System.out.println("Element found at "
                  + "index " + result);

      endTime = new Date().getTime();
      System.out.println("");
      System.out.println("Sorting a link List values End time ::" + endTime);
      timediffrence = endTime - startTime;
      System.out.println("Execution time in millisecond ::" + timediffrence);

  }
}
