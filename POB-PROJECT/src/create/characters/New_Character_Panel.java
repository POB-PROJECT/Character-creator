package create.characters;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import java.awt.Label;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;

public class New_Character_Panel extends JPanel {
	private JTextField Name_textfiled;
	JButton Back_button = new JButton("MENU");
	JButton Save_button = new JButton("SAVE");
	JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");




	/**
	 * Create the panel.
	 */
	public New_Character_Panel() {
		setLayout(null);
		
		
		Name_textfiled = new JTextField();
		Name_textfiled.setFont(new Font("Tahoma", Font.BOLD, 10));
		Name_textfiled.setBounds(361, 536, 91, 20);
		add(Name_textfiled);
		Name_textfiled.setColumns(10);
		
		Save_button.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Save_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Save_button.setBounds(686, 536, 87, 15);
		add(Save_button);
		
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu_Panel Main_Menu_Panel_object = new Main_Menu_Panel();
				Main_Menu_Panel_object.setBounds(0, 0, 800, 600);			
				add(Main_Menu_Panel_object);	
				lblNewJgoodiesLabel.setVisible(false);
				Name_textfiled.setVisible(false);
				Save_button.setVisible(false);
				Back_button.setVisible(false);
				
			}
		});
		
		Back_button.setBounds(686, 500, 89, 23);
		add(Back_button);
		
		lblNewJgoodiesLabel.setIcon(new ImageIcon(New_Character_Panel.class.getResource("/create/characters/img/background_WoW_8x6.jpg")));
		lblNewJgoodiesLabel.setBounds(0, 0, 800, 600);
		add(lblNewJgoodiesLabel);


	}
}
