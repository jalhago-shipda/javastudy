import test.seller.FruitSeller;
import test.buyer.FruitBuyer;

class q8_1_1
{
    public static void main(String[] args)
    {
        FruitSeller seller1 = new FruitSeller(0, 30, 1500);
        FruitSeller seller2 = new FruitSeller(0, 20, 1000);
        FruitBuyer buyer = new FruitBuyer(10000, 0);

        buyer.buyApple(seller1, 4500);
        buyer.buyApple(seller2, 2000);

        System.out.println("사과장수1의 상태");
        seller1.showPriority();

        System.out.println("사과장수2의 상태");
        seller2.showPriority();
        
        System.out.println("구매자의 상태");
        buyer.showPriority();
    }
}
