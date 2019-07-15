package programinhaxmldom;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.parser.AttributeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PrograminhaXMLDOM {

    public static void main(String[] args) {

        EntradaDemanda demandasE = new EntradaDemanda();
        demandasE.entradaDemanda1();
        
        ProducaoDemanda demandasP = new ProducaoDemanda();
        demandasP.producaoDemanda();
        
        HomologacaoDemanda demandasH = new HomologacaoDemanda();
        demandasH.homologacaoDemanda();
        
        EntregaDemanda demandasEn = new EntregaDemanda();
        demandasEn.entregaDemandas();
            
           
            
            

//            
//           import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.text.html.parser.AttributeList;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//  
//public class PrograminhaXMLDOM {             
//   public static void main(String[] args) {           
//        
//        //duas classes importantes para a leitura e manipulação do XML
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        try {
//            
//            DocumentBuilder  builder = factory.newDocumentBuilder();
//                //pegar um documento xml e criar um novo documento
//            Document doc  = builder.parse("C:\\Users\\guilhermecr\\Documentos\\Teste_Para_Produção.xml");
//                //caminho XML   
//                
//            NodeList listaDePessoas = doc.getElementsByTagName("pessoa");
//            
//              //vareendo lista de pessoas para pegar cada item que está dentro de cada pessoa
//              
//              int tamanhoDaLista = listaDePessoas.getLength();
//
//              
//              for (int i = 0; i < tamanhoDaLista; i++) {
//                  
//                  //varrer a lista
//                  Node noPessoa = listaDePessoas.item(i);
//                   
//                  //se for um nó de tipo elemento, temos coisas dentro dele.
//                  if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
//                      
//                     Element elementoPessoa = (Element) noPessoa; 
//                
//                     
//                      String id = elementoPessoa.getAttribute("id");
//                      System.out.println("\nID = " + id );
//                      
//                      NodeList listaFilhosDaPessoa = elementoPessoa.getChildNodes();//metodo que retorna os 3 valores em uma ista de nós
//                     int tamanholistaFilhos = listaFilhosDaPessoa.getLength();
//                      //varrimento da lista do elemento pessoas
//                      
//                      for (int j = 0; j < tamanholistaFilhos; j++) {
//                      
//                          Node noFilho = listaFilhosDaPessoa.item(j);
//                          
//                          if(noFilho.getNodeType() == Node.ELEMENT_NODE){
//                          
//                          Element elementoFilho = (Element) noFilho;
//                          
//                          //para pegar as informações das tag (textContent)
//                          switch(elementoFilho.getTagName()){
//                              case "codigo":
//                                    System.out.println("CODIGO = " + elementoFilho.getTextContent());
//                                    break;
//                              case "nome":
//                                    System.out.println("NOME = " + elementoFilho.getTextContent());
//                                    break;
//                              case "diretoria":
//                                    System.out.println("DIRETORIA = " + elementoFilho.getTextContent());
//                                    break;
//                              case "tamanho":
//                                    System.out.println("TAMANHO = " + elementoFilho.getTextContent());
//                                    break;
//                              case "statusjira":
//                                    System.out.println("STATUSJIRA = " + elementoFilho.getTextContent());
//                                    break;
//                              case "mensagem":
//                                  System.out.println("MENSAGEM = " + elementoFilho.getTextContent());
//                                    break;
//                                    
//                          }
//                          }
//                      }
//            }
//              }
//                    
//        } catch (ParserConfigurationException ex) {
//            Logger.getLogger(PrograminhaXMLDOM.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SAXException ex) {
//            Logger.getLogger(PrograminhaXMLDOM.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(PrograminhaXMLDOM.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    //fim class
//}

    }//fim class

}
