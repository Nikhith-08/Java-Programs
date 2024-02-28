class SuperClass {
    public void display() {
        System.out.println("This is a superclass method");
    }
}

class SubClass extends SuperClass {
    public void display() {
        System.out.println("This is a subclass method");
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass();
        obj1.display();
        SuperClass obj2 = new SubClass();
        obj2.display();
    }

}