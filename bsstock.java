import java.util.*;

public class bsstock {
    public static int bs(int stock[] ){
        int buy_price = Integer.MAX_VALUE;
        int max_profit= 0;
        
        for(int i=0; i<stock.length; i++){
            if (buy_price<stock[i]) {
                int profit = stock[i] - buy_price;   
                max_profit = Math.max(max_profit, profit);             
            }else{
                buy_price=stock[i];
            }
        }
        return max_profit;
    }
    
    public static void main(String args[]){
        int stock[] = {7,1,5,3,6,4};
        System.out.println(bs(stock));
    }    
}
