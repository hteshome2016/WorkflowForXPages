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

package com.ibm.xsp.xflow;



/**
 * Used to resolve a person back and forth between its platform and workflow name. 
 */
public interface IIdentityResolver {
	public static final String EXTENSION_NAME = "com.ibm.xsp.xflow.identityresolver";
	
	public String nativeToWorkflow(String name) throws WorkflowException;

	public String workflowToNative(String name) throws WorkflowException;
}
