class arithop
{
    public static void main(String[] args)
    {
        int n1=7;
        int n2=3;

        int result=n1+n2;
        System.out.println("덧셈 결과 : " + result);

        result=n1-n2;
//        System.out.println("뺄셈 연산식다르게 : " + n1 - n2);   <- 이렇게하면 컴파일 오류남 자료혈 불일치로. 
        System.out.println("뺄셈 결과 : " + result);
        System.out.println("곱셈 결과 : " + n1 * n2);
        System.out.println("나눗셈 결과 : " + n1 / n2);
        System.out.println("나머지 결과 : " + n1 % n2);
    }
}
