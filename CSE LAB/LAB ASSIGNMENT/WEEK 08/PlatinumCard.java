public class PlatinumCard extends CreditCard{
    public int oldReward;
    public PlatinumCard(String c, String i){
        super(c, i, 100);
    }
    public void spendCash(int a){
        oldReward = rewardPoints;
        rewardPoints += a*2/100;
        System.out.println("Previous Reward Points: "+oldReward);
        System.out.println("Reward points after spending "+a+" taka: "+rewardPoints);
    }
    
}
