class method2param
{
    public static void main(String[] args)
    {
        double myheight = 175.9;
        hieveryone(12, 12.5);
        hieveryone(13, myheight);
        byeveryone();
    }

    public static void hieveryone(int age, double height)
    {
        System.out.println("나는 " + age + "살이다");
        System.out.println("내 키는 " + height + "cm 얌.");
    }

    public static void byeveryone()
    {
        System.out.println("다음에 보자");
    }
}
