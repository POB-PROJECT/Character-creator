package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class Edit_Character_Panel extends Back_Panel {
	protected String name="marek";

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Edit_Character_Panel() {
		
		DefaultListModel listModel;
		listModel = new DefaultListModel();
		listModel.addElement("kasiek");

		JList list = new JList(listModel);

		list.setBounds(47, 115, 143, 123);
		add(list);
		
		listModel.addElement("pierog");
		listModel.addElement(name);
		
		JButton Back_button = new JButton("Back to MENU");
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			Back_button.setVisible(false);
			Main_Menu_Penel_object.setBounds(0, 0, 800, 600);	
			list.setVisible(false);
			System.out.println(list.getSelectedValue());

			}
		});
		
		
		Back_button.setBounds(468, 438, 240, 93);
		add(Main_Menu_Penel_object);
		add(Back_button);
		

		

		add(super.background_label);

	}
}
