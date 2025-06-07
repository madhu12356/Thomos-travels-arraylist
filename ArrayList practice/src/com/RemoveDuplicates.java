    package com;

     import java.util.ArrayList;

     public class RemoveDuplicates {
     public static void main(String[] args) {
   
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(20);
        originalList.add(30);
        originalList.add(20);
        originalList.add(20);
        originalList.add(20);
        originalList.add(30);
        originalList.add(4);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < originalList.size(); i++) {
            int current = originalList.get(i);
            if (!uniqueList.contains(current)) {
                uniqueList.add(current);
            }
        }

        System.out.println("Original List: " + originalList);
        System.out.println("List after removing duplicates: " + uniqueList);
     }
    }
