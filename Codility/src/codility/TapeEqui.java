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
public class TapeEqui {
    
     public static int solution(int[] A) {
     int[] result = new int[A.length];
     int min = Integer.MAX_VALUE;
     int arrsum = 0; 
     int sum = A[0];
     for(int i = 0; i<A.length;i++){
         arrsum += A[i];
         }
         
     for(int i = 1; i<A.length; i++){
        sum += A[i];
        A[i] = sum;
     }
     result[0] = A[0];
     for(int i = 0; i<A.length-1; i++){
      result[i+1] = Math.abs(arrsum - 2*A[i]);   
     }
     
     for(int i = 1; i<result.length;i++){
         if(result[i]<min)
         {
          min = result[i];   
         }
     }
     
    //System.out.println(Arrays.toString(result));
     //System.out.println("The min value is" + min);
     return min; 
}
     
     
     public static void main(String[] a){
        int[] input = {2,3};
        int result = solution(input);
        System.out.println(result);
        //System.out.println(input.toString());
    }
    
    
}
