package test;

public class Robot implements Participants {
    private int heightJumpping;
    private int longRunning;

    public Robot(int heightJumpping, int longRunning) {
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
        System.out.println("Robot is running");
    }
    @Override
    public void jumping() {
        System.out.println("Robot is Jumping");
    }

/*    private void run () {
        System.out.println("Robot is running...");
    }

    private void jump () {
        System.out.println("Robot is jumping...");
    }*/
}
