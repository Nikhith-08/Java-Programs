class StaticProgram1 {
    static int var=10;
    void printVar(){
        System.out.println("Static variable value is: "+var);
    }
    static{
        System.out.println("This is a static block");
    }
    static void display(){
        System.out.println("This is a static method");
    }
}
class StaticProgram {
    public static void main(String[] args) {
    StaticProgram1 obj = new StaticProgram1();
    obj.printVar();
    StaticProgram1.display();  
    }
}
