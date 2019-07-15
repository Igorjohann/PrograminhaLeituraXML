
package programinhaxmldom;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EntregaDemanda {
    
    
    public void entregaDemandas(){
    
        
        final int NODE_ENTRADA = 1;
        final int NODE_PRODUCAO = 3;
        //final int NODE_VALIDACAO = 3;
        final int NODE_HOMOLOGACAO = 5;
        final int NODE_ENTREGA = 7;
    

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse("C:\\Users\\ilevino\\Desktop\\jira.xml");
//          Document doc = builder.parse("C:\\Users\\ilevino\\Desktop\\Pessoa.xml");

            Node tagCorpo = doc.getElementsByTagName("statusatividades").item(0);
            Node tagEntrega = tagCorpo.getChildNodes().item(NODE_ENTREGA);
            NodeList TagsTarefa = tagEntrega.getChildNodes();

            int tamanhoDaLista = TagsTarefa.getLength();

            for (int i = 0; i < tamanhoDaLista; i++) {
                if (TagsTarefa.item(i).getAttributes() != null) {
                    System.out.println("\nAtributos de Entrega: ");
                    System.out.println(TagsTarefa.item(i).getAttributes().getNamedItem("codigo"));
                    System.out.println(TagsTarefa.item(i).getAttributes().getNamedItem("nome"));
                    System.out.println(TagsTarefa.item(i).getAttributes().getNamedItem("diretoria"));
                    System.out.println(TagsTarefa.item(i).getAttributes().getNamedItem("tamanho"));
                    System.out.println(TagsTarefa.item(i).getAttributes().getNamedItem("statusjira"));
                    System.out.println(TagsTarefa.item(i).getAttributes().getNamedItem("mensagem"));
                }
            }

        } catch (SAXException ex) {
            Logger.getLogger(EntradaDemanda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EntradaDemanda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EntradaDemanda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    }

