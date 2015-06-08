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

					Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
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
					Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
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
					Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
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
		btnCreate.setBounds(607, 408, 183, 75);
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
				Main_Menu_Penel_object.setBounds(0, 0, 800, 600);
			}
		});
		Back_button.setBounds(607, 494, 183, 62);

		add(Main_Menu_Penel_object);
		add(Back_button);

		NameField.setText("");
		NameField.setBounds(299, 505, 167, 34);
		add(NameField);
		NameField.setColumns(10);

		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(208, 507, 70, 24);
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
		btnOrcWarrior.setBounds(13, 59, 81, 62);
		add(btnOrcWarrior);

		btnOrcMage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOrcMage.setBackground(Color.GREEN);
				btnOrcWarrior.setBackground(Color.LIGHT_GRAY);
				btnOrcRanger.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Mage");
				lblSelectedWeapon.setText("Wand");
				lblSelectedArmor.setText("Robe");
				lblSelectedSkills.setText("Exevo Gran Mas Vis");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		btnOrcMage.setBounds(104, 59, 81, 62);
		add(btnOrcMage);

		btnOrcRanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOrcRanger.setBackground(Color.GREEN);
				btnOrcWarrior.setBackground(Color.LIGHT_GRAY);
				btnOrcMage.setBackground(Color.LIGHT_GRAY);
				lblClass.setText("Ranger");
				lblSelectedWeapon.setText("Crossbow");
				lblSelectedArmor.setText("Paladin");
				lblSelectedSkills.setText("Exevo Mas San");
				lblShowWeapon.setText(lblSelectedWeapon.getText());
				lblShowArmor.setText(lblSelectedArmor.getText());
				lblShowSkills.setText(lblSelectedSkills.getText());
			}
		});
		btnOrcRanger.setBounds(195, 59, 83, 62);
		add(btnOrcRanger);

		// ----------------------------------------------------------------------------------------------------------
		// POKAZYWANIE POSTACI
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblClass.setBounds(453, 25, 271, 34);
		add(lblClass);

		lblShowWeapon.setForeground(Color.WHITE);
		lblShowWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWeapon.setBounds(453, 80, 271, 38);
		add(lblShowWeapon);

		lblShowArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowArmor.setForeground(Color.WHITE);
		lblShowArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowArmor.setBounds(453, 120, 271, 38);
		add(lblShowArmor);

		lblShowSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowSkills.setForeground(Color.WHITE);
		lblShowSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShowSkills.setBounds(453, 160, 271, 38);
		add(lblShowSkills);

		// ----------------------------------------------------------------------------------------------------------
		// WEAPON
		lblWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setBounds(104, 165, 93, 24);
		add(lblWeapon);

		lblSelectedWeapon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedWeapon.setForeground(Color.WHITE);
		lblSelectedWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedWeapon.setBounds(55, 200, 183, 24);
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
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Wand");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponPrev.setBackground(Color.ORANGE);
		btnWeaponPrev.setBounds(0, 201, 45, 23);
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
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Wand") {
						lblSelectedWeapon.setText("Rod");
					} else if (lblSelectedWeapon.getText() == "Rod") {
						lblSelectedWeapon.setText("Staff");
					} else if (lblSelectedWeapon.getText() == "Staff") {
						lblSelectedWeapon.setText("Wand");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					if (lblSelectedWeapon.getText() == "Crossbow") {
						lblSelectedWeapon.setText("Spear");
					} else if (lblSelectedWeapon.getText() == "Spear") {
						lblSelectedWeapon.setText("Bow");
					} else if (lblSelectedWeapon.getText() == "Bow") {
						lblSelectedWeapon.setText("Crossbow");
					}
					lblShowWeapon.setText(lblSelectedWeapon.getText());
				}
			}
		});
		btnWeaponNext.setBackground(Color.ORANGE);
		btnWeaponNext.setBounds(248, 201, 45, 23);
		add(btnWeaponNext);

		// ----------------------------------------------------------------------------------------------------------
		// ARMOR
		lblArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArmor.setForeground(Color.WHITE);
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setBounds(103, 235, 94, 38);
		add(lblArmor);

		lblSelectedArmor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedArmor.setForeground(Color.WHITE);
		lblSelectedArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedArmor.setBounds(55, 269, 183, 24);
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
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Robe");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorPrev.setBounds(0, 272, 45, 23);
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
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Robe") {
						lblSelectedArmor.setText("Cape");
					} else if (lblSelectedArmor.getText() == "Cape") {
						lblSelectedArmor.setText("Coat");
					} else if (lblSelectedArmor.getText() == "Coat") {
						lblSelectedArmor.setText("Robe");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				} else if (btnOrcRanger.getBackground() == Color.GREEN) {
					if (lblSelectedArmor.getText() == "Paladin") {
						lblSelectedArmor.setText("Master Archer's");
					} else if (lblSelectedArmor.getText() == "Master Archer's") {
						lblSelectedArmor.setText("Yalahar");
					} else if (lblSelectedArmor.getText() == "Yalahar") {
						lblSelectedArmor.setText("Paladin");
					}
					lblShowArmor.setText(lblSelectedArmor.getText());
				}
			}
		});
		btnArmorNext.setBounds(248, 272, 45, 23);
		add(btnArmorNext);

		// ----------------------------------------------------------------------------------------------------------
		// SKILL
		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSkills.setBounds(104, 304, 94, 24);
		add(lblSkills);

		lblSelectedSkills.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSelectedSkills.setForeground(Color.WHITE);
		lblSelectedSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedSkills.setBounds(55, 336, 183, 24);
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
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Gran Mas Vis") {
						lblSelectedSkills.setText("Exori Frigo");
					} else if (lblSelectedSkills.getText() == "Exori Frigo") {
						lblSelectedSkills.setText("Utori Flam");
					} else if (lblSelectedSkills.getText() == "Utori Flam") {
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
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				} else if (btnOrcMage.getBackground() == Color.GREEN) {
					if (lblSelectedSkills.getText() == "Exevo Gran Mas Vis") {
						lblSelectedSkills.setText("Utori Flam");
					} else if (lblSelectedSkills.getText() == "Utori Flam") {
						lblSelectedSkills.setText("Exori Frigo");
					} else if (lblSelectedSkills.getText() == "Exori Frigo") {
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
					}
					lblShowSkills.setText(lblSelectedSkills.getText());
				}
			}
		});

		btnSkillsPrev.setBounds(0, 339, 45, 23);
		add(btnSkillsPrev);

		btnSkillsNext.setBackground(Color.ORANGE);
		btnSkillsNext.setBounds(248, 339, 45, 23);
		add(btnSkillsNext);

		add(super.background_label);

	}

}
