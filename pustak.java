
class publications {

    String title;
    float price;
    int copies;

    publications() {
        title = null;
        price = 0;
        copies = 0;
    }

    publications(String a, float b, int c) {
        title = a;
        price = b;
        copies = c;
    }
    void salecopy(){
        System.out.println("The total sales of the ");
    }

}

class book extends publications {

}

class magazine extends publications {

}

public class pustak {

    public static void main(String[] args) {

    }
}
