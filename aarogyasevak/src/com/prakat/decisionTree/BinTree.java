package com.prakat.decisionTree;

public class BinTree {
	int nodeID;
	String questOrAns = null;
	BinTree yesBranch = null;
	BinTree noBranch = null;

	/* CONSTRUCTOR */

	public BinTree(int newNodeID, String newQuestAns) {
		nodeID = newNodeID;
		questOrAns = newQuestAns;
	}

}
