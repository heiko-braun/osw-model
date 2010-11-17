/*
 *  Copyright 2010 Vodafone Group Services Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *    
 */
package org.onesocialweb.model.relation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.onesocialweb.model.acl.AclRule;

public class DefaultRelation implements Relation {

	private List<AclRule> aclRules = new ArrayList<AclRule>();

	private String comment;

	private String from;

	private String id;

	private String message;

	private String nature;

	private Date published;

	private String status;

	private String to;

	@Override
	public void addAclRule(AclRule rule) {
		this.aclRules.add(rule);
	}

	@Override
	public List<AclRule> getAclRules() {
		return aclRules;
	}

	@Override
	public String getComment() {
		return comment;
	}

	@Override
	public String getFrom() {
		return from;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String getNature() {
		return nature;
	}

	@Override
	public Date getPublished() {
		return published;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public String getTo() {
		return to;
	}

	@Override
	public boolean hasAclRules() {
		return (aclRules != null && !aclRules.isEmpty());
	}

	@Override
	public boolean hasComment() {
		return (comment != null);
	}

	@Override
	public boolean hasFrom() {
		return (from != null);
	}

	@Override
	public boolean hasId() {
		return (id != null);
	}

	@Override
	public boolean hasMessage() {
		return (message != null);
	}

	@Override
	public boolean hasNature() {
		return (nature != null);
	}

	@Override
	public boolean hasPublished() {
		return (published != null);
	}

	@Override
	public boolean hasStatus() {
		return (status != null);
	}

	@Override
	public boolean hasTo() {
		return (to != null);
	}

	@Override
	public void removeAclRule(AclRule rule) {
		this.aclRules.remove(rule);
	}

	@Override
	public void setAclRules(List<AclRule> rules) {
		this.aclRules = rules;
	}

	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public void setFrom(String from) {
		this.from = from;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setNature(String nature) {
		this.nature = nature;
	}

	@Override
	public void setPublished(Date published) {
		this.published = published;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[Relation ");
		if (id != null) {
			buffer.append("id:" + id + " ");
		}
		if (from != null) {
			buffer.append("from:" + from + " ");
		}
		if (to != null) {
			buffer.append("to:" + to + " ");
		}
		if (nature != null) {
			buffer.append("nature:" + nature + " ");
		}
		if (status != null) {
			buffer.append("status:" + status + " ");
		}
		if (message != null) {
			buffer.append("message:" + message + " ");
		}
		if (comment != null) {
			buffer.append("comment:" + comment + " ");
		}
		buffer.append("]");
		return buffer.toString();
	}

}
