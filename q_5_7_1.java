class q_5_7_1
{
    public static void main(String[] args)
    {
        for(int i=1; i<5; i++)                   // 답에서는 그냥 i<10 잡아놓고 밑에 이프문에서 j>=i면 break 로 써놨음
        {
            for(int j=1; j<10; j++)
            {
                System.out.println(2*i + " * " + j + " = " + 2*i*j);
                if(2*i==j)
                    break;
            }
        }
    }
}
