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

//in folder eclips workspace we tape:
//git init
//ls -a
// sudo echo "
// sudo " > .gitignore
// git add .
// git status								
