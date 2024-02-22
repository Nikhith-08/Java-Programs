class Time{
    int hours;
    int minutes;
    int seconds;
    Time(){
        hours=2;
        minutes=18;
        seconds=22;
    }
    Time(int h,int m,int s){
        hours=h;
        minutes=m;
        seconds=s;
    }
    Time(int a){
        hours=a;
        minutes=a;
        seconds=a;
    }
    public void display(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }    
}
class ConstructorOverloading{
    public static void main(String[] args){
        Time t1=new Time();
        t1.display();
        Time t2=new Time(4,32,16);
        t2.display();
        Time t3=new Time(4);
        t3.display();
    }
}
