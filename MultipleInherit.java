interface Interface1{
    void show();
}
interface Interface2{
    void print();
}
class Demo implements Interface1, Interface2{
    public void show(){
        System.out.println("First Interface method : show");
    }
    public void print(){
        System.out.println("Second Interface method : print");
    }
}
class MultipleInherit {
    public static void main(String[] args) {
        Demo x = new Demo();
        x.show();
        x.print();
    }
}
