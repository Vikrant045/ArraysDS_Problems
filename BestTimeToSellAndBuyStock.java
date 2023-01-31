public class BestTimeToSellAndBuyStock {

    public static void main(String args[]) {

int arr[]={7,1,5,3,6,4};
  
int stockPrice = Integer.MAX_VALUE;
int MaxProfit =0;
     for(int i=0;i<arr.length;i++){

        if(stockPrice<arr[i]){
            int profit = arr[i]-stockPrice;
            MaxProfit= Math.max(MaxProfit, profit);
        }
        else{
            stockPrice = arr[i];
        }
        
     }
     System.out.println(MaxProfit);
        
    }
    
}
