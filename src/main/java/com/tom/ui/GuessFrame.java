package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    JButton button=new JButton("Guess");
    JLabel label=new JLabel("Zzzz...");
    JTextField number=new JTextField(8);
    int secrect=0;
    public GuessFrame(){
    super();
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(number.getText());
                System.out.println(num);
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        JFrame frame=new GuessFrame();
    }
}





//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