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
public class ventu {
 
 public static void main (String ...rk){
     int temphi=0;
     node root= new node();
     root.parent=null;
     node current= root;
 int a[]={6,4,598,3,5,7,9};
 for(int j=0;j<a.length;j++){
    if(root.value==0){
  //  System.out.print("root");
    current.value=a[j];
    }else{
      current= add(a[j],current);
    }
 }
 root.value=40;
 showfinal(root);
 showpost(root);
 showfinal(root);
 
 }   

    private static node add(int a,node x) {
    if(a<x.value){
       if(x.left!=null){
       x=x.left;
       add(a,x);
       return x.parent;
       }else{//System.out.println("left of"+x.value);
    x.left=new node();
    x.left.value=a;
    x.left.parent=x;
    return x;}
    }else{
        if(x.right!=null){
            x=x.right;
       add(a,x);
            return x.parent;
        }else{
   // System.out.println("right of "+x.value);
    x.right=new node();
    x.right.value=a;
    x.right.parent=x;
    return x;}
    }
    }

    private static int showpost(node c) {
    node cur=c;
    int temp=0,temp2=0;
        if(cur.left!=null){
        temp=showpost(cur.left);
        }
        if(cur.right!=null){
            temp2=showpost(cur.right);
        }
        if(cur.right==null&&cur.left==null){
            System.out.println(""+cur.value);
            return cur.value;
        }
       int swap=(cur.left).value;
       (cur.left).value=(cur.right).value;
       (cur.right).value=swap;
        cur.value=temp+temp2;
       System.out.println(""+(cur.value));
       return cur.value;
    
    }
    
     private static int showfinal(node c) {
    node cur=c;
    //int temp=0,temp2=0;
        if(cur.left!=null){
        showfinal(cur.left);
        }
        if(cur.right!=null){
            showfinal(cur.right);
        }
       System.out.println(""+(cur.value));
       return cur.value;
    
    }
 
 }   

