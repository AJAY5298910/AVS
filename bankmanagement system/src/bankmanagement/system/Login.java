

package bankmanagement.system;
import javax.swing.*;
import java.awt.*;// for image class object
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener{
     JButton b1,b2,b3;
    JTextField t1;//t2;// if we want that these password and card no, comes in star form we use jpasswward class insted of j text feild
    // lets make t2 textfield as password field everything come in star form// IN MAKING IT PASSWORD FIELD HERE IS SOME PROBLEM SO WE USED TEXTFIELD FOR NOW
    JTextField t2;
    Login(){
        setSize(800,600);
        setVisible(true);// tO MAKE FRAME VISIBLE 
        setLocation(350,200);
        setTitle("ATOMATIC TELLER MACHINE ");
          //image setting :start
       
//       ImageIcon i1= new ImageIcon(classLoader.getSystemResource("icon/logo.jpg"));
       ImageIcon  i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
       Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel label=new JLabel(i3);
       add(label);
       setLayout(null);
       label.setBounds(70,10, 100, 100);
       // adding welcome to ATM 
       JLabel text=new JLabel("Welcome To ATM");
       text.setFont(new Font("Osward",Font.BOLD,38)); 
       text.setBounds(200,40,400,40);
        add(text);
        // adding card no and pin label 
        JLabel cardno=new JLabel("CardNo.");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        JLabel pin=new JLabel("Pin.");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        // adding textfield in front of card number and pin label 
         t1=new JTextField();
        t1.setFont(new Font("Areal",Font.BOLD,14));
        t1.setBounds(300,150,250,30);
        add(t1);
         t2=new JTextField();
        t2.setFont(new Font("areal",Font.BOLD,14));
        t2.setBounds(300,220,250,30);// we will change thi textField into passwordfield
        add(t2);
        
        // now adding three buttons viz login,clear,signup
         b1=new JButton("SignIn");
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setBounds(300,300,100,30);
        b1.setBackground(Color.WHITE);
        add(b1);
        b2=new JButton("Clear");
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.setBounds(430,300,100,30);
        b2.setBackground(Color.WHITE);
        add(b2);
       b3=new JButton("SignUp");
        b3.setFont(new Font("Raleway",Font.BOLD,14));
        b3.setBounds(300,350,230,30);
        b3.setBackground(Color.WHITE);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent  ae){
        if (ae.getSource()==b2) {//b2 is for clear
            t1.setText(" ");
            t2.setText(" ");
            
        }else if (ae.getSource()==b1) {//b1 is for signin
            
        }else if(ae.getSource()==b3){// b2 is for singup
            setVisible(false);
             new SignupOne().setVisible(true);// frames are be default setvisible false , so wee need to set is setvisible true
        
    }}

    
    public static void main(String[]args){
        new Login();
        
        
    }
    
}
