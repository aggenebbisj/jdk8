package nr0.examples;

import java.util.function.Supplier;

public class Context {

    public static void main(String... args) {
        Supplier<Runnable> factory = () -> () -> System.out.printf("Hi, I'm %s !\n", Thread.currentThread().getName());
        
        for (int i = 0; i < 10; i++) {
            new Thread(factory.get()).start();
        }

    }
    
}
