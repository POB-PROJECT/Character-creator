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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Back_Panel extends JPanel {
	JLabel background_u_smoczego = new JLabel("New label");

	Main_Menu_Panel Main_Menu_Penel_object = new Main_Menu_Panel();

	public Back_Panel() {
		setLayout(null);

		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMenu.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);

			}
		});

		btnMenu.setBounds(543, 487, 225, 62);
		add(btnMenu);
		add(Main_Menu_Penel_object);

		background_u_smoczego.setIcon(new ImageIcon(Author_Panel.class
				.getResource("/create/characters/img/background_mario.gif")));
		background_u_smoczego.setBounds(-6, 0, 800, 600);

	}
}
