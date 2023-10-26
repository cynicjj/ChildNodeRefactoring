package com.multicampus.cleancode.childnode;

public enum NodeType {
	TF_G(1), TF_H(2), TF_GLOT(3);

	private int type = 0;

	NodeType(int type) {
		this.type = type;
	}

	protected int getType() {
		return type;
	}
}