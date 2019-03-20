package com.app.ch15.list;

import java.util.*;


/*
1) order
2) allows duplicate
3) access by index
                            Collection
                     List                  Set
               ArrayList  LinkedList    HashSet TreeSet LinkedHashSet


 */
public class MainList {

    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new LinkedList();

        System.out.println("-------------Order + index access-----------");
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("-------------allows duplicate-----------");
        list.add("B");

        System.out.println("list.hashCode="+list.hashCode());
        //System.out.println("list.hashCode="+list.hashCode());
        System.out.println("size="+list.size());
        System.out.println("isEmpty="+list.isEmpty());
        for(int i=0;i<list.size();i++){
            Object item = list.get(i);
            System.out.println(item);
        }
        System.out.println("------------------------");
        for(Object item: list){
            System.out.println(item);
        }
        System.out.println("----------Iterator--------------");

        Iterator itr = list.iterator();
        //itr.remove();

        while(itr.hasNext()){
            Object item = itr.next();
            System.out.println(item);
            if("A".equals(item)){
                itr.remove();
            }
        }

        System.out.println("--------After itr.remove---------");
        System.out.println(list);
        System.out.println("list.hashCode="+list.hashCode());
        System.out.println("---------------Equals------------------");

        List list2 = new ArrayList();
        List list3 = new ArrayList();
        System.out.println("list2==list3: "+(list2==list3));
        System.out.println("list2.equals(list3): "+(list2.equals(list3)));
        System.out.println("list2.hashCode="+list2.hashCode());
        System.out.println("list3.hashCode="+list3.hashCode());

        list2.add("T");
        list3.add("K");
        System.out.println("list2==list3: "+(list2==list3));
        System.out.println("list2.equals(list3): "+(list2.equals(list3)));
        System.out.println("list2.hashCode="+list2.hashCode());
        System.out.println("list3.hashCode="+list3.hashCode());

        System.out.println("---------------LinkedList------------------");
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        Iterator descItr = linkedList.descendingIterator();
        while(descItr.hasNext()){
            Object item = descItr.next();
            System.out.println(item);
        }

        System.out.println("--------------Collections-------------------------");
        //Arrays.toString();
        //Collection - interface for List, Set

        Collections.shuffle(linkedList);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);

        System.out.println("-----------------SubList------------------------------");

        List data = new ArrayList();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        //[)
        List subData=data.subList(0, 3);
        System.out.println("subData"+subData);

        Object oldValue=subData.set(0, "Test");
        System.out.println("oldValue="+oldValue);
        System.out.println("subData"+subData);
        System.out.println("data"+data);
        System.out.println("@@@@@@@@");
        data.set(1, "Fake");
        System.out.println("subData"+subData);
        System.out.println("data"+data);

        System.out.println("--------List CRUD------");
        List myData = new ArrayList();
        myData.add("A");
        myData.add("B");
        myData.add("C");
        System.out.println(myData);
        myData.add(1, "A1");
        //myData.add("A1");
        System.out.println(myData);
        Object value=myData.set(0, "Update");
        System.out.println("value by [0]="+value);
        System.out.println(myData);
        int n = myData.size();
        System.out.println("size="+n);
        Object firstItem=myData.get(0);
        Object lastItem=myData.get(n-1);
        System.out.println("firstItem="+firstItem);
        System.out.println("lastItem="+lastItem);

        Object removedValue=myData.remove(0);
        System.out.println(myData);
        n = myData.size();
        System.out.println("size="+n);
        System.out.println("removedValue="+removedValue);

        myData.add("A1");
        myData.add("A1");
        System.out.println(myData);

        //myData.remove("A1");
        //System.out.println(myData);

        boolean success = true;
        while(success){
            success = myData.remove("A1");
        }
        System.out.println(myData);

    }
}
