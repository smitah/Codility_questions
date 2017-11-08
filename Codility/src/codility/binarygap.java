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
public class binarygap {
    
     public static int solution(int n) {
        int max = 0; 
        int curr = 0; 
        int flag1 = 0;
     
        
        if(n == 1)
            return 0;
        
        while(n>1){
            if(n%2 == 0 && flag1 == 0){
              n = n/2; 
              continue; 
            }
            if(n%2 ==0 && flag1 == 1){
                 curr++;
                
                 
            }
               
            if(n%2 == 1){
                curr = 0; 
                flag1 = 1;
               
            }
                
            if(curr>max )
                max = curr;
            n = n/2;
        }
    return max;
    }
     
     public static void main(String args[]) {
         int number = 1041; 
         int answer = solution(number);
         System.out.println(answer);
     }
    
}
