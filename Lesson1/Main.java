package test;

public class Main {

    public static void main(String[] args) {

        Let[] lets = {new Wall(500),new Treadmill(500)};
        Participants[] participants = {new Human(2,10000),
                new Cat(1,900),new Robot(10,100500) };
    
    //тут я не додумался как абстрактно реализовать сход с препятствия.
        //пробовал прямо в интерфейсе делать проверки, но это не то(
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                lets[j].passTheObstacle(participants[i]);
            }
            
        }
    }
}
