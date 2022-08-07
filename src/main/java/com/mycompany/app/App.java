package com.mycompany.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main(String[] args)
            throws TransformerException, TransformerConfigurationException,
            FileNotFoundException, IOException
    {
        // Use the static TransformerFactory.newInstance() method to instantiate
        // a TransformerFactory. The javax.xml.transform.TransformerFactory
        // system property setting determines the actual class to instantiate --
        // org.apache.xalan.transformer.TransformerImpl.
        TransformerFactory tFactory = TransformerFactory.newInstance();

        // Use the TransformerFactory to instantiate a Transformer that will work with
        // the stylesheet you specify. This method call also processes the stylesheet
        // into a compiled Templates object.
        Transformer transformer = tFactory.newTransformer(new StreamSource("birds.xsl"));

        // Use the Transformer to apply the associated Templates object to an XML document
        // (foo.xml) and write the output to a file (foo.out).
        transformer.transform(new StreamSource("birds.xml"), new StreamResult(new FileOutputStream("birds.out")));

        System.out.println("************* The result is in birds.out *************");
    }
}
