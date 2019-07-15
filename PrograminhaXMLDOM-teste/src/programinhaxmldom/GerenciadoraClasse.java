
package programinhaxmldom;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GerenciadoraClasse {
     for (int i = 0; i < tamanhoDaLista; i++) {
                  
                  //varrer a lista
                  Node noPessoa = listaDePessoas.item(i);
    
    if(noPessoa.getNodeType() == Node.ELEMENT_NODE){
                      
                     Element elementoPessoa = (Element) noPessoa; 
                
                     
                      String id = elementoPessoa.getAttribute("id");
                      System.out.println("\nID = " + id );
                      
                      NodeList listaFilhosDaPessoa = elementoPessoa.getChildNodes();//metodo que retorna os 3 valores em uma ista de nós
                     int tamanholistaFilhos = listaFilhosDaPessoa.getLength();
                      //varrimento da lista do elemento pessoas
                      
                      for (int j = 0; j < tamanholistaFilhos; j++) {
                      
                          Node noFilho = listaFilhosDaPessoa.item(j);
                          
                          if(noFilho.getNodeType() == Node.ELEMENT_NODE){
                          
                          Element elementoFilho = (Element) noFilho;
                          
                          //para pegar as informações das tag (textContent)
                          switch(elementoFilho.getTagName()){
                              case "nome":
                                    System.out.println("NOME = " + elementoFilho.getTextContent());
                                    break;
                              case "idade":
                                    System.out.println("IDADE = " + elementoFilho.getTextContent());
                                    break;
                              case "peso":
                                    System.out.println("PESO = " + elementoFilho.getTextContent());
                                    break;
                              case "apelido":
                                    System.out.println("APELIDO = " + elementoFilho.getTextContent());
                                    break;
                              case "sexo":
                                    System.out.println("GENERO = " + elementoFilho.getTextContent());
                                    break;
                                    
                          }
                          }
                      }
    
    
    
    
    
    
    
}
