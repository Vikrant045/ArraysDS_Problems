public class BinarySearch {

    public static int  BS(int arr[],int key) {

        int start = 0;
        int end = arr.length-1;
        int match;
        int mid;
        while(start<=end){

            mid = (start+end)/2;
            if(key == arr[mid]){
              return mid;
              // match=mid;
               
            }
            else if(key<arr[mid]){
                //start=0;
                end = mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
               // end = mid-1;
            }
        }
       // System.out.println(match);

      //  return match;
      return -1;

        
    }
    public static void main(String args[]) {

        int arr []= {1,10,20,25,36,56,58,220,500};
        int key = 500;
        System.out.println("Index for key "+BS(arr, key));
        
    }
    
}


