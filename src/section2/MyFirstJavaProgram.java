package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot rob = new Robot();//this makes the robot.
		for(int i = 0; i < 6; i++) {
		rob.turn(360/6);
		rob.penDown();
		rob.move(10);
		}
	
	}
}