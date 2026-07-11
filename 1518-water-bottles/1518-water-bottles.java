class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int ans=numBottles;
       while(numBottles>=numExchange){
        int s=numBottles/numExchange;
        int r=numBottles%numExchange;
        ans=ans+s;
        numBottles=s+r;



        
       }
      


       return ans;

        
    }
}