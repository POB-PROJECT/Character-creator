package create.characters;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import java.io.File;

public class Edit_Character_Panel extends Back_Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Edit_Character_Panel() throws IOException {

		JLabel lblNickname = new JLabel("");
		lblNickname.setHorizontalAlignment(SwingConstants.CENTER);
		lblNickname.setFont(new Font("LifeCraft", Font.PLAIN, 40));
		JLabel lblWeapon = new JLabel("");
		lblWeapon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeapon.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		JLabel lblArmor = new JLabel("");
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		JLabel lblSkill = new JLabel("");
		lblSkill.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkill.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		JLabel lblNickname_1 = new JLabel("Name");
		JLabel lblWeapon_1 = new JLabel("Weapon");
		JLabel lblArmor_1 = new JLabel("Armor");
		JLabel lblSkill_1 = new JLabel("Skill");
		JButton btnWeaponPrev = new JButton("<");
		JButton btnSelectedValueJList = new JButton("");
		btnSelectedValueJList.setIcon(new ImageIcon(Edit_Character_Panel.class.getResource("/create/characters/img/Buttons/SelectOFF.png")));
		JButton btnWeaponNext = new JButton(">");
		JButton btnArmorPrev = new JButton("<");
		JButton btnArmorNext = new JButton(">");
		JButton btnSkillPrev = new JButton("<");
		JButton btnSkillNext = new JButton(">");
		JLabel lblRace = new JLabel("");
		lblRace.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		JLabel lblClass = new JLabel("");
		lblClass.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		JButton btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon(Edit_Character_Panel.class.getResource("/create/characters/img/Buttons/Save_off.png")));
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon(Edit_Character_Panel.class.getResource("/create/characters/img/Buttons/Delete_off.png")));
		JLabel lblLoadTable = new JLabel("");
		lblLoadTable.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		JLabel lblTable2 = new JLabel("");
		lblTable2.setFont(new Font("LifeCraft", Font.PLAIN, 25));
		lblRace.setVisible(false);
		lblClass.setVisible(false);
		lblNickname.setVisible(false);
		lblWeapon.setVisible(false);
		lblArmor.setVisible(false);
		lblSkill.setVisible(false);
		lblNickname_1.setVisible(false);
		lblWeapon_1.setVisible(false);
		lblArmor_1.setVisible(false);
		lblSkill_1.setVisible(false);
		btnWeaponPrev.setVisible(false);
		btnWeaponNext.setVisible(false);
		btnArmorPrev.setVisible(false);
		btnArmorNext.setVisible(false);
		btnSkillPrev.setVisible(false);
		btnSkillNext.setVisible(false);
		btnSave.setVisible(false);
		btnDelete.setVisible(false);
		JLabel lblCharacter_Load = new JLabel("");
		JLabel lblShowIcon = new JLabel("");
		JButton Back_button = new JButton("");
		Back_button.setIcon(new ImageIcon(Edit_Character_Panel.class.getResource("/create/characters/img/Buttons/Return_off.png")));

		BufferedReader in = null;
		String line;
		DefaultListModel listModel = new DefaultListModel();
		try {
			in = new BufferedReader(new FileReader("characters.txt"));
			while ((line = in.readLine()) != null) {
				listModel.addElement(line);
			}
		} catch (IOException ex) {
			System.out.println("IOException");
		} finally {
			if (in != null) {
				in.close();
			}
		}

		JList list = new JList(listModel);

		list.setBackground(new Color(0, 0, 0, 0));
		list.setForeground(Color.WHITE);
		list.setFont(new Font("LifeCraft", Font.PLAIN, 35));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(293, 135, 442, 672);

		add(list);
		btnSelectedValueJList.setBorderPainted(false); 
		btnSelectedValueJList.setContentAreaFilled(false); 
		btnSelectedValueJList.setFocusPainted(false); 
		btnSelectedValueJList.setOpaque(false);
		btnSelectedValueJList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selected = (String) list.getSelectedValue();
				String selected_class = "";
				String selected_race = "";
				
				
				btnSelectedValueJList.setVisible(false);
				lblLoadTable.setVisible(false);
				background_label.setVisible(false);
				list.setVisible(false);
				lblNickname.setVisible(true);
				lblWeapon.setVisible(true);
				lblArmor.setVisible(true);
				lblSkill.setVisible(true);
				lblNickname_1.setVisible(true);
				btnArmorNext.setVisible(true);
				lblWeapon_1.setVisible(true);
				lblArmor_1.setVisible(true);
				lblSkill_1.setVisible(true);
				btnWeaponPrev.setVisible(true);
				btnDelete.setVisible(true);
				btnWeaponNext.setVisible(true);
				btnArmorPrev.setVisible(true);
				btnSave.setVisible(true);
				btnWeaponNext.setVisible(true);
				btnSkillPrev.setVisible(true);
				btnSkillNext.setVisible(true);
				// --------------------------------------------------------
				// Class
				boolean check = false;
				int firstspace = 0;
				for (int i = selected.length() - 1; i > 0; i--) {
					char c = selected.charAt(i);
					if (c == ' ' && check == true) {
						for (int j = i + 1; j < firstspace; j++) {
							c = selected.charAt(j);
							selected_race = selected_race + c;
						}
						break;
					}
					if (c == ' ') {
						check = true;
						firstspace = i;
					}
				}
				if(selected_race.equals("BloodElf"))
				{
					selected_race="Human";
				}
				// --------------------------------------------------------
				// Class
				for (int i = selected.length() - 1; i > 0; i--) {
					char c = selected.charAt(i);
					if (c == ' ') {
						for (int j = i + 1; j < selected.length(); j++) {
							c = selected.charAt(j);
							selected_class = selected_class + c;
						}
						break;
					}
				}
				// --------------------------------------------------------
				// Nick
				String nick = "";
				for (int i = 0; i < selected.length(); i++) {
					char c = selected.charAt(i);
					if (selected.charAt(i) == ' '
							&& selected.charAt(i + 1) == '-')
						break;
					nick = nick + c;
				}
				// --------------------------------------------------------
				// main loop
				if (selected_class.equals("Warrior")
						&& selected_race.equals("Orc")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Orc_Warrior test_orc = (Orc_Warrior) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblRace.setText(selected_race);
						lblClass.setText(selected_class);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");
						e.printStackTrace();
					}
				} else if (selected_class.equals("Mage")
						&& selected_race.equals("Orc")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Orc_Mage test_orc = (Orc_Mage) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblRace.setText(selected_race);
						lblClass.setText(selected_class);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");
						e.printStackTrace();
					}
				} else if (selected_class.equals("Ranger")
						&& selected_race.equals("Orc")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Orc_Ranger test_orc = (Orc_Ranger) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblRace.setText(selected_race);
						lblClass.setText(selected_class);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");
						e.printStackTrace();
					}
				} else if (selected_class.equals("Warrior")
						&& selected_race.equals("Human")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Human_Warrior test_orc = (Human_Warrior) ois
								.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblRace.setText(selected_race);
						lblClass.setText(selected_class);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");
						e.printStackTrace();
					}
				} else if (selected_class.equals("Mage")
						&& selected_race.equals("Human")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Human_Mage test_orc = (Human_Mage) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblRace.setText(selected_race);
						lblClass.setText(selected_class);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						e.printStackTrace();
					}
				} else if (selected_class.equals("Ranger")
						&& selected_race.equals("Human")) {
					ObjectInputStream ois;
					try {
						ois = new ObjectInputStream(new FileInputStream(
								"CharactersDB\\" + nick + ".dat"));
						Human_Ranger test_orc = (Human_Ranger) ois.readObject();
						ois.close();
						lblNickname.setText(test_orc.nickname);
						lblWeapon.setText(test_orc.weapon);
						lblArmor.setText(test_orc.armor);
						lblSkill.setText(test_orc.skill);
						lblRace.setText(selected_race);
						lblClass.setText(selected_class);
					} catch (FileNotFoundException e) {
						System.out.println("not found");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("IOE");

						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						System.out.println("Classnotfound");

						e.printStackTrace();
					}
				} else {
					System.out.println("ERROR");
				}
				if (lblRace.getText().equals("Human")) {
					lblRace.setText("BloodElf");
				}
				if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Master");
				}
				lblCharacter_Load.setIcon(new ImageIcon(
						Load_Character_Panel.class
								.getResource("/create/characters/img/"
										+ lblRace.getText() + "-"
										+ lblClass.getText() + "/"
										+ lblRace.getText() + "-"
										+ lblWeapon.getText() + "-"
										+ lblArmor.getText() + ".gif")));
				lblShowIcon.setIcon(new ImageIcon(Load_Character_Panel.class
						.getResource("/create/characters/img/Skills/"
								+ lblClass.getText() + "_" + lblSkill.getText()
								+ ".png")));

			}

		});
		btnSelectedValueJList.setBounds(846, 678, 434, 109);
		add(btnSelectedValueJList);

		lblNickname.setForeground(Color.WHITE);
		lblNickname.setBounds(82, 256, 262, 65);
		add(lblNickname);

		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setBounds(124, 401, 176, 22);
		add(lblWeapon);

		lblArmor.setForeground(Color.WHITE);
		lblArmor.setBounds(124, 514, 176, 22);
		add(lblArmor);

		lblSkill.setForeground(Color.WHITE);
		lblSkill.setBounds(128, 619, 176, 22);
		add(lblSkill);

		lblNickname_1.setFont(new Font("LifeCraft", Font.PLAIN, 30));
		lblNickname_1.setForeground(Color.WHITE);
		lblNickname_1.setBounds(184, 214, 54, 31);
		add(lblNickname_1);

		lblWeapon_1.setFont(new Font("LifeCraft", Font.PLAIN, 30));
		lblWeapon_1.setForeground(Color.WHITE);
		lblWeapon_1.setBounds(174, 351, 80, 31);
		add(lblWeapon_1);

		lblArmor_1.setFont(new Font("LifeCraft", Font.PLAIN, 30));
		lblArmor_1.setForeground(Color.WHITE);
		lblArmor_1.setBounds(184, 460, 67, 31);
		add(lblArmor_1);

		lblSkill_1.setFont(new Font("LifeCraft", Font.PLAIN, 30));
		lblSkill_1.setForeground(Color.WHITE);
		lblSkill_1.setBounds(184, 577, 57, 31);
		add(lblSkill_1);
		
		btnSave.setBorderPainted(false); 
		btnSave.setContentAreaFilled(false); 
		btnSave.setFocusPainted(false); 
		btnSave.setOpaque(false);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.setVisible(false);
				btnSelectedValueJList.setVisible(false);
				lblNickname.setVisible(false);
				lblWeapon.setVisible(false);
				lblArmor.setVisible(false);
				lblSkill.setVisible(false);
				lblNickname_1.setVisible(false);
				lblWeapon_1.setVisible(false);
				lblArmor_1.setVisible(false);
				lblSkill_1.setVisible(false);
				Back_button.setVisible(false);
				btnWeaponPrev.setVisible(false);
				
				btnWeaponNext.setVisible(false);
				btnArmorPrev.setVisible(false);
				btnArmorNext.setVisible(false);
				btnSkillPrev.setVisible(false);
				btnSkillNext.setVisible(false);
				btnSave.setVisible(false);
				btnDelete.setVisible(false);
			if(lblRace.getText().equals("BloodElf"))
			{
				lblRace.setText("Human");
			}
				if (lblClass.getText().equals("Warrior")
						&& lblRace.getText().equals("Orc")) {
					Orc_Warrior test_orc = new Orc_Warrior(lblNickname
							.getText(), lblWeapon.getText(),
							lblArmor.getText(), lblSkill.getText());

					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ lblNickname.getText() + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else if (lblClass.getText().equals("Mage")
						&& lblRace.getText().equals("Orc")) {
					Orc_Mage test_orc = new Orc_Mage(lblNickname.getText(),
							lblWeapon.getText(), lblArmor.getText(), lblSkill
									.getText());

					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ lblNickname.getText() + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else if (lblClass.getText().equals("Ranger")
						&& lblRace.getText().equals("Orc")) {
					Orc_Ranger test_orc = new Orc_Ranger(lblNickname.getText(),
							lblWeapon.getText(), lblArmor.getText(), lblSkill
									.getText());

					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ lblNickname.getText() + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else if (lblClass.getText().equals("Warrior")
						&& lblRace.getText().equals("Human")) {
					Human_Warrior test_orc = new Human_Warrior(lblNickname
							.getText(), lblWeapon.getText(),
							lblArmor.getText(), lblSkill.getText());

					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ lblNickname.getText() + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else if (lblClass.getText().equals("Ranger")
						&& lblRace.getText().equals("Human")) {
					Human_Ranger test_orc = new Human_Ranger(lblNickname
							.getText(), lblWeapon.getText(),
							lblArmor.getText(), lblSkill.getText());

					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ lblNickname.getText() + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else if (lblClass.getText().equals("Mage")
						&& lblRace.getText().equals("Human")) {
					Human_Mage test_orc = new Human_Mage(lblNickname.getText(),
							lblWeapon.getText(), lblArmor.getText(), lblSkill
									.getText());

					try {
						ObjectOutputStream nc = new ObjectOutputStream(
								new FileOutputStream("CharactersDB\\"
										+ lblNickname.getText() + ".dat"));
						nc.writeObject(test_orc);
						nc.close();
					} catch (FileNotFoundException e1) {
						System.out.println("File not found");
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);

			}			
		});
		btnSave.setBounds(880, 598, 356, 89);
		add(btnSave);

		btnWeaponPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lblWeapon.getText().equals("Sword")) {
					lblWeapon.setText("Axe");
				} else if (lblWeapon.getText().equals("Axe")) {
					lblWeapon.setText("Club");
				} else if (lblWeapon.getText().equals("Club")) {
					lblWeapon.setText("Sword");
				} else if (lblWeapon.getText().equals("Wand")) {
					lblWeapon.setText("Staff");
				} else if (lblWeapon.getText().equals("Staff")) {
					lblWeapon.setText("Rod");
				} else if (lblWeapon.getText().equals("Rod")) {
					lblWeapon.setText("Wand");
				} else if (lblWeapon.getText().equals("Crossbow")) {
					lblWeapon.setText("Bow");
				} else if (lblWeapon.getText().equals("Bow")) {
					lblWeapon.setText("Spear");
				} else if (lblWeapon.getText().equals("Spear")) {
					lblWeapon.setText("Crossbow");
				}
				if (lblRace.getText().equals("Human")) {
					lblRace.setText("BloodElf");
				}
				if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Master");
				}

				lblCharacter_Load.setIcon(new ImageIcon(
						Load_Character_Panel.class
								.getResource("/create/characters/img/"
										+ lblRace.getText() + "-"
										+ lblClass.getText() + "/"
										+ lblRace.getText() + "-"
										+ lblWeapon.getText() + "-"
										+ lblArmor.getText() + ".gif")));
			}
		});
		btnWeaponPrev.setBounds(32, 401, 56, 22);
		add(btnWeaponPrev);

		btnArmorPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblArmor.getText().equals("Plate")) {
					lblArmor.setText("Dark");
				} else if (lblArmor.getText().equals("Dark")) {
					lblArmor.setText("Golden");
				} else if (lblArmor.getText().equals("Golden")) {
					lblArmor.setText("Plate");
				} else if (lblArmor.getText().equals("Robe")) {
					lblArmor.setText("Coat");
				} else if (lblArmor.getText().equals("Coat")) {
					lblArmor.setText("Cape");
				} else if (lblArmor.getText().equals("Cape")) {
					lblArmor.setText("Robe");
				} else if (lblArmor.getText().equals("Paladin")) {
					lblArmor.setText("Yalahar");
				} else if (lblArmor.getText().equals("Yalahar")) {
					lblArmor.setText("Master");
				} else if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Paladin");
				}
				if (lblRace.getText().equals("Human")) {
					lblRace.setText("BloodElf");
				}
				if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Master");
				}

				lblCharacter_Load.setIcon(new ImageIcon(
						Load_Character_Panel.class
								.getResource("/create/characters/img/"
										+ lblRace.getText() + "-"
										+ lblClass.getText() + "/"
										+ lblRace.getText() + "-"
										+ lblWeapon.getText() + "-"
										+ lblArmor.getText() + ".gif")));
			}
		});
		btnArmorPrev.setBounds(32, 514, 56, 22);
		add(btnArmorPrev);

		btnSkillPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (lblSkill.getText().equals("Brutal Shot")) {
					lblSkill.setText("Gains");
				} else if (lblSkill.getText().equals("Gains")) {
					lblSkill.setText("Berserker Rage");
				} else if (lblSkill.getText().equals("Berserker Rage")) {
					lblSkill.setText("Brutal Shot");
				} else if (lblSkill.getText().equals("Eye Of The Storm")) {
					lblSkill.setText("Shadow Form");
				} else if (lblSkill.getText().equals("Shadow Form")) {
					lblSkill.setText("Fire Breathe");
				} else if (lblSkill.getText().equals("Fire Breathe")) {
					lblSkill.setText("Eye Of The Storm");
				} else if (lblSkill.getText().equals("Power Shot")) {
					lblSkill.setText("Freeze");
				} else if (lblSkill.getText().equals("Freeze")) {
					lblSkill.setText("Strafe");
				} else if (lblSkill.getText().equals("Strafe")) {
					lblSkill.setText("Power Shot");
				}
				lblShowIcon.setIcon(new ImageIcon(Load_Character_Panel.class
						.getResource("/create/characters/img/Skills/"
								+ lblClass.getText() + "_" + lblSkill.getText()
								+ ".png")));

			}

		});
		btnSkillPrev.setBounds(32, 619, 56, 22);
		add(btnSkillPrev);

		btnWeaponNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (lblWeapon.getText().equals("Sword")) {
					lblWeapon.setText("Club");
				} else if (lblWeapon.getText().equals("Club")) {
					lblWeapon.setText("Axe");
				} else if (lblWeapon.getText().equals("Axe")) {
					lblWeapon.setText("Sword");
				} else if (lblWeapon.getText().equals("Wand")) {
					lblWeapon.setText("Rod");
				} else if (lblWeapon.getText().equals("Rod")) {
					lblWeapon.setText("Staff");
				} else if (lblWeapon.getText().equals("Staff")) {
					lblWeapon.setText("Wand");
				} else if (lblWeapon.getText().equals("Crossbow")) {
					lblWeapon.setText("Spear");
				} else if (lblWeapon.getText().equals("Spear")) {
					lblWeapon.setText("Bow");
				} else if (lblWeapon.getText().equals("Bow")) {
					lblWeapon.setText("Crossbow");
				}
				if (lblRace.getText().equals("Human")) {
					lblRace.setText("BloodElf");
				}
				if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Master");
				}

				lblCharacter_Load.setIcon(new ImageIcon(
						Load_Character_Panel.class
								.getResource("/create/characters/img/"
										+ lblRace.getText() + "-"
										+ lblClass.getText() + "/"
										+ lblRace.getText() + "-"
										+ lblWeapon.getText() + "-"
										+ lblArmor.getText() + ".gif")));
			}
		});
		btnWeaponNext.setBounds(329, 401, 56, 22);
		add(btnWeaponNext);

		btnArmorNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblArmor.getText().equals("Plate")) {
					lblArmor.setText("Golden");
				} else if (lblArmor.getText().equals("Golden")) {
					lblArmor.setText("Dark");
				} else if (lblArmor.getText().equals("Dark")) {
					lblArmor.setText("Plate");
				} else if (lblArmor.getText().equals("Robe")) {
					lblArmor.setText("Cape");
				} else if (lblArmor.getText().equals("Cape")) {
					lblArmor.setText("Coat");
				} else if (lblArmor.getText().equals("Coat")) {
					lblArmor.setText("Robe");
				} else if (lblArmor.getText().equals("Paladin")) {
					lblArmor.setText("Master");
				} else if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Yalahar");
				} else if (lblArmor.getText() == "Yalahar") {
					lblArmor.setText("Paladin");
				}
				if (lblRace.getText().equals("Human")) {
					lblRace.setText("BloodElf");
				}
				if (lblArmor.getText().equals("Master")) {
					lblArmor.setText("Master");
				}

				lblCharacter_Load.setIcon(new ImageIcon(
						Load_Character_Panel.class
								.getResource("/create/characters/img/"
										+ lblRace.getText() + "-"
										+ lblClass.getText() + "/"
										+ lblRace.getText() + "-"
										+ lblWeapon.getText() + "-"
										+ lblArmor.getText() + ".gif")));
			}
		});
		btnArmorNext.setBounds(329, 514, 56, 22);
		add(btnArmorNext);

		btnSkillNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblSkill.getText().equals("Brutal Shot")) {
					lblSkill.setText("Berserker Rage");
				} else if (lblSkill.getText().equals("Berserker Rage")) {
					lblSkill.setText("Gains");
				} else if (lblSkill.getText().equals("Gains")) {
					lblSkill.setText("Brutal Shot");
				} else if (lblSkill.getText().equals("Eye Of The Storm")) {
					lblSkill.setText("Fire Breathe");
				} else if (lblSkill.getText().equals("Fire Breathe")) {
					lblSkill.setText("Shadow Form");
				} else if (lblSkill.getText().equals("Shadow Form")) {
					lblSkill.setText("Eye Of The Storm");
				} else if (lblSkill.getText().equals("Power Shot")) {
					lblSkill.setText("Strafe");
				} else if (lblSkill.getText().equals("Strafe")) {
					lblSkill.setText("Freeze");
				} else if (lblSkill.getText().equals("Freeze")) {
					lblSkill.setText("Power Shot");
				}
				lblShowIcon.setIcon(new ImageIcon(Load_Character_Panel.class
						.getResource("/create/characters/img/Skills/"
								+ lblClass.getText() + "_" + lblSkill.getText()
								+ ".png")));
			}
		});
		btnSkillNext.setBounds(329, 619, 56, 22);
		add(btnSkillNext);

		Back_button.setBorderPainted(false); 
		Back_button.setContentAreaFilled(false); 
		Back_button.setFocusPainted(false); 
		Back_button.setOpaque(false);
		Back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnWeaponPrev.setVisible(false);
				btnWeaponNext.setVisible(false);
				btnArmorPrev.setVisible(false);
				btnArmorNext.setVisible(false);
				btnSkillPrev.setVisible(false);
				btnSkillNext.setVisible(false);
				Back_button.setVisible(false);
				list.setVisible(false);

				btnSave.setVisible(false);
				btnSelectedValueJList.setVisible(false);

				lblNickname.setVisible(false);
				lblWeapon.setVisible(false);
				lblArmor.setVisible(false);
				lblSkill.setVisible(false);
				lblNickname_1.setVisible(false);
				lblWeapon_1.setVisible(false);
				lblArmor_1.setVisible(false);
				lblSkill_1.setVisible(false);
				btnDelete.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);

			}
		});
		Back_button.setBounds(846, 798, 434, 109);
		add(Main_Menu_Penel_object);
		add(Back_button);

		lblRace.setBounds(814, 275, 144, 22);
		add(lblRace);

		lblClass.setBounds(814, 329, 144, 22);
		add(lblClass);
		btnDelete.setBorderPainted(false); 
		btnDelete.setContentAreaFilled(false); 
		btnDelete.setFocusPainted(false); 
		btnDelete.setOpaque(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					
					File inFile = new File("characters.txt");

					if (!inFile.isFile()) {
						System.out.println("Parameter is not an existing file");
						return;
					}

					// Construct the new file that will later be renamed to the
					// original filename.
					File tempFile = new File(inFile.getAbsolutePath()
							+ "characterstmp.txt");

					BufferedReader br = new BufferedReader(new FileReader(
							"characters.txt"));
					PrintWriter pw = new PrintWriter(new FileWriter(
							"characterstmp.txt"));

					String line = null;

					// Read from the original file and write to the new
					// unless content matches data to be removed.
					
					
					while ((line = br.readLine()) != null) {
						
						if (!line.trim().equals(
								lblNickname.getText() + " - "
										+ lblRace.getText() + " "
										+ lblClass.getText())) {

							pw.println(line);
							pw.flush();
						}
					}
					pw.close();
					br.close();

					if (!inFile.delete()) {
						System.out.println("Could not delete file");
						return;
					}

					File oldfile = new File("characterstmp.txt");
					File newfile = new File("characters.txt");

					if (oldfile.renameTo(newfile)) {

					} else {
						System.out.println("Sorry! the file can't be renamed");
					}
				}

				catch (FileNotFoundException ex) {
					ex.printStackTrace();
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				try {

					File file = new File("CharactersDB\\"
							+ lblNickname.getText() + ".dat");

					file.delete();

				} catch (Exception e) {

					e.printStackTrace();

				}
				btnWeaponPrev.setVisible(false);
				btnWeaponNext.setVisible(false);
				btnArmorPrev.setVisible(false);
				btnArmorNext.setVisible(false);
				btnSkillPrev.setVisible(false);
				btnSkillNext.setVisible(false);
				Back_button.setVisible(false);
				list.setVisible(false);

				btnSave.setVisible(false);
				btnSelectedValueJList.setVisible(false);

				lblNickname.setVisible(false);
				lblWeapon.setVisible(false);
				lblArmor.setVisible(false);
				lblSkill.setVisible(false);
				lblNickname_1.setVisible(false);
				lblWeapon_1.setVisible(false);
				lblArmor_1.setVisible(false);
				lblSkill_1.setVisible(false);
				btnDelete.setVisible(false);
				Main_Menu_Penel_object.setBounds(0, 0, 1280, 1024);
			}
		});

		lblLoadTable.setIcon(new ImageIcon(Edit_Character_Panel.class
				.getResource("/create/characters/img/Load_bg.png")));
		lblLoadTable.setBounds(127, 97, 831, 1011);
		add(lblLoadTable);

		btnDelete.setBounds(880, 698, 356, 89);
		add(btnDelete);
		add(super.background_label);

		lblTable2.setIcon(new ImageIcon(Edit_Character_Panel.class
				.getResource("/create/characters/img/tabela.png")));
		lblTable2.setBounds(9, 54, 400, 800);
		add(lblTable2);

		lblShowIcon.setIcon(null);
		lblShowIcon.setBounds(37, 645, 356, 319);
		add(lblShowIcon);

		lblCharacter_Load.setBounds(0, 0, 1280, 1024);
		add(lblCharacter_Load);
	}
}
