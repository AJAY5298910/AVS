
 
package bankmanagement.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class Deposit extends JFrame implements ActionListener{
      JTextField T1;
      JButton b1,b2,b3;
      JLabel L1,L2,L3;

     Deposit() {
         T1=new JTextField();
         T1.setFont(f);
         T1.setBounds(r);
         add(T1);
         
         b1=new JButton();
         b1.setFont(f);
         b1.setBounds(r);
         add(b1);
         b1.addActionListener(this);
         b2=new JButton();
         b2.setFont(f);
         b2.setBounds(r);
         add(b2);
         b2.addActionListener(this);
         b3=new JButton();
         b3.setFont(f);
         b3.setBounds(r);
         add(b3);
         b3.addActionListener(this);
         L1=new JLabel();
         L1.setFont(f);
         L1.setBounds(r);
         add(L1);
         L2=new JLabel();
         L2.setFont(f);
         L2.setBounds(r);
         add(L2);
         L3=new JLabel();
         L3.setFont(f);
         L3.setBounds(r);
         add(L3);
               
       
         
    }
    
    public static void main(String[] args) {
        new Deposit();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
