package mytictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TicTacToeV1 implements ActionListener {
/*Instance Variables*/
private JFrame window = new JFrame("Tic-Tac-Toe");
private JButton button1 = new JButton("");
private JButton button2 = new JButton("");
private JButton button3 = new JButton("");
private JButton button4 = new JButton("");
private JButton button5 = new JButton("");
private JButton button6 = new JButton("");
private JButton button7 = new JButton("");
private JButton button8 = new JButton("");
private JButton button9 = new JButton("");
private String letter = "";
private int count = 0;

public TicTacToeV1(){
/*Create Window*/
window.setSize(300,300);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setLayout(new GridLayout(3,3));

/*Add Buttons To The Window*/
window.add(button1);
window.add(button2);
window.add(button3);
window.add(button4);
window.add(button5);
window.add(button6);
window.add(button7);
window.add(button8);
window.add(button9);

/*Add The Action Listener To The Buttons*/
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);

/*Make The Window Visible*/
window.setVisible(true);
}

public void actionPerformed(ActionEvent a) {
count++;

/*Calculate Who's Turn It Is*/
if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){
letter = "X";
} else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){
letter = "O";
}

/*Display X's or O's on the buttons*/
if(a.getSource() == button1){
button1.setText(letter);
} else if(a.getSource() == button2){
button2.setText(letter);
} else if(a.getSource() == button3){
button3.setText(letter);
} else if(a.getSource() == button4){
button4.setText(letter);
} else if(a.getSource() == button5){
button5.setText(letter);
} else if(a.getSource() == button6){
button6.setText(letter);
} else if(a.getSource() == button7){
button7.setText(letter);
} else if(a.getSource() == button8){
button8.setText(letter);
} else if(a.getSource() == button9){
button9.setText(letter);
}
}

public static void main(String[] args){
new TicTacToeV1();
}
}