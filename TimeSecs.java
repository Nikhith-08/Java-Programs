class Time {
	int hours;
	int minutes;
	int seconds;
}
class TimeSecs{
	public static void main(String args[]){
		Time time=new Time();
		time.hours=2;
		time.minutes=23;
		time.seconds=46;
		int total=time.hours*60*60+time.minutes*60+time.seconds;
		System.out.println("Total seconds: "+total);
	}

}
