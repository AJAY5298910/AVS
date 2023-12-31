/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author NetImpact
 */
public class Transactions extends JFrame implements ActionListener{
        JLabel L1;
        JButton B1,B2,B3,B4,B5,B6,B7;


     Transactions() {
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image I2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel Image= new JLabel(I3);
        Image.setBounds(0,0,900,900);
        add(Image);
        
        L1=new JLabel("PLEASE SELECT YOUR TRANSACTION");
        L1.setFont(new Font("Railway",Font.BOLD,16));
        L1.setBounds(235,300,700,35);
        L1.setForeground(Color.WHITE);
        L1.setBackground(Color.black);
//        add(L1);//THIS ADDED THE LABEL ON FRMAE NOT ON IMAGE , SO WE NEED TO ADD IT ON IMAGE 
        Image.add(L1);
        B1=new JButton("DEPOSIT");
//        B1.setFont(font);
        B1.setBounds(170,400,150,35);
        add(B1);
        B1.addActionListener(this);
        B2=new JButton("CASH WITHDRAWL");
//        B2.setFont(font);
        B2.setBounds(390,499,150,35);
        
        add(B2);
        B2.addActionListener(this);
        B3=new JButton("FAST CASH");
//        B3.setFont(font);
        B3.setBounds(170,543,150,35);
        add(B3);
        B3.addActionListener(this);
        B4=new JButton("MINI STATEMENTS");
//        B4.setFont(font);
        B4.setBounds(390,543,150,35);
        add(B4);
        B4.addActionListener(this);
        B5=new JButton("PIN CHANGE");
//        B5.setFont(font);
        B5.setBounds(170,588,150,35);
        add(B5);
        B5.addActionListener(this);
        B6=new JButton("BALANCE ENQUIRY");
//        B6.setFont(font);
        B6.setBounds(390,588,150,35);
        add(B6);
        B6.addActionListener(this);
        B7=new JButton("EXIT");
//        B7.setFont(font);
        B7.setBounds(390,633,150,35);
        add(B7);
        B7.addActionListener(this);
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Transactions();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==B1) {
            
            
        }
        
    }
    
}
