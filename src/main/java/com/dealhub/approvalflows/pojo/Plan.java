package com.dealhub.approvalflows.pojo;

import java.util.ArrayList;

public class Plan {

	private ArrayList<User> approvers = new ArrayList();
	
	private boolean isApproved = false; 
	
	private int approverIndex = 0;
	
	private ApprovalFlow approvalFlow;
	
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

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public ApprovalFlow getApprovalFlow() {
		return approvalFlow;
	}

	public void setApprovalFlow(ApprovalFlow approvalFlow) {
		this.approvalFlow = approvalFlow;
	}

	public User getNextUser() {
		return approvers.get(approverIndex);
	}
	
	
}
