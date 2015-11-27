class q_5_6_1
{
    public static void main(String[] args)
    {
        int count=0;

        for(int num=1; num<=100; num++)
        {
            System.out.println(num);
            if(num%5!=0 || num%7!=0)
                continue;

            System.out.println("진짜는"+num);
            count++;
        }

        System.out.println("횟수는"+count);
    }
}
