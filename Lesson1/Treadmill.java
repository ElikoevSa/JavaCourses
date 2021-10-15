package test;

public class Treadmill implements Let{
    private int valuesMiles;

    public Treadmill(int valuesMiles) {
        this.valuesMiles = valuesMiles;
    }

    public int getValuesMiles() {
        return valuesMiles;
    }

    @Override
    public void passTheObstacle(Participants participants) {
        participants.running();
    }
}
