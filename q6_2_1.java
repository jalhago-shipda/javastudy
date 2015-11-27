//원의 반지름 정보를 전달하면, 원의 넒이를 계산해서 반환하는 메소드와 원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고, 이를 호출하는 main 메소드를 정의하자

class q6_2_1
{
    public static double circle_s(double r)
    {
        return r*r;
    }

    public static double circle_l(double r)
    {
        return 2*r;
    }

    public static void main(String[] args)
    {
        double r=6;

        System.out.println("반지름의 6인 원의 넓이는 = " + circle_s(6)+"pi");
        System.out.println("둘레는 = " + circle_l(6)+"pi");
    }
}
