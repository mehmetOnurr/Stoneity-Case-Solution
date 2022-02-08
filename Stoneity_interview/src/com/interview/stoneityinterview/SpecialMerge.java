/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interview.stoneityinterview;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class SpecialMerge {
    
    public SpecialMerge(){
        
    }
    
    public int[] descendingSortRecursive(int[] array_unsorted,int left,int right,boolean head){
        
     
        int max_value= array_unsorted[left],index_max=left,temp=0;
        int i;
        
        for( i=left; i<=right;i++){
            
            if( max_value < array_unsorted[i]){
                max_value = array_unsorted[i];
                index_max = i;
            }
        }
        
        if(head == true){
            temp = array_unsorted[left];
            array_unsorted[left] = max_value;
            array_unsorted[index_max] = temp;
            left =left +1;
            head = false;
        }
        else{
            temp = array_unsorted[right];
            array_unsorted[right] = max_value;
            array_unsorted[index_max] = temp;
            right = right -1;
            head=true;
        }
        
      
        
        
        if(left == right){
            return array_unsorted;
        }
        
        
        return descendingSortRecursive(array_unsorted, left, right, head);
     
    }
}
