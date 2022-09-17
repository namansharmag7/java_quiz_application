package quiz.application;

import java.awt.*;
import javax.swing.*;
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
import java.awt.event.*;
//import javax.swing.JFrame;

public class Score extends JFrame implements ActionListener {
    
    Score(String name,int score){
        setBounds(400,150,750,550);//setSize(800,650);---setLocation(350,100);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jfif"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou "+name+" for playing Simple Minds");
        heading.setBounds(15,30,700,30);
        heading.setFont(new Font("Tohma",Font.PLAIN,28));
        add(heading);
        setVisible(true);
        
        JLabel uscore = new JLabel("Your score is : "+ score);
        uscore.setBounds(350,200,300,30);
        uscore.setFont(new Font("Tohma",Font.PLAIN,28));
        add(uscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,150,30);
        submit.setFont(new Font("Tohama",Font.PLAIN,18));
        submit.setBackground(new Color(30,114,255));
        submit.setForeground(Color.yellow);
        submit.addActionListener(this);
        add(submit);
        //submit.setEnabled(false);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args){
        new Score("User",0);
    }
}
