//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.06.29 à 04:21:26 PM CEST 
//


package org.codehaus.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.codehaus.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Test_QNAME = new QName("http://v1.test/", "test");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.codehaus.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestObject }
     * 
     */
    public TestObject createTestObject() {
        return new TestObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.test/", name = "test")
    public JAXBElement<TestObject> createTest(TestObject value) {
        return new JAXBElement<TestObject>(_Test_QNAME, TestObject.class, null, value);
    }

}
