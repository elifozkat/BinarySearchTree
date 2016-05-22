import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File input = new File("input.txt");
		File output = new File("output.txt");
		Scanner sc = new Scanner(input);
		PrintWriter printer = new PrintWriter(output);
		BinarySearchTree out = new BinarySearchTree();

		while (sc.hasNextLine()) {
			String word = sc.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(word, " ,?.!-");
			while(tokenizer.hasMoreTokens()){
				
			

			Node newNode = new Node(tokenizer.nextToken(), 1);
			//if (out.contains(out.getRoot(),newNode))
			//	newNode.setValue(newNode.getValue() + 1);
			
			out.add(newNode);
		
		}
		}
		
		printer.println(out.toString(out.getRoot())+"\r\nTotal number of different words : "+out.size());
		
		printer.close();

	}

}
