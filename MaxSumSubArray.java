public class MaxSumSubArray {

    public static void maxSum(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                  //  System.out.print(" "+arr[k]);
                    currSum = currSum+arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                currSum=0;
            }
        }
        System.out.println("MaxMum Sum is : "+maxSum);

    }
    public static void main(String args[]){

        int arr[]={-1,2,3,-4};
        maxSum(arr);
    }
    
}
