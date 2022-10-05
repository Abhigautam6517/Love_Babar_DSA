package Array;

import java.util.ArrayList;

public class FactorialOfLargeNUmber{
    static ArrayList<Integer> factorial(int N){
        int c = 0;     
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);  // 0th index pr initially 1 add kiya hai 
       
        
        int val = 2;  // 2 se multiply krna start krenge 2 x 3 x 4...N
        while(val <= N){
            
            for(int i = list.size()-1; i >= 0; i--){
            
            // last digit milri hai list.get(i) se then X val X carry 
				int temp= list.get(i)*val+c;  
                
               	list.set(i,temp%10);  
                c = temp/10;
            }
            
            while(c != 0){
                list.add(0, c%10);
                c = c/10;
               
            }
            val++;
        }
        return list;
    }
}

