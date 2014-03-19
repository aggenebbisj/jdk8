package nr0.examples;

import static java.lang.System.out;

public class Scoping {

    Runnable r1 = () -> out.println(this);
    Runnable r2 = () -> out.println(toString());

    Runnable r3 = new Runnable() {
        @Override
        public void run() {
            out.println(this);
        }
    };
    Runnable r4 = new Runnable() {
        @Override
        public void run() {
            out.println(toString());
        }
    };
    
    @Override
    public String toString() {
        return "Hello, world!";
    }

    public static void withInnerClass() {
        new Scoping().r3.run();
        new Scoping().r4.run();
    }

    public static void withLambda() {
        new Scoping().r1.run();
        new Scoping().r2.run();
    }

    public static void main(String... args) {
        withLambda();
        withInnerClass();
    }

}
