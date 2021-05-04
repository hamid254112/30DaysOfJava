package mySweetProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("/home/bm2020/eclipse-workspace/mySweetProgram/src/abdellah.txt"));
		
		List<String> mahmoudi = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			mahmoudi.add(in.nextLine());
		}
		
		for(int i = 0; i < mahmoudi.size(); i++) {
			System.out.println("mahmoudi " + mahmoudi.get(i));
		}
		in.close();
	}

}
