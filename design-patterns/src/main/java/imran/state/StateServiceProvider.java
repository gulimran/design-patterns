package imran.state;

public class StateServiceProvider {
    private State state;

    public StateServiceProvider(State state) {
        this.state = state;
    }

    public void changeState(State newState) {
        state = newState;
    }

    public void service() {
        state.operation1();
    }
}
