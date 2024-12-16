abstract class shapes {
    double a;
    double b;

    abstract void area();
}

class rectangle extends shapes {
    rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void area() {
        System.out.println("The area of the rectanlge is: " + this.a * this.b);
    }
}

class triangle extends shapes {
    triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void area() {
        System.out.println("The area of the triangle is: " + (this.a * this.b) / 2);
    }
}

public class shapesabs {
    public static void main(String[] args) {
        shapes s = new rectangle(2, 2);
        s.area();
        s = new triangle(6, 10);
        s.area();
    }

}
