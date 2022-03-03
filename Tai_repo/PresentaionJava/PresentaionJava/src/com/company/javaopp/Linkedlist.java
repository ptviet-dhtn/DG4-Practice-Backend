package com.company.javaopp;

import java.util.LinkedList;

//import java.util.*;
public class Linkedlist {

    public static void main(String [] args)
    {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Tài");
        ll.add("Việt");
        ll.add("Định");
        ll.add("Tuấn");
        ll.add("Trân");
        ll.add("Sinh");
        ll.add("Quốc");
        ll.add("Thiên");
        System.out.println("Initial list of elements: "+ll);
        //Removing specific element from arraylist
        ll.remove("Việt");
        System.out.println("After invoking remove(object) method: "+ll);
        //Removing element on the basis of specific position
        ll.remove(0);
        System.out.println("After invoking remove(index) method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Sơn");
        ll2.add("Hòa");
        // Adding new elements to arraylist
        ll.addAll(ll2);
        System.out.println("Updated list : "+ll);
        //Removing all the new elements from arraylist
        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: "+ll);
        //Removing first element from the list
        ll.removeFirst();
        System.out.println("After invoking removeFirst() method: "+ll);
        //Removing first element from the list
        ll.removeLast();
        System.out.println("After invoking removeLast() method: "+ll);
        ll.clear();
        System.out.println("After invoking clear() method: "+ll);
    }
}
