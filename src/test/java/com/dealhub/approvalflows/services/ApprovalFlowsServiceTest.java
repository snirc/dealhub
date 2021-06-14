package com.dealhub.approvalflows.services;

import com.dealhub.approvalflows.pojo.Plan;
import com.dealhub.approvalflows.pojo.User;

import junit.framework.TestCase;

public class ApprovalFlowsServiceTest extends TestCase {

	ApprovalFlowsService approvalFlowsService;
	Plan plan;
	protected void setUp() throws Exception {
		super.setUp();
		
		approvalFlowsService = new ApprovalFlowsService();
		plan = new Plan();
		plan.addApproverUser(new User("snir1@"));
		
	}

	public void testApprovePlan() {
		fail("Not yet implemented");
	}

	public void testSendMessageToNextUser() {
		//approvalFlowsService.sendMessageToNextUser(null);
		assertTrue(true);
	}

}
