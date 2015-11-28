class 판매자
{
    int 사과갯수 = 20;
    int 사과가격 = 1000;
    int 판매수익 = 0;

    public int 사과팔기(int 사과값)
    {
        갯수 = 사과값 / 사과가격;
        사과갯수 -= 갯수;
        판매수익 += 사과값;
        return 갯수;
    }
    public void 현재상황()
    {
        System.out.println("남은 사과 = " + 사과갯수);
        System.out.println("판매 수익 = " + 판매수익);
    }
}

class 구매자
{
    int 보유 금액 = 5000;
    int 보유 사과 = 0;
    
    pubic void 사과사기(int 사과값);
    {
        보유 사과 += 사과장수.사과팔기(사과값);
        보유 금액 -= 사과값;
    }
    public void 현재상황()
    {
        System.out.println("보유 금액 = " + 보유금액);
        System.out.println("보유 사과 = " + 보유사과);
    }
}

class 진짜 사보자
{
    public static void main(String[] args)
    {
        판매자 사과장수 = new 판매자();
        구매자 손님1 = new 구매자();

        손님1.사과사기(사과장수, 2000);

        System.out.println("사과장수의 현재상태");
        사과장수.현재상황();
        System.out.println("손님1의 현재상태");
        손님1.현재상황();
    }
}
