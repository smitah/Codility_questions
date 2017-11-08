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
public class missingelem {
    
    public static int solution(int[] A){
        if(A.length == 1)
            return A[0];
        if(A == null)
            return 1; 
        Arrays.sort(A);
        for(int i = 0; i<A.length-1; i++){
            if(A[i+1] == A[i] + 1)
                continue; 
            else
                return A[i] + 1; 
        }
        
        return A[A.length-1] + 1; 
    }
    
     public static void main(String[] a){
        int[] input = {2,3,1,5};
        int result = solution(input);
        System.out.println(result);
        //System.out.println(input.toString());
    }
    
}
