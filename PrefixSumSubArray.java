public class PrefixSumSubArray {

    public static void main(String args[]) {

        int arr[] = {1,2,3,4};

        int prefixArr [] = new int [arr.length];
        prefixArr[0]=arr[0];
        for(int i=0;i<prefixArr.length;i++){
            prefixArr[i]=(i==0)?arr[0]:arr[i]+prefixArr[i-1];
            System.out.print(" "+prefixArr[i]);
        }
        System.out.println();
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
               currSum = i==0?prefixArr[j]:prefixArr[j]-prefixArr[i-1];
               // System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
               // currSum=0;
            }
        }
        System.out.println("MaxMum Sum is : "+maxSum);
        
    }
    
}
