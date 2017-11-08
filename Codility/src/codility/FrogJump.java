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
public class FrogJump {
    
   
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        
        int result = (Y-X) % D == 0 ? (Y-X)/D: (Y-X)/D +1; 
        return result; 
    }
    
    public static void main(String[] a){
        int result = solution(10, 85, 30);
                
        System.out.println(result);
    }
}
    

