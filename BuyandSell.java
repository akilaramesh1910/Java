public class BuyandSell {
    public static void main(String[] args) {
        int arr[]={7,1,5,4,6,3};
        int value=maxProfit(arr);
        System.out.println(value);
    }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int cost_price=prices[0];
        for(int i=1;i<prices.length;i++){
           if(cost_price>=prices[i]){
              cost_price=prices[i];
           }
           int current_profit = prices[i] - cost_price;
           if(current_profit > profit) {
                profit = current_profit;
           }
        }
        return profit;
    }
}
