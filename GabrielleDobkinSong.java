//Gabrielle Dobkin
//Date: 9/27
//Period: #1
//Assignment #1
//
//This program will print a song without redundancies in the code and repetitions in the main method
public class GabrielleDobkinSong {
	//In the main method I call all of the individual verses
	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
		lastVerse();

	}
	//the next 7 methods detail the contents of each verse. They have a unique portion and a part that calls upon other static methods to eliminate redundancy
	public static void verse1() {
		intro();
		System.out.println("fly.");
		die();
		System.out.println();
	}
	public static void verse2() {
		intro();
		System.out.println("spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		message1();
		die();
		System.out.println();

	}
	public static void verse3() {
		intro();
		System.out.println("bird,");
		System.out.println("How absurd to swallow a bird.");
		message2();
		die();
		System.out.println();
	}
	public static void verse4() {
		intro();
		System.out.println("cat,");
		System.out.println("Imagine that to swallow a cat.");
		message3();
		die();
		System.out.println();
	}
	public static void verse5() {
		intro();
		System.out.println("dog,");
		System.out.println("What a hog to swallow a dog.");
		message4();
		die();
		System.out.println();
	}
	public static void verse6() {
		intro();
		System.out.println("badger,");
		System.out.println("It barely made it down inside her.");
		message5();
		die();
		System.out.println();
	}
	public static void lastVerse() {
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
	//this sentence is repeated at the beginning of every verse
	//I made it a print statement so I can just plug the animal at the end individually in each verse method with a println statement
	public static void intro() {
		System.out.print("There was an old woman who swallowed a ");
	}
	//These are the repetitive last two lines of every verse
	public static void die() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	//for the messages I write the line that is new then I call the previous message
	//this nests all the statements and reduces the amount of code I have to write
	//Each different line is only written once and then repeatedly called upon
	public static void message1() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void message2() {
		System.out.println("She swallowed the bird to catch the spider,");
		message1();
	}
	public static void message3() {
		System.out.println("She swallowed the cat to catch the bird,");
		message2();
	}
	public static void message4() {
		System.out.println("She swallowed the dog to catch the cat,");
		message3();
	}
	public static void message5() {
		System.out.println("She swallowed a badger to catch the dog,");
		message4();
	}
}
