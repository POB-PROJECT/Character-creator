package create.characters;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Authors_Panel extends JPanel {
	 
	
	
	
	
	
	
	//Main_Menu_Panel Main_Menu_Panel_object = new Main_Menu_Panel();
	
	
	
	
	/**
	 * Create the panel.
	 */
	public Authors_Panel() {
		setLayout(null);
		
		
		
		JLabel lblAuthors = new JLabel("Authors: smoczy & orte");
		lblAuthors.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthors.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAuthors.setBounds(267, 214, 236, 136);
		add(lblAuthors);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lblAuthors.setVisible(false);
				btnMenu.setVisible(false);
				Main_Menu_Panel Main_Menu_Penel_object = new Main_Menu_Panel();
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
				add(Main_Menu_Penel_object);
			}
		});
		btnMenu.setBounds(347, 500, 89, 23);
		add(btnMenu);
		
		
		
		
		
		//add(panel);
	
	

	}
}
