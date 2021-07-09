package Primjer04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Start {

	public Start() {
	prviGui();
		drugiGui();
	}
	
	

	private void drugiGui() {
		JFrame frano = new JFrame("Novi frejm");
		final JTextField noviFild = new JTextField();
		noviFild.setBounds(50, 50, 150, 20);
		JButton pero = new JButton("Click here");
		pero.setBounds(50,100,95,30);
		pero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				noviFild.setText("Kliknio si gumb");
				
			}
		});
		frano.add(pero);
		frano.add(noviFild);
		frano.setLayout(null);
		frano.setVisible(true);
		
	}



	private void prviGui() {
		//Objekt klase JFrame
		JFrame frame = new JFrame("Primjer buttona");
		JButton button = new JButton("Click here");
		button.setBounds(20, 20, 400, 400);
		frame.add(button);
		frame.setSize(800,800);
		frame.setLayout(null);
		frame.setVisible(true);
				
		
	}



	public static void main(String[] args) {

		new Start();

	}

}
