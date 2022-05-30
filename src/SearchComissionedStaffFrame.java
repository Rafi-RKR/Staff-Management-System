import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class SearchComissionedStaffFrame {

	private JFrame frame;
	private JTextField searchIdTextField;
	private JTextField nameTextField;
	private JTextField idTextField;
	private JTextField designationTextField;
	private JTextField comissionTextField;
	private JTextField salesTextField;
	private JTextField salaryTextField;
	private boolean admin;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchComissionedStaffFrame window = new SearchComissionedStaffFrame(admin);
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
	public SearchComissionedStaffFrame(boolean b) {
		this.admin = b;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 500, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(163, 0, 321, 371);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblInformationForPaid = new JLabel("Information For Comission Staff");
		lblInformationForPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformationForPaid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInformationForPaid.setBounds(0, 26, 316, 47);
		panel.add(lblInformationForPaid);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("");
				idTextField.setText("");
				designationTextField.setText("");
				comissionTextField.setText("");
				salesTextField.setText("");
				salaryTextField.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(111, 306, 89, 23);
		panel.add(btnClear);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nameTextField.setColumns(10);
		nameTextField.setBounds(129, 104, 171, 20);
		panel.add(nameTextField);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 104, 88, 20);
		panel.add(lblNewLabel_1);
		
		idTextField = new JTextField();
		idTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idTextField.setColumns(10);
		idTextField.setBounds(129, 135, 171, 20);
		panel.add(idTextField);
		
		designationTextField = new JTextField();
		designationTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		designationTextField.setColumns(10);
		designationTextField.setBounds(129, 166, 171, 20);
		panel.add(designationTextField);
		
		comissionTextField = new JTextField();
		comissionTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comissionTextField.setColumns(10);
		comissionTextField.setBounds(129, 197, 171, 20);
		panel.add(comissionTextField);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(31, 135, 88, 20);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Designation");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(31, 166, 88, 20);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Comission");
		lblNewLabel_1_3.setToolTipText("Enter only the amount (No currency signs)");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(31, 197, 88, 20);
		panel.add(lblNewLabel_1_3);
		
		salesTextField = new JTextField();
		salesTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		salesTextField.setColumns(10);
		salesTextField.setBounds(129, 228, 171, 20);
		panel.add(salesTextField);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Sales");
		lblNewLabel_1_3_1.setToolTipText("Enter only the amount (No currency signs)");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(31, 228, 88, 20);
		panel.add(lblNewLabel_1_3_1);
		
		salaryTextField = new JTextField();
		salaryTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		salaryTextField.setColumns(10);
		salaryTextField.setBounds(129, 260, 171, 20);
		panel.add(salaryTextField);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Salary");
		lblNewLabel_1_3_1_1.setToolTipText("Enter only the amount (No currency signs)");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1_1.setBounds(31, 260, 88, 20);
		panel.add(lblNewLabel_1_3_1_1);
		
		searchIdTextField = new JTextField();
		searchIdTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		searchIdTextField.setBounds(43, 96, 86, 20);
		frame.getContentPane().add(searchIdTextField);
		searchIdTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 99, 28, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchId = searchIdTextField.getText();
				FileOperationsComissionedStaff op = new FileOperationsComissionedStaff();
				ComissionedStaff foundStaff = (ComissionedStaff)op.search(searchId);
				if (foundStaff == null) {
					return;
				}
				nameTextField.setText(foundStaff.getName());
				idTextField.setText(foundStaff.getId());
				designationTextField.setText(foundStaff.getDesignation());
				comissionTextField.setText(Double.toString(foundStaff.getComissionRate()));
				salesTextField.setText(Integer.toString(foundStaff.getSales()));
				salaryTextField.setText(Double.toString(foundStaff.getSalary()));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(35, 147, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(35, 205, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
