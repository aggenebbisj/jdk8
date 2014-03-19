package nr6.interfaces;

public class Sample {

    public interface Fly {
        default public void takeOff() { 
            System.out.println("Fly::takeOff"); 
        }
        
        default public void land() { 
            System.out.println("Fly::land"); 
        }
    }

    public static void main(String... args) {
        Fly fly = new Fly(){
            @Override
            public void land() {
                System.out.println("Crash!!");
            }
        };
        
        fly.takeOff();
        fly.land();
    }
}
