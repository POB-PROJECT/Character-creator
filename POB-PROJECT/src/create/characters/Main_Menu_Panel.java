package create.characters;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;


public class Main_Menu_Panel extends JPanel {
	
	New_Character_Panel New_Character_panel_object = new New_Character_Panel();
	/**
	 * Create the panel.
	 */
	public Main_Menu_Panel() {
		setLayout(null);
		JButton Load_Character_button = new JButton("Load Character");
		Load_Character_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Load_Character_button.setBounds(467, 205, 266, 60);
		add(Load_Character_button);
		
		JButton Exit_button = new JButton("EXIT");
		Exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		Exit_button.setBounds(467, 486, 266, 60);
		add(Exit_button);
		
		JButton Author_button = new JButton("Author");
		Author_button.setBounds(467, 394, 266, 63);
		add(Author_button);
		
		JButton Edit_Character_button = new JButton("Edit Character");
		Edit_Character_button.setBounds(467, 303, 266, 65);
		add(Edit_Character_button);
		
		JButton New_Character_button = new JButton("New Character");
		New_Character_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				New_Character_panel_object.setBounds(0, 0, 800, 600);
				New_Character_button.setVisible(false);
				Exit_button.setVisible(false);
				Load_Character_button.setVisible(false);
				Author_button.setVisible(false);
				Edit_Character_button.setVisible(false);
				
				
			}
		});
		New_Character_button.setBounds(467, 114, 266, 60);
		add(New_Character_button);
		
		
		
		
		
		
		add(New_Character_panel_object);
		
		JLabel Guitarman_gif = DefaultComponentFactory.getInstance().createLabel("");
		Guitarman_gif.setIcon(new ImageIcon(Main_Menu_Panel.class.getResource("/create/characters/img/picgifs-world-of-warcraft-8316948.gif")));
		Guitarman_gif.setBounds(93, 55, 454, 443);
		add(Guitarman_gif);
		

		

	}
}
