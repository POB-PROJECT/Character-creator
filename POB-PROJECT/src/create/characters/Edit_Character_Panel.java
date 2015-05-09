package create.characters;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.FlowLayout;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Edit_Character_Panel extends JPanel {
	JButton Back_button = new JButton("MENU");
	JLabel background_mario_label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");

	/**
	 * Create the panel.
	 */
	public Edit_Character_Panel() {
		setLayout(null);
		
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Back_button.setVisible(false);
				Main_Menu_Panel Main_Menu_Panel_object = new Main_Menu_Panel();
				Main_Menu_Panel_object.setBounds(0, 0, 800, 600);
				background_mario_label.setVisible(false);
				add(Main_Menu_Panel_object);	

			}
		});
		Back_button.setBounds(625, 473, 87, 23);
		add(Back_button);
		
		background_mario_label.setIcon(new ImageIcon(Edit_Character_Panel.class.getResource("/create/characters/img/background_mario.gif")));
		background_mario_label.setBounds(-6, 0, 800, 600);
		add(background_mario_label);

	}
}
