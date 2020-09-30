package Fuu;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String name = JOptionPane.showInputDialog("What is you name");
        System.out.println(name);
        
        //Parse the input as an int.
        //Print its value +1
        int number = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
        number++;
        System.out.println(number);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Input a number")));

        
    }
}