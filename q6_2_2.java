// 전달된 값이 소수인지 아닌지를 판단하여, 소수인 경우 true를, 소수가 아닌경우 false를 반환하는 메소드를 정의하고, 이를 이용해서 1이상 100이하의 소수를 전부 출력할 수 있도록 main메소드를 정의하자

class q6_2_2
{
    public static boolean primecheck(int n)
    {
        int a=2;

        if(n==1)
            return false;
        else if(n==2)
            return true;
        else
        {
            do{
                if(n%a==0)
                    return false;
                    a++;
                }while(a<n);
            return true;
        }
    }

    public static void main(String[] args)
    {
        int n=1, count=0;

        while(n<=100)
        {
            if(primecheck(n))
            {
                System.out.println(n);
                count+=1;
            }
            n++;
        }
        System.out.println("1~100사이에 있는 소수 개수 : "+count);
    }
}
