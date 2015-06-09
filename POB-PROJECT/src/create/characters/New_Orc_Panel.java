package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JEditorPane;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

public class New_Orc_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public New_Orc_Panel() {
		// ----------------------------------------------------------------------------------------------------------
		// OBIEKTY
		JButton btnOrcWarrior = new JButton("Warrior");
		btnOrcWarrior.setBackground(Color.LIGHT_GRAY);
		JButton btnOrcMage = new JButton("Mage");
		btnOrcMage.setBackground(Color.LIGHT_GRAY);
		JButton btnOrcRanger = new JButton("Ranger");
		btnOrcRanger.setBackground(Color.LIGHT_GRAY);
		JLabel lblClass = new JLabel("Default Class");
		lblClass.setForeground(Color.WHITE);
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JLabel lblName = new JLabel("NAME");
		JTextField NameField = new JTextField();
		JButton btnCreate = new JButton("CREATE");
		JButton Back_button = new JButton("Back to MENU");
		// ------------------------------------------------ Weapon
		JLabel lblWeapon = new JLabel("Weapon");
		JLabel lblSelectedWeapon = new JLabel("None");
		JButton btnWeaponPrev = new JButton("<");
		JButton btnWeaponNext = new JButton(">");
		JLabel lblShowWeapon = new JLabel("Default Weapon");
		lblShowWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Armor
		JLabel lblArmor = new JLabel("Armor");
		JLabel lblSelectedArmor = new JLabel("None");
		JButton btnArmorPrev = new JButton("<");
		JButton btnArmorNext = new JButton(">");
		JLabel lblShowArmor = new JLabel("Default Armor");
		lblShowArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Skill
		JLabel lblSkills = new JLabel("Skills");
		JLabel lblSelectedSkills = new JLabel("None");
		JButton btnSkillsPrev = new JButton("<");
		JButton btnSkillsNext = new JButton(">");
		JLabel lblShowSkills = new JLabel("Default Skill");
		lblShowSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JLabel lblShowCharacter = new JLabel("");
		
		// ----------------------------------------------------------------------------------------------------------
		// CREATE BUTTON

		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					Orc_Warrior test_orc = new Orc_Warrior(NameField.getText(),
							lblShowWeapon.getText(), lblShowArmor.getText(),
							lblShowSkills.getText());
					try {
						FileWriter new_warrior = null;
						new_warrior = new FileWriter("characters.txt", true);
						new_warrior.write(test_orc.nickname);
						new_warrior.write(" - Orc ");
						new_warrior.write(test_orc.race_class);
						new_warrior.write("\n");
						new_warrior.close();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ test_orc.nickname + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					Orc_Mage test_orc = new Orc_Mage(NameField.getText(),
							lblShowWeapon.getText(), lblShowArmor.getText(),
							lblShowSkills.getText());
					try {
						FileWriter new_mage = null;
						new_mage = new FileWriter("characters.txt", true);
						new_mage.write(test_orc.nickname);
						new_mage.write(" - Orc ");
						new_mage.write(test_orc.race_class);
						new_mage.write("\n");
						new_mage.close();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ test_orc.nickname + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					Orc_Ranger test_orc = new Orc_Ranger(NameField.getText(),
							lblShowWeapon.getText(), lblShowArmor.getText(),
							lblShowSkills.getText());
					try {
						FileWriter new_ranger = null;
						new_ranger = new FileWriter("characters.txt", true);
						new_ranger.write(test_orc.nickname);
						new_ranger.write(" - Orc ");
						new_ranger.write(test_orc.race_class);
						new_ranger.write("\n");
						new_ranger.close();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ test_orc.nickname + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
				} else if (btnOrcWarrior.getBackground() != Color.GREEN
						&& btnOrcMage.getBackground() != Color.GREEN
						&& btnOrcRanger.getBackground() != Color.GREEN) {
					lblShowWeapon.setText("Error");
					lblClass.setText("ERROR");
				}
				btnOrcWarrior.setVisible(false);
				btnOrcMage.setVisible(false);
				btnOrcRanger.setVisible(false);
				lblClass.setVisible(false);
				lblWeapon.setVisible(false);
				lblSelectedWeapon.setVisible(false);
				btnWeaponPrev.setVisible(false);
				btnWeaponNext.setVisible(false);
				btnArmorPrev.setVisible(false);
				btnArmorNext.setVisible(false);
				btnSkillsPrev.setVisible(false);
				btnSkillsNext.setVisible(false);
				lblArmor.setVisible(false);
				lblSkills.setVisible(false);
				lblShowWeapon.setVisible(false);
				Back_button.setVisible(false);
				lblName.setVisible(false);
				NameField.setVisible(false);
				btnCreate.setVisible(false);
			}
		});
		btnCreate.setBounds(1068, 817, 183, 75);
		add(btnCreate);

		// ----------------------------------------------------------------------------------------------------------
		// BACK_BUTTON I NICKNAME
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnOrcWarrior.setVisible(false);
				btnOrcMage.setVisible(false);
				btnOrcRanger.setVisible(false);
				lblClass.setVisible(false);
				lblWeapon.setVisible(false);
				lblSelectedWeapon.setVisible(false);
				btnWeaponPrev.setVisible(false);
				btnWeaponNext.setVisible(false);
				btnArmorPrev.setVisible(false);
				btnArmorNext.setVisible(false);
				btnSkillsPrev.setVisible(false);
				btnSkillsNext.setVisible(false);
				lblArmor.setVisible(false);
				lblSkills.setVisible(false);
				lblShowWeapon.setVisible(false);
				Back_button.setVisible(false);
				lblName.setVisible(false);
				NameField.setVisible(false);
				btnCreate.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
			}
		});
		Back_button.setBounds(1068, 916, 183, 62);

		add(Main_Menu_Penel_object);
		add(Back_button);

		NameField.setText("");
		NameField.setBounds(671, 858, 167, 34);
		add(NameField);
		NameField.setColumns(10);

		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(607, 860, 70, 24);
		add(lblName);

		// ----------------------------------------------------------------------------------------------------------
		// BUTTONY KLAS
		btnOrcWarrior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnOrcWarrior.setBackground(Color.GREEN);
				btnOrcMage.setBackground(Color.LIGHT_GRAY);
				btnOrcRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Warrior");
				lblSelectedWeapon.setText("Sword");
				lblSelectedArmor.setText("Plate");
				lblSelectedSkills.setText("Exori");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		btnOrcWarrior.setBounds(21, 308, 81, 62);
		add(btnOrcWarrior);

		btnOrcMage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Def.gif")));
				
				btnOrcMage.setBackground(Color.GREEN);
				btnOrcWarrior.setBackground(Color.LIGHT_GRAY);
				btnOrcRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Mage");
				lblSelectedWeapon.setText("Default Weapon");
				lblSelectedArmor.setText("Default Armor");
				lblSelectedSkills.setText("Default Skill");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		btnOrcMage.setBounds(112, 308, 81, 62);
		add(btnOrcMage);

		btnOrcRanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Def.gif")));
				
				btnOrcRanger.setBackground(Color.GREEN);
				btnOrcWarrior.setBackground(Color.LIGHT_GRAY);
				btnOrcMage.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Ranger");
				lblSelectedWeapon.setText("Default Weapon");
				lblSelectedArmor.setText("Default Armor");
				lblSelectedSkills.setText("Default Skill");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
				
			}
		});
		btnOrcRanger.setBounds(203, 308, 83, 62);
		add(btnOrcRanger);

		// ----------------------------------------------------------------------------------------------------------
		// POKAZYWANIE POSTACI
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setBounds(999, 24, 271, 34);
		add(lblClass);

		lblShowWeapon.setForeground(Color.WHITE);
		lblShowWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWeapon.setBounds(999, 83, 271, 38);
		add(lblShowWeapon);

		lblShowArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowArmor.setForeground(Color.WHITE);
		lblShowArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowArmor.setBounds(999, 125, 271, 38);
		add(lblShowArmor);

		lblShowSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowSkills.setForeground(Color.WHITE);
		lblShowSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowSkills.setBounds(999, 158, 271, 38);
		add(lblShowSkills);

		// ----------------------------------------------------------------------------------------------------------
		// WEAPON
		lblWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setBounds(112, 414, 93, 24);
		add(lblWeapon);

		lblSelectedWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedWeapon.setForeground(Color.WHITE);
		lblSelectedWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedWeapon.setBounds(63, 449, 183, 24);
		add(lblSelectedWeapon);

		btnWeaponPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (btnOrcWarrior.getBackground() == Color.GREEN) {
						
					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Sword");
					}else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Sword");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
			//--------------------------------------------------------------------------------------Mage Gifs
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Def.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Def.gif")));
					}else if(lblShowWeapon.getText().equals("Wand") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Wand") && lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Robe.gif")));
					}
					else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Robe.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Cape.gif")));
					}
					else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Cape.gif")));
					}else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Cape.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Coat.gif")));
					}
					else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Coat.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Coat.gif")));
					}else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Coat.gif")));
					}
					
					//---------------------------------------------------------Mage Gifs END
					
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Wand");
					}else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Staff");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					//-----------------------------------------------------------------------Ranger Gifs
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Def.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Def.gif")));
					}else if(lblShowWeapon.getText().equals("Bow") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Bow") && lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Paladin.gif")));
					}
					else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Paladin.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Master.gif")));
					}
					else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Master.gif")));
					}else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Master.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Yalahar.gif")));
					}
					else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Yalahar.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Yalahar.gif")));
					}else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Yalahar.gif")));
					}
					
					//---------------------------------------------------------------------------------------------------------------Ranger Gif END
					
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Crossbow");
					}else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponPrev.setBackground(Color.ORANGE);
		btnWeaponPrev.setBounds(8, 450, 45, 23);
		add(btnWeaponPrev);

		btnWeaponNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Sword");
					}else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Sword");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
		//-------------------------------------------------------------------------------------------------------------------Mage - GIFS
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Def.gif")));
					} else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Def.gif")));
					}else if(lblShowWeapon.getText().equals("Wand") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Rod") && lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Robe.gif")));
					}
					else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Robe.gif")));
					} else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Cape.gif")));
					}
					else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Cape.gif")));
					}else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Cape.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Coat.gif")));
					}
					else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Coat.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Coat.gif")));
					}else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Coat.gif")));
					}
					
				//-------------------------------------------------------------------------------------------------------------Mage - Gifs END
					
				
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Wand");
					}else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Wand");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					
				//--------------------------------------------------------------------------------------------------------Ranger Gifs 
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Def.gif")));
					} else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Def.gif")));
					}else if(lblShowWeapon.getText().equals("Bow") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Def.gif")));
					}
					else if(lblShowWeapon.getText().equals("Crossbow") && lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Paladin.gif")));
					}
					else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Paladin.gif")));
					} else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Master.gif")));
					}
					else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Master.gif")));
					}else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Master.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Yalahar.gif")));
					}
					else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Yalahar.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Yalahar.gif")));
					}else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Yalahar.gif")));
					}
					//-----------------------------------------------------------------------------------------------------Ranger Gifs END
					
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Crossbow");
					}else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponNext.setBackground(Color.ORANGE);
		btnWeaponNext.setBounds(256, 450, 45, 23);
		add(btnWeaponNext);

		// ----------------------------------------------------------------------------------------------------------
		// ARMOR
		lblArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArmor.setForeground(Color.WHITE);
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setBounds(111, 484, 94, 38);
		add(lblArmor);

		lblSelectedArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedArmor.setForeground(Color.WHITE);
		lblSelectedArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedArmor.setBounds(63, 518, 183, 24);
		add(lblSelectedArmor);

		btnArmorPrev.setBackground(Color.ORANGE);
		btnArmorPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Plate");
					}else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Plate");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					
		//----------------------------------------------------------------------------------------------Mage-Gifs
					
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Coat.gif")));
					}
					else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Coat.gif")));
					}else if(lblShowWeapon.getText().equals("Wand") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Coat.gif")));
					}
					else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Coat.gif")));
					}if(lblShowWeapon.getText().equals("Staff") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Coat.gif")));
					}
					else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Coat.gif")));
					}if(lblShowWeapon.getText().equals("Rod") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Coat.gif")));
					}
					else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Coat.gif")));
					}
		//---------------------------------------------------------------------------------------------------------------------Mage Gifs END
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Robe");
					}else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Coat");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Paladin.gif")));
					}
					else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Yalahar.gif")));
					}else if(lblShowWeapon.getText().equals("Bow") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Yalahar.gif")));
					}
					else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Yalahar.gif")));
					}if(lblShowWeapon.getText().equals("Spear") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Yalahar.gif")));
					}
					else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Yalahar.gif")));
					}if(lblShowWeapon.getText().equals("Crossbow") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Yalahar.gif")));
					}
					else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Master Archer's"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Yalahar.gif")));
					}
					
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Paladin");
					}else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorPrev.setBounds(8, 521, 45, 23);
		add(btnArmorPrev);

		btnArmorNext.setBackground(Color.ORANGE);
		btnArmorNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Plate");
					}else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Plate");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
				//---------------------------------------------------------------------------------Mage Gifs
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Robe.gif")));
					}
					else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Coat.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Robe.gif")));
					}else if(lblShowWeapon.getText().equals("Wand") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Robe.gif")));
					}
					else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Coat.gif")));
					}else if(lblShowWeapon.getText().equals("Wand")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Wand-Robe.gif")));
					}if(lblShowWeapon.getText().equals("Staff") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Robe.gif")));
					}
					else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Coat.gif")));
					}else if(lblShowWeapon.getText().equals("Staff")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Staff-Robe.gif")));
					}if(lblShowWeapon.getText().equals("Rod") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Robe.gif")));
					}
					else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Robe"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Cape.gif")));
					} else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Cape"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Coat.gif")));
					}else if(lblShowWeapon.getText().equals("Rod")&& lblShowArmor.getText().equals("Coat"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Rod-Robe.gif")));
					}
				//---------------------------------------------------------------------------------------------------Mage Gifs END
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Robe");
					}else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Robe");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					
					if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Paladin.gif")));
					}
					else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Master"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Yalahar.gif")));
					}else if(lblShowWeapon.getText().equals("Default Weapon")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Def-Paladin.gif")));
					}else if(lblShowWeapon.getText().equals("Bow") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Paladin.gif")));
					}
					else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Master"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Yalahar.gif")));
					}else if(lblShowWeapon.getText().equals("Bow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Bow-Paladin.gif")));
					}if(lblShowWeapon.getText().equals("Spear") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Paladin.gif")));
					}
					else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Master"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Yalahar.gif")));
					}else if(lblShowWeapon.getText().equals("Spear")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Spear-Paladin.gif")));
					}if(lblShowWeapon.getText().equals("Crossbow") && lblShowArmor.getText().equals("Default Armor"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Paladin.gif")));
					}
					else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Paladin"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Master.gif")));
					} else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Master"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Yalahar.gif")));
					}else if(lblShowWeapon.getText().equals("Crossbow")&& lblShowArmor.getText().equals("Yalahar"))
					{
						lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-Crossbow-Paladin.gif")));
					}
					
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Paladin");
					}else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorNext.setBounds(256, 521, 45, 23);
		add(btnArmorNext);

		// ----------------------------------------------------------------------------------------------------------
		// SKILL
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSkills.setBounds(112, 553, 94, 24);
		add(lblSkills);

		lblSelectedSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedSkills.setForeground(Color.WHITE);
		lblSelectedSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedSkills.setBounds(63, 585, 183, 24);
		add(lblSelectedSkills);

		btnSkillsPrev.setBackground(Color.ORANGE);
		btnSkillsPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exori") {
						lblSelectedSkills.setText("Exori Gran");
					} else if (lblSelectedSkills.getText() == "Exori Gran") {
						lblSelectedSkills.setText("Exori Gran Ico");
					} else if (lblSelectedSkills.getText() == "Exori Gran Ico") {
						lblSelectedSkills.setText("Exori");
					}else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Exori");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Gran Mas Vis") {
						lblSelectedSkills.setText("Exori Frigo");
					} else if (lblSelectedSkills.getText() == "Exori Frigo") {
						lblSelectedSkills.setText("Utori Flam");
					} else if (lblSelectedSkills.getText() == "Utori Flam") {
						lblSelectedSkills.setText("Exevo Gran Mas Vis");
					}else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Exevo Gran Mas Vis");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Mas San") {
						lblSelectedSkills.setText("Exori Con");
					} else if (lblSelectedSkills.getText() == "Exori Con") {
						lblSelectedSkills.setText("Utito Tempo San");
					} else if (lblSelectedSkills.getText() == "Utito Tempo San") {
						lblSelectedSkills.setText("Exevo Mas San");
					}else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Exevo Mas San");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
			}
		});

		btnSkillsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exori") {
						lblSelectedSkills.setText("Exori Gran Ico");
					} else if (lblSelectedSkills.getText() == "Exori Gran Ico") {
						lblSelectedSkills.setText("Exori Gran");
					} else if (lblSelectedSkills.getText() == "Exori Gran") {
						lblSelectedSkills.setText("Exori");
					}else if (lblSelectedSkills.getText() == "Exori Gran Ico") {
						lblSelectedSkills.setText("Exori");
					}else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Exori");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Gran Mas Vis") {
						lblSelectedSkills.setText("Utori Flam");
					} else if (lblSelectedSkills.getText() == "Utori Flam") {
						lblSelectedSkills.setText("Exori Frigo");
					} else if (lblSelectedSkills.getText() == "Exori Frigo") {
						lblSelectedSkills.setText("Exevo Gran Mas Vis");
					}else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Exevo Gran Mas Vis");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Mas San") {
						lblSelectedSkills.setText("Utito Tempo San");
					} else if (lblSelectedSkills.getText() == "Utito Tempo San") {
						lblSelectedSkills.setText("Exori Con");
					} else if (lblSelectedSkills.getText() == "Exori Con") {
						lblSelectedSkills.setText("Exevo Mas San");
					}else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Exevo Mas San");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
			}
		});

		btnSkillsPrev.setBounds(8, 588, 45, 23);
		add(btnSkillsPrev);

		btnSkillsNext.setBackground(Color.ORANGE);
		btnSkillsNext.setBounds(256, 588, 45, 23);
		add(btnSkillsNext);
		
		
		
		
		if(lblShowWeapon.getText().equals("Default Weapon") && lblShowArmor.getText().equals("Default Armor"))
		{
			lblShowCharacter.setIcon(new ImageIcon(New_Orc_Panel.class.getResource("/create/characters/img/BloodElf-Mage/BloodElf-Def-Def.gif")));
		}
		
		lblShowCharacter.setHorizontalAlignment(SwingConstants.LEFT);
		lblShowCharacter.setBounds(0, 0, 1270, 1013);
		add(lblShowCharacter);

		add(super.background_label);
	}
}
