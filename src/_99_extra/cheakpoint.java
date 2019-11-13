package _99_extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class cheakpoint {

	
	public static void main(String[] args) {
		
		
		
		
		 String input = JOptionPane.showInputDialog("What is your favroite colur?");
		
		 JOptionPane.showMessageDialog(null,input+ " is also my favroite colur");
		
		 Robot fav = new Robot ();
		
		 fav.setSpeed(1000);
		 
		fav.move(250);
		
		fav.turn(150);
		
		fav.penDown();
		
		if(input.equals("red")) {
			
			fav.setPenColor(Color.red);
		}
		
		
	if(input.equals("yellow")) {
			
			fav.setPenColor(Color.yellow);
		}
		
	
	if(input.equals("pink")) {
		
		fav.setPenColor(Color.pink);
	}
	
	if(input.equals("blue")) {
		
		fav.setPenColor(Color.blue);
	}
	
	
	if(input.equals("green")) {
		
		fav.setPenColor(Color.green);

	}
	if(input.equals("orange")) {
		
		fav.setPenColor(Color.orange);
	
	
	}
	
	if(input.equals("gray")) {
		
		fav.setPenColor(Color.gray);
	}
	
	if(input.equals("black")) {
		
		fav.setPenColor(Color.black);
	}
	
	if(input.equals("white")) {
		
		fav.setPenColor(Color.white);
	}
	
	
	
	
	
	
	
	
		fav.move(300);
		
		fav.turn(120);
		
		fav.move(300);
		
		fav.turn(120);
		
		fav.move(300);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
