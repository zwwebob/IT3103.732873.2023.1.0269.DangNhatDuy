//Example 2.2.3: HelloNameDialog.java
package lab1;

import javax.swing.JOptionPane;
public class HelloNameDialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "Hello "+ result + "!");
		System.exit(0);
	}
}
