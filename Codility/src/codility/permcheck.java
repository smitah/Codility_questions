/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author smitahirve
 */
public class permcheck {
    
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
       int totalsum = (A.length*(A.length + 1))/2;
       int arrsum = 0; 
        for(int i = 0; i<A.length; i++){
            arrsum += A[i];
            set.add(A[i]);
        }
           
        if(arrsum != totalsum)
            return 0; 
        
        if(set.size() != A.length)
            return 0;
        // write your code in Java SE 8
       return 1; 
    }
    
    public static void main(String[] a){
        int[] input = {4,1,3};
        int result = solution(input);
        System.out.println(result);
        //System.out.println(input.toString());
    }
    
}
