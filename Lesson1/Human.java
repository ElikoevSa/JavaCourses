package test;

public class Human implements Participants{
    private int heightJumpping;
    private int longRunning;

    public Human(int heightJumpping, int longRunning) {
        this.heightJumpping = heightJumpping;
        this.longRunning = longRunning;
    }

    public int getHeightJumpping() {
        return heightJumpping;
    }

    public int getLongRunning() {
        return longRunning;
    }

    @Override
    public void running() {
        System.out.println("Human is running");
    }

    @Override
    public void jumping() {
        System.out.println("Human is jumpiing");
    }
}
