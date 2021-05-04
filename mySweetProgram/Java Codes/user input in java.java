package hello;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello" + ", " + name + " nice to meet you");
		

	}

}

//2- hands on java (input):
package mySweetProgram;

import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("Hello" + " " + s);

	}

}

package mySweetProgram;

import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = new String("nice to meet you");
		System.out.println("Hello" + " " + s + " " + t);

	}

}

//int x = 5; //declaration and initialization
int x; //declaration		
x = 5; //initialization	

//2- user input we use if statement and else if and else:
package mySweetProgram;

import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		//int x = 5; //declaration and initialization
		
		if(s.equals("abdellah")) {
			System.out.println("welcome" + " " + s);
		}else if(s.equals("youcef")){
			System.out.println("welcome" + " " + s);
		}else {
			System.out.println("you are not welcome here" + " " + s);
		}
		
		in.close();
	}

}

//loops:
//while loop:
int i = 0; //initialization
while(i <= 10) { //condition
	System.out.println("i is" + " " + i);
	i++; //update						
}

//for loop:
for(int i = 0; i <= 10; i++) {
	System.out.println("i is" + " " + i);			
}

//do while:
int i = 100;
do {		
	System.out.println("i is" + " " + i);		
	i++;		
}while(i <= 10);

// in folder eclips workspace we tape:
// git init
// ls -a
// sudo echo "
// sudo " > .gitignore
// git add .
// git status
// git commit -m "initial commit"
// git status	
// git log
//git remote add origin https://github.com/hamid254112/30DaysOfJava.git
//git branch -M main
//git push -u origin main	
//create a new project and new file we called test
// git status
// git add test/
// git commit -m "test for github"
// git log
// git push origin main	


//create array we using for loop:
package mySweetProgram;

import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give us a size.");
		int size = in.nextInt();
		
		int[] grades = new int[size];
		
		System.out.println("Enter " + size + " numbers. Press enter after each");
		
		for(int i = 0; i < size; i++) {
			grades[i] = in.nextInt();
		}
		in.close();
		
		for(int i = 0; i < size; i++) {
			System.out.println(grades[i]);
		}
	}

}

//how to read a file in java:
package mySweetProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("/home/bm2020/eclipse-workspace/mySweetProgram/src/abdellah.txt"));
		
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
	}

}

//using for and while loops to read file.txt:
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

					
