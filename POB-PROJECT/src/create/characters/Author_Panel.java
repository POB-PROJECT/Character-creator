package create.characters;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

public class Author_Panel extends Back_Panel {

	public Author_Panel() {

		JLabel lblAuthorsSmoczy = new JLabel("Authors: SMOCZY & ORTE");
		lblAuthorsSmoczy.setForeground(Color.MAGENTA);
		lblAuthorsSmoczy.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAuthorsSmoczy.setBounds(225, 199, 420, 71);
		add(lblAuthorsSmoczy);
		add(super.background_u_smoczego);
	}
}
