package test.seller;

public class FruitSeller
{
    int numOfApple;
    int myMoney;
    final int APPLE_PRICE;

    public FruitSeller(int money, int appleNum, int price)
    {
        numOfApple = appleNum;
        myMoney = money;
        APPLE_PRICE = price;
    }
    public int saleApple(int money)
    {
        int num = money/APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;
        return num;
    }
    public void showPriority()
    {
        System.out.println("매출 : " + myMoney);
        System.out.println("남은 사과 : " + numOfApple + " 개");
    }
}
