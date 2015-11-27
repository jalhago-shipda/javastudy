class q_5_7_2
{
    public static void main(String[] args)
    {
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(i+j==9)
                {
                    System.out.println("a = " + i + ", b = " + j);
                    break;         // 이 브레이크ㅜ는 쓸 필요가 없음. 어차피 이프문 끝나면 안의포문 벗어나서 바깥포문 조건검사해서 참이면 다시 진행되는 형식이라 굳이 쓸필요가 없다                }
            }
        }
    }
}
/* answer  답은 똑같이 나옴. 
class q_5_7_2
{
    public static void main(String[] args)
    {
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                if((i*10+j)+(j*10+i)==99)
                    System.out.println(i + ", " + j);
            }
        }
    }
}
