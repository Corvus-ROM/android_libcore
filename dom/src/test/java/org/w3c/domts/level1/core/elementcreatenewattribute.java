
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The "setAttributeNode(newAttr)" method adds a new 
 *    attribute to the Element.  
 *    
 *    Retrieve first address element and add
 *    a new attribute node to it by invoking its         
 *    "setAttributeNode(newAttr)" method.  This test makes use
 *    of the "createAttribute(name)" method from the Document
 *    interface.
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-887236154">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-887236154</a>
*/
public final class elementcreatenewattribute extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public elementcreatenewattribute(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staff", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      NodeList elementList;
      Element testAddress;
      Attr newAttribute;
      Attr oldAttr;
      Attr districtAttr;
      String attrVal;
      doc = (Document) load("staff", true);
      elementList = doc.getElementsByTagName("address");
      testAddress = (Element) elementList.item(0);
      newAttribute = doc.createAttribute("district");
      oldAttr = testAddress.setAttributeNode(newAttribute);
      assertNull("old_attr_doesnt_exist", oldAttr);
      districtAttr = testAddress.getAttributeNode("district");
      assertNotNull("new_district_accessible", districtAttr);
      attrVal = testAddress.getAttribute("district");
      assertEquals("attr_value", "", attrVal);
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/elementcreatenewattribute";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(elementcreatenewattribute.class, args);
   }
}

