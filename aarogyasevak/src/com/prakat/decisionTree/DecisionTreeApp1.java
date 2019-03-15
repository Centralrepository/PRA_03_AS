package com.prakat.decisionTree;

//DECISION TREE  APPLICATION
//Frans Coenen
//Thursday 15 August 2002
//Department of Computer Science, University of Liverpool
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.ResourceBundle;

class DecisionTreeApp1 {

	static BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
	static DecisionTree newTree;
	private static ResourceBundle rb = ResourceBundle.getBundle("data");
	static String node1= rb.getString("A");
	static String node2= rb.getString("B");
	static String node3= rb.getString("C");
	static String node4= rb.getString("D");
	static String node5= rb.getString("E");
	static String node6= rb.getString("F");
	static String node7= rb.getString("G");
	static String node8= rb.getString("H");
	static String node9= rb.getString("I");
	static String node10= rb.getString("J");
	static String node11= rb.getString("K");
	static String node12= rb.getString("L");
	static String node13= rb.getString("M");
	static String node14= rb.getString("N");
	static String node15= rb.getString("O");
	static String node16= rb.getString("P");
	static String node17= rb.getString("Q");
	static String node18= rb.getString("R");
	static String node19= rb.getString("S");
	static String node20= rb.getString("T");
	static String node21= rb.getString("U");

	
	public static void main(String[] args) throws IOException {

		// Create instance of class DecisionTree
		newTree = new DecisionTree();

		// Generate tree
		DecisionTreeApp1 app= new DecisionTreeApp1();
		app.generateTree();
		// Output tree

		// System.out.println("\nOUTPUT DECISION TREE");
		// System.out.println("====================");
	//	newTree.outputBinTree();

		// Query tree

		queryTree();
	}

	/* GENERATE TREE */
	 void generateTree() throws IOException {
		// System.out.println("\nGENERATE DECISION TREE");
		// System.out.println("======================");
		
		
		newTree.createRoot(1, node1);
		newTree.addYesNode(1, 2, node2);
		newTree.addNoNode(1, 3, node3);
		newTree.addYesNode(2, 4, node4);
		newTree.addNoNode(2, 5, node5);
		newTree.addYesNode(3, 6, node6);
		newTree.addNoNode(3, 7, node7);
		newTree.addYesNode(7, 8, node8);
		newTree.addNoNode(7, 9, node9);
		newTree.addYesNode(8, 10, node10);
		newTree.addNoNode(8, 11, node11);
		newTree.addYesNode(11, 12, node12);
		newTree.addNoNode(11, 13, node13);
		newTree.addYesNode(9, 14, node14);
		newTree.addNoNode(9, 15, node15);
		newTree.addYesNode(15, 16, node16);
		newTree.addNoNode(15, 17, node17);
		newTree.addYesNode(17, 18, node18);
		newTree.addNoNode(17, 19, node19);
		newTree.addYesNode(19, 20, node20);
		newTree.addNoNode(19, 21, node21);
	}

	/* QUERY TREE */

	static void queryTree() throws IOException {
		// System.out.println("\nQUERY DECISION TREE");
		// System.out.println("===================");
		newTree.queryBinTree();

		// Option to exit

		optionToExit();
	}

	/* OPTION TO EXIT PROGRAM */

	static void optionToExit() throws IOException {
		System.out.println("Exit? (enter \"Yes\" or \"No\")");
		String answer = keyboardInput.readLine();
		if (answer.equals("Yes"))
			return;
		else {
			if (answer.equals("No"))
				queryTree();
			else {
				System.out.println("ERROR: Must answer \"Yes\" or \"No\"");
				optionToExit();
			}
		}
	}
}
