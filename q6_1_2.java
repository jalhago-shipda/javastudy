// 두 정수를 전달받아서, 두 수의 차의 절대값을 계산하여 출력하는 메소드와 이 메소드를 호출하는 main메소드를 정의해 보자. 단 메소드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다.

class q6_1_2
{
    public static void absolute(int a, int b)
    {
        if(a>=b)
            System.out.println("두 수의 차의 절대값은 = "+(a-b));
        else
            System.out.println("두 수의 차의 절대값은 = "+(b-a));
    }

    public static void main(String[] args)
    {
        System.out.println("20과 -7의 차의 절대값?");
        absolute(20, -7);
        System.out.println("-18과 20의 차의 절대값?");
        absolute(-18, 20);
    }
}
