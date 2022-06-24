package Injector;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static String name = null;

    public static void main(String[] args) throws IOException, InterruptedException {
    	 if (System.getProperty("os.name").contains("Windows"))
             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         else
             Runtime.getRuntime().exec("clear");

    	System.out.print(ANSI.RED + "\r\n"
    			+ " ___  ________         ___  _______   ________ _________  ________  ________     \r\n"
    			+ "|\\  \\|\\   ___  \\      |\\  \\|\\  ___ \\ |\\   ____\\\\___   ___\\\\   __  \\|\\   __  \\    \r\n"
    			+ "\\ \\  \\ \\  \\\\ \\  \\     \\ \\  \\ \\   __/|\\ \\  \\___\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\   \r\n"
    			+ " \\ \\  \\ \\  \\\\ \\  \\  __ \\ \\  \\ \\  \\_|/_\\ \\  \\       \\ \\  \\ \\ \\  \\\\\\  \\ \\   _  _\\  \r\n"
    			+ "  \\ \\  \\ \\  \\\\ \\  \\|\\  \\\\_\\  \\ \\  \\_|\\ \\ \\  \\____   \\ \\  \\ \\ \\  \\\\\\  \\ \\  \\\\  \\| \r\n"
    			+ "   \\ \\__\\ \\__\\\\ \\__\\ \\________\\ \\_______\\ \\_______\\  \\ \\__\\ \\ \\_______\\ \\__\\\\ _\\ \r\n"
    			+ "    \\|__|\\|__| \\|__|\\|________|\\|_______|\\|_______|   \\|__|  \\|_______|\\|__|\\|__|\r\n"
    			+ "                                                                                 \r\n"
    			+ "                                                                                 \r\n"
    			+ "                                                                                 \r\n"
    			+ ""+ ANSI.RESET);
    	Scanner scanner = new Scanner(System.in);
    	System.out.print(ANSI.GREEN +"USAGE : \r\n");
    	System.out.print("java -Djava.library.path=\"%JAVA_HOME%\\jre\\bin\" -jar Injector.jar \r\n" + ANSI.RESET);
    	System.out.print("\r\n");
    	System.out.print("\r\n");
    	System.out.print("java agent directory : ");
    	name = scanner.nextLine();
    
        try {
            Injector.inject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}