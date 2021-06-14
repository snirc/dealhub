package com.dealhub.approvalflows.pojo;

import java.util.ArrayList;

public class Plan {

	private ArrayList<User> approvers = new ArrayList();
	
	private int approverIndex = -0;
	
	public void addApproverUser(User user) {
		approvers.add(user);
	}
	
	public ArrayList<User> getApprovers() {
		return approvers;
	}

	public void setApprovers(ArrayList<User> approvers) {
		this.approvers = approvers;
	}

	public int getApproverIndex() {
		return approverIndex;
	}

	public void setApproverIndex(int approverIndex) {
		this.approverIndex = approverIndex;
	}
	
	
}
