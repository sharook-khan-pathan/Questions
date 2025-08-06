package Constructor_Assignment2;
class Clock{
	int hours;
	int min;
	int sec;
	Clock(){
		this.hours = 12;
		this.min = 0;
		this.sec = 0;
	}
	Clock(int hours,int min,int sec){
		this.hours = (hours >= 0 && hours <= 23) ? hours : 0;
        this.min = (min >= 0 && min <= 59) ? min : 0;
        this.sec = (sec >= 0 && sec <= 59) ? sec : 0;
	}
	Clock(int sec){
		this.hours = (sec / 3600) % 24;
		this.min = (sec % 3600) / 60; 
		this.sec = sec % 60;
	}
	public void displays() {
		System.out.println(hours + " : "+ min + " : " + sec);
	}
	
	
	
}
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock(30,12,22);
		c.displays();
	}

}
