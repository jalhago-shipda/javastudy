/*
다음 조건을 만족하는 클래스 정의
-어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다
-놀이를 통한 구슬의 주고받음을 표현하는 메소드가 존재
-어린이의 현재 보유자산(구슬의 수)을 출력하는 메소드가 존재

위의 두번째 조건은 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음을 의마하는 것이다.
위의 조건을 만족하는 클래스를 정의했다면, 다음 조건을 만족하는 인스턴스를 각각 생성하자
-어린이1의 보유자산 -> 구슬15개
-어린이2의 보유자산 -> 구슬 9개

인스턴스의 생성이 완료되면 다음의 상황을 main메소드 내에서 시뮬레이션하자
-1차 게임에서 어린이1은 어린이2의 구슬 2개를 획득한다.
-2차 게임에서 어린이2는 어린이1의 구슬 7개를 획득한다.

마지막으로 각각의 어린이가 보유하고 있는 구슬의 수를 출력하면서 프로그램을 종료한다
*/
/*
class q7_1_2
{
    public static void main(String[] args)
    {
        BallGame ch1 = new BallGame(15);
        BallGame ch2 = new BallGame(9);

        ch1.takeBall(2);
        ch2.giveBall(2);

        ch2.takeBall(7);
        ch1.giveBall(7);

        System.out.println("어린이1이 보유하고 있는 구슬의 수는" + ch1.getBall());
        System.out.println("어린이2가 보유하고 있는 구슬의 수는" + ch2.getBall());
    }
}

class BallGame
{
    int ballNum;

    public BallGame(int num)
    {
        ballNum=num;
    }
    public void takeBall(int num)
    {
        ballNum+=num;
    }
    public void giveBall(int num)
    {
        ballNum-=num;
    }
    public int getBall()
    {
        return ballNum;
    }
}

Answer
*/

class ChildProperty
{
    int numOfBead;  // 구슬개수

    public ChildProperty(int bead)  //생성자 정의
    {
        numOfBead = bead;
    }

    public void obtainBead(ChildProperty child, int obtainCount)
    {
        int obtainBeadCount = child.loseBead(obtainCount);
        numOfBead+=obtainBeadCount;
    }

    public int loseBead(int loseCount)
    {
        if(numOfBead < loseCount)
        {
            int retValue = numOfBead;
            numOfBead = 0;
            return retValue;
        }

        numOfBead -=loseCount;
        return loseCount;
    }

    public void showProperty()
    {
        System.out.println("보유 구슬 개수 : " + numOfBead);
    }
}

class MarblesMain
{
    public static void main(String[] args)
    {
        ChildProperty child1=new ChildProperty(15);
        ChildProperty child2=new ChildProperty(9);

        System.out.println("게임 전 구슬 보유 개수");
        System.out.println("어린이1***************");
        child1.showProperty();
        System.out.println("어린이2***************");
        child2.showProperty();

        child1.obtainBead(child2, 2);

        child2.obtainBead(child1, 7);

        System.out.println("");
        System.out.println("게임 후 구슬보유개수");
        System.out.println("어린이1*************");
        child1.showProperty();
        System.out.println("어린이2*************");
        child2.showProperty();
    }
}
