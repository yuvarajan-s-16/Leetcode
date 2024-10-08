class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numExchange <= numBottles ) {
            numBottles -= numExchange;
            numBottles++;
            numExchange++;
            sum++;
        }
        return sum;
    }
}
