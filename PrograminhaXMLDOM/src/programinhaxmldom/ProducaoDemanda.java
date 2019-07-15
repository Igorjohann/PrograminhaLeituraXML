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

public class ProducaoDemanda {

    public void producaoDemanda() {

        final int NODE_ENTRADA = 1;
        final int NODE_PRODUCAO = 3;
        //final int NODE_VALIDACAO = 3;
        final int NODE_HOMOLOGACAO = 5;
        final int NODE_ENTREGA = 7;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse("C:\\Users\\ilevino\\Desktop\\jira.xml");
//            Document doc = builder.parse("C:\\Users\\ilevino\\Desktop\\Pessoa.xml");

            Node tagCorpo = doc.getElementsByTagName("statusatividades").item(0);
            Node tagProducao = tagCorpo.getChildNodes().item(NODE_PRODUCAO);
            NodeList TagsTarefa2 = tagProducao.getChildNodes();

            int tamanhoDaLista2 = TagsTarefa2.getLength();

            for (int i = 0; i < tamanhoDaLista2; i++) {
                if (TagsTarefa2.item(i).getAttributes() != null) {
                    System.out.println("\nAtributos de Produção: ");
                    System.out.println(TagsTarefa2.item(i).getAttributes().getNamedItem("codigo"));
                    System.out.println(TagsTarefa2.item(i).getAttributes().getNamedItem("nome"));
                    System.out.println(TagsTarefa2.item(i).getAttributes().getNamedItem("diretoria"));
                    System.out.println(TagsTarefa2.item(i).getAttributes().getNamedItem("tamanho"));
                    System.out.println(TagsTarefa2.item(i).getAttributes().getNamedItem("statusjira"));
                    System.out.println(TagsTarefa2.item(i).getAttributes().getNamedItem("mensagem"));
                }
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ProducaoDemanda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ProducaoDemanda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProducaoDemanda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

//final metodo
//class
