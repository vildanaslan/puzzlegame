package puzzle;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LevelTwo extends PuzzleGame{

    LevelTwo(){
        button1.setText("1");
        button2.setText(" ");
        button3.setText("3");
        button4.setText("4");
        button5.setText("5");
        button6.setText("6");
        button7.setText("7");
        button8.setText("8");
        button9.setText("2");
        button.setText("NEXT");

        button1.setBounds(10,30,50,40);
        button2.setBounds(70,30,50,40);
        button3.setBounds(130,30,50,40);
        button4.setBounds(10,80,50,40);
        button5.setBounds(70,80,50,40);
        button6.setBounds(130,80,50,40);
        button7.setBounds(10,130,50,40);
        button8.setBounds(70,130,50,40);
        button9.setBounds(130,130,50,40);

        remove(textLabel);
        button.setEnabled(false);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button.addActionListener(this);

        button.setBackground(Color.GRAY);
        button.setForeground(Color.BLUE);

        setSize(250,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String state;
        if(e.getSource()==button){
            state = button4.getText();
            button4.setText(button9.getText());
            button9.setText(state);
            state = button1.getText();
            button1.setText(button5.getText());
            button5.setText(state);
            state = button2.getText();
            button2.setText(button7.getText());
            button7.setText(state);

            button.setText("NEXT");
            button.setEnabled(false);
        }

        if(e.getSource()== button1){
            state = button1.getText();
            if(button2.getText().equals(" ")){ button2.setText(state); button1.setText(" ");}
            else if(button4.getText().equals(" ")){ button4.setText(state); button1.setText(" ");}
        }

        if(e.getSource()== button3){
            state = button3.getText();
            if(button2.getText().equals(" ")){ button2.setText(state); button3.setText(" ");}
            else if(button6.getText().equals(" ")){ button6.setText(state); button3.setText(" ");}
        }

        if(e.getSource()== button2){
            state = button2.getText();
            if(button1.getText().equals(" ")){ button1.setText(state); button2.setText(" ");}
            else if(button3.getText().equals(" ")){ button3.setText(state); button2.setText(" ");}
            else if(button5.getText().equals(" ")){ button5.setText(state); button2.setText(" ");}
        }

        if(e.getSource()== button4){
            state = button4.getText();
            if(button1.getText().equals(" ")){ button1.setText(state); button4.setText(" ");}
            else if(button7.getText().equals(" ")){ button7.setText(state); button4.setText(" ");}
            else if(button5.getText().equals(" ")){ button5.setText(state); button4.setText(" ");}
        }

        if(e.getSource()== button5){
            state = button5.getText();
            if(button2.getText().equals(" ")){ button2.setText(state); button5.setText(" ");}
            else if(button4.getText().equals(" ")){ button4.setText(state); button5.setText(" ");}
            else if(button6.getText().equals(" ")){ button6.setText(state); button5.setText(" ");}
            else if(button8.getText().equals(" ")){ button8.setText(state); button5.setText(" ");}
        }

        if(e.getSource()== button6){

            state = button6.getText();
            if(button9.getText().equals(" ")){ button9.setText(state); button6.setText(" ");}
            else if(button3.getText().equals(" ")){ button3.setText(state); button6.setText(" ");}
            else if(button5.getText().equals(" ")){ button5.setText(state); button6.setText(" ");}

        }

        if(e.getSource()== button7){
            state = button7.getText();
            if(button4.getText().equals(" ")){ button4.setText(state); button7.setText(" ");}
            else if(button8.getText().equals(" ")){ button8.setText(state); button7.setText(" ");}

        }

        if(e.getSource()== button8){
            state = button8.getText();
            if(button7.getText().equals(" ")){ button7.setText(state); button8.setText(" ");}
            else if(button9.getText().equals(" ")){ button9.setText(state); button8.setText(" ");}
            else if(button5.getText().equals(" ")){ button5.setText(state); button8.setText(" ");}

        }

        if(e.getSource()== button9){
            state = button9.getText();
            if(button6.getText().equals(" ")){ button6.setText(state); button9.setText(" ");}
            else if(button8.getText().equals(" ")){ button8.setText(state); button9.setText(" ");}

            if(button1.getText().equals("1")&& button2.getText().equals("2")&& button3.getText()
                    .equals("3")&& button4.getText().equals("4")&& button5.getText().equals("5")
                    && button6.getText().equals("6")&& button7.getText().equals("7")&& button8.getText()
                    .equals("8")&& button9.getText().equals(" ")){
                JOptionPane.showMessageDialog(LevelTwo.this,"You passed this level!");
                button.setEnabled(true);
            }
        }

    }
}