package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public int listComGenerics(){
    	
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
         
        int total = 0;
        for(Integer i : lista){
               total += i;
        }
         
        return total;	
    }	
	
    public int listSemGenerics(){            
        
        List lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
         
        int total = 0;
        for (int i = 0; i < lista.size(); i++){
               total += (int) lista.get(i);
        }
         
        return total;	
             
      }    
    
}
