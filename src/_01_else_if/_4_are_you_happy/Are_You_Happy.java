package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] args) {
	String Input = JOptionPane.showInputDialog("Are You Happy(YES or NO)");
	if (Input.equals("YES")) {
		JOptionPane.showMessageDialog(null, "Keep Doing What You are Doing");
	}
	else if (Input.equals("NO")) {
		String Input2 = JOptionPane.showInputDialog("Do You Want to be Happy?");
	
	if (Input2.equals("YES")) {
		JOptionPane.showMessageDialog(null, "Change Something");
	}
	else if (Input2.equals("NO")) {
		JOptionPane.showMessageDialog(null, "Keep Doing What You are Doing");
	}
	
	}
	
	
	
	
	
	
	
	
}
}
