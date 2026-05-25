public class SignatureCard extends CreditCard {
    public int oldReward;
    public SignatureCard(String c, String i){
        super(c, i, 200);
    }
     public void spendCash(int a){
        oldReward = rewardPoints;
        rewardPoints += a*4/100;
        System.out.println("Previous Reward Points: "+oldReward);
        System.out.println("Reward points after spending "+a+" taka: "+rewardPoints);
    }
}
