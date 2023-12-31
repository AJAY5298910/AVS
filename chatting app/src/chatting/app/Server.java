
package chatting.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.stream.ImageInputStream;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author NetImpact
 */
public class Server extends JFrame implements ActionListener{
    JTextField Text;
    JPanel a1;
    Box verticalBox= Box.createVerticalBox();// TO SET MESAAGES VERTICALLY when we sent and with the help of border layout we set in on at line end 

     Server() {
         // now add images on panel 
         
         JPanel p1= new JPanel();
         p1.setLayout(null);
         p1.setBackground(Color.GREEN);
         p1.setBounds(0,0,450,70);
         add(p1);
         
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
         Image i2=i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel back = new JLabel(i3);
         back.setBounds(5,20,25,25);
         p1.add(back);// becoz i need to add image on panel , and panel is on frame
         
         ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
         Image i5=i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
         ImageIcon i6=new ImageIcon(i5);
         JLabel profile = new JLabel(i6);
         profile.setBounds(40,10,50,50);
         p1.add(profile);
         
         ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("icons/Video.png"));
         Image i8=i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
         ImageIcon i9=new ImageIcon(i8);
         JLabel Video = new JLabel(i9);
         Video.setBounds(300,20,30,30);
         p1.add(Video);
         
         ImageIcon i10= new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
         Image i11=i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
         ImageIcon i12=new ImageIcon(i11);
         JLabel phone = new JLabel(i12);
         phone.setBounds(360,20,35,30);
         p1.add(phone);
         
         ImageIcon i13= new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
         Image i14=i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
         ImageIcon i15=new ImageIcon(i14);
         JLabel morevert = new JLabel(i15);
         morevert.setBounds(420,20,10,25);
         p1.add(morevert);
         
         // if we want to write on frame we can do it via Jlabel
         // now we are adding name 
         JLabel name = new JLabel("GAITONDE");
         name.setBounds(110,15,100,18);
         name.setFont(new Font("SAN_SARIF",Font.BOLD,18));
         p1.add(name );
         
         // now i need to add one more panel on the frame which is a1
          a1= new JPanel();
          a1.setLayout(null);
          a1.setBounds(5,75,440,570);
          a1.setBackground(Color.gray);
          add(a1);
          
          JLabel status = new JLabel("Active Now");
          status.setBounds(110, 35, 100, 18);
          status.setForeground(Color.WHITE);
          status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
          p1.add(status);
          
          Text= new JTextField();
          Text.setBounds(5,655,310,40);
          Text.setBackground(Color.WHITE);
          Text.setFont(new Font("SAN_SARIF",Font.PLAIN,16));
          add(Text);
          
          JButton send = new JButton();
          send.setBounds(320,655,123,40);
          send.setBackground(Color.green);
          add(send);
          // now whatever is going to wrtten in text must be shown in a1 left
          send.addActionListener(this);
          
         
         
         //now i need action on arrow which is image icon and we are clicking via mouse so mouse event we need 
         back.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent e){
                 setVisible(false);
                 // or System.exit(0); to close the project or app
                 
            }
        
             
         });
         
         
         
                 
         setLayout(null);
         setSize(450,700);
         setLocation(200,50);
         setUndecorated(true);// to remove the header of frame and put always after location 
         getContentPane().setBackground(Color.WHITE);
         setVisible(true);
        
         
         
    }
    
    
    public static void main(String[] args) {
        new Server();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String out= Text.getText();// we need text out of text field and make it print on a1
        // but its string so need to add in label
       // we need to add this  text on a1 via ADDING IT TO JLABEL AND THEN making one more panal
        JPanel P2= formatLabel(out);// WE CAN NOT ADD DIRECTLY TEXT ON JPANEL SO 
        
       
       
        
        a1.setLayout(new BorderLayout());// setting border layout on a1
                // borde layout set elemnts on top bottom left and centre 
                //  now i need panel set to border layout and on right set of frame 
//                // then in need to put out text on that panel and on  right hand side of frame plus set message verticaley
        JPanel  right= new JPanel(new BorderLayout());// AFTER MAKING BOX VERTCAL , SETPANEL ON RIGHT SIDE ALONG WITH TEXT BUT TEXT IS STRING SO MAKE IT TEXT FIRST 
        right.add(P2,BorderLayout.LINE_END);// THIS DOES NOT TAKE STRING THATS WHY WE NEED TO MAKE P2 
        // LINE END MEANS AT END OF LINE       we are aliging one msg on right  
        // now we are aliging all  mesaages sent vertically 
        verticalBox.add(right);
        verticalBox.add(Box.createVerticalStrut(15));// all mesaages on right side vertically 
        // we need to add all this in a1
        a1.add(verticalBox,BorderLayout.PAGE_START);// WHERE WE TO NEED TO SHOW VERTICAL IS IN BORDER LAYOUT from PAGE START 
//         but message is still not visible so we need to repaint/reload frame  
        // for this we need frame object so that we can call few function and do our task 
//        // jframe which is extended is is object and inside that we need to call function , 3 functions 
         Text.setText("");
        repaint();
        validate();
        invalidate();
    }
//        
        // now i need to abjust the text whixh is sent and visible on our frame 
         public static JPanel formatLabel(String out){// jpanel is return type 
             JPanel panel = new JPanel();
//             panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
             
             JLabel output= new JLabel("<html><p style=\"width: 150px\">"+out+"</p></html>");
             output.setFont(new Font("Tahoma", Font.PLAIN, 16));
             output.setBackground(new Color(37, 211, 102));
             output.setOpaque(true);
             output.setBorder(new EmptyBorder(15, 15, 15, 50));
             panel.add(output);
             
             panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
             
             // now adding time 
             Calendar cal = Calendar.getInstance();// calmder class java util 
             SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");//simple date format class from text 
        
             JLabel time = new JLabel();
             time.setText(sdf.format(cal.getTime()));
        
             panel.add(time);
             return panel;
             
             
             
         }
    
    
        
}



    