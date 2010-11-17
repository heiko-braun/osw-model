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

package org.onesocialweb.model.vcard4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.onesocialweb.model.acl.AclRule;
import org.onesocialweb.model.atom.DefaultAtomHelper;

public class DefaultBirthdayField extends BirthdayField {

	private List<AclRule> rules = new ArrayList<AclRule>();

	private Date birthday;

	private BirthdayField.Type type = BirthdayField.Type.DateTime;

	@Override
	public String getBirthday() {
		if (birthday != null) {
			return formatDate(birthday);
		} else {
			return null;
		}
	}

	@Override
	public Date getDate() {
		return birthday;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public void setBirthday(String value, Type type) {
		setDate(parseDate(value));
		this.type = type;
	}

	@Override
	public void setDate(Date date) {
		this.birthday = date;
		this.type = BirthdayField.Type.DateTime;
	}

	@Override
	public void addAclRule(AclRule rule) {
		rules.add(rule);
	}

	@Override
	public List<AclRule> getAclRules() {
		return Collections.unmodifiableList(rules);
	}

	@Override
	public void setAclRules(List<AclRule> rules) {
		this.rules = rules;
	}

	@Override
	public void removeAclRule(AclRule rule) {
		rules.remove(rule);
	}

	@Override
	public boolean hasAclRules() {
		if (rules != null && rules.size() > 0) {
			return true;
		}
		return false;
	}
	
	protected Date parseDate(String dateString) {
		return DefaultAtomHelper.parseDate(dateString);
	}
	
	protected String formatDate(Date date) {
		return DefaultAtomHelper.format(birthday);
	}
}
