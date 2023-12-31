/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.jar.JarFile;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.ActiveEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author NetImpact
 */
public class SignupOne extends JFrame implements ActionListener{
    JLabel Formmo,PersonalDetails,Name,Fname,Dob,Gender,Email,MaritalStatus,Address,City,State,pin,Date,Month,Year;
    JTextField NametextfiField,FnametextfiField,EmailtextfiField,AddresstextfiField,CitytextfiField,pintextField,StatetextfiField;
    JButton Next;
    JRadioButton male,female,married,unmarried,others;
    Random ran=new Random();
    JDateChooser dateChooser;
    long random=Math.abs(ran.nextLong()%9000L+1000L);
     SignupOne() {
         setSize(850,800);
         setLocation(350,10);
         setVisible(true);
         setLayout(null);
         // now making labels 
         Formmo =new JLabel("Application Form no."+random);
         Formmo.setFont(new Font("RALEWAY",Font.BOLD,38));
         Formmo.setBounds(140,20,600,40);
         add(Formmo);
         
         PersonalDetails=new JLabel("Personal Details:");
         PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
         PersonalDetails.setBounds(290,80,600,30);
         add(PersonalDetails);
         
         Name=new JLabel("Name:");
         Name.setFont(new Font("Raleway",Font.BOLD,20));
         Name.setBounds(100,140,100,30);
         add(Name);
         
         Fname=new JLabel("Fname");
         Fname.setFont(new Font("Raleway",Font.BOLD,20));
         Fname.setBounds(100,190,200,30);
         add(Fname);
         
         Dob=new JLabel("Dob");
         Dob.setFont(new Font("Raleway",Font.BOLD,20));
         Dob.setBounds(100,240,200,30);
         add(Dob);
         // ADDING CALENDER 
          dateChooser=new JDateChooser();
         dateChooser.setBounds(300,240,400,30);
         add(dateChooser);
         
         Gender=new JLabel("Gender");
         Gender.setFont(new Font("Raleway",Font.BOLD,20));
         Gender.setBounds(100,290,200,30);
         add(Gender);
         
         Email=new JLabel("Email");
         Email.setFont(new Font("Raleway",Font.BOLD,20));
         Email.setBounds(100,340,200,30);
         add(Email);
                 
         MaritalStatus=new JLabel("MaritalStatus");
         MaritalStatus.setFont(new Font("Raleway",Font.BOLD,22));
         MaritalStatus.setBounds(100,390,200,30);
         add(MaritalStatus);
         
         Address=new JLabel("Address");
         Address.setFont(new Font("Raleway",Font.BOLD,20));
         Address.setBounds(100,440,200,30);
         add(Address);
                 
         City=new JLabel("City");
         City.setFont(new Font("Raleway",Font.BOLD,20));
         City.setBounds(100,490,200,30);
         add(City);
                 
         State=new JLabel("State");
         State.setFont(new Font("Raleway",Font.BOLD,20));
         State.setBounds(100,540,200,30);
         add(State);
         
         pin=new JLabel("pin");
         pin.setFont(new Font("Raleway",Font.BOLD,20));
         pin.setBounds(100,590,200,30);
         add(pin);
          
                // THESE OF NOT USED FOR DATE MONTH AND YEAR;
              
         
         
         
         
                  //LETS MAKE TEXTFEILD
         
         NametextfiField=new JTextField();
         NametextfiField.setFont(new Font("Raleway",Font.BOLD,14));
         NametextfiField.setBounds(300,140,400,30);
         add(NametextfiField);
         
         FnametextfiField=new JTextField();
         FnametextfiField.setFont(new Font("Raleway",Font.BOLD,14));
         FnametextfiField.setBounds(300,190,400,30);
         add(FnametextfiField);
         
         EmailtextfiField=new JTextField();
         EmailtextfiField.setFont(new Font("Raleway",Font.BOLD,14));
         EmailtextfiField.setBounds(300,340,400,30);
         add(EmailtextfiField);
         
         AddresstextfiField=new JTextField();
         AddresstextfiField.setFont(new Font("Raleway",Font.BOLD,14));
         AddresstextfiField.setBounds(300,440,400,30);
         add(AddresstextfiField);
         
         CitytextfiField=new JTextField();
         CitytextfiField.setFont(new Font("Raleway",Font.BOLD,14));
         CitytextfiField.setBounds(300,490,400,30);
         add(CitytextfiField);
         
         StatetextfiField=new JTextField();
         StatetextfiField.setFont(new Font("Raleway",Font.BOLD,14));
         StatetextfiField.setBounds(300,540,400,30);
         add(StatetextfiField);
         
         pintextField=new JTextField();
         pintextField.setFont(new Font("Raleway",Font.BOLD,14));
         pintextField.setBounds(300,590,400,30);
         add(pintextField);
         
         
         male=new JRadioButton("male");
         male.setFont(new Font("Rleway",Font.BOLD,14));
         male.setBounds(300,290,60,30);
         add(male);
         female=new JRadioButton("female");
         female.setFont(new Font("Rleway",Font.BOLD,14));
         female.setBounds(450,290,90,30);
         add(female);
         
         //GROUPING TO ABOVE TWO BUTTONS SO THAT ONLY ONE GET SELECTED 
         ButtonGroup genderGroup= new ButtonGroup();
         genderGroup.add(male);
         genderGroup.add(female);
         
         
         married=new JRadioButton("married");
         married.setFont(new Font("Rleway",Font.BOLD,14));
         married.setBounds(300,390,100,30);
         add(married);
         
         unmarried=new JRadioButton("unmarried");
         unmarried.setFont(new Font("Rleway",Font.BOLD,14));
         unmarried.setBounds(450,390,100,30);
         add(unmarried);
         
         others=new JRadioButton("others");
         others.setFont(new Font("Rleway",Font.BOLD,14));
         others.setBounds(635,390,100,30);
         add(others);
         
         // GROUPING TO ABOVE TWO BUTTONS SO THAT ONLY ONE GET SELECTED 
         
         ButtonGroup martialStatusGroup=new ButtonGroup();
         martialStatusGroup.add(married);
         martialStatusGroup.add(unmarried);
         martialStatusGroup.add(others);
         
         Next=new JButton("Next");
         Next.setFont(new Font("Raleway",Font.BOLD,14));
         Next.setBounds(620,660,80,30);
         add(Next);
         
         // we need to provide action listner so that when we click next every textfield get stored in database
         // to get stored in database we need to make JDBC FIRST
         // LETS MAKE jdbc Class Conn class
         Next.addActionListener(this);
         
                 
         
         
                
         
         
         
         
         
         
         
         
         
         
         
    }
     public void actionPerformed(ActionEvent ae){
        // as we have only one button in here not like login
        //string variable name should be different from variable we have used to make buttons and labels 
        
        String form_no=""+random;
        String name= NametextfiField.getText();
        String fname=FnametextfiField.getText();
        String  Dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();/// IMPORTANT MIGHT TYPO CAUSE TYPO ERROR 
        
        String gender=null;// need to intialize every variable otherwise error
        if(male.isSelected()){
            gender = "male";
        }
        else if (female.isSelected()) {
            gender="Female";
             
         }
        String  Email=EmailtextfiField.getText(); // string variable name should be different from label and textfield name 
        String Marital_status=null;// here also need to intialize 
        if(married.isSelected()){
            Marital_status="Married";
        }else if (unmarried.isSelected()) {
            Marital_status="Unmarried";
            
         }else if (others.isSelected()) {
            Marital_status="Others";
             
         }
         String address=AddresstextfiField.getText();
         String state=StatetextfiField.getText();
         String city=CitytextfiField.getText();
         String Pin=pintextField.getText();
         
         try {
             if (name.equals("")) {
                 JOptionPane.showMessageDialog(null, "field req");
             }else{
                 Conn c=new Conn();
                  String query="insert into signup values('"+form_no+"','"+name+"','"+fname+"','"+Dob+"','"+gender+"','"+Email+"','"+Marital_status+"','"+address+"','"+city+"','"+Pin+"','"+state+"')";// strings name should be same as of action performed function and if u want database column names 
                  
                  c.s.executeUpdate(query);
                  
                  // after the successful submission signupone will get closed and signup two ll be open as i click next 
                  setVisible(false);
                  new SignupTwo(form_no).setVisible(true);
                 
             }
         } catch (Exception ex) {
             System.out.println(ex);
         }
       
     }
     
 
    
    
    public static void main(String[] args) {
        new SignupOne();
    }
   
    
}
