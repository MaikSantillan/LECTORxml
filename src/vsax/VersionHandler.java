/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsax;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author user
 */
public class VersionHandler extends DefaultHandler {

    private ArrayList<Version> versiones = new ArrayList();
    private Version version;
    private StringBuilder buffer=new StringBuilder();

    public ArrayList<Version> getVersiones() {
        return versiones;
    }
    
    
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
      
       buffer.append(ch,start,length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
     
        switch(qName)
        {
            case "nombre":
                version.setNombre(buffer.toString());
                break;
            case "api":
                version.setApi(Integer.parseInt(buffer.toString()));
                break;
            case "version":
                break;
            case "versiones":
                
                break;
              
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch(qName)
        {
            case "versiones":
              break;
            case "version":
                version=new Version();
                versiones.add(version);
                version.setNumero(Double.parseDouble(attributes.getValue("numero")));
              break;  
            case "nombre":
                buffer.delete(0,buffer.length());
               break;
            case "api":
                buffer.delete(0,buffer.length());
              break;
              
              
        }
        
    }
    
    
}
