package puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PuzzleGame extends JFrame implements ActionListener {

    JLabel textLabel = new JLabel();
    JButton button = new JButton(); //START and NEXT buttons
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();

    PuzzleGame(){
        super("Puzzle Game");

        textLabel.setText("Welcome to Puzzle Game!");
        button.setText("START");

        textLabel.setBounds(10,30,200,40);
        button.setBounds(70,200,100,40);

        add(textLabel);
        add(button);

        button.addActionListener(this);

        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLUE);

        setSize(250,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            setVisible(false);
            new LevelOne();
        }
    }

    public static void main(String[] args){
        new PuzzleGame();
    }
}



