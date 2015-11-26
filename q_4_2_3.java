/*

class q_4_2_3
{
    public static void main(String[] args)
    {
// <<연산은 msb를 변경시켜 엉뚱한 결과를 보이는 경우도 있음. 음의정수와 양의정수 하나씩 예를 들어서 그 결과가 언제 어떻게 나오는지 보이고, 이를 증명하기 위한 간단한 프로그램도 작성해보자

        byte a = 1;

// 양의정수일때

        System.out.println("1을 6칸 왼쪽으로 옮기면 " + (a << 6));
        System.out.println("1을 7칸 옮기면 " + (a << 7));


// 음의정수일때

        byte b = 0;
        System.out.println("0을 6칸 옮기면 " + (b << 6));
        System.out.println("0을 7칸 옮기면 " + (b << 7));
    }
}

*/


//Answer
class q_4_2_3
{
    public static void main(String[] args)
    {

        int num = 7;
        int bitset = 1<<30;
        num |= bitset;
        System.out.println(num);
        System.out.println(num <<= 1);

        num=-12;
        bitset = ~0;
        bitset ^= (1<<30);
        num &= bitset;
        System.out.println(num);
        System.out.println(num <<= 1);
    }
}

