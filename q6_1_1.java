//두개의 정수를 전달받아서, 두 수의 사칙연산 결과를 출력하는 메소드와 이 메소드를 호출하는 main메소드를 정의해 보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.

class q6_1_1
{
    public static void math(int a, int b)
    {
        System.out.println("더하기 = " + (a+b));
        System.out.println("빼기 = " + (a-b));
        System.out.println("곱하기 = " + (a*b));
        System.out.println("나누기 = " + (a/b) + ", 나머지는 " + (a%b));
    }

    public static void main(String[] args)
    {
        System.out.println("20과 4의 사칙연산은?");
        math(20, 4);
        System.out.println("18과 5의 사칙연산은?");
        math(18, 5);
    }
}
