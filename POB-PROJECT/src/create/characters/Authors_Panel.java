package create.characters;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Authors_Panel extends JPanel {
	Main_Menu_Panel Main_Menu_Penel_object = new Main_Menu_Panel();
	JLabel background_mario_label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");

	public Authors_Panel() {
		setLayout(null);

		JLabel lblAuthors = new JLabel("Authors: smoczy & orte");
		lblAuthors.setForeground(Color.RED);
		lblAuthors.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthors.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAuthors.setBounds(267, 214, 236, 136);
		add(lblAuthors);

		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblAuthors.setVisible(false);
				btnMenu.setVisible(false);
				
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
				background_mario_label.setVisible(false);
			
			}
		});
		btnMenu.setBounds(347, 500, 89, 23);
		add(btnMenu);
		add(Main_Menu_Penel_object);
		
		background_mario_label.setIcon(new ImageIcon(Authors_Panel.class.getResource("/create/characters/img/background_mario.gif")));
		background_mario_label.setBounds(-6, 0, 800, 600);
		add(background_mario_label);
	}
}
