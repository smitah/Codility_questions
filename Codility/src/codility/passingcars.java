/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

import java.util.Arrays;

/**
 *
 * @author smitahirve
 */
public class passingcars {
    
    
        public static int solution(int[] A) {
        // write your code in Java SE 8
        int i = A.length;
        Arrays.sort(A);
        if(i == 0)
            return 0;
        if(i == 1 )
            return A[0];
        if(i == 2)
            return A[0]*A[1];
        
        
         return A[i-1]*A[i-2]*A[i-3];
    }
    
    
    
    public static void main(String[] a){
        int[] input = {-1,-2,-3,-4,-5};
        
        System.out.println("The answer is " + solution(input));
    }
}
