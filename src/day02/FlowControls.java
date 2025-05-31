package day02;
import java.util.Scanner;

public class FlowControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enhancedSwitchStat();
		doWhileLoop();
		breakStatement() ;

	}
	
	public static void NestedIfElse() {
		int age  = 24;
		boolean haveLicense = true;
		if(age >= 18) {
			if(haveLicense == true) {
				System.out.println("u can drive");
			}else{
				System.out.println("get a license");
			}
		}else {
			System.out.println("ur not old enough");
		}
		
		
	}
	public static void SwitchStat() {
		int day  = 5;
		switch(day) {
			case 1:
				System.out.println("its monday");
				break;
			
			case 2:
				System.out.println("its tues");
				break;
			
			case 3:
				System.out.println("its wed");
				break;
			
			case 4:
				System.out.println("its thurs");
				break;
			
			case 5:
				System.out.println("its fri");
				break;
			
			case 6:
				System.out.println("its sat");
				break;
			
			case 7:
				System.out.println("its sun");
				break;
		}
	
	}
	public static void enhancedSwitchStat() {
		String month = "FEB";
		int days = switch (month) {
			case "JAN" , "MAR" , "JUL" -> 31;
			case "APR", "JUN", "SEP" -> 30;
			case "FEB" -> {
				System.out.println("feb has 29 or 28 days");
				yield 28;
			}
			default -> 0;
			
		};
		System.out.println(month +" "+ days);
		
	}
	public static void doWhileLoop() {
		int i =1;
		do {
			
			System.out.println("Count:" + i);
			i++;
		}while(i < 5);
//		{
////			Scanner scanner = new Scanner (System.in);
//			int choice;
//		}
		
		
	}
	public static void breakStatement() {
		for (int i = 1 ; i <= 10 ; i++ ) {
			if (i ==5 || i ==7) {
				continue;
			}
			System.out.println("the num is " + i);
		}
		
		
	}
	


	}
