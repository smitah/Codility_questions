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
public class arrayrotate {
    
    public static int[] solution(int[] A, int k ){
        int len = A.length;
        int[] result1 = new int[len];
        for(int i = 0; i<len; i++)
            result1[(i+k)%len] = A[i];
        
        return result1;
    }
    
    public static void main(String[] a){
        int[] input = {3,8,9,7,6};
        int[] result = solution(input, 3);
        System.out.println(Arrays.toString(result));
        //System.out.println(input.toString());
    }
    
}
