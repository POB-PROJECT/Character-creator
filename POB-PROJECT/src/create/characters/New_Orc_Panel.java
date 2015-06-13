package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class New_Orc_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public New_Orc_Panel() {
		// ----------------------------------------------------------------------------------------------------------
		// OBJECTS
		JButton btnOrcWarrior = new JButton("");
		btnOrcWarrior.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/warrior_icon.png")));
		btnOrcWarrior.setBackground(Color.LIGHT_GRAY);
		JButton btnOrcMage = new JButton("");
		btnOrcMage.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/priest_icon.png")));
		btnOrcMage.setBackground(Color.LIGHT_GRAY);
		JButton btnOrcRanger = new JButton("");
		btnOrcRanger.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/hunter_icon.png")));
		btnOrcRanger.setBackground(Color.LIGHT_GRAY);
		JLabel lblClass = new JLabel("Default Class");
		lblClass.setVisible(false);
		lblClass.setForeground(Color.WHITE);
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JLabel lblName = new JLabel("");
		lblName.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/name.png")));
		JTextField NameField = new JTextField();
		NameField.setFont(new Font("LifeCraft", Font.PLAIN, 20));
		NameField.setBackground(Color.BLACK);
		NameField.setForeground(Color.WHITE);
		JButton btnCreate = new JButton("");
		btnCreate.setOpaque(false);
		btnCreate.setPreferredSize(new Dimension(30, 7));
		btnCreate
				.setIcon(new ImageIcon(
						New_Orc_Panel.class
								.getResource("/create/characters/img/Buttons/Create_small_off.png")));
		JButton Back_button = new JButton("");
		Back_button
				.setIcon(new ImageIcon(
						New_Orc_Panel.class
								.getResource("/create/characters/img/Buttons/Return_small_off.png")));
		// ------------------------------------------------ Weapon
		JLabel lblWeapon = new JLabel("Weapon");
		JLabel lblSelectedWeapon = new JLabel("None");
		JButton btnWeaponPrev = new JButton("");
		btnWeaponPrev.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/strzalka-lewo.png")));
		JButton btnWeaponNext = new JButton("");
		btnWeaponNext.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/strzalka-prawo.png")));
		JLabel lblShowWeapon = new JLabel("Default Weapon");
		lblShowWeapon.setVisible(false);
		lblShowWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Armor
		JLabel lblArmor = new JLabel("Armor");
		JLabel lblSelectedArmor = new JLabel("None");
		JButton btnArmorPrev = new JButton("");
		btnArmorPrev.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/strzalka-lewo.png")));
		JButton btnArmorNext = new JButton("");
		btnArmorNext.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/strzalka-prawo.png")));
		JLabel lblShowArmor = new JLabel("Default Armor");
		lblShowArmor.setVisible(false);
		lblShowArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Skill
		JLabel lblSkills = new JLabel("Skills");
		JLabel lblSelectedSkills = new JLabel("None");
		JButton btnSkillsPrev = new JButton("");
		btnSkillsPrev.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/strzalka-lewo.png")));
		JButton btnSkillsNext = new JButton("");
		btnSkillsNext.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/strzalka-prawo.png")));
		JLabel lblShowSkills = new JLabel("Default Skill");
		lblShowSkills.setVisible(false);
		lblShowSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JLabel lblShowCharacter = new JLabel("");
		JLabel lblShowSkillsIcon = new JLabel("");
		lblShowSkillsIcon.setIcon(null);

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
		btnCreate.setBounds(922, 731, 335, 90);
		btnCreate.setBorderPainted(false);
		btnCreate.setContentAreaFilled(false);
		btnCreate.setFocusPainted(false);
		add(btnCreate);

		// ----------------------------------------------------------------------------------------------------------
		// BACK_BUTTON & NICKNAME
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

		Back_button.setBounds(922, 832, 335, 90);
		Back_button.setBorderPainted(false);
		Back_button.setContentAreaFilled(false);
		Back_button.setFocusPainted(false);
		Back_button.setOpaque(false);

		add(Main_Menu_Penel_object);
		add(Back_button);

		NameField.setOpaque(false);
		NameField.setText("");
		NameField.setBounds(621, 864, 214, 34);
		add(NameField);
		NameField.setColumns(10);

		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(545, 789, 371, 149);
		add(lblName);

		// ----------------------------------------------------------------------------------------------------------
		// CLASS BUTTONS
		btnOrcWarrior.setBorderPainted(false);
		btnOrcWarrior.setContentAreaFilled(false);
		btnOrcWarrior.setFocusPainted(false);
		btnOrcWarrior.setOpaque(false);
		btnOrcWarrior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblShowSkillsIcon.setIcon(null);
				lblShowCharacter.setIcon(new ImageIcon(
						New_Orc_Panel.class
								.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Def.gif")));
				btnOrcWarrior.setBackground(Color.GREEN);
				btnOrcMage.setBackground(Color.LIGHT_GRAY);
				btnOrcRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Warrior");
				lblSelectedWeapon.setText("Default Weapon");
				lblSelectedArmor.setText("Default Armor");
				lblSelectedSkills.setText("Default Skill");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		btnOrcWarrior.setBounds(20, 189, 132, 158);
		add(btnOrcWarrior);
		btnOrcMage.setBorderPainted(false);
		btnOrcMage.setContentAreaFilled(false);
		btnOrcMage.setFocusPainted(false);
		btnOrcMage.setOpaque(false);
		btnOrcMage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShowSkillsIcon.setIcon(null);
				lblShowCharacter.setIcon(new ImageIcon(
						New_Orc_Panel.class
								.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Def.gif")));
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
		btnOrcMage.setBounds(142, 189, 132, 158);
		add(btnOrcMage);
		btnOrcRanger.setBorderPainted(false);
		btnOrcRanger.setContentAreaFilled(false);
		btnOrcRanger.setFocusPainted(false);
		btnOrcRanger.setOpaque(false);
		btnOrcRanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShowSkillsIcon.setIcon(null);
				lblShowCharacter.setIcon(new ImageIcon(
						New_Orc_Panel.class
								.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Def.gif")));
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
		btnOrcRanger.setBounds(264, 189, 132, 158);
		add(btnOrcRanger);

		// ----------------------------------------------------------------------------------------------------------
		// SHOW INFO
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
		lblWeapon.setFont(new Font("LifeCraft", Font.BOLD, 30));
		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setBounds(39, 346, 332, 37);
		add(lblWeapon);

		lblSelectedWeapon.setFont(new Font("LifeCraft", Font.PLAIN, 20));
		lblSelectedWeapon.setForeground(Color.WHITE);
		lblSelectedWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedWeapon.setBounds(39, 394, 332, 38);
		add(lblSelectedWeapon);
		// ----------------------------------------------------------------------------------------------------------
		// BTN WEAPON PREV
		btnWeaponPrev.setBorderPainted(false);
		btnWeaponPrev.setContentAreaFilled(false);
		btnWeaponPrev.setFocusPainted(false);
		btnWeaponPrev.setOpaque(false);
		btnWeaponPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Dark.gif")));
					}
					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Sword");
					} else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Axe");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Coat.gif")));
					}

					// ------------------------------------------------------------------------------------------
					// GIFS MAGE END

					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Wand");
					} else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Staff");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Yalahar.gif")));
					}

					// ------------------------------------------------------------------------------------------
					// GIFS RANGER END

					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Crossbow");
					} else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponPrev.setBackground(Color.LIGHT_GRAY);
		btnWeaponPrev.setBounds(39, 370, 59, 70);
		add(btnWeaponPrev);
		// ----------------------------------------------------------------------------------------------------------
		// BTN WEAPON NEXT
		btnWeaponNext.setBorderPainted(false);
		btnWeaponNext.setContentAreaFilled(false);
		btnWeaponNext.setFocusPainted(false);
		btnWeaponNext.setOpaque(false);
		btnWeaponNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR
					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Dark.gif")));
					}
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR END
					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Sword");
					} else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Sword");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
				} else if (btnOrcMage.getBackground() == Color.GREEN) {

					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Coat.gif")));
					}

					// ------------------------------------------------------------------------------------------
					// GIFS MAGE END

					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Wand");
					} else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Wand");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {

					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Def.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Yalahar.gif")));
					}
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER END

					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Crossbow");
					} else if (lblSelectedWeapon.getText() == "Default Weapon") {
						lblSelectedWeapon.setText("Bow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponNext.setBackground(Color.ORANGE);
		btnWeaponNext.setBounds(306, 372, 65, 67);
		add(btnWeaponNext);

		// ------------------------------------------------------------------------------------------
		// ARMOR
		lblArmor.setFont(new Font("LifeCraft", Font.BOLD, 30));
		lblArmor.setForeground(Color.WHITE);
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setBounds(39, 451, 332, 38);
		add(lblArmor);

		lblSelectedArmor.setFont(new Font("LifeCraft", Font.PLAIN, 20));
		lblSelectedArmor.setForeground(Color.WHITE);
		lblSelectedArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedArmor.setBounds(39, 500, 332, 40);
		add(lblSelectedArmor);
		// ----------------------------------------------------------------------------------------------------------
		// BTN ARMOR PREV
		btnArmorPrev.setBackground(Color.ORANGE);
		btnArmorPrev.setBorderPainted(false);
		btnArmorPrev.setContentAreaFilled(false);
		btnArmorPrev.setFocusPainted(false);
		btnArmorPrev.setOpaque(false);
		btnArmorPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ------------------------------------------------------------------------------------------
				// GIFS WARRIOR
				if (btnOrcWarrior.getBackground() == Color.GREEN) {

					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Dark.gif")));
					}
					if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Dark.gif")));
					}
					if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Dark.gif")));
					}

					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Plate");
					} else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Dark");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {

					// ------------------------------------------------------------------------------------------
					// GIFS MAGE

					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Coat.gif")));
					}
					if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Coat.gif")));
					}
					if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Coat.gif")));
					}
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Robe");
					} else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Coat");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {

					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Yalahar.gif")));
					}
					if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Yalahar.gif")));
					}
					if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Yalahar.gif")));
					}
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER END
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Paladin");
					} else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Yalahar");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorPrev.setBounds(39, 470, 59, 89);
		add(btnArmorPrev);
		// ----------------------------------------------------------------------------------------------------------
		// BTN ARMOR NEXT
		btnArmorNext.setBackground(Color.ORANGE);
		btnArmorNext.setBorderPainted(false);
		btnArmorNext.setContentAreaFilled(false);
		btnArmorNext.setFocusPainted(false);
		btnArmorNext.setOpaque(false);
		btnArmorNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ------------------------------------------------------------------------------------------
				// GIFS WARRIOR
				if (btnOrcWarrior.getBackground() == Color.GREEN) {

					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Sword")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Sword-Plate.gif")));
					}
					if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Axe")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Axe-Plate.gif")));
					}
					if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Plate.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Plate")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Golden.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Golden")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Dark.gif")));
					} else if (lblShowWeapon.getText().equals("Club")
							&& lblShowArmor.getText().equals("Dark")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Warrior/Orc-Club-Plate.gif")));
					}
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR END
					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Plate");
					} else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Plate");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
				} else if (btnOrcMage.getBackground() == Color.GREEN) {

					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Def-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Wand")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Wand-Robe.gif")));
					}
					if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Staff")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Staff-Robe.gif")));
					}
					if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Robe.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Robe")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Cape.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Cape")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Coat.gif")));
					} else if (lblShowWeapon.getText().equals("Rod")
							&& lblShowArmor.getText().equals("Coat")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Mage/Orc-Rod-Robe.gif")));
					}
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE END
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Robe");
					} else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Robe");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {

					if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Master")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Default Weapon")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Def-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Bow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Bow-Paladin.gif")));
					}
					if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Spear")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Spear-Paladin.gif")));
					}
					if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Default Armor")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Paladin.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Paladin")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Master.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Master Archer's")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Yalahar.gif")));
					} else if (lblShowWeapon.getText().equals("Crossbow")
							&& lblShowArmor.getText().equals("Yalahar")) {
						lblShowCharacter.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Orc-Ranger/Orc-Crossbow-Paladin.gif")));
					}
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER END
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Paladin");
					} else if (lblSelectedArmor.getText() == "Default Armor") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorNext.setBounds(306, 470, 65, 89);
		add(btnArmorNext);

		// ----------------------------------------------------------------------------------------------------------
		// SKILLS
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("LifeCraft", Font.BOLD, 30));
		lblSkills.setBounds(39, 551, 332, 40);
		add(lblSkills);

		lblSelectedSkills.setFont(new Font("LifeCraft", Font.PLAIN, 20));
		lblSelectedSkills.setForeground(Color.WHITE);
		lblSelectedSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedSkills.setBounds(39, 598, 332, 38);
		add(lblSelectedSkills);
		// ----------------------------------------------------------------------------------------------------------
		// BTN SKILLS PREV
		btnSkillsPrev.setBackground(Color.ORANGE);
		btnSkillsPrev.setBorderPainted(false);
		btnSkillsPrev.setContentAreaFilled(false);
		btnSkillsPrev.setFocusPainted(false);
		btnSkillsPrev.setOpaque(false);
		btnSkillsPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnOrcWarrior.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR
					if (lblSelectedSkills.getText() == "Brutal Shot") {
						lblSelectedSkills.setText("Berserker Rage");
					} else if (lblSelectedSkills.getText() == "Berserker Rage") {
						lblSelectedSkills.setText("Gains");
					} else if (lblSelectedSkills.getText() == "Gains") {
						lblSelectedSkills.setText("Brutal Shot");
					} else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Brutal Shot");
					}

					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Brutal Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/WARRIOR_Brutal_Shot.png")));
					} else if (lblShowSkills.getText().equals("Berserker Rage")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/WARRIOR_Berserker_Rage.png")));
					} else if (lblShowSkills.getText().equals("Gains")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/WARRIOR_Gains.png")));
					}

				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedSkills.getText() == "Eye Of The Storm") {
						lblSelectedSkills.setText("Fire Breathe");
					} else if (lblSelectedSkills.getText() == "Fire Breathe") {
						lblSelectedSkills.setText("Shadow Form");
					} else if (lblSelectedSkills.getText() == "Shadow Form") {
						lblSelectedSkills.setText("Eye Of The Storm");
					} else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Eye Of The Storm");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Eye Of The Storm")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/MAGE_Eye_Of_The_Storm.png")));
					} else if (lblShowSkills.getText().equals("Fire Breathe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/MAGE_Fire_Breathe.png")));
					} else if (lblShowSkills.getText().equals("Shadow Form")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/MAGE_Shadow_Form.png")));
					}
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblSelectedSkills.getText() == "Power Shot") {
						lblSelectedSkills.setText("Strafe");
					} else if (lblSelectedSkills.getText() == "Strafe") {
						lblSelectedSkills.setText("Freeze");
					} else if (lblSelectedSkills.getText() == "Freeze") {
						lblSelectedSkills.setText("Power Shot");
					} else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Power Shot");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Power Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/RANGER_Power_Shot.png")));
					} else if (lblShowSkills.getText().equals("Strafe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/RANGER_Strafe.png")));
					} else if (lblShowSkills.getText().equals("Freeze")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/RANGER_Freeze.png")));
					} 
				}
			}
		});
		btnSkillsPrev.setBounds(39, 566, 59, 78);
		add(btnSkillsPrev);
		// ----------------------------------------------------------------------------------------------------------
		// BTN SKILLS NEXT
		btnSkillsNext.setBorderPainted(false);
		btnSkillsNext.setContentAreaFilled(false);
		btnSkillsNext.setFocusPainted(false);
		btnSkillsNext.setOpaque(false);
		btnSkillsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnOrcWarrior.getBackground() == Color.GREEN) {

					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR
					if (lblSelectedSkills.getText() == "Brutal Shot") {
						lblSelectedSkills.setText("Gains");
					} else if (lblSelectedSkills.getText() == "Gains") {
						lblSelectedSkills.setText("Berserker Rage");
					} else if (lblSelectedSkills.getText() == "Berserker Rage") {
						lblSelectedSkills.setText("Brutal Shot");
					} else if (lblSelectedSkills.getText() == "Gains") {
						lblSelectedSkills.setText("Brutal Shot");
					} else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Brutal Shot");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Brutal Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/WARRIOR_Brutal_Shot.png")));
					} else if (lblShowSkills.getText().equals("Berserker Rage")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/WARRIOR_Berserker_Rage.png")));
					} else if (lblShowSkills.getText().equals("Gains")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/WARRIOR_Gains.png")));
					}
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedSkills.getText() == "Eye Of The Storm") {
						lblSelectedSkills.setText("Shadow Form");
					} else if (lblSelectedSkills.getText() == "Shadow Form") {
						lblSelectedSkills.setText("Fire Breathe");
					} else if (lblSelectedSkills.getText() == "Fire Breathe") {
						lblSelectedSkills.setText("Eye Of The Storm");
					} else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Eye Of The Storm");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Eye Of The Storm")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/MAGE_Eye_Of_The_Storm.png")));
					} else if (lblShowSkills.getText().equals("Fire Breathe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/MAGE_Fire_Breathe.png")));
					} else if (lblShowSkills.getText().equals("Shadow Form")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/MAGE_Shadow_Form.png")));
					}
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS
					if (lblSelectedSkills.getText() == "Power Shot") {
						lblSelectedSkills.setText("Freeze");
					} else if (lblSelectedSkills.getText() == "Freeze") {
						lblSelectedSkills.setText("Strafe");
					} else if (lblSelectedSkills.getText() == "Strafe") {
						lblSelectedSkills.setText("Power Shot");
					} else if (lblSelectedSkills.getText() == "Default Skill") {
						lblSelectedSkills.setText("Power Shot");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Power Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/RANGER_Power_Shot.png")));
					} else if (lblShowSkills.getText().equals("Strafe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/RANGER_Strafe.png")));
					} else if (lblShowSkills.getText().equals("Freeze")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Orc_Panel.class
										.getResource("/create/characters/img/Skills/RANGER_Freeze.png")));
					}
				}
			}
		});
		btnSkillsNext.setBackground(Color.ORANGE);
		btnSkillsNext.setBounds(306, 569, 65, 67);
		add(btnSkillsNext);
		// ----------------------------------------------------------------------------------------------------------
		// DEFAULT ORC
		if (lblShowWeapon.getText().equals("Default Weapon")
				&& lblShowArmor.getText().equals("Default Armor")) {
			lblShowCharacter
					.setIcon(new ImageIcon(
							New_Orc_Panel.class
									.getResource("/create/characters/img/Orc-Warrior/Orc-Def-Def.gif")));
		}

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(New_Orc_Panel.class
				.getResource("/create/characters/img/tabela.png")));
		lblNewLabel.setBounds(10, 98, 450, 675);
		add(lblNewLabel);
		lblShowSkillsIcon.setBounds(39, 666, 393, 286);
		add(lblShowSkillsIcon);
		lblShowCharacter.setHorizontalAlignment(SwingConstants.LEFT);
		lblShowCharacter.setBounds(0, 0, 1270, 1013);
		add(lblShowCharacter);

		// add(super.background_label);
	}
}
