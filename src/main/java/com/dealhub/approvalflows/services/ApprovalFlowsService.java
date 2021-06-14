package com.dealhub.approvalflows.services;

import com.dealhub.approvalflows.pojo.Plan;
import com.dealhub.approvalflows.pojo.User;

/**
 * 
 * @author sncohen
 *
 */
public class ApprovalFlowsService {

	public int approvePlan(Plan plan, boolean isApprove) {
		if(isApprove) {
			int nextApprover = plan.getApproverIndex()+1;
			if(nextApprover > plan.getApprovers().size()) {
				plan.setApproved(true);
			}else {
				plan.setApproverIndex(nextApprover);
				sendMessageToNextUser(plan);
				return nextApprover;	
			}
			
		}
		
		return -1;
		
	}
	
	public void sendMessageToNextUser(Plan plan) {
		
		System.out.println("Message sent to user: " +plan.getNextUser().getEmail() + ".....");
	}
	

}
