public class KadanMaxSumSubArray {

    public static void kadanSum(int kadan[]) {
        
        int maxSum = Integer.MIN_VALUE;

        int currSum = 0;
        for(int i =0;i<kadan.length;i++){
            currSum = currSum+kadan[i];
            if(currSum<=0){
                currSum=0;
            }
            if(maxSum<currSum){
                maxSum =currSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {
        int kadan [] = {1,2,3,4};
         kadanSum(kadan);
        
    }
    
}
