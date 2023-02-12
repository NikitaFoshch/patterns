package behavioral.state;

public class Robot {
    State state;
    State oldState;

    public void setState(State state) {
        oldState=this.state;
        this.state = state;
    }

    public void changeState(){
        if(state instanceof Charge|| state instanceof Cook){
            setState(new Move());
        } else if (state instanceof Move && !(oldState instanceof Cook) ) {
            setState(new Cook());
        } else if (state instanceof Move) {
            setState(new Charge());
        }
    }

    public void doAction(){
        state.action();

    }
}
