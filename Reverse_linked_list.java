package com.company;
//Given a linked list of N nodes. The task is to reverse this list.
//        Input:
//        LinkedList: 1->2->3->4->5->6
//        Output: 6 5 4 3 2 1
//        Explanation: After reversing the list,
//        elements are 6->5->4->3->2->1.

public class Main {
   static Node head =null;
    public static void main(String[] args) {
	// write your code here

        int[] input={9,8,7,6,5,4,3,2,1 };
        for(Integer i:input){//for each
            insert(i);
        }
        printLinkedList();
        System.out.println("reverse of linked list");
        reverseLinkedList(head);

    }
    public static  void insert(Integer val){
        //if not head
        if(head == null){//no node inserted
            head =new Node(val);//1->2->null
        }
        else{
            Node temp=head;
            while (temp.Next !=null){
                temp=temp.Next;
            }
            //temp points 2
            temp.Next =new Node(val);// 1->2->3->null
        }
    }
    public  static  void printLinkedList(){
        Node temp=head;
        System.out.println("values of linked list");
        while(temp !=null){
            System.out.println(temp.val);
            temp=temp.Next;
        }
    }
    public  static  void  reverseLinkedList(Node curr){
        if(curr == null){//1->2->3->null
            return;
        }
        reverseLinkedList(curr.Next);
        System.out.println(curr.val);

    }
}



