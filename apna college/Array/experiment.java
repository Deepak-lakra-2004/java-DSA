public class experiment{
    public static int buyAndSellStocks(int[] price){
        int bp = Integer.MAX_VALUE;
        int tp = Integer.MIN_VALUE;
        int mp = 0;
        for(int i=0; i<price.length; i++){
            if (price[i] < bp) {
                bp = price[i];
            }
            tp = price[i] - bp;
            mp = Math.max(tp, mp);
        }
        
        if(mp > 0){
            return mp;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.println("The maximum profit is : " + buyAndSellStocks(price));
    }
}