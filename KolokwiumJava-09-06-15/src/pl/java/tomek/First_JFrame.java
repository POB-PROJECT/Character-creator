package pl.java.tomek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class First_JFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_JFrame frame = new First_JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public First_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKupBilet = new JButton("Kup bilet");
		btnKupBilet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second_JPanel Second_JPane_object = new Second_JPanel();
				btnKupBilet.setVisible(false);
				Second_JPane_object.setBounds(0, 0, 400, 300);
				add(Second_JPane_object);
				
			}
		});
		btnKupBilet.setBounds(55, 36, 329, 186);
		contentPane.add(btnKupBilet);
	}
}