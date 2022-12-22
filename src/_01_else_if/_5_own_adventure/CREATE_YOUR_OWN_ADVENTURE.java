package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class CREATE_YOUR_OWN_ADVENTURE {
public static void main(String[] args) {
	String Input = JOptionPane.showInputDialog(null, "A man walks into a bar. Should he buy a drink or asks for grapes?");
	if (Input.equals("Buy a drink.")) {
		JOptionPane.showMessageDialog(null, "The man buys a drink, and drinks himself to death. THE END.");
	}
	if (Input.equals("Ask for grapes.")) {
		String Input2 = JOptionPane.showInputDialog("The bartender looks at him funny and tells him to leave. The next day the guy comes back. Should he buy a drink or ask for grapes");
	if (Input2.equals("Buy a drink.")) {
		JOptionPane.showMessageDialog(null, "the man buys a drin, and drinks himself to death. The End.");
	if (Input2.equals("Ask for grapes.")) {
		String Input3 = JOptionPane.showInputDialog("The bartender calls security and they drag him out. He comes back the next day. Should he buy a drink or ask for grapes?");
		if (Input3.equals("Buy a drink.")) {
			JOptionPane.showMessageDialog(null, "The man buys a drink and drinks himself to death. The End.");
		if (Input3.equals("Ask for grapes.")) {
			JOptionPane.showMessageDialog(null, "The bartender takes out his shotgun and shoots the man. The End.");
		}
		}
	}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
