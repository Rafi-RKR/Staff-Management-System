import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileOperationsHourlyStaff implements Operations {
	@Override
	public void add(Object obj) {
		try {
			File file = new File ("HourlyStaff.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter wrt = new PrintWriter(new FileWriter(file, true));
			wrt.println(((HourlyStaff)obj).getName());
			wrt.println(((HourlyStaff)obj).getId());
			wrt.println(((HourlyStaff)obj).getDesignation());
			wrt.println(((HourlyStaff)obj).getHours());
			wrt.println(((HourlyStaff)obj).getHourlyRate());
			wrt.close();
			
		}catch(IOException e) {
			System.out.println("HourlyStaff File Exception");
		}
		
	}

	@Override
	public void edit(Object obj) {
		boolean found = false;
		try {
			File file = new File ("HourlyStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("HourlyStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				File tempFile = new File ("tempFile.txt");
				PrintWriter wrt = new PrintWriter (new FileWriter(tempFile, true));
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				
				HourlyStaff read;
				while (in.hasNext()){
					read = new HourlyStaff (in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Double.parseDouble(in.nextLine()));
					
					if (((HourlyStaff)obj).getId().equals(read.getId())) {
						wrt.println(((HourlyStaff)obj).getName());
						wrt.println(((HourlyStaff)obj).getId());
						wrt.println(((HourlyStaff)obj).getDesignation());
						wrt.println(((HourlyStaff)obj).getHours());
						wrt.println(((HourlyStaff)obj).getHourlyRate());
						found = true;
					}
					
					else {
						wrt.println(read.getName());
						wrt.println(read.getId());
						wrt.println(read.getDesignation());
						wrt.println(read.getHours());
						wrt.println(read.getHourlyRate());
					}
				}
				in.close();
				wrt.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				
			}
		}catch(Exception e) {
			System.out.println("HourlyStaff Edit Exception");
			e.printStackTrace();
		}
		if (found) {
			JOptionPane.showMessageDialog(null, "Edit Successful");
		}
		else {
			JOptionPane.showMessageDialog(null, "Data not found");
		}
		
	}

	@Override
	public void delete(String id) {
		boolean found = true;
		try {
			File file = new File ("HourlyStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("HourlyStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				File tempFile = new File ("tempFile.txt");
				PrintWriter wrt = new PrintWriter (new FileWriter(tempFile, true));
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				
				HourlyStaff read;
				while (in.hasNext()){
					read = new HourlyStaff (in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Double.parseDouble(in.nextLine()));
					
					if (id.equals(read.getId())) {
						found = true;
					}
					if (!(id.equals(read.getId()))) {
						wrt.println(read.getName());
						wrt.println(read.getId());
						wrt.println(read.getDesignation());
						wrt.println(read.getHours());
						wrt.println(read.getHourlyRate());
					}
					
				}
				in.close();
				wrt.close();
				
				file.delete();
				tempFile.renameTo(file);
				
			}
		}catch(Exception e) {
			System.out.println("HourlyStaff Delete Exception");
		}
		if (found) {
			JOptionPane.showMessageDialog(null, "Delete Successful");
		}
		else {
			JOptionPane.showMessageDialog(null, "Data not found");
		}
	}

	@Override
	public Object search(String id) {
		boolean found = false;
		HourlyStaff read = null;
		try {
			File file = new File ("HourlyStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("HourlyStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				while (in.hasNext()){
					read = new HourlyStaff (in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Double.parseDouble(in.nextLine()));
					
					if ((id.equals(read.getId()))) {
						found = true;
						break;
					}
					
				}
				in.close();
				
			}
		}catch(Exception e) {
			System.out.println("HourlyStaff Delete Exception");
		}
		if (found) {
			JOptionPane.showMessageDialog(null, "Staff found");
			return read;
		}
		else {
			JOptionPane.showMessageDialog(null, "Staff not found");
			return null;
		}
	}
	
	
}
