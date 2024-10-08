class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange)
        {
            int di=numBottles/numExchange;
            sum+=di;
            numBottles=(numBottles/numExchange)+(numBottles%numExchange);
        }
        return sum;
    }
}
