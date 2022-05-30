import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuFrame {

	private JFrame frame;
	private boolean admin;

	/**
	 * Launch the application.
	 */
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuFrame window = new MainMenuFrame(admin);
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
	
	
	public MainMenuFrame(boolean b) {
		this.admin = b;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(179, 0, 405, 461);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		layeredPane.add(panel_1, "name_19786796036100");
		
		JButton btnNewButton = new JButton("Add Staff");
		btnNewButton.setBounds(67, 136, 108, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					AddPaidStaffFrame add = new AddPaidStaffFrame(true);
					add.newScreen();
				}
				else {
					AddPaidStaffFrame add = new AddPaidStaffFrame(false);
					add.newScreen();
				}
				
			}
		});
		panel_1.setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnNewButton);
		
		JButton btnEditStaff = new JButton("Edit Staff");
		btnEditStaff.setBounds(233, 136, 108, 23);
		btnEditStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					EditPaidStaffFrame edit = new EditPaidStaffFrame(true);
					edit.newScreen();
				}
				else {
					EditPaidStaffFrame edit = new EditPaidStaffFrame(false);
					edit.newScreen();
				}
			}
		});
		btnEditStaff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnEditStaff);
		
		JButton btnDeleteStaff = new JButton("Delete Staff");
		btnDeleteStaff.setBounds(67, 219, 108, 23);
		btnDeleteStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					DeletePaidStaffFrame delete = new DeletePaidStaffFrame(true);
					delete.newScreen();
				}
				else {
					DeletePaidStaffFrame delete = new DeletePaidStaffFrame(false);
					delete.newScreen();
				}
			}
		});
		btnDeleteStaff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnDeleteStaff);
		
		JButton btnSearchStaff = new JButton("Search Staff");
		btnSearchStaff.setBounds(233, 219, 108, 23);
		btnSearchStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					SearchPaidStaffFrame search = new SearchPaidStaffFrame(true);
					search.newScreen();
				}
				else {
					SearchPaidStaffFrame search = new SearchPaidStaffFrame(false);
					search.newScreen();
				}
			}
		});
		btnSearchStaff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(btnSearchStaff);
		
		JLabel lblNewLabel = new JLabel("Paid Staff");
		lblNewLabel.setBounds(105, 58, 189, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		layeredPane.add(panel_2, "name_19851496320200");
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Add Staff");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					AddHourlyStaffFrame add = new AddHourlyStaffFrame(true);
					add.newScreen();
				}
				else {
					AddHourlyStaffFrame add = new AddHourlyStaffFrame(false);
					add.newScreen();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(67, 136, 108, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnEditStaff_1 = new JButton("Edit Staff");
		btnEditStaff_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					EditHourlyStaffFrame edit = new EditHourlyStaffFrame(true);
					edit.newScreen();
				}
				else {
					EditHourlyStaffFrame edit = new EditHourlyStaffFrame(false);
					edit.newScreen();
				}
			}
		});
		btnEditStaff_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditStaff_1.setBounds(233, 136, 108, 23);
		panel_2.add(btnEditStaff_1);
		
		JButton btnDeleteStaff_1 = new JButton("Delete Staff");
		btnDeleteStaff_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					DeleteHourlyStaffFrame delete = new DeleteHourlyStaffFrame(true);
					delete.newScreen();
				}
				else {
					DeleteHourlyStaffFrame delete = new DeleteHourlyStaffFrame(false);
					delete.newScreen();
				}
			}
		});
		btnDeleteStaff_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDeleteStaff_1.setBounds(67, 219, 108, 23);
		panel_2.add(btnDeleteStaff_1);
		
		JButton btnSearchStaff_1 = new JButton("Search Staff");
		btnSearchStaff_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					SearchHourlyStaffFrame search = new SearchHourlyStaffFrame(true);
					search.newScreen();
				}
				else {
					SearchHourlyStaffFrame search = new SearchHourlyStaffFrame(false);
					search.newScreen();
				}
			}
		});
		btnSearchStaff_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearchStaff_1.setBounds(233, 219, 108, 23);
		panel_2.add(btnSearchStaff_1);
		
		JLabel lblHourlyStaff = new JLabel("Hourly Staff");
		lblHourlyStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblHourlyStaff.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHourlyStaff.setBounds(105, 58, 189, 33);
		panel_2.add(lblHourlyStaff);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		layeredPane.add(panel_3, "name_19854009301300");
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Add Staff");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					AddComissionedStaffFrame add = new AddComissionedStaffFrame(true);
					add.newScreen();
				}
				else {
					AddComissionedStaffFrame add = new AddComissionedStaffFrame(false);
					add.newScreen();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(67, 136, 108, 23);
		panel_3.add(btnNewButton_2);
		
		JButton btnEditStaff_2 = new JButton("Edit Staff");
		btnEditStaff_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					EditComissionedStaffFrame edit = new EditComissionedStaffFrame(true);
					edit.newScreen();
				}
				else {
					EditComissionedStaffFrame edit = new EditComissionedStaffFrame(false);
					edit.newScreen();
				}
			}
		});
		btnEditStaff_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditStaff_2.setBounds(233, 136, 108, 23);
		panel_3.add(btnEditStaff_2);
		
		JButton btnDeleteStaff_2 = new JButton("Delete Staff");
		btnDeleteStaff_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					DeleteComissionedStaffFrame delete = new DeleteComissionedStaffFrame(true);
					delete.newScreen();
				}
				else {
					DeleteComissionedStaffFrame delete = new DeleteComissionedStaffFrame(false);
					delete.newScreen();
				}
			}
		});
		btnDeleteStaff_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDeleteStaff_2.setBounds(67, 219, 108, 23);
		panel_3.add(btnDeleteStaff_2);
		
		JButton btnSearchStaff_2 = new JButton("Search Staff");
		btnSearchStaff_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					SearchComissionedStaffFrame search = new SearchComissionedStaffFrame(true);
					search.newScreen();
				}
				else {
					DeleteComissionedStaffFrame search = new DeleteComissionedStaffFrame(false);
					search.newScreen();
				}
			}
		});
		btnSearchStaff_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearchStaff_2.setBounds(233, 219, 108, 23);
		panel_3.add(btnSearchStaff_2);
		
		JLabel lblComissionedStaff = new JLabel("Comissioned Staff");
		lblComissionedStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblComissionedStaff.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblComissionedStaff.setBounds(105, 58, 189, 33);
		panel_3.add(lblComissionedStaff);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		layeredPane.add(panel_4, "name_3374075090500");
		panel_4.setLayout(null);
		
		JLabel lblManagementStaff = new JLabel("Management Staff");
		lblManagementStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagementStaff.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblManagementStaff.setBounds(105, 58, 189, 33);
		panel_4.add(lblManagementStaff);
		
		JButton btnNewButton_2_1 = new JButton("Add Management");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					AddManagementStaffFrame add = new AddManagementStaffFrame(true);
					add.newScreen();
				}
				else {
					AddManagementStaffFrame add = new AddManagementStaffFrame(false);
					add.newScreen();
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(116, 136, 169, 23);
		panel_4.add(btnNewButton_2_1);
		
		JButton btnEditStaff_2_1 = new JButton("Remove Management");
		btnEditStaff_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				if (admin) {	
					RemoveManagementStaffFrame remove = new RemoveManagementStaffFrame(true);
					remove.newScreen();
				}
				else {
					RemoveManagementStaffFrame remove = new RemoveManagementStaffFrame(false);
					remove.newScreen();
				}
			}
		});
		btnEditStaff_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditStaff_2_1.setBounds(116, 219, 169, 23);
		panel_4.add(btnEditStaff_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 180, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton PaidStaffButton = new JButton("Paid Staff");
		PaidStaffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		PaidStaffButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PaidStaffButton.setBounds(35, 100, 110, 37);
		panel.add(PaidStaffButton);
		
		JButton HourlyStaffButton = new JButton("Hourly Staff");
		HourlyStaffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		HourlyStaffButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		HourlyStaffButton.setBounds(35, 180, 110, 37);
		panel.add(HourlyStaffButton);
		
		JButton ComissionedStaffButton = new JButton();
		ComissionedStaffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		ComissionedStaffButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ComissionedStaffButton.setBounds(35, 259, 110, 42);
		ComissionedStaffButton.setLayout(new BorderLayout());
		JLabel ComissionedStaffButtonlabel1 = new JLabel ("Comissioned"); 
		ComissionedStaffButtonlabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JLabel ComissionedStaffButtonlabel2 = new JLabel ("      Staff");
		ComissionedStaffButtonlabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ComissionedStaffButton.add(BorderLayout.CENTER, ComissionedStaffButtonlabel1);
		ComissionedStaffButton.add(BorderLayout.SOUTH, ComissionedStaffButtonlabel2);
		ComissionedStaffButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(ComissionedStaffButton);
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AppLaunchLoginFrame.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(91, 438, 89, 23);
		panel.add(btnNewButton_3);
		
		JButton managersButton = new JButton("Management");
		managersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		managersButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		managersButton.setBounds(33, 340, 114, 37);
		if (admin) {	
			panel.add(managersButton);
		}
		
	}

	public void setVisible (boolean b) {
		frame.setVisible(b);
	}
}
