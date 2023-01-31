public class LinearSearch {


    public static void Linear(int arr[],int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
         }
    }
    public static void main(String args[]) 
    
    {
        int arr[] ={15,4,44,12,20,96,100,89,120};

        int key = 15;
        Linear(arr, key);
        
    }
    
}
