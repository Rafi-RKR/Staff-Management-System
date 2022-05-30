import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperationsLogin {
	public void add (Login log) {
		try {
			File file = new File ("LoginData.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			PrintWriter wrt = new PrintWriter(new FileWriter(file, true));
			wrt.println(log.getUserName());
			wrt.println(log.getPassword());
			wrt.close();
			
		}catch(IOException e) {
			System.out.println("LoginData File Exception");
		}
	}
	
	public void remove (Login log) {
		try {
			File file = new File ("LoginData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("LoginData File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				File tempFile = new File ("tempFile.txt");
				PrintWriter wrt = new PrintWriter (new FileWriter(tempFile, true));
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				
				Login read;
				while (in.hasNext()){
					read = new Login (in.nextLine(), in.nextLine());
					
					if (!(log.getUserName().equals(read.getUserName()))) {
						wrt.println(read.getUserName());
						wrt.println(read.getPassword());
					}
					
				}
				in.close();
				wrt.close();
				
				file.delete();
				tempFile.renameTo(file);
				
				
			}
		}catch(Exception e) {
			System.out.println("LoginData Delete Exception");
		}
	}
	
	public boolean found(Login log) {
		int flag = 0;
		Login read = null;
		try {
			File file = new File ("LoginData.txt");
			if (!file.exists()) {
				throw new FileNotFoundException("LoginData File Exception");
			}
			
			else {
				Scanner in = new Scanner(file);
				
				while (in.hasNextLine()){
					read = new Login (in.nextLine(), in.nextLine());
					
					if (read.getUserName().equals(log.getUserName()) && read.getPassword().equals(log.getPassword())) {
						flag = 1;
					}
					
				}
				in.close();
				
			}
		}catch(Exception e) {
			System.out.println("PaidStaff Delete Exception");
		}
		
		if (flag == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
