import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main_Frame extends JFrame /*implements ActionListener*/ {
	public Main_Frame() {
		super("Zakat Application");
		this.setSize(1000,700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = this.getContentPane();
		
		JPanel pano = new JPanel();
		c.add(pano);
		pano.setBackground(Color.DARK_GRAY);
		
		JLabel back = new JLabel();
		ImageIcon bac = new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/pexels-photo-813269.jpeg");
		Image imb = bac.getImage();
		Image ib = imb.getScaledInstance(1400, 800, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icb = new ImageIcon(ib);
		back.setBounds(0, 0, 1400, 800);
		back.setIcon(icb);
		
		
		Font f1 = new Font("Garamond", Font.ITALIC,30);
		Font f2 = new Font("Arial", Font.ITALIC,20);
		
		JLabel welcome = new JLabel("Welcome in our Application");
		welcome.setFont(f1);
		welcome.setForeground(Color.WHITE);
		welcome.setBounds(30,50,550,30);
		pano.add(welcome);
		
		
		
		JLabel choose = new JLabel("please choose the zakat kind");
		choose.setFont(f2);
		choose.setForeground(Color.WHITE);
		choose.setBounds(350,180,600,100);
		pano.add(choose);
		
		ImageIcon image = new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/index.jpeg");
		Image im = image.getImage();
		Image i = im.getScaledInstance(300, 150, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon1 = new ImageIcon(i);
		
		JLabel l = new JLabel("hola");
		l.setBounds(600,10,300,200);
		l.setIcon(icon1);
		pano.add(l);
		
		JLabel power = new JLabel("Powered By Anouar");
		power.setFont(f2);
		power.setBounds(740, 600, 500, 40);
		power.setForeground(Color.WHITE);
		pano.add(power);
		
		JButton b1 = new JButton("            Livestock");
		b1.setBounds(250, 250, 500, 70);
		b1.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/camel1.png"));
		//b1.setBackground(Color.LIGHT_GRAY);
		b1.setOpaque(false);
		b1.setFocusPainted(false);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				LivestockFrame f = new LivestockFrame();
				setVisible(false);
				f.setVisible(true);
				f.b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						f.setVisible(false);
						setVisible(true);
						
					}
				});
				
				
			}
		});
		//b1.setContentAreaFilled(false);
		b1.setFont(f1);
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.WHITE);
		b1.setFocusPainted(false);
		pano.add(b1);
		
		JButton b2 = new JButton("Agricultural products");
		b2.setBounds(250, 330, 500, 70);
		b2.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/wheat.png"));
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AgricFrame f = new AgricFrame();
				setVisible(false);
				f.setVisible(true);
				f.b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						f.setVisible(false);
						setVisible(true);
						
					}
				});
				
				
			}
		});
		//b2.setBackground(Color.ORANGE);
		b2.setBackground(Color.DARK_GRAY);
		b2.setFont(f1);
		b2.setForeground(Color.WHITE);
		b2.setFocusPainted(false);
		b2.setOpaque(false);
		pano.add(b2);
		
		JButton b3 = new JButton("        Gold & Silver");
		b3.setBounds(250, 410, 500, 70);
		b3.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/gold.png"));
		//b3.setBackground(Color.ORANGE);
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				GoldFrame f = new GoldFrame();
				setVisible(false);
				f.setVisible(true);
				f.b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						f.setVisible(false);
						setVisible(true);
						
					}
				});
				
				
			}
		});
		b3.setBackground(Color.DARK_GRAY);
		b3.setFont(f1);
		b3.setForeground(Color.WHITE);
		b3.setOpaque(false);
		b3.setFocusPainted(false);
		pano.add(b3);
		
		JButton b4 = new JButton("         Cash        ");
		b4.setBounds(250, 490, 500, 70);
		b4.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/money-bag.png"));
		b4.setBackground(Color.DARK_GRAY);
		b4.setFont(f1);
		b4.setForeground(Color.WHITE);
		b4.setOpaque(false);
		b4.setFocusPainted(false);
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				CashFrame f = new CashFrame();
				setVisible(false);
				f.setVisible(true);
				f.b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						f.setVisible(false);
						setVisible(true);
						
					}
				});
				
				
			}
		});
		
		
		pano.add(b4);
		
		
		
		
		
		pano.add(back);
		pano.setLayout(null);
		pano.validate();
		
		
		
		this.setVisible(true);
	}
	

}
