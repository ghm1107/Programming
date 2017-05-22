import javax.swing.*;
public class RegisMatch {
	public static void main (String [] args){

		String input1 = "";
		String input2 = "";
		String input3 = "";
		String input4 = "";
		int user = 25;
		
		input1 = JOptionPane.showInputDialog("Are you male or female?");
		
		if (input1.equals("male")){
			JOptionPane.showInputDialog("Great! Let's find you a match!");
			
		}
			
		if (input1.equals("female")){
				JOptionPane.showInputDialog("Great! Let's find you a match!");
		}
	
		//if (input1.equals(!= male  female)){
			//JOptionPane.showInputDialog("Please enter either male or female");
		//}
			
		input2 = JOptionPane.showInputDialog("Are you an introvert or an extrovert?");
	
		if (input2.equals("introvert")){
			JOptionPane.showInputDialog("Let's see if we can find any single introverts.");
		}
		
		if (input2.equals("extrovert")){
			JOptionPane.showInputDialog("Let's see if we can find any single extroverts!!");
		
		}
		
		
		input3 = JOptionPane.showInputDialog("Do you eat your pizza with a knife and fork, yes or no?");
		
		if (input3.equals("yes")){
			JOptionPane.showInputDialog("Unfortunately you are not compatible with anyone.");
			System.out.println("Please change your pizza eating habits");
			System.exit(0);
		}
	
		if (input3.equals("no")){
			JOptionPane.showInputDialog("Yay! You have great datability potential!");
	
		
		}
	
		input4 = JOptionPane.showInputDialog("How old are you?");
		user = Integer.parseInt(input4); 
		
		if (user <= 17){
			JOptionPane.showInputDialog("User is younger than or is 17 years old.");
		}
		
		if (user > 17){
			JOptionPane.showInputDialog("User is older than 17 years of age.");
		}
		
	}
}
