package test;

public class Cat implements Participants {
    private int heightJumpping;
    private int longRunning;

    public Cat(int heightJumpping, int longRunning) {
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
        System.out.println("Cat is running");
    }

    @Override
    public void jumping() {
        System.out.println("Cat is jumping");
    }

    //    private void run () {
//        System.out.println("Cat is running...");
//    }
//
//    private void jump () {
//        System.out.println("Cat is jumping...");
//    }
}
