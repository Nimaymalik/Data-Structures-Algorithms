public class Bottle {
    public static int numWaterBottles(int numBottles, int numExchange) {
        
        int ans=numBottles;//ans=15
        while(numBottles>=numExchange){
           int newBottles=(int)numBottles/numExchange;//new=15/4=3
            int remaining=numBottles%numExchange; //remaining=15%4=3
            ans+=newBottles;//ans=15+3=18
            numBottles=newBottles+remaining;//numBottles=3+3=6
        }
        return ans;
    }
    public static void main(String[] args) {
     int numBottles=9;
     int numExchange=3;

     System.out.println(numWaterBottles(numBottles, numExchange));
        
    }
}