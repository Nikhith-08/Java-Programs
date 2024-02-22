class MethodOverloading1 {
    int add(int a,int b, int c){
        return a+b+c;
    }
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading1 a = new MethodOverloading1();
        System.out.println(a.add(1,2,3));
        System.out.println(a.add(1,2));
        System.out.println(a.add(1,2,3,4));
    }
}
