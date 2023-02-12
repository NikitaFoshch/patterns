package structural.adapter;

public class User extends Robot implements Machine{

    @Override
    public void move() {
        moveRobot();
    }

    @Override
    public void stay() {
        stayRobot();
    }

    @Override
    public void talk() {
        talkRobot();
    }
}
