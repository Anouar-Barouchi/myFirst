import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder; 

public class GoldFrame extends JFrame {
	
	public GoldFrame() {
		super("Gold & Silver");
		this.setSize(1000,700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = this.getContentPane();
		
		JPanel pano = new JPanel();
		c.add(pano);
		
		Font f = new Font("Arial",Font.BOLD	, 20);
		
		
		JLabel lab = new JLabel();
		ImageIcon i = new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/gld.jpg");
		Image im = i.getImage();
		Image imm = im.getScaledInstance(1000, 700, java.awt.Image.SCALE_SMOOTH);
		ImageIcon ico = new ImageIcon(imm);
		lab.setIcon(ico);
		lab.setBounds(0, 0, 1200, 700);
		
		Text calc = new Text();
		calc.setBounds(400, 70, 250, 30);
		calc.setFont(f);
		pano.add(calc);
		
		JLabel enter = new JLabel("Input :");
		enter.setFont(f);
		enter.setBounds(250, 70, 100, 30);
		enter.setForeground(Color.WHITE);
		pano.add(enter);
		
		Text result = new Text();
		result.setText("0 g");
		result.setEditable(false);
		result.setBounds(400, 250, 250, 30);
		result.setFont(f);
		pano .add(result);
		
		
		JLabel res = new JLabel("Result :");
		res.setFont(f);
		res.setBounds(250, 250, 100, 30);
		res.setForeground(Color.WHITE);
		pano.add(res);
		
		JLabel en = new JLabel(" g");
		en.setFont(f);
		en.setBounds(670, 70, 100, 30);
		en.setForeground(Color.WHITE);
		pano.add(en);
		
		b1.setBounds(300, 500, 170, 40);
		b1.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/back.png"));
		b1.setBackground(Color.DARK_GRAY);
		b1.setFont(f);
		b1.setForeground(Color.WHITE);
		b1.setFocusPainted(false);
		pano.add(b1);
		
		JButton b2 = new JButton("Calculate");
		b2.setBounds(530, 500, 170, 40);
		b2.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/calculator.png"));
		b2.setBackground(Color.DARK_GRAY);
		b2.setFont(f);
		b2.setForeground(Color.WHITE);
		b1.setFocusPainted(false);
		pano.add(b2);
		
		JRadioButton g1 = new JRadioButton("24 carat");
		JRadioButton g2 = new JRadioButton("21 carat");
		JRadioButton g3 = new JRadioButton("18 carat");
		g1.setBounds(250, 150, 100, 20);
		g2.setBounds(360, 150, 100, 20);
		g3.setBounds(470, 150, 100, 20);
		
		pano.add(g1);
		pano.add(g2);
		pano.add(g3);
		
		
		ButtonGroup grpe = new ButtonGroup();
		grpe.add(g1);
		grpe.add(g2);
		grpe.add(g3);
		
		
		
		JRadioButton r1 = new JRadioButton("Gold");
		JRadioButton r2 = new JRadioButton("Silver");
		r1.setBounds(300, 10, 100, 30);
		r2.setBounds(500, 10, 100, 30);
		r1.setFont(f);
		r2.setFont(f);
		r1.setBackground(Color.BLACK);
		r2.setBackground(Color.BLACK);
		r1.setForeground(Color.WHITE);
		r2.setForeground(Color.WHITE);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(r1);
		grp.add(r2);
		pano.add(r1);
		pano.add(r2);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(r1.isSelected()) {
					if (g1.isSelected()) {
						if(calc.getInt()>85) {
							result.setText(""+(calc.getInt()*0.25)+" g");
						}
					}
					if (g2.isSelected()) {
						if(calc.getInt()>97) {
							result.setText(""+(calc.getInt()*0.25)+" g");
						}
					}
					if (g3.isSelected()) {
						if(calc.getInt()>113) {
							result.setText(""+(calc.getInt()*0.25)+" g");
						}
					}
					
				}
				
				if (r2.isSelected()) {
					if(calc.getInt()>595) {
						result.setText(""+(calc.getInt()*0.025) + " g");
					}
				}
			}
		});
		
		
		
		
		pano.add(lab);
		c.validate();
		pano.validate();
		pano.setLayout(null);
		this.setVisible(true);
	}
	JButton b1 = new JButton("Back");
	

}
