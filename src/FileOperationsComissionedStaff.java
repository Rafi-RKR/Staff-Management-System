import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FileOperationsComissionedStaff implements Operations{

	@Override
	public void add(Object obj) {
		try {
			File file = new File ("ComissionedStaff.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter wrt = new PrintWriter(new FileWriter(file, true));
			wrt.println(((ComissionedStaff)obj).getName());
			wrt.println(((ComissionedStaff)obj).getId());
			wrt.println(((ComissionedStaff)obj).getDesignation());
			wrt.println(((ComissionedStaff)obj).getComissionRate());
			wrt.println(((ComissionedStaff)obj).getSales());
			wrt.close();
			
		}catch(IOException e) {
			System.out.println("ComissionedStaff File Exception");
		}
		
	}

	@Override
	public void edit(Object obj) {
		boolean found = false;
		try {
			File file = new File ("ComissionedStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("ComissionedStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				File tempFile = new File ("tempFile.txt");
				PrintWriter wrt = new PrintWriter (new FileWriter(tempFile, true));
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				
				ComissionedStaff read;
				while (in.hasNext()){
					read = new ComissionedStaff (in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Integer.parseInt(in.nextLine()));
					
					if (((ComissionedStaff)obj).getId().equals(read.getId())) {
						wrt.println(((ComissionedStaff)obj).getName());
						wrt.println(((ComissionedStaff)obj).getId());
						wrt.println(((ComissionedStaff)obj).getDesignation());
						wrt.println(((ComissionedStaff)obj).getComissionRate());
						wrt.println(((ComissionedStaff)obj).getSales());
						found = true;
					}
					
					else {
						wrt.println(read.getName());
						wrt.println(read.getId());
						wrt.println(read.getDesignation());
						wrt.println(read.getComissionRate());
						wrt.println(read.getSales());
					}
				}
				in.close();
				wrt.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				
			}
		}catch(Exception e) {
			System.out.println("ComissionedStaff Edit Exception");
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
			File file = new File ("ComissionedStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("ComissionedStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				File tempFile = new File ("tempFile.txt");
				PrintWriter wrt = new PrintWriter (new FileWriter(tempFile, true));
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				
				ComissionedStaff read;
				while (in.hasNext()){
					read = new ComissionedStaff (in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Integer.parseInt(in.nextLine()));
					
					if (id.equals(read.getId())) {
						found = true;
					}
					if (!(id.equals(read.getId()))) {
						wrt.println(read.getName());
						wrt.println(read.getId());
						wrt.println(read.getDesignation());
						wrt.println(read.getComissionRate());
						wrt.println(read.getSales());
					}
					
				}
				in.close();
				wrt.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				
			}
		}catch(Exception e) {
			System.out.println("ComissionedStaff Delete Exception");
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
		ComissionedStaff read = null;
		try {
			File file = new File ("ComissionedStaff.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("ComissionedStaff File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				while (in.hasNextLine()){
					read = new ComissionedStaff (in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Integer.parseInt(in.nextLine()));
					
					if ((id.equals(read.getId()))) {
						found = true;
						break;
					}
					
				}
				in.close();
				
			}
		}catch(Exception e) {
			System.out.println("ComissionedStaff Delete Exception");
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
