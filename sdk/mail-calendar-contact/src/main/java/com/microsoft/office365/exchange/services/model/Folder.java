/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.exchange.services.model;

public class Folder extends Entity {
	private String parentFolderId;

	public String getParentFolderId() {
		 return parentFolderId; 
	}

	public void setParentFolderId(String value) { 
		parentFolderId = value; 
	}
	private String displayName;

	public String getDisplayName() {
		 return displayName; 
	}

	public void setDisplayName(String value) { 
		displayName = value; 
	}
	private Integer childFolderCount;

	public Integer getChildFolderCount() {
		 return childFolderCount; 
	}

	public void setChildFolderCount(Integer value) { 
		childFolderCount = value; 
	}
}