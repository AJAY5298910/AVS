/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class Signup3 extends JFrame implements ActionListener{
    JLabel AccountDetails,AccountType,Card,CardNumber,Pin,PinNumber,CardDetails,PinDetails,Services;
    JRadioButton r1,r2,r3,r4;
    JButton Submit,cancel;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String form_no;//this keyword play to creat local variable 
//    private String formno;
    
    

    public Signup3(String form_no) {
    this.form_no=form_no;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(800,800);
        setLocation(350, 0);
        setVisible(true);
        AccountDetails= new JLabel("Page3: Account details ");
        AccountDetails.setFont(new Font("Ralway",Font.BOLD,22));
        AccountDetails.setBounds(280,40,400,40);
        add(AccountDetails);
        AccountType= new JLabel("Account Type: ");
        AccountType.setBounds(100,140,200,30);
        AccountType.setFont(new Font("Raleway",Font.BOLD,22));
        add(AccountType);
        // after this we have to add 4 radio buttons\
        r1= new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,160,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        r2=new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,180,250,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        r3= new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,250,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        r4= new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,220,250,20);
        r4.setBackground(Color.WHITE);
        add(r4);
        ButtonGroup accounttypegroup=new ButtonGroup();
        accounttypegroup.add(r1);
        accounttypegroup.add(r2);
        accounttypegroup.add(r3);
        accounttypegroup.add(r4);
        // we didnt group the the check box becoz we want user to select multiple option
        
        Card= new JLabel("Card Number:");
        Card.setFont(new Font("Raleway",Font.BOLD,22));
        Card.setBounds(100,270,200,30);
        add(Card);
        CardNumber=new JLabel("xxxx-xxxx-xxxx-4804");
        CardNumber.setFont(new Font("Raleway",Font.BOLD,22));
        CardNumber.setBounds(330,270,300,30);
        add(CardNumber);
        
        CardDetails= new JLabel("your 16 digit card number");
        CardDetails.setFont(new Font("Raleway",Font.BOLD,12));
        CardDetails.setBounds(100,300,300,20);
        add(CardDetails);
        Pin= new JLabel("Pin");
        Pin.setFont(new Font("Raleway",Font.BOLD,22));
        Pin.setBounds(100,320,200,30);
        add(Pin);
        PinNumber= new JLabel("xxxx");
        PinNumber.setFont(new Font("Raleway",Font.BOLD,22));
        PinNumber.setBounds(330,320,300,30);
        add(PinNumber);
        PinDetails= new JLabel("This is your 4 digit passwor");
        PinDetails.setFont(new Font("Raleway",Font.BOLD,12));
        PinDetails.setBounds(100,350,300,20);
        add(PinDetails);
        
        Services= new JLabel("Service Required");
        Services.setFont(new Font("Raleways",Font.BOLD,22));
        Services.setBounds(100,400,400,30);
        add(Services);
       
        c1= new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,450,200,30);
        c1.setBackground(Color.WHITE);
        add(c1);
        c2= new JCheckBox(" Internet Banking");
        c2.setFont(new Font("Raleways",Font.BOLD,16));
        c2.setBounds(350,450,200,30);
        c2.setBackground(Color.WHITE);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,500,200,30);
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS Alerts ");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,500,200,30);
        c4.setBackground(Color.WHITE);
        add(c4);
        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,550,200,30);
        c5.setBackground(Color.WHITE);
        add(c5);
        c6= new JCheckBox("E-Statment");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,550,200,30);
        c6.setBackground(Color.WHITE);
        add(c6);
        c7= new JCheckBox("I hereby declares the above eneterd details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,600,600,30);
        c7.setBackground(Color.WHITE);
        add(c7);
        Submit= new JButton("Submit");
        Submit.setFont(new Font("Raleway",Font.BOLD,14));
        Submit.setBounds(250,630,100,30);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        add(Submit);
        cancel= new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,630,100,30);
        cancel.setBackground(Color. BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);
        cancel.addActionListener(this);
        
        
             
        
        
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==Submit){
        
        String accountType="null";
        if(r1.isSelected()){
            accountType="Saving Account";
        }else if (r2.isSelected()){
            accountType="Fixed Deposite Account";
        } else if (r3.isSelected()){
            accountType="Current Account";
        }else if (r4.isSelected()){
            accountType="Recurring Deposite account";
        }
        
        // i need to creat in here random card and form no.
        
        Random random= new Random();
        String cardnum="" + Math.abs((random.nextLong()%9000000L+5040936000000000L));
        String Pinnum="" + Math.abs((random.nextLong()%9000000L)+5040936000000000L);
                
        String Facility="";
        if(c1.isSelected()){
            Facility=Facility+" ATM CARD";
        } else if (c2.isSelected()){
            Facility=Facility+" Internet Banking "; 
           
        }else if (c3.isSelected()){
            Facility=Facility+"Mobile Banking ";
        }else if(c4.isSelected()){
            Facility=Facility+"Emails And sms Alerts";
        }else if (c5.isSelected()){
            Facility=Facility+"Cheque Book";
        }else if (c6.isSelected()){
            Facility=Facility+"Estatment";
        }
        try {
            if(accountType.equals("")){// by using else is i can set up n check aevery field
                JOptionPane.showMessageDialog(null,"MADATORY" );
            }else {
                Conn conn= new Conn();// make every class in same package , otheriwse ineed to import it , in sighnup 2 we make c in it we make conn
                    String query1= "insert into signup3 values('"+form_no+"','"+accountType+"','"+cardnum+"','"+Pinnum+"','"+Facility+"')";  
                
                conn.s.executeUpdate(query1);
                
                // what i want that user get his cardnumber na pin number 
                JOptionPane.showMessageDialog(null,"cardnumber"+ cardnum+"/n pinnumber"+Pinnum );
                // now i want uer to login through this , we ake one more table in db and rum one more query in here 
                String query2= "insert into login values('"+form_no+"','"+cardnum+"','"+Pinnum+"')";  
                conn.s.executeUpdate(query2);
                
                
                // NOW SETTING SIGNUP2 SETVISIBLE FALSE AND SIGHNUP3 SETVISIBLE TRUE PLUS TAKING FORM NO FROMSIGHNUPW ,, ALL MUST BE DONE IN SIGHNUP 2
                
                
            } 
            
        } catch (Exception e) {
            System.out.println(e);
                 
               
        }
        
        
        
    }else if (ae.getSource()==cancel){
        
    }
  
    
    
    
    
    }
    
           
    
    public static void main(String[] args) {
         new Signup3("");// if we dont give "" in here this object will call orgumnet constructor not the constructor we want so we give ""
    }
    
}
