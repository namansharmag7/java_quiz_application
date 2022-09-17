package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tframe;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz_time.jfif"));
        JLabel image  = new JLabel(i1);
        image.setBounds(-10,-10,550,440);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,30,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE);  // or new Color(30,144,254)
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(800,100,200,60);
        name.setFont(new Font("Mangolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLUE);  // or new Color(30,144,254)
        add(name);
        
        tframe = new JTextField();
        tframe.setBounds(735,170,300,25);
        tframe.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tframe);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,450);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tframe.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        
        new Login();
    }
    
}
