class q_4_2_2
{
    public static void main(String[] args)
    {
//int형 정수 15678의 오른쪽에서 세번째 비트와 더섯번째 비트가 각각 어떻게 되는지 확인하여 출력하는 프로그램
        int a = 15678;

        int b = a >> 2;   //a를 오른쪽으로 2비트씩 밀고 b에 저장

        int c = 1;     //b랑 비교하기 위한 수

        int d = b & c;    //b랑 c가 같으면 1 아니면 0. 세번째 비트 수 찾음.

        System.out.println(d);


        b = a >> 4;

        d = b & c;

        System.out.println(d);
    }
}

/*

    int num=15678;
    System.out.println((num >> 2) & 1);
    System.out.println((num >> 4) & 1);

*/
