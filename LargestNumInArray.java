import java.util.*;
public class LargestNumInArray {

public static int  Largest(int arr[]) {

    int largest = Integer.MIN_VALUE;

    for(int  i =0;i<arr.length;i++){
        
        int num = arr[i];
        if(num>largest){
            largest=num;
        }
    }
    return largest;
    
}

    public static void main(String args[]) {

        int arr[] ={12,1,65,0,686,032,222,2};
      System.out.println(Largest(arr));  
        
    }
    
}
