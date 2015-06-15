package create.characters;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;

import java.awt.Dimension;

public class New_Human_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public New_Human_Panel() {
		// ----------------------------------------------------------------------------------------------------------
		// OBJECTS
		JButton btnHumanWarrior = new JButton("");
		btnHumanWarrior.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/warrior_icon.png")));
		btnHumanWarrior.setBackground(Color.LIGHT_GRAY);
		JButton btnHumanMage = new JButton("");
		btnHumanMage.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/mage_icon.png")));
		btnHumanMage.setBackground(Color.LIGHT_GRAY);
		JButton btnHumanRanger = new JButton("");
		btnHumanRanger.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/ranger_icon.png")));
		btnHumanRanger.setBackground(Color.LIGHT_GRAY);
		JLabel lblClass = new JLabel("Default Class");
		lblClass.setVisible(false);
		lblClass.setForeground(Color.WHITE);
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JLabel lblName = new JLabel("");
		lblName.setIcon(new ImageIcon(New_Human_Panel.class
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
						New_Human_Panel.class
								.getResource("/create/characters/img/Buttons/Create_small_off.png")));
		JButton Back_button = new JButton("");
		Back_button
				.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/Buttons/Return_small_off.png")));
		JLabel lblCharacterExists = new JLabel(
				"character with this name already exists");
		lblCharacterExists.setVisible(false);

		// ------------------------------------------------ Weapon
		JLabel lblWeapon = new JLabel("Weapon");
		JLabel lblSelectedWeapon = new JLabel("None");
		JButton btnWeaponPrev = new JButton("");
		btnWeaponPrev.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/strzalka-lewo.png")));
		JButton btnWeaponNext = new JButton("");
		btnWeaponNext.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/strzalka-prawo.png")));
		JLabel lblShowWeapon = new JLabel("None");
		lblShowWeapon.setVisible(false);
		lblShowWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Armor
		JLabel lblArmor = new JLabel("Armor");
		JLabel lblSelectedArmor = new JLabel("None");
		JButton btnArmorPrev = new JButton("");
		btnArmorPrev.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/strzalka-lewo.png")));
		JButton btnArmorNext = new JButton("");
		btnArmorNext.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/strzalka-prawo.png")));
		JLabel lblShowArmor = new JLabel("None");
		lblShowArmor.setVisible(false);
		lblShowArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// ------------------------------------------------ Skill
		JLabel lblSkills = new JLabel("Skills");
		JLabel lblSelectedSkills = new JLabel("None");
		JButton btnSkillsPrev = new JButton("");
		btnSkillsPrev.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/strzalka-lewo.png")));
		JButton btnSkillsNext = new JButton("");
		btnSkillsNext.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/strzalka-prawo.png")));
		JLabel lblShowSkills = new JLabel("None");
		lblShowSkills.setVisible(false);
		lblShowSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JLabel lblShowCharacter = new JLabel("");
		JLabel lblShowSkillsIcon = new JLabel("");
		lblShowSkillsIcon.setIcon(null);

		// ----------------------------------------------------------------------------------------------------------
		// CREATE BUTTON
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (NameField.getText().equals("")) {

				} else {

					File file_exist = new File("CharactersDB\\"
							+ NameField.getText() + ".dat");
					if (file_exist.isFile())
						lblCharacterExists.setVisible(true);
					else {
						if (btnHumanWarrior.getBackground() == Color.GREEN) {
							Human_Warrior test_Human = new Human_Warrior(NameField
									.getText(), lblShowWeapon.getText(),
									lblShowArmor.getText(), lblShowSkills
											.getText());
							try {
								FileWriter new_warrior = null;
								new_warrior = new FileWriter("characters.txt",
										true);
								new_warrior.write(test_Human.nickname);
								new_warrior.write(" - BloodElf ");
								new_warrior.write(test_Human.race_class);
								new_warrior.write("\n");
								new_warrior.close();
							} catch (IOException e2) {
								e2.printStackTrace();
							}
							try {
								ObjectOutputStream nc = new ObjectOutputStream(
										new FileOutputStream("CharactersDB\\"
												+ test_Human.nickname + ".dat"));
								nc.writeObject(test_Human);
								nc.close();
							} catch (FileNotFoundException e1) {
								System.out.println("File not found");
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}

							Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
						} else if (btnHumanMage.getBackground() == Color.GREEN) {
							Human_Mage test_Human = new Human_Mage(NameField
									.getText(), lblShowWeapon.getText(),
									lblShowArmor.getText(), lblShowSkills
											.getText());
							try {
								FileWriter new_mage = null;
								new_mage = new FileWriter("characters.txt",
										true);
								new_mage.write(test_Human.nickname);
								new_mage.write(" - BloodElf ");
								new_mage.write(test_Human.race_class);
								new_mage.write("\n");
								new_mage.close();
							} catch (IOException e2) {
								e2.printStackTrace();
							}
							try {
								ObjectOutputStream nc = new ObjectOutputStream(
										new FileOutputStream("CharactersDB\\"
												+ test_Human.nickname + ".dat"));
								nc.writeObject(test_Human);
								nc.close();
							} catch (FileNotFoundException e1) {
								System.out.println("File not found");
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
						} else if (btnHumanRanger.getBackground() == Color.GREEN) {
							Human_Ranger test_Human = new Human_Ranger(NameField
									.getText(), lblShowWeapon.getText(),
									lblShowArmor.getText(), lblShowSkills
											.getText());
							try {
								FileWriter new_ranger = null;
								new_ranger = new FileWriter("characters.txt",
										true);
								new_ranger.write(test_Human.nickname);
								new_ranger.write(" - BloodElf ");
								new_ranger.write(test_Human.race_class);
								new_ranger.write("\n");
								new_ranger.close();
							} catch (IOException e2) {
								e2.printStackTrace();
							}
							try {
								ObjectOutputStream nc = new ObjectOutputStream(
										new FileOutputStream("CharactersDB\\"
												+ test_Human.nickname + ".dat"));
								nc.writeObject(test_Human);
								nc.close();
							} catch (FileNotFoundException e1) {
								System.out.println("File not found");
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
						} else if (btnHumanWarrior.getBackground() != Color.GREEN
								&& btnHumanMage.getBackground() != Color.GREEN
								&& btnHumanRanger.getBackground() != Color.GREEN) {
							lblShowWeapon.setText("Error");
							lblClass.setText("ERROR");
						}

						btnHumanWarrior.setVisible(false);
						btnHumanMage.setVisible(false);
						btnHumanRanger.setVisible(false);
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
				}
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
				btnHumanWarrior.setVisible(false);
				btnHumanMage.setVisible(false);
				btnHumanRanger.setVisible(false);
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
		btnHumanWarrior.setBorderPainted(false);
		btnHumanWarrior.setContentAreaFilled(false);
		btnHumanWarrior.setFocusPainted(false);
		btnHumanWarrior.setOpaque(false);
		btnHumanWarrior.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHumanWarrior.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/warrior_icon_on.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {

				if ((btnHumanWarrior.getBackground() != Color.GREEN))
					btnHumanWarrior.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/warrior_icon.png")));
			}
		});
		btnHumanWarrior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblShowSkillsIcon.setIcon(null);
				lblShowCharacter.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-None-None.gif")));
				btnHumanWarrior.setBackground(Color.GREEN);
				btnHumanMage.setBackground(Color.LIGHT_GRAY);
				btnHumanRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Warrior");
				lblSelectedWeapon.setText("None");
				lblSelectedArmor.setText("None");
				lblSelectedSkills.setText("None");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
				btnHumanWarrior.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/warrior_icon_on.png")));
				btnHumanMage.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/mage_icon.png")));
				btnHumanRanger.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/ranger_icon.png")));
			}
		});
		btnHumanWarrior.setBounds(20, 189, 132, 158);
		add(btnHumanWarrior);
		btnHumanMage.setBorderPainted(false);
		btnHumanMage.setContentAreaFilled(false);
		btnHumanMage.setFocusPainted(false);
		btnHumanMage.setOpaque(false);
		btnHumanMage.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHumanMage.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/mage_icon_on.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {

				if ((btnHumanMage.getBackground() != Color.GREEN))
					btnHumanMage.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/mage_icon.png")));
			}
		});
		btnHumanMage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShowSkillsIcon.setIcon(null);
				lblShowCharacter.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-None-None.gif")));
				btnHumanMage.setBackground(Color.GREEN);
				btnHumanWarrior.setBackground(Color.LIGHT_GRAY);
				btnHumanRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Mage");
				lblSelectedWeapon.setText("None");
				lblSelectedArmor.setText("None");
				lblSelectedSkills.setText("None");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
				btnHumanWarrior.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/warrior_icon.png")));
				btnHumanMage.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/mage_icon_on.png")));
				btnHumanRanger.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/ranger_icon.png")));
			}
		});
		btnHumanMage.setBounds(142, 189, 132, 158);
		add(btnHumanMage);
		btnHumanRanger.setBorderPainted(false);
		btnHumanRanger.setContentAreaFilled(false);
		btnHumanRanger.setFocusPainted(false);
		btnHumanRanger.setOpaque(false);
		btnHumanRanger.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHumanRanger.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/ranger_icon_on.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {

				if ((btnHumanRanger.getBackground() != Color.GREEN))
					btnHumanRanger.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/ranger_icon.png")));
			}
		});
		btnHumanRanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShowSkillsIcon.setIcon(null);
				lblShowCharacter.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-None-None.gif")));
				btnHumanRanger.setBackground(Color.GREEN);
				btnHumanWarrior.setBackground(Color.LIGHT_GRAY);
				btnHumanMage.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Ranger");
				lblSelectedWeapon.setText("None");
				lblSelectedArmor.setText("None");
				lblSelectedSkills.setText("None");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
				btnHumanWarrior.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/warrior_icon.png")));
				btnHumanMage.setIcon(new ImageIcon(New_Human_Panel.class
						.getResource("/create/characters/img/mage_icon.png")));
				btnHumanRanger.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/ranger_icon_on.png")));

			}
		});
		btnHumanRanger.setBounds(264, 189, 132, 158);
		add(btnHumanRanger);

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
		btnWeaponPrev.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnWeaponPrev.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-lewoON.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnWeaponPrev.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-lewo.png")));
			}
		});
		btnWeaponPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Sword");
					} else if (lblSelectedWeapon.getText() == "None") {
						lblSelectedWeapon.setText("Axe");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
				} else if (btnHumanMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Wand");
					} else if (lblSelectedWeapon.getText() == "None") {
						lblSelectedWeapon.setText("Staff");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
					lblShowCharacter.setIcon(new ImageIcon(New_Human_Panel.class
							.getResource("/create/characters/img/BloodElf-Mage/BloodElf-"
									+ lblSelectedWeapon.getText() + "-"
									+ lblSelectedArmor.getText() + ".gif")));
				} else if (btnHumanRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Crossbow");
					} else if (lblSelectedWeapon.getText() == "None") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
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
		btnWeaponNext.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnWeaponNext.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-prawoON.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnWeaponNext.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-prawo.png")));
			}
		});
		btnWeaponNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR

					if (lblSelectedWeapon.getText() == "Sword") {
						lblSelectedWeapon.setText("Club");
					} else if (lblSelectedWeapon.getText() == "Club") {
						lblSelectedWeapon.setText("Axe");
					} else if (lblSelectedWeapon.getText() == "Axe") {
						lblSelectedWeapon.setText("Sword");
					} else if (lblSelectedWeapon.getText() == "None") {
						lblSelectedWeapon.setText("Sword");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
				} else if (btnHumanMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Wand");
					} else if (lblSelectedWeapon.getText() == "None") {
						lblSelectedWeapon.setText("Wand");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
					lblShowCharacter.setIcon(new ImageIcon(New_Human_Panel.class
							.getResource("/create/characters/img/BloodElf-Mage/BloodElf-"
									+ lblSelectedWeapon.getText() + "-"
									+ lblSelectedArmor.getText() + ".gif")));
				} else if (btnHumanRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Crossbow");
					} else if (lblSelectedWeapon.getText() == "None") {
						lblSelectedWeapon.setText("Bow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());


					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
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
		btnArmorPrev.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnArmorPrev.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-lewoON.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnArmorPrev.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-lewo.png")));
			}
		});
		btnArmorPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR
					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Plate");
					} else if (lblSelectedArmor.getText() == "None") {
						lblSelectedArmor.setText("Dark");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					if (lblSelectedArmor.getText().equals("None")) {
						lblSelectedArmor.setText("None");
					}
					if (lblSelectedArmor.getText().equals("None")) {
						lblSelectedArmor.setText("None");
					}
					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
				} else if (btnHumanMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE

					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Robe");
					} else if (lblSelectedArmor.getText() == "None") {
						lblSelectedArmor.setText("Coat");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					lblShowCharacter.setIcon(new ImageIcon(New_Human_Panel.class
							.getResource("/create/characters/img/BloodElf-Mage/BloodElf-"
									+ lblSelectedWeapon.getText() + "-"
									+ lblSelectedArmor.getText() + ".gif")));
				} else if (btnHumanRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Master");
					} else if (lblSelectedArmor.getText() == "Master") {
						lblSelectedArmor.setText("Paladin");
					} else if (lblSelectedArmor.getText() == "None") {
						lblSelectedArmor.setText("Yalahar");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
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
		btnArmorNext.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnArmorNext.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-prawoON.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnArmorNext.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-prawo.png")));
			}
		});
		btnArmorNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR
					if (lblSelectedArmor.getText() == "Plate") {
						lblSelectedArmor.setText("Golden");
					} else if (lblSelectedArmor.getText() == "Golden") {
						lblSelectedArmor.setText("Dark");
					} else if (lblSelectedArmor.getText() == "Dark") {
						lblSelectedArmor.setText("Plate");
					} else if (lblSelectedArmor.getText() == "None") {
						lblSelectedArmor.setText("Plate");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());					
					if (lblShowArmor.getText().equals("None")) {
						lblSelectedArmor.setText("None");
					}
					if (lblShowWeapon.getText().equals("None")) {
						lblSelectedWeapon.setText("None");
					}

					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
				} else if (btnHumanMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Robe");
					} else if (lblSelectedArmor.getText() == "None") {
						lblSelectedArmor.setText("Robe");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					lblShowCharacter.setIcon(new ImageIcon(New_Human_Panel.class
							.getResource("/create/characters/img/BloodElf-Mage/BloodElf-"
									+ lblSelectedWeapon.getText() + "-"
									+ lblSelectedArmor.getText() + ".gif")));
				} else if (btnHumanRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Master");
					} else if (lblSelectedArmor.getText() == "Master") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Paladin");
					} else if (lblSelectedArmor.getText() == "None") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
					lblShowArmor.setText(lblSelectedArmor.getText());
					lblShowCharacter.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Ranger/BloodElf-"
											+ lblSelectedWeapon.getText()
											+ "-"
											+ lblSelectedArmor.getText()
											+ ".gif")));
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
		btnSkillsPrev.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnSkillsPrev.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-lewoON.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnSkillsPrev.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-lewo.png")));
			}
		});
		btnSkillsPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS WARRIOR
					if (lblSelectedSkills.getText() == "Brutal Shot") {
						lblSelectedSkills.setText("Berserker Rage");
					} else if (lblSelectedSkills.getText() == "Berserker Rage") {
						lblSelectedSkills.setText("Gains");
					} else if (lblSelectedSkills.getText() == "Gains") {
						lblSelectedSkills.setText("Brutal Shot");
					} else if (lblSelectedSkills.getText() == "None") {
						lblSelectedSkills.setText("Brutal Shot");
					}

					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Brutal Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Warrior_Brutal Shot.png")));
					} else if (lblShowSkills.getText().equals("Berserker Rage")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Warrior_Berserker Rage.png")));
					} else if (lblShowSkills.getText().equals("Gains")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Warrior_Gains.png")));
					}

				} else if (btnHumanMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedSkills.getText() == "Eye Of The Storm") {
						lblSelectedSkills.setText("Fire Breathe");
					} else if (lblSelectedSkills.getText() == "Fire Breathe") {
						lblSelectedSkills.setText("Shadow Form");
					} else if (lblSelectedSkills.getText() == "Shadow Form") {
						lblSelectedSkills.setText("Eye Of The Storm");
					} else if (lblSelectedSkills.getText() == "None") {
						lblSelectedSkills.setText("Eye Of The Storm");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Eye Of The Storm")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Mage_Eye Of The Storm.png")));
					} else if (lblShowSkills.getText().equals("Fire Breathe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Mage_Fire Breathe.png")));
					} else if (lblShowSkills.getText().equals("Shadow Form")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Mage_Shadow Form.png")));
					}
				} else if (btnHumanRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS RANGER
					if (lblSelectedSkills.getText() == "Power Shot") {
						lblSelectedSkills.setText("Strafe");
					} else if (lblSelectedSkills.getText() == "Strafe") {
						lblSelectedSkills.setText("Freeze");
					} else if (lblSelectedSkills.getText() == "Freeze") {
						lblSelectedSkills.setText("Power Shot");
					} else if (lblSelectedSkills.getText() == "None") {
						lblSelectedSkills.setText("Power Shot");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Power Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Ranger_Power Shot.png")));
					} else if (lblShowSkills.getText().equals("Strafe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Ranger_Strafe.png")));
					} else if (lblShowSkills.getText().equals("Freeze")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Ranger_Freeze.png")));
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
		btnSkillsNext.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnSkillsNext.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-prawoON.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnSkillsNext.setIcon(new ImageIcon(
						New_Human_Panel.class
								.getResource("/create/characters/img/strzalka-prawo.png")));
			}
		});
		btnSkillsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnHumanWarrior.getBackground() == Color.GREEN) {

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
					} else if (lblSelectedSkills.getText() == "None") {
						lblSelectedSkills.setText("Brutal Shot");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Brutal Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Warrior_Brutal Shot.png")));
					} else if (lblShowSkills.getText().equals("Berserker Rage")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Warrior_Berserker Rage.png")));
					} else if (lblShowSkills.getText().equals("Gains")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Warrior_Gains.png")));
					}
				} else if (btnHumanMage.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS MAGE
					if (lblSelectedSkills.getText() == "Eye Of The Storm") {
						lblSelectedSkills.setText("Shadow Form");
					} else if (lblSelectedSkills.getText() == "Shadow Form") {
						lblSelectedSkills.setText("Fire Breathe");
					} else if (lblSelectedSkills.getText() == "Fire Breathe") {
						lblSelectedSkills.setText("Eye Of The Storm");
					} else if (lblSelectedSkills.getText() == "None") {
						lblSelectedSkills.setText("Eye Of The Storm");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Eye Of The Storm")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Mage_Eye Of The Storm.png")));
					} else if (lblShowSkills.getText().equals("Fire Breathe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Mage_Fire Breathe.png")));
					} else if (lblShowSkills.getText().equals("Shadow Form")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Mage_Shadow Form.png")));
					}
				} else if (btnHumanRanger.getBackground() == Color.GREEN) {
					// ------------------------------------------------------------------------------------------
					// GIFS
					if (lblSelectedSkills.getText() == "Power Shot") {
						lblSelectedSkills.setText("Freeze");
					} else if (lblSelectedSkills.getText() == "Freeze") {
						lblSelectedSkills.setText("Strafe");
					} else if (lblSelectedSkills.getText() == "Strafe") {
						lblSelectedSkills.setText("Power Shot");
					} else if (lblSelectedSkills.getText() == "None") {
						lblSelectedSkills.setText("Power Shot");
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
					if (lblShowSkills.getText().equals("Power Shot")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Ranger_Power Shot.png")));
					} else if (lblShowSkills.getText().equals("Strafe")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Ranger_Strafe.png")));
					} else if (lblShowSkills.getText().equals("Freeze")) {
						lblShowSkillsIcon.setIcon(new ImageIcon(
								New_Human_Panel.class
										.getResource("/create/characters/img/Skills/Ranger_Freeze.png")));
					}
				}
			}
		});
		btnSkillsNext.setBackground(Color.ORANGE);
		btnSkillsNext.setBounds(306, 569, 65, 67);
		add(btnSkillsNext);
		// ----------------------------------------------------------------------------------------------------------
		// None Human
		if (lblShowWeapon.getText().equals("None")
				&& lblShowArmor.getText().equals("None")) {
			lblShowCharacter
					.setIcon(new ImageIcon(
							New_Human_Panel.class
									.getResource("/create/characters/img/BloodElf-Warrior/BloodElf-None-None.gif")));
		}

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(New_Human_Panel.class
				.getResource("/create/characters/img/tabela.png")));
		lblNewLabel.setBounds(10, 98, 450, 675);
		add(lblNewLabel);
		lblShowSkillsIcon.setBounds(39, 666, 393, 286);
		add(lblShowSkillsIcon);

		lblCharacterExists.setForeground(Color.RED);
		lblCharacterExists.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		lblCharacterExists.setBounds(893, 682, 377, 38);
		add(lblCharacterExists);
		lblShowCharacter.setHorizontalAlignment(SwingConstants.LEFT);
		lblShowCharacter.setBounds(0, 0, 1270, 1013);
		add(lblShowCharacter);

	}
}
