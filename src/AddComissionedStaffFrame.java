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
import java.awt.Color;

public class AddComissionedStaffFrame {

	private JFrame frame;
	private JTextField nameTextField;
	private JTextField idTextField;
	private JTextField designationTextField;
	private JTextField comissionTextField;
	private JTextField salesTextField;
	private boolean admin;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddComissionedStaffFrame window = new AddComissionedStaffFrame(admin);
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
	public AddComissionedStaffFrame(boolean b) {
		this.admin = b;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Information For Comission Staff");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(34, 29, 369, 47);
		frame.getContentPane().add(lblNewLabel);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nameTextField.setBounds(163, 87, 171, 20);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(65, 87, 88, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idTextField.setColumns(10);
		idTextField.setBounds(163, 118, 171, 20);
		frame.getContentPane().add(idTextField);
		
		designationTextField = new JTextField();
		designationTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		designationTextField.setColumns(10);
		designationTextField.setBounds(163, 149, 171, 20);
		frame.getContentPane().add(designationTextField);
		
		comissionTextField = new JTextField();
		comissionTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comissionTextField.setColumns(10);
		comissionTextField.setBounds(163, 180, 171, 20);
		frame.getContentPane().add(comissionTextField);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(65, 118, 88, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Designation");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(65, 149, 88, 20);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Comission");
		lblNewLabel_1_3.setToolTipText("Enter only the amount (No currency signs)");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(65, 180, 88, 20);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nameTextField.getText().isEmpty() || idTextField.getText().isEmpty() || designationTextField.getText().isEmpty()
						|| comissionTextField.getText().isEmpty() || salesTextField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please type in all the information");
					return;
				}
				
				String name = nameTextField.getText();
				String id = idTextField.getText();
				String designation = designationTextField.getText();
				double comission = Double.parseDouble(comissionTextField.getText());
				int sales = Integer.parseInt(salesTextField.getText());
				
				FileOperationsComissionedStaff op = new FileOperationsComissionedStaff();
				op.add(new ComissionedStaff (name, id, designation, comission, sales));
				JOptionPane.showMessageDialog(null, "Add Successful");
			} 
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(96, 262, 89, 23);
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
		btnBack.setBounds(245, 262, 89, 23);
		frame.getContentPane().add(btnBack);
		
		salesTextField = new JTextField();
		salesTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		salesTextField.setColumns(10);
		salesTextField.setBounds(163, 211, 171, 20);
		frame.getContentPane().add(salesTextField);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Sales");
		lblNewLabel_1_3_1.setToolTipText("Enter only the amount (No currency signs)");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(65, 211, 88, 20);
		frame.getContentPane().add(lblNewLabel_1_3_1);
	}

}
