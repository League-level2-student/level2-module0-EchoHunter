package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Random q = new Random();

	//2. create an array of 5 robots.
 Robot[] r = new Robot[5];
	//3. use a for loop to initialize the robots.
 for (int i = 0; i < 5;) {
	 r[i]= new Robot();
	r[i].moveTo(500,600);
	r[i].turn(75);
	r[i].setSpeed(1000);
	
	i++;
}

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
 int l = -10;
	String winner = ("");
 while (l<0) {
	 for(int g = -0; g < q.nextInt(50); g++) {
	 for (int m = 0; m < 6; m++) {
			if(r[m].getX() > l) {
				l = r[m].getX();
			if((r[m].getX()== 500) && (r[m].getY() == 500)) {
			String x = String.valueOf(m);
				winner = ("robot"+ x);
			}
			 for (int c = 0; c <5 ; c++) {
					
				 r[c].move(5);
				r[c].turn(-10);
				
			}
			}
	
	 }

}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
JOptionPane.showMessageDialog(null, "And the Winner is" + winner);
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

 
}
}
}
