package konwerter;

import java.util.*;
import java.io.*;

public class Converter {
	private int menu;

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public void javatocpp() {
		System.out.println("javatocpp");

		FileReader fr = null;
		String rdr = "";
		
		String linia2 = "";
		FileWriter cpp = null;
		FileReader cpp2 = null;

		// file open:
		try {
			fr = new FileReader("test_class_java.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		}
		
//		BufferedReader bfr = new BufferedReader(fr);
//		// print file:
//		try {
//			while ((linia = bfr.readLine()) != null) {
//				System.out.println(linia);
//			}
//		} catch (IOException e) {
//			System.out.println("Error while reading");
//			System.exit(2);
//		}
		
		// cpp create:
		BufferedReader read = new BufferedReader(fr);
		try {
			cpp = new FileWriter("converted_javatocpp.txt");
			cpp.write("test");
			rdr = read.readLine();
			cpp.write(rdr);
			cpp.close();
			
			rdr.split(" ");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			System.out.println("Error");
			System.exit(2);
		}

		// cpp open:
		try {
			cpp2 = new FileReader("converted_javatocpp.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		}
		BufferedReader bfr2 = new BufferedReader(cpp2);
		// print cpp:
		try {
			while ((linia2 = bfr2.readLine()) != null) {
				System.out.println(linia2);
			}
		} catch (IOException e) {
			System.out.println("Error while reading2");
			System.exit(2);
		}
	}

	public void cpptojava() {
		System.out.println("cpptojava");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter con = new Converter();

		System.out.println("            CLASS CONVERTER      ");
		System.out.println("[===================================]");
		System.out.println("[===]      1. Java to C++       [===]");
		System.out.println("[===]      2. C++ to Java       [===]");
		System.out.println("[===================================]");
		System.out.println("Select: ");
		con.setMenu(sc.nextInt());
		sc.close();
		switch (con.getMenu()) {
		case 1:
			con.javatocpp();
			break;
		case 2:
			con.cpptojava();
			break;
		default:
			System.out.println("Wrong choose");

		}
	}
}