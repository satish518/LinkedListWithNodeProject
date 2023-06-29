package com.example.linkedlistwithnodeproject;

import java.util.Scanner;

public class LinkedListTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        boolean flag = true;

        while(flag) {
            System.out.println("");
            System.out.println("1. Add Item to the list at start");
            System.out.println("2. Add Item to the list at end");
            System.out.println("3. Add Item to the list at position");
            System.out.println("4. Delete Start Item from the list");
            System.out.println("5. Delete End Item from the list");
            System.out.println("6. Delete Pos Item from the list");
            System.out.println("7. View List");
            System.out.println("8. Exit");
            System.out.println("Enter Your Choice");

            int choice = sc.nextInt();
            int position, val;
            switch(choice) {
                case 1:
                    System.out.println("Enter Value of List Item");
                    val = sc.nextInt();
                    list.insertAtStart(val);
                    break;
                case 2:
                    System.out.println("Enter Value of List Item");
                    val = sc.nextInt();
                    list.insertAtEnd(val);
                    break;
                case 3:
                    System.out.println("Enter Position");
                    position = sc.nextInt();
                    System.out.println("Enter Value of List Item");
                    val = sc.nextInt();
                    list.insertAtPos(val, position);
                    break;
                case 4:
                    list.deleteStart();
                    break;
                case 5:
                    list.deleteEnd();
                    break;
                case 6:
                    System.out.println("Enter Position");
                    position = sc.nextInt();
                    list.deleteAtPos(position);
                    break;
                case 7:
                    list.viewList();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");

            }

        }

    }
}
