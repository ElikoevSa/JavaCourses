package test;

public class Wall implements Let{
    private int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    public int getHeightWall() {
        return heightWall;
    }

    @Override
    public void passTheObstacle(Participants participants) {
        participants.jumping();
    }
}
