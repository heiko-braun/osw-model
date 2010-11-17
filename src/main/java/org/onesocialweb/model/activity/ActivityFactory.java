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
package org.onesocialweb.model.activity;

public abstract class ActivityFactory {
	
	public abstract ActivityActor actor();
	
	public abstract ActivityEntry entry();
	
	public abstract ActivityObject object();
	
	public abstract ActivityVerb verb();
	
	public ActivityObject object(String type) {
		ActivityObject object = object();
		object.setType(type);
		return object;
	}
	
	public ActivityVerb verb(String name) {
		ActivityVerb verb = verb();
		verb.setValue(name);
		return verb;
	}
	
}
