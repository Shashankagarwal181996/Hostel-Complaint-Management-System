import java.util.*;
public class Plumber extends Washroom{
	Plumber(String user,String toilet1) {
		super(user);
		toilet = toilet1; 
		// TODO Auto-generated constructor stub
	}
	Scanner sc = new Scanner(System.in);
	void leakage(){
		System.out.println("There is a error in " +toilet +"of leakage");
	}
	void malfunctioning(){
		System.out.println("There is a error in " +toilet +"of malfunctioning");
	}
	void flush(){
		System.out.println("There is a error in " +toilet +"of flush");
	}
	void taps(){
		System.out.println("There is a error in " +toilet +"of taps");
	}
}
