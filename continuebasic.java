class continuebasic
{
    public static void main(String[] args)
    {
        int num=0;
        int count=0;

        while(num++<100)
        {
            System.out.println(num);
            if(num%5!=0 || num%7!=0)
                continue;

            count++;
            System.out.println("진짜는"+num);
        }
        System.out.println(count);
    }
}
