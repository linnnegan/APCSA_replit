import javax.swing.*;

public class HelloWorld {
  public static void main(String[] args) {
    JFrame myFrame = new JFrame();
    JButton myButton = new JButton("Hello World");
    myButton.setBounds(0, 0, 200, 50);
    myFrame.add(myButton);
    myFrame.setSize(500, 500);
    myFrame.setLayout(null);
    myFrame.setVisible(true);
  }
}