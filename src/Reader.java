import java.io.*;
import java.util.*;
public class Reader{

	/**
    reads and prints the content in the file with directory filename
    @param filename a string containing the directory of the target file
    **/
	public static void readData(String filename) throws FileNotFoundException 
	{
		File inFile = new File(filename);
		Scanner in = new Scanner(inFile);   // Can throw a FileNotFoundException
		while(in.hasNextLine()){
			System.out.println(in.nextLine());
		}
		in.close();  
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter the directory of the file you wish to read: ");
		Scanner in = new Scanner(System.in);
		String filename = in.nextLine();
		
		boolean isFile = false;
		do{
			try{
				try{
					readData(filename);
					isFile = true;
				}
				finally{
					in.close();
				}
			}
			catch(IOException exception){
				
			}
		}while(!isFile);
	}
}
