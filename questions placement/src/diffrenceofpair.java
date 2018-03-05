/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shashank
 */
public class diffrenceofpair {
    public static void main(String ... sm){
    int a[]={1,2,3,4,5,6,7,8,41,7,8};
    findPair(a,40);
    }
 
    
    private static boolean findPair(int arr[],int n)
    {
        int size = arr.length;
 
        // Initialize positions of two elements
        int i = 0, j = 1;
 
        // Search for a pair
        while (i < size && j < size)
        {
            if (i != j && arr[j]-arr[i] == n)
            {
                System.out.print("Pair Found: "+
                                 "( "+arr[i]+", "+ arr[j]+" )");
                return true;
            }
            else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
 
        System.out.print("No such pair");
        return false;
    }
    
    
}
