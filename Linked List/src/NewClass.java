/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
//node root;
/**
 *
 * @author Shashank
 */
public class NewClass {
 public static void main (String ...rk){
     node root= new node();
     node current= root;
 int a[]={1,2,3,4,5,6,7,8,9};
 for(int j=0;j<a.length;j++){
    if(root.value==0){
    root.value=a[j];
    root.next= new node();
    current=root.next;
    }else{
       // System.out.print(""+current);
      current= add(a[j],current);
    }
 }
 
 show(root);
 }   

    private static node add(int a,node x) {
    x.next=new node();
    x.value=a;
    return x.next;}

    private static void  show(node p) {
        while(p.next!=null){
        System.out.println(""+p.value);
        p=p.next;
        }        
    }
}

