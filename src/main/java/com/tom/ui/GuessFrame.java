package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    JButton button=new JButton("hi");
    JLabel label=new JLabel("Zzzz...");

    public GuessFrame(){
    super();
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        JFrame frame=new GuessFrame();
    }
}
