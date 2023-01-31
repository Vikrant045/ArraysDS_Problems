public class IndexOfTargetValue {

    public static int target(int nums[], int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
       return -1;   
        
    }
    public static void main(String args[]) {
        int arr[]={0,1,2,4,5,6,7,8,9,12,56,00,5};
        int index = 7;
        int end = arr.length;
       // int h = end -index; 
        int mid = index;
        int start =0;
      
        int newA [] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(mid<end){
            newA[i]= arr[mid];
            mid++;
            }
            else{
                newA[i]=arr[start];
                start++;
            }
            
            System.out.print(" "+newA[i]);
        }
        System.out.println();
        
        int target = 6;
        System.out.println(target(newA, target));
        
    }
    
}
