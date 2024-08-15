class Add {

    int a, b;

    Add() {
        a = 0;
        b = 0;
    }

    // using this to allocate values to variable with same name
    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Add retobj() {
        // returning this (obj)
        return this;
    }

    void display(Add o) {
        System.out.println("The values of a and b are " + o.a + " " + o.b);
    }

    void Add2() {
        // Using "this" as arguement
        display(this);
    }
}

class This {

    public static void main(String[] args) {
        Add o1 = new Add();
        Add o2 = new Add(10, 30);
        o2.display(o2);
        o2.Add2();
        o2.display(o2.retobj());

    }

}

/*
 * "this" is the keyword use to represent object in methods with which they are
 * invoked
 * this can be used as arguement for method as long as method is invoked with in
 * other method which is invoked obj , "this" is obj which is used to invoked
 * outer method
 * 
 */