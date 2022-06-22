package puzzle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LevelOne extends PuzzleGame{

    LevelOne(){

        button1.setText("1");
        button2.setText(" ");
        button3.setText("3");
        button4.setText("2");
        button.setText("NEXT");

        button1.setBounds(10,30,50,40);
        button2.setBounds(70,30,50,40);
        button3.setBounds(10,80,50,40);
        button4.setBounds(70,80,50,40);

        remove(textLabel);
        button.setEnabled(false);
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button.addActionListener(this);

        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLUE);

        setSize(250,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            setVisible(false);
            new LevelTwo();
        }

        String state;
        if(e.getSource()== button1){
            state = button1.getText();
            if(button2.getText().equals(" ")){ button2.setText(state); button1.setText(" ");}
            else if(button3.getText().equals(" ")){ button3.setText(state); button1.setText(" ");}
        }

        if(e.getSource()== button2){
            state = button2.getText();
            if(button1.getText().equals(" ")){ button1.setText(state); button2.setText(" ");}
            else if(button4.getText().equals(" ")){ button4.setText(state); button2.setText(" ");}
        }

        if(e.getSource()== button3){
            state = button3.getText();
            if(button1.getText().equals(" ")){ button1.setText(state); button3.setText(" ");}
            else if(button4.getText().equals(" ")){ button4.setText(state); button3.setText(" ");}
        }

        if(e.getSource()== button4){
            state = button4.getText();
            if(button2.getText().equals(" ")){ button2.setText(state); button4.setText(" ");}
            else if(button3.getText().equals(" ")){ button3.setText(state); button4.setText(" ");}

            if(button1.getText().equals("1")&& button2.getText().equals("2")&& button3.getText()
                    .equals("3")&& button4.getText().equals(" ")){
                JOptionPane.showMessageDialog(LevelOne.this,"You passed this level!");
                button.setEnabled(true);
            }
        }


    }

}



