
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
rob.penDown();	
int i = 0;
while (i<4) {
	rob.move(50);
	rob.turn(90);
	i++;
}

		
		//3. Set the pen width to 10
rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
JOptionPane.showInputDialog("What color would you like the robot to draw with?");

		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
