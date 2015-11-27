class bytimes2
{
    public static void main(String[] args)
    {
        int a=2, b;

        while(a<10)
        {
            b=1;                   // 초기화를 여기서 하는 이유는 밑에 와일문 돌리면 b가 10이되니까 전체적으로 봤을때 2단밖에 출력이 안되기 때문임
            while(b<10)
            {
                System.out.println(a + " * " + b + " = " + a*b);
                b++;
            }
            
            a++;
        }
    }
}
