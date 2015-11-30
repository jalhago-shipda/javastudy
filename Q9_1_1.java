class Rectangle
{
    private int ulx, uly;
    private int lrx, lry;

    private boolean isProperRange(int pos)
    {
        if(0<=pos && pos<=100)
            return true;
        else
            return false;
    }

    public void setXY(int x1, int y1, int x2, int y2)
    {
        if(x1>x2 || y1>y2)
        {
            System.out.println("좌상단 좌표값은 우하단 좌표값보다 작아야 합니다.");
            return;
        }
        if(!isProperRange(x1) || !isProperRange(y1))
        {
            System.out.println("좌상단 좌표는 0과 100 사이에 있어야 합니다.");
            return;
        }    
        if(!isProperRange(x2) || !isProperRange(y2))
        {
            System.out.println("우하단 좌표는 0과 100 사이에 있어야 합니다.");
            return;
        }
        ulx = x1; uly = y1;
        lrx = x2; lry = y2;
    }        
    public void showArea()
    {
        int xLen=lrx - ulx;
        int yLen=lry - uly;
        System.out.println("넓이 : " + (xLen*yLen));
    }
}

class Q9_1_1
{
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle();

        rec.setXY(2, 2, 8, 8);
        rec.showArea();

//        rec.setXY(-3, -1, 2, 7);
//        rec.showArea();
    }
}
