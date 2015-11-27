class q_5_4_2
{
    public static void main(String[] args)
    {
        int n=1;

        while(n<=100)
        {
            System.out.println(n);
            n++;
        }

        do
        {
            --n;
            System.out.println(n);
        }while(n>1);
    }
}

/* Answer

int num = 1;

while(num<=100)
    System.out.println(num++);             //프린트문에도 증감넣을수있구나

do {
    System.out.println(--num);
    }while(num>1);

*/
