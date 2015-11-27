// 정수 n을 전달받아서, 2의 n승을 계산하여 반환하는 메소드를 재귀의 형태로 정의하고, 이의 테스트를 위한 main메소드도 함께 정의하자

class q6_3_1
{
    public static int squarecal(int n)
    {
        if(n==1)
            return 2;
        else
            n = 2*squarecal(n-1);
            return n;
    }

    public static void main(String[] args)
    {
        System.out.println("2의 5승은 " + squarecal(5) + " 입니다.");
        System.out.println("2의 10승은 " + squarecal(10) + " 입니다.");
    }
}

/* answer
if(n==0)
    return 1;

return 2*suarecal(n-1);


0승을 생각 안했네. 

*/




