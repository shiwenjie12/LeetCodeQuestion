public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){return 0;}
        int len=prices.length;
        int profit=0;
        int start=prices[0];
        for(int i=1;i<len;i++){
            if(prices[i]<start){start=prices[i];}
            profit=Math.max(prices[i]-start,profit);
        }
        return profit;
    }

    public static void main(String[] args) {

    }
}
