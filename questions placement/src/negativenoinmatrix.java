/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shashank
 */
public class negativenoinmatrix {
    public static void main(String...sm){
    int a[][]={{-3,-1,-2,-5},{-1,-5,6},{-4,9,15}};
    int count=0;
    //System.out.print(""+a.length);
    for(int i=0;i<a.length;i++){
     //System.out.print(""+a[i].length);   
    for(int j=0;j<a[i].length;j++){
    if(a[i][j]<0){count++;}
    }
    }
    System.out.print(count);
    
    
    }
    
}
