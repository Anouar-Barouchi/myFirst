import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AgricFrame extends JFrame {
	
	public AgricFrame() {
		super("Agricultural Products");
		this.setSize(1000,700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = this.getContentPane();
		
		JPanel pano = new JPanel();
		c.add(pano);
		
		Font f = new Font("Arial",Font.BOLD	, 20);
		
		
		JLabel lab = new JLabel();
		ImageIcon i = new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/agric.jpg");
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
		
		JLabel en = new JLabel(" Kg");
		en.setFont(f);
		en.setBounds(670, 70, 100, 30);
		en.setForeground(Color.WHITE);
		pano.add(en);
		
		Text result = new Text();
		result.setText("0 kg");
		result.setEditable(false);
		result.setBounds(400, 250, 250, 30);
		result.setFont(f);
		pano .add(result);
		
		
		JLabel res = new JLabel("Result :");
		res.setFont(f);
		res.setBounds(250, 250, 100, 30);
		res.setForeground(Color.WHITE);
		pano.add(res);
		
		
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
		
		JRadioButton r1 = new JRadioButton("Natural Irrigation");
		JRadioButton r2 = new JRadioButton("Artificial Irrigation");
		r1.setBounds(280, 150, 200, 30);
		r2.setBounds(500, 150, 250, 30);
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
					result.setText(result.calc_agrs(calc.getInt())+" Kg");
				}
				if(r2.isSelected()) {
					result.setText(""+result.calc_agrA(calc.getInt())+" Kg");
				}
				
				
			}
		});
		
		
		pano.add(lab);
		pano.setLayout(null);
		c.validate();
		pano.validate();
		this.setVisible(true);
		
	}
	JButton b1 = new JButton("Back");
	

}
