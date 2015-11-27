/*
10진수 정수를 전달받아서, 전달받은 정수에 해당하는 2진수를 출력하는 메소드를 재귀의 형태로 정의하고,
이의 테스트를 위한 main메소드도 함께 정의하자.
참고로 아직은 다양한 출력방법을 소개하지 않았으니, 여러줄에 걸쳐 출력이 이뤄지도록 메소드를 정의하자.
*/

class q6_3_2
{
    public static int b_number(int n)
    {
        if(n>0)
        {
            int bin;
            bin=n%2;
            n/=2;
            System.out.println(bin);
            b_number(n);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        b_number(12);
    }
}
            
