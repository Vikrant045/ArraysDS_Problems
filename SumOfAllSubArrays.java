public class SumOfAllSubArrays {

    public static void sum(int arr[]) {
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                for(int k=j;k<=j;k++){
                    sum =sum+arr[k];

                }
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min =sum;
                }
                System.out.print(" "+sum);
            }
            sum=0;
        }
        System.out.println();
        System.out.println("Maximum sum = "+max);
        System.out.println("Minimum sum = "+min);

        
    }
    public static void main(String args[]) {

        int arr[]={11,22,33,44,43};
        sum(arr);
        
    }
    
}
