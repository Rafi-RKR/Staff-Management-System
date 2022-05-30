import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class AppLaunchLoginFrame {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JRadioButton adminRadioButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppLaunchLoginFrame window = new AppLaunchLoginFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppLaunchLoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(48, 47, 79, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(137, 52, 235, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(48, 84, 79, 26);
		frame.getContentPane().add(lblPassword);
		
		adminRadioButton = new JRadioButton("Admin Login");
		adminRadioButton.setBackground(Color.WHITE);
		adminRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adminRadioButton.setBounds(48, 129, 129, 23);
		frame.getContentPane().add(adminRadioButton);
		
		JRadioButton managementRadioButton = new JRadioButton("Management Login");
		managementRadioButton.setBackground(Color.WHITE);
		managementRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		managementRadioButton.setBounds(48, 155, 139, 23);
		frame.getContentPane().add(managementRadioButton);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || lblPassword.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fillup all the information");
					return;
				}
				boolean selected = false;
				if (!(adminRadioButton.isSelected() || managementRadioButton.isSelected())) {
					JOptionPane.showMessageDialog(null, "Please select the type of your login");
					return;
				}
				else if ((adminRadioButton.isSelected() && managementRadioButton.isSelected())){
					JOptionPane.showMessageDialog(null, "Please select only one type of login");
					return;
				}
				else {
					selected = true;
				}

				boolean found = false;
				if (adminRadioButton.isSelected()) {
					if ("admin".equals(textField.getText()) && "admin".equals(passwordField.getText())) {
						JOptionPane.showMessageDialog(null, "Login Successful");
						found = true;
						frame.setVisible(false);
						MainMenuFrame menu = new MainMenuFrame(true);
						menu.newScreen();
					}

				}
				else if (managementRadioButton.isSelected()) {
					FileOperationsLogin log = new FileOperationsLogin();
					if (log.found(new Login (textField.getText(), passwordField.getText()))) {
						JOptionPane.showMessageDialog(null, "Login Successful");
						found = true;
						frame.setVisible(false);
						MainMenuFrame menu = new MainMenuFrame(false);
						menu.newScreen();
					}
				}
				if (!found && selected) {
					JOptionPane.showMessageDialog(null, "Enter valid login details");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(48, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(137, 89, 235, 20);
		frame.getContentPane().add(passwordField);
	}
	
}
