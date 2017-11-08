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
public class countdiv {
    
    public static int solution(int A, int B, int K){
        int result = 0; 
        int i = A; 
        while(i<B){
            if(i%K== 0)
                result++;
            i++; 
        }
        return result; 
    }
    
    
    public static void main(String[] a){
        int b = 6; 
        int c = 11; 
        int d = 2;
        
        System.out.println("The answer is " + solution(b, c, d));
    }
    
}
