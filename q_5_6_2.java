class q_5_6_2
{
    public static void main(String[] args)
    {
        int n=1, sum=0;

        while(true)
        {
            if(n%2!=0 || (n%3==0 && n%2==0))
                sum+=n;

            if(sum>1000)
            {
                System.out.println("몇을 더했냐" + n);
                System.out.println("1000넘은 값은 얼마냐" + sum);
                break;
            }
            n++;
        }
    }
}


/*  answer    답은 같게 나옴
class q_5_6_2
{
    public static void main(String[] args)
    {
        int sum=0, num=1;

        while(true)
        {
            if(num%2!=0)
                sum+=num;
            else
            {
                if(num%3==0)
                    sum+=num;
            }
            if(sum>1000)
            {
                System.out.println(num+" 더할 때 1000을 넘는다.");
                System.out.println("초과된 값 : "+sum);
                break;
            }
            num++;
        }
    }
}

*/
