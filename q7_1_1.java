/*
밑변과 높이 정보를 저장할 수 있는 Triangle 클래스를 정의하자.
그리고 생성과 동시에 초기화가 가능한 생성자도 정의하자.
끝으로 밑변과 높이 정보를 변경시킬 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자.
*/

class Triangle
{
    double baseLine;
    double height;

    public Triangle(double baseLineValue, double heightValue)
    {
        baseLine=baseLineValue;
        height=heightValue;
    }

    public void diffSet(double changeBaseLine, double changeHeight)
    {
        baseLine=changeBaseLine;
        height=changeHeight;
    }

    public double getArea()
    {
        double tArea=baseLine*height/2;
        return tArea;
    }
}

class InstanceTest
{
    public static void main(String[] args)
    {
        Triangle tri = new Triangle(10, 6);
        System.out.println("삼각형의 넓이 = " + tri.getArea());
    }
}


/* anwer

class Triangle
{
    double bottom;
    double height;

    public Triangle(double bt, double hg)
    {
        bottom = bt;
        height = hg;
    }

    public setBottom(double bt)
    {
        bottom = bt;
    }
    public setHeight(double hg)
    {
        height = hg;
    }

    public double getArea();
    {
        return bottom*height/2;
    }
}

class TriangleInstanceTest
{
    public static void main(String[] args)
    {
        Triangle tr=new Triangle(10.2, 17.3);
        System.out.println("삼각형의 넓이 = " + tr.getArea());

        tr.setBottom(7.5);
        tr.setHeight(9.2);
        System.out.println("삼각형의 넓이 = " + tr.getArea());
    }
}
*/
