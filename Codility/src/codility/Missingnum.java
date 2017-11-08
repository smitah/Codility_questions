/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author smitahirve
 */
public class Missingnum {
    
    public static int solution(int[] A){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i<A.length;i++){
            if(A[i]>max)
                max = A[i];
            
            if(A[i]<min)
                min = A[i];
            
            
        }
        System.out.println("The min value is " + min);
            System.out.println("The max value is " + max);
        int k = 0; 
        min++;
        int var = 0; 
        while(k<A.length){
            var = min;
            for(int p = 0; p<A.length; p++){
                if(A[p] == min)
                    min++;  
            }
            
            if((min == var) && min>0)
                return var;
            k++;
        }
        
        if(max>0)
            return max++;
        else
            return 1; 
        
    }
    
    public static void main(String s[]){
        int[] input = {-1,-3};
        
        int result = solution(input);
        System.out.println("The answer is" + result);
        
    }
    
}
