import java.io.*;

class Node {
    int data;
    Node next;
    Node(int d)                                                          // Constructor
    {
        data = d;
        next = null;
    }
}

public class LUCLinkedList {                                             // a Singly Linked List
    Node head;                                                           // head of list
    public static LUCLinkedList insert(LUCLinkedList list, int data)     // Method to insert a new node
    {
        Node new_node = new Node(data);                                  // Create a new node with given data
        new_node.next = null;
        if (list.head == null) {                                         // If the Linked List is empty, then make the new node as head
            list.head = new_node;
        }
        else {                                                           // Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;                                        // Insert the new_node at last node
        }
        return list;
    }

    public static void printList(LUCLinkedList list)                     // Method to print the LinkedList.
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {                                       // Traverse through the LinkedList
            System.out.print(currNode.data + " ");                       // Print the data at current node
            currNode = currNode.next;                                    // Go to next node
        }
    }

    /*
    * In class activity #1 1/19/23
    * A. Write a method that adds all the data values stored in a list
    * Written by Christian Vasquez
     */
    public static void addData(LUCLinkedList list) {
        int sum = 0;                                                      // output variable
        Node currNode = list.head;                                        // list head
        while (currNode != null) {                                        // traverse through the list
            sum += currNode.data;                                         // add the current data to sum
            currNode = currNode.next;                                     // set currNode to next node
        }
        System.out.println("\nAll elements of linked list added together = " + sum); 
    } // method addData                                                               

    /*
     * In class activity #1 1/19/23
     * B. Write a method that finds the maximum (data) element of a list
     * Written by Christian Vasquez
     */
    public static int maxElement(LUCLinkedList list) {
        int max = 0;                                                     // output variable
        Node currNode = list.head;                                       // list head
        while (currNode != null) {                                       // traverse through list
            if (currNode.data >= max) {                                  // if the current value is larger than the value of max
                max = currNode.data;                                     // set max to the current value
            }
            currNode = currNode.next;                                    // set currNode to the next node in list
        }
        System.out.print("The maximum element of the list is: " + max);  // print result
        return max;
    } // method maxElement

    /*
     * In class activity #1 1/19/23
     * C. Write a method that prints only the elements with even index (index: 0, 2, 4, ...)
     * Written by Christian Vasquez
     */
    public static void evenElements(LUCLinkedList list) {
        Node currNode = list.head;                                       // list head
        System.out.print("\nLinked List (Even elements): ");
        while (currNode != null) {                                       // traverse through list
            if (currNode.data % 2 == 0) {                                // if the current data point is even
                System.out.print(currNode.data + " ");                   // Print the data at current node
            }
            currNode = currNode.next;                                    // Set current node to next node
        }
    } // method evenElements

    /*
     * In class activity #1 1/19/23
     * D. Write a method that removes all the elements of a list that match an input value
     * Written by Christian Vasquez
     */
    public static void removal(LUCLinkedList list, int num){
        Node currNode = list.head;                                       // list head
        System.out.print("\nLinked List (without " + num + "): ");
        while (currNode != null) {                                       // traverse through list
            if (currNode.data != num) {                                  // if the current data point does not match the input number
                System.out.print(currNode.data + " ");                   // Print the data at current node
            }
            currNode = currNode.next;                                    // set currNode to next node
        }
    } // method removal

    public static void main(String[] args)
    {
        LUCLinkedList list = new LUCLinkedList();/* Start with the empty list. */
        // Insert the values
        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        printList(list);                                                 // Print the LinkedList
        addData(list);                                                   // add the data together (A)
        maxElement(list);                                                // find the max element (B)
        evenElements(list);                                              // print only even elements of LinkedList (C)
        removal(list, 0);                                                // print linked list with input num removed (D)
    }
}
