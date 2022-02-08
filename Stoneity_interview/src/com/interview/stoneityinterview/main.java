/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interview.stoneityinterview;

/**
 *
 * @author Asus
 */
public class main {
    
    public static void main(String[] args) {
         //int[] array_unsorted = {16, 23, 7,11, 3, 14};
         int[] array_unsorted = {4, 13, 8, 9, 7, 1, 6};
         int[] sorted_array = new int[array_unsorted.length];
         
         int[] array_unsorted2 = {16, 23, 7,11, 3, 14};
         int[] sorted_array2 = new int[array_unsorted2.length];
         
         boolean head =true;
         int left =0,right= array_unsorted.length-1,right2= array_unsorted2.length-1;
      
         SpecialMerge special_merge = new SpecialMerge();
         
         sorted_array = special_merge.descendingSortRecursive(array_unsorted, left, right, head);
         
         System.out.println("Sample 1");
         for(Integer e : sorted_array){
             System.out.print(e+" ");
         }
         
        System.out.println("\n");
        
        
        
        sorted_array2 = special_merge.descendingSortRecursive(array_unsorted2, left, right2, head);
        
        System.out.println("Sample 2");
         for(Integer e : sorted_array2){
             System.out.print(e+" ");
         }
         
        System.out.println("\n");
    }
}
