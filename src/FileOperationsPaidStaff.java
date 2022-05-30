import java.io.*;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileOperationsPaidStaff implements Operations {
	@Override
	public void add(Object obj) {
		try {
			File file = new File ("PaidStaff.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter wrt = new PrintWriter(new FileWriter(file, true));
			wrt.println(((PaidStaff)obj).getName());
			wrt.println(((PaidStaff)obj).getId());
			wrt.println(((PaidStaff)obj).getDesignation());
			wrt.println(((PaidStaff)obj).getSalary());
			wrt.close();
			
		}catch(IOException e) {
			System.out.println("PaidStaff File Exception");
		}
		
	}

	@Override
	public void edit(Object obj) {
		boolean found = false;
		try {
			File file = new File ("PaidStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("PaidStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				File tempFile = new File ("tempFile.txt");
				PrintWriter wrt = new PrintWriter (new FileWriter(tempFile, true));
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				
				PaidStaff read;
				while (in.hasNext()){
					read = new PaidStaff (in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()));
					
					if (((PaidStaff)obj).getId().equals(read.getId())) {
						wrt.println(((PaidStaff)obj).getName());
						wrt.println(((PaidStaff)obj).getId());
						wrt.println(((PaidStaff)obj).getDesignation());
						wrt.println(((PaidStaff)obj).getSalary());
						found = true;
					}
					
					else {
						wrt.println(read.getName());
						wrt.println(read.getId());
						wrt.println(read.getDesignation());
						wrt.println(read.getSalary());
					}
				}
				in.close();
				wrt.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				
			}
		}catch(Exception e) {
			System.out.println("PaidStaff Edit Exception");
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
		boolean found = false;
		try {
			File file = new File ("PaidStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("PaidStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				File tempFile = new File ("tempFile.txt");
				PrintWriter wrt = new PrintWriter (new FileWriter(tempFile, true));
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				
				PaidStaff read;
				while (in.hasNext()){
					read = new PaidStaff (in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()));
					
					if (id.equals(read.getId())) {
						found = true;
					}
					if (!(id.equals(read.getId()))) {
						wrt.println(read.getName());
						wrt.println(read.getId());
						wrt.println(read.getDesignation());
						wrt.println(read.getSalary());
					}
					
				}
				in.close();
				wrt.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				
			}
		}catch(Exception e) {
			System.out.println("PaidStaff Delete Exception");
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
		PaidStaff read = null;
		try {
			File file = new File ("PaidStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("PaidStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				while (in.hasNextLine()){
					read = new PaidStaff (in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()));
					
					if ((id.equals(read.getId()))) {
						found = true;
						break;
					}
					
				}
				in.close();
				
			}
		}catch(Exception e) {
			System.out.println("PaidStaff Delete Exception");
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
