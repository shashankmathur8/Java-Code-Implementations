/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Shashank
 */
public class Hashset {
    
    public static void main(String ... rk){
    char a[]={'a','s','d','s','s','a'};
  HashSet<String> set=new HashSet<String>();
  for(int j=0;j<a.length;j++){
      if(!set.contains(""+a[j])){
          set.add(""+a[j]);
          System.out.println(set);
      }else{
      System.out.print("aagya"+a[j]);
      break;
      }
  }
  //System.out.print(set);
    
    
    
    }
    
}
