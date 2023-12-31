/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.Random;//////imp

/**
 *
 * @author NetImpact
 */
public class SignupTwo extends JFrame implements ActionListener{
    JLabel Additional_Details,Religion,Category,Income,Edu_qualifi,Occupation,PAN_No,Aadhaar_No,Senior_Citizen,Existing_Acc;
    JTextField PAN_NoTF,Aadhaar_NoTF;
    JComboBox ValReligion,ValCategory,incomCategory,EducationValues,OccuptaionValue;
    JRadioButton sYes,sNo,eYes,eNo;
    JButton Next;
    String form_no;//////imp,, same oackage , different class public variable we are using 


    SignupTwo(String form_no) {/// this was default constructor so we inserted in its parameter what we are using form other class 
        this.form_no=form_no;///////imp
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setLayout(null);
        setTitle("New Account Application Form-Page2");
        Additional_Details =new JLabel("Additional Details ");
        Additional_Details.setBounds(320,80,400,30);
        Additional_Details.setFont(new Font("Raleway",Font.BOLD,20));
        add(Additional_Details);
        
        Religion =new JLabel("Religion");
        Religion.setBounds(100,140,100,30);
        Religion.setFont(new Font("Raleway",Font.BOLD,20));
        add(Religion);
        String Religion[]= {"Hindu","Muslim","Sikh","Christian","Other"};
        ValReligion=new JComboBox(Religion);
        ValReligion.setBounds(300,140,400,30);
        ValReligion.setFont(new Font("Railway",Font.PLAIN,15));
        ValReligion.setBackground(Color.WHITE);
        add(ValReligion);
        
        Category =new JLabel("Category");
        Category.setBounds(100,190,200,30);
        Category.setFont(new Font("Raleway",Font.BOLD,20));
        add(Category);
    
        String Category[]= {"General","OBC","SC","ST","Other"};
        ValCategory=new JComboBox(Category);
        ValCategory.setBounds(300,190,400,30);
        ValCategory.setFont(new Font("Railway",Font.PLAIN,15));
        ValCategory.setBackground(Color.WHITE);
        add(ValCategory);
        
        Income =new JLabel("Income");
        Income.setBounds(100,240,200,30);
        Income.setFont(new Font("Raleway",Font.BOLD,20));
        add(Income);
        
        String Income[]= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        incomCategory=new JComboBox(Income);
        incomCategory.setBounds(300,240,400,30);
        incomCategory.setFont(new Font("Railway",Font.PLAIN,15));
        incomCategory.setBackground(Color.WHITE);
        add(incomCategory);
        
        Edu_qualifi =new JLabel("Edu_qualifi");
        Edu_qualifi.setBounds(100,290,200,30);
        Edu_qualifi.setFont(new Font("Raleway",Font.BOLD,20));
        add(Edu_qualifi);
        
        String Edu_qualifi[]= {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        EducationValues=new JComboBox(Edu_qualifi);
        EducationValues.setBounds(300,290,400,30);
        EducationValues.setFont(new Font("Railway",Font.PLAIN,15));
        EducationValues.setBackground(Color.WHITE);
        add(EducationValues);
        
        Occupation =new JLabel("Occupation");
        Occupation.setBounds(100,340,200,30);
        Occupation.setFont(new Font("Raleway",Font.BOLD,20));
        add(Occupation);
       
        String Occupation[]=  {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        OccuptaionValue=new JComboBox(Occupation);
        OccuptaionValue.setBounds(300,340,400,30);
        OccuptaionValue.setFont(new Font("Railway",Font.PLAIN,15));
        OccuptaionValue.setBackground(Color.WHITE);
        add(OccuptaionValue);
        
        PAN_No =new JLabel("PAN_No");
        PAN_No.setBounds(100,390,200,30);
        PAN_No.setFont(new Font("Raleway",Font.BOLD,20));
        add(PAN_No);
        PAN_NoTF=new JTextField();
        PAN_NoTF.setBounds(300,390,400,30);
        PAN_NoTF.setFont(new Font("Raleway",Font.PLAIN,15));
        add(PAN_NoTF);
        
        Aadhaar_No =new JLabel("Aadhaar_No");
        Aadhaar_No.setBounds(100,440,200,30);
        Aadhaar_No.setFont(new Font("Raleway",Font.BOLD,20));
        add(Aadhaar_No);
        Aadhaar_NoTF=new JTextField();
        Aadhaar_NoTF.setBounds(300,440,400,30);
        Aadhaar_NoTF.setFont(new Font("Raleway",Font.PLAIN,15));
        add(Aadhaar_NoTF);
        
        Senior_Citizen =new JLabel("Senior_Citizen");
        Senior_Citizen.setBounds(100,490,200,30);
        Senior_Citizen.setFont(new Font("Raleway",Font.BOLD,20));
        add(Senior_Citizen);
        sYes=new JRadioButton("YES");
        sYes.setBounds(300,490,100,30);
        add(sYes);
        sNo=new JRadioButton("NO");
        sNo.setBounds(450,490,100,30);
        add(sNo);
        
        ButtonGroup senior_citizenGroup=new ButtonGroup();
        senior_citizenGroup.add(sNo);
        senior_citizenGroup.add(sYes);
        
        Existing_Acc =new JLabel("Existing_Acc");
        Existing_Acc.setBounds(100,540,200,30);
        Existing_Acc.setFont(new Font("Raleway",Font.BOLD,20));
        add(Existing_Acc);
        eYes=new JRadioButton("YES");
        eYes.setBounds(300,540,100,30);
        add(eYes);
        
        eNo=new JRadioButton("NO");
        eNo.setBounds(450,540,100,30);
        add(eNo);
        ButtonGroup Existing_AccGroup=new ButtonGroup();
        Existing_AccGroup.add(eYes);
        Existing_AccGroup.add(eNo);
        
        Next=new JButton("Next");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setBounds(620,640,80,30);
        add(Next);
        Next.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String form_no=""+random();///////imp
        String religion=(String) ValReligion.getSelectedItem();
        String category=(String)ValCategory.getSelectedItem();
        String income=(String)incomCategory.getSelectedItem();
         
        String education_q=(String)EducationValues.getSelectedItem();
        String occupation=(String)OccuptaionValue.getSelectedItem();
        String pan=PAN_NoTF.getText();
        String aadhar=Aadhaar_NoTF.getText();
        String Scitizen=null;// OR WE CAN DO LIKE THIS String Scitizen="";
        if(sYes.isSelected()){
            Scitizen="YES";
        }else if(sNo.isSelected()){
            Scitizen="NO";
        }
        String Eaccount=null;// OR WE CAN DO LIKE THIS String Scitizen="";
        if(eYes.isSelected()){
            Scitizen="YES";
        }else if(eNo.isSelected()){
            Scitizen="NO";
        }
        try {
            if(PAN_NoTF.equals("")){
                JOptionPane.showMessageDialog(null, "req.field");
            }else {
                Conn c1=new Conn();
                String query1= "insert into signupTwo  values('"+form_no+"','"+religion+"','"+category+"','"+income+"','"+education_q+"','"+occupation+"','"+pan+"','"+aadhar+"','"+Scitizen+"','"+Eaccount+"')";
                c1.s.executeUpdate(query1);
                
                // now e need to crete signup 3 class object as we didi in signup one for sighnuptwo
                setVisible(false);
                new Signup3(form_no).setVisible(true);// creating object of 
                
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
    public static void main(String[] args) {
        new SignupTwo("");// form no.  ki dikkat ki wajah se yhn string pass krni pad rahi hai 
    }}

    