package org.agomez.pooclasesabstractas.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.text.AbstractDocument;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class EjemploLeerXml {
    public static void main(String[] args) {
        String ruta = "E:\\Desarrollos\\proyectos\\JavaUdemy\\poo_clases_abstractas\\src\\org\\agomez\\pooclasesabstractas\\xml\\CatalogosGeneralesMexico.xml";
        Document xml = leerArchivo(ruta);

        //leerNodo("tipoServicio", xml);
        Map<String, String> tipoServicio = retornaCatalogo("tipoServicio", xml);
        Map<String, String> negocio = retornaCatalogo("negocio", xml);
        Map<String, String> accion = retornaCatalogo("accion", xml);
        Map<String, String> moneda = retornaCatalogo("moneda", xml);

        System.out.println(tipoServicio);
        System.out.println(negocio);
        System.out.println(accion);
        System.out.println(moneda);
    }

    public static Document leerArchivo(String ruta) {
        Path p = Paths.get(ruta);
        Path normalizedPath = p.normalize();
        Document doc = null;
        try {
            File xmlFile = new File(normalizedPath.toString());
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Terminamos de prosesar el documento");
        } catch(Exception e) {
            System.out.println("Error al procesar el archivo: " + e);
        }
        return doc;
    }

    public static void leerNodo(String catalogo, Document doc) {
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        NodeList resultados = doc.getElementsByTagName(catalogo);

        System.out.println("Los nodos hijos de identificaciones son: " + resultados.item(0));
        Map<String, String> respuestaCatalogo = new HashMap<String, String>();
        try {
            System.out.println("Iniciamos la revisión del catalogo");
            System.out.println("tenemos: " + resultados.getLength() + " registros");
            for(int i = 0; i < resultados.getLength(); i++) {
                Node resultCatalogo = resultados.item(i);
                Element infoCatalogo = (Element) resultCatalogo;
                // System.out.println("El acronimo es: " + infoCatalogo.getElementsByTagName("acronimo").item(0).getTextContent());
                // System.out.println("El valor es: " + infoCatalogo.getElementsByTagName("valor").item(0).getTextContent());
                respuestaCatalogo.put(infoCatalogo.getElementsByTagName("acronimo").item(0).getTextContent(), infoCatalogo.getElementsByTagName("valor").item(0).getTextContent());
            }
            System.out.println(respuestaCatalogo);
        } catch(Exception e) {
            System.out.println("Error al ver los elementos del xml: " + e);
        }
    }

    public static Map<String, String> retornaCatalogo(String catalogo, Document doc) {
        NodeList resultados = doc.getElementsByTagName(catalogo);
        Map<String, String> respuestaCatalogo = new HashMap<String, String>();
        try {
            for(int i = 0; i < resultados.getLength(); i++) {
                Node resultCatalogo = resultados.item(i);
                Element infoCatalogo = (Element) resultCatalogo;
                respuestaCatalogo.put(infoCatalogo.getElementsByTagName("acronimo").item(0).getTextContent(),
                        infoCatalogo.getElementsByTagName("valor").item(0).getTextContent());
            }
        } catch(Exception e) {
            System.out.println("Error al ver los elementos del xml: " + e);
        }
        return respuestaCatalogo;
    }
}
