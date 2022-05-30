import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RemoveManagementStaffFrame {

	private JFrame frame;
	private JTextField userNameTextField;
	private JTextField passwordTextField;
	private boolean admin;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveManagementStaffFrame window = new RemoveManagementStaffFrame(admin);
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
	public RemoveManagementStaffFrame(boolean b) {
		this.admin = b;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Valid Information");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(60, 29, 316, 47);
		frame.getContentPane().add(lblNewLabel);
		
		userNameTextField = new JTextField();
		userNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		userNameTextField.setBounds(163, 122, 171, 20);
		frame.getContentPane().add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(65, 122, 88, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordTextField = new JTextField();
		passwordTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(163, 180, 171, 20);
		frame.getContentPane().add(passwordTextField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(65, 180, 88, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (userNameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please type in all the information");
					return;
				}
				
				String userName = userNameTextField.getText();
				String password = passwordTextField.getText();
				
				FileOperationsLogin op = new FileOperationsLogin();
				Login fieldInfo = new Login (userName, password);
				if (op.found(fieldInfo)) {
					op.remove(fieldInfo);
				}
				else {
					JOptionPane.showMessageDialog(null, "User doesn't exist");
				}
			} 
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(96, 258, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				if (admin) {
					new MainMenuFrame(true).setVisible(true);
				}
				else {
					new MainMenuFrame(false).setVisible(true);
				}
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(246, 258, 89, 23);
		frame.getContentPane().add(btnBack);
	}

}
