import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import com.sun.nio.file.SensitivityWatchEventModifier;

public class LivestockFrame extends JFrame  {
	
	public LivestockFrame() {
		super("livestock");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = this.getContentPane();
		
		JPanel pano = new JPanel();
		c.add(pano);
		
		Font f = new Font("Arial",Font.BOLD	, 20);
		
		JLabel lab = new JLabel(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/back.jpg"));
		lab.setBounds(0, 0, 1200, 700);
		
		
		Text calc = new Text();
		calc.setBounds(600, 200, 200, 30);
		calc.setFont(f);
		
		JLabel enter = new JLabel("Input :");
		enter.setFont(f);
		enter.setBounds(500, 200, 100, 30);
		enter.setForeground(Color.WHITE);
		pano.add(enter);
		
		Text result = new Text();
		result.setText("");
		result.setEditable(false);
		result.setBounds(600, 400, 200, 30);
		result.setFont(f);
		
		
		JLabel res = new JLabel("the result is :");
		res.setFont(f);
		
		res.setBounds(450, 400, 150, 30);
		res.setForeground(Color.WHITE);
		pano.add(res);
		
		
		pano.add(result);
		pano.add(calc);
	
		JLabel prin = new JLabel("Select the kind firstly");
		prin.setBounds(440, 100, 350, 30);
		prin.setFont(new Font("Arial", Font.BOLD, 30));
		prin.setForeground(Color.red);
		pano.add(prin);
		
		JRadioButton r1 = new JRadioButton("Cattle");
		JRadioButton r3 = new JRadioButton("Camel");
		JRadioButton r2 = new JRadioButton("Sheep");
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(r1);
		grp.add(r2);
		grp.add(r3);
		//r1.setSelected(true);
		
		r1.setBounds(420, 170, 100, 20);
		r2.setBounds(530, 170, 100, 20);
		r3.setBounds(640, 170, 100, 20);
		r1.setFont(f);
		r1.setForeground(Color.WHITE);
		r1.setBackground(Color.BLACK);
		r1.setOpaque(false);
		r1.setFocusPainted(false);
		r2.setFont(f);
		r2.setForeground(Color.WHITE);
		r2.setBackground(Color.BLACK);
		r2.setOpaque(false);
		r2.setFocusPainted(false);
		r3.setFont(f);
		r3.setForeground(Color.WHITE);
		r3.setBackground(Color.BLACK);
		r3.setOpaque(false);
		r3.setFocusPainted(false);
		
		r1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				prin.setForeground(Color.WHITE);
				prin.setText("Cattle");
				setTitle("Cattle");
				
			}
		});
		r2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				prin.setForeground(Color.WHITE);
				prin.setText("Sheep");
				setTitle("Sheep");
				
			}
		});
		r3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				prin.setForeground(Color.WHITE);
				prin.setText("Camel");
				setTitle("Camel");
				
			}
		});
		
		pano.add(r1);
		pano.add(r2);
		pano.add(r3);
		
		
		
		b1.setBounds(420, 500, 170, 40);
		b1.setFont(f);
		b1.setForeground(Color.WHITE);
		b1.setFocusPainted(false);
		b1.setBackground(Color.black);
		b1.setOpaque(false);
		b1.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/back.png"));
		
		pano.add(b1);
		
		JButton b2 = new JButton("Calculate");
		b2.setBounds(650, 500, 170, 40);
		b2.setIcon(new ImageIcon("/home/anouar/eclipse-workspace/Zakat/Pictures/calculator.png"));
		b2.setFont(f);
		b2.setForeground(Color.WHITE);
		b2.setFocusPainted(false);
		b2.setBackground(Color.black);
		b2.setOpaque(false);
	
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(r1.isSelected()) {
					setTitle("Cattle");
					result.setText(result.Calc_Bovins(calc.getInt()));
				}
				
				if(r2.isSelected()) {
					result.setText(result.Calc_Ovins(calc.getInt()));
					
					
				}
				
				if(r3.isSelected()) {
					result.setText(result.calc(calc.getInt()));
					
					
				}
				
				
			}
		});
		pano.add(b2);
		
		pano.add(lab);
		pano.setLayout(null);
		pano.validate();
		c.validate();
		
		
		
		
		
	}
	JButton b1 = new JButton("Back");
	

}
