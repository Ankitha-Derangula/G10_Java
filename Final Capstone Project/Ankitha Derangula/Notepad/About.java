package notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
	About(){
		super("About Notepad");
        setSize(1950, 1050);
        
        setLayout(new BorderLayout());
    	setBounds(400,100,600,500);
		setLayout(null);
		ImageIcon AboutIcon=new ImageIcon(ClassLoader.getSystemResource("Icons/notepad.png"));
        Image icon1=AboutIcon.getImage();
        setIconImage(icon1);
        
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/windows.png"));
		Image i2=i1.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel headerIcon=new JLabel(i3);
		headerIcon.setBounds(70,40,400,80);
		add(headerIcon);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Icons/notepad.png"));
		Image i5=i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel icon=new JLabel(i6);
		icon.setBounds(70,180,70,70);
		add(icon);
		
		JLabel text=new JLabel("<html>Code for Interview 0.1.0(OS Build Java)<br>Code for Inetrview.All rights reserved<br>Created By Ankitha.</html>");
		text.setBounds(150,100,500,200);
		text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
		add(text);
		
		JButton b1=new JButton("OK");
		b1.setBounds(150,350,120,25);
		add(b1);
		
	
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new About();

	}

}
