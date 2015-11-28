package test.buyer;
import test.seller.FruitSeller;

public class FruitBuyer
{
    int myMoney;
    int numOfApple;

    public FruitBuyer(int money, int appleNum)
    {
        myMoney = money;
        numOfApple = appleNum;
    }
    public void buyApple(FruitSeller seller, int money)
    {
        numOfApple += seller.saleApple(money);
        myMoney -= money;
    }
    public void showPriority()
    {
        System.out.println("산 사과 : " + numOfApple);
        System.out.println("남은 돈 : " + myMoney);
    }
}
