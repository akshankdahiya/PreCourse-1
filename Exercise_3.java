import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
          data = d;
          next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
      Node NewNode = new Node(data);
      NewNode = null;
   
        // If the Linked List is empty, 
        // then make the new node as head 
      if(list.head == null)
      {
        list.head = NewNode;
      }
      
     else{
            // Else traverse till the last node 
            // and insert the new_node there 
      Node LastNode = list.head;
      while(LastNode.next != null){
        LastNode = LastNode.next;
      }
     }

            // Insert the new_node at last node
      LastNode.next = NewNode;
      
        // Return the list by head 
      return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
      Node CurrNode = list.head;
      System.out.println("Linkedlist: ");
      while(CurrNode != null){
        // Print the data at current node 
      System.out.println(CurrNode.data +"  ");
       
            // Go to next node 
      CurrNode = CurrNode.next;
        
      }
        
   
            
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
