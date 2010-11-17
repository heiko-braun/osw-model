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
package org.onesocialweb.xml.dom;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.dom4j.dom.DOMDocument;
import org.dom4j.io.DOMReader;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import org.onesocialweb.model.acl.AclAction;
import org.onesocialweb.model.acl.AclFactory;
import org.onesocialweb.model.acl.AclRule;
import org.onesocialweb.model.acl.AclSubject;
import org.onesocialweb.model.acl.DefaultAclFactory;
import org.onesocialweb.xml.dom.AclDomWriter;
import org.onesocialweb.xml.dom.imp.DefaultAclDomWriter;
import org.w3c.dom.Element;

public class AclDomWriterTest {

	@Test
	public void ruleToXML() throws DocumentException, IOException {
		AclFactory factory = new DefaultAclFactory();
		AclRule rule = factory.aclRule();
		rule.addAction(factory.aclAction(AclAction.ACTION_VIEW, AclAction.PERMISSION_GRANT));
		rule.addSubject(factory.aclSubject("Friends", AclSubject.GROUP));
		
		AclDomWriter aclDomWriter = new DefaultAclDomWriter();
		DOMDocument document = new DOMDocument();
		Element element = aclDomWriter.toElement(rule, document);
		assertNotNull(element);
		
		DOMReader reader = new DOMReader();
		
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter = new XMLWriter( System.out, format );
	}
}
