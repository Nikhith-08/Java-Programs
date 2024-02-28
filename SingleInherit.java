class Parent {
    int a=10,b=20;
    void printParent() {
        System.out.println("Parent class variables: a="+a+", b="+b);
    }
}
class Child extends Parent {
    int c=30,d=40;
    void printChild() {
        System.out.println("Child class variables: c="+c+", d="+d);
    }
}
class SingleInherit {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.printParent();
        obj.printChild();
    }
}
