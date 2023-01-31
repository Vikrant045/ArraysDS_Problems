public class BuyAndSellStock {

    public static int Stock(int stocksPrice[]){

        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i =0;i<stocksPrice.length;i++){
            if(BuyPrice<stocksPrice[i]){
                int profit = stocksPrice[i]-BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                BuyPrice = stocksPrice[i];
            }
        }
        return MaxProfit;

    }
    public static void main(String args[]){

        int stocksPrice[]={7,1,5,3,6,4};
        System.out.println(Stock(stocksPrice));
    }
    
}
