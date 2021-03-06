/*
 * � Copyright IBM Corp. 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package com.ibm.xsp.xflow.history;

import com.ibm.commons.util.StringUtil;
import com.ibm.xsp.xflow.IWorkflowContext;
import com.ibm.xsp.xflow.WorkflowException;


/**
 * Event emitted when the workflow started. 
 */
public class WorkflowStartedHistory extends BasicHistory  {

	public WorkflowStartedHistory(IWorkflowContext context) throws WorkflowException {
		super(context,getString(context));
	}
	
	private static String getString(IWorkflowContext context) throws WorkflowException {
		return StringUtil.format("Workflow Started, requester {0}", context.getRequester());
	}
}
