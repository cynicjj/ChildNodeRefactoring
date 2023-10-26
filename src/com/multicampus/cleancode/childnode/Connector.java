package com.multicampus.cleancode.childnode;

import static com.multicampus.cleancode.childnode.NodeType.*;

import java.util.ArrayList;
import java.util.List;

public class Connector {
	private List<Node> paraList = new ArrayList<Node>();
	private boolean nodeAdded;

	public void connect(Node node) {
		if (node.type() == TF_G || node.type() == TF_H || (node.type() == TF_GLOT && node.isChild())) {
			paraList.add(node);
			setNodeAdded(true);
		}
	}

	public boolean isNodeAdded() {
		return nodeAdded;
	}

	public void setNodeAdded(boolean nodeAdded) {
		this.nodeAdded = nodeAdded;
	}
}
