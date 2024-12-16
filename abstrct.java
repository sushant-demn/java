import java.io.*;

abstract class shape {

    abstract int area();

}

class square extends shape {
    square() {

    };

    int area() {
        System.out.println(1 * 3 * 6);
        return 0;
    }

}

public class abstrct {

    public static void main(String args[]) {
        shape a = new square();
        a.area();
    }
}