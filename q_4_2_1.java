class q_4_2_1
{
    public static void main(String[] args)
    {
//  7에대한 2의 보수를 계산해서 출력하는 프로그램
        int a = 7, b, c = 1;

        b = ~a;
        b += c;

        int result = a+b;
        System.out.println(result);
    }
}
