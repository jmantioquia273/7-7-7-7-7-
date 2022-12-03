import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MyGui extends JFrame implements ActionListener {
 Font font = new Font("Arial", Font.BOLD,15);
 
 JTable t = new JTable();
 JFrame f = new JFrame();
 JFrame f2 = new JFrame();
 JLabel title = new JLabel("Polytechnic University of the Phil");
 JLabel userId = new JLabel("1st Choice");
 JLabel userId2 = new JLabel("2nd Choice");
 JTextField text1 = new JTextField(25);
 JTextField text2 = new JTextField(25);
 JButton b = new JButton("OK");
 
 
 String [] columnName = {"Academic Programs", "Min Grade 10 & 11 GWA",
   "Min G10 in Math", "Min G10 in Science", "Min G10 in English"
   
   };
   
   Object [][] data = {
     {"Academic Programs", "Min Grade 10 & 11 GWA",
      "Min G10 in Math", "Min G10 in Science", "Min G10 in English"},
     
     {"BEED", "88", "88", "88", "88"}, {"BPA-PFM", "85", "82", "82","85" },
     {"BSAM", "85", "85", "85", "85"}, {"BSENT", "82", "82", "82","82" },
     {"BSOA", "88", "88", "88", "88"}, {"DIT", "85", "82", "82","85" },
     {"DOMTMOM", "88", "88", "88", "88"}
   };
   
 public class Myframe2 {
  JFrame frame = new JFrame();
  private JTextField answer = new JTextField(30);
  JLabel gwa11 = new JLabel("Grade 11 GWA");
  JLabel gmath = new JLabel("Grade in Math");
  JLabel gsci = new JLabel("Grade in Science");
  JLabel geng = new JLabel("Grade in English");
  JTextField gwa = new JTextField(30);
  JTextField math = new JTextField(30);
  JTextField sci = new JTextField(30);
  JTextField eng = new JTextField(30);
  JPanel panel = new JPanel();
  public JButton b2 = new JButton("Submit");

  public Myframe2() {
   getContentPane().setLayout(new FlowLayout());
   getContentPane().setBackground(Color.black);
   add(gwa11);
   gwa11.setForeground(Color.green);
   add(gwa);
   add(gmath);
   gmath.setForeground(Color.green);
   add(math);
   add(gsci);
   gsci.setForeground(Color.green);
   add(sci);
   add(geng);
   geng.setForeground(Color.green);
   add(eng);
   add(b2);
   b2.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent d){
   
     if( == 88){
     answer.setText("BEED");
     }
   }
   });
   
   add(answer);
     
   
   //close the frame 1
   setVisible(true);
   setResizable(false);
   setSize(400,600);
   t.setVisible(false);
   userId.setVisible(false);
   text1.setVisible(false);
   text2.setVisible(false);
   userId2.setVisible(false);
   b.setVisible(false);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
  }
 
  
  
 }
 

 
 
 public MyGui() {
  setLayout(new FlowLayout());
  t =  new JTable(data, columnName);
  pack();
  add(t);
  add(userId);
  add(text1);
  add(userId2);
  add(text2);
  userId.setFont(font);
  userId2.setFont(font);
  title.setFont(font);
  add(b);
  b.setSize(30,300);
  setResizable(false);
  setLocation(300,100);
  setVisible(true);
  setSize(400,600);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  b.setPreferredSize(new Dimension(100,20));
  
  b.addActionListener(this);
  
  
 }

 public static void main(String[] args) {
  new MyGui();

 }
@Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource().equals(b)) {
   
   new Myframe2();
   
    
   
  }
  
  }

 
  
  
  

  
  }


 
  
 

