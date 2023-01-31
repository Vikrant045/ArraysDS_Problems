import java.util.HashSet;

public class CheckDuplicateInArray {

    public static boolean  check1(int arr[]) {

        // brute force Approach

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;

        
    }
    public static boolean  check2(int arr[]){
        HashSet<Integer> check= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(check.contains(arr[i])){
return true;
            }
            else{
                check.add(arr[i]);
            }
        }
        return false;

    }
    public static void main(String args[]) {

        int arr[]={1,45,2,1,20};
        System.out.println(check2(arr));
       
        
    }
    
}
