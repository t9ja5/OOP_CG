// Title: Implementation of Multiple Inheritance using Interface in Java to Demonstrate Polymorphism

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 from Interface1 implemented.");
    }

    public void method2() {
        System.out.println("Method 2 from Interface2 implemented.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();

        Interface1 i1 = obj;
        i1.method1();

        Interface2 i2 = obj;
        i2.method2();
    }
}
