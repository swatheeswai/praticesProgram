/* *Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. 
  *Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.
  *creating interface and methods should be parameterized method so you give a return is String 
  * if check the content in the method
  *contains method is use a check a if contains or not
  */
interface Searchable {
    boolean search(String keyword);
    }

class Document implements Searchable{
      private String content;
      
Document(String content){
      this.content=content;
}
@Override
public boolean search(String keyword){
      return content.contains(keyword);
      }
      }


class WebPage implements Searchable{
    private String url;
    private String htmlcontent;

 WebPage(String url,String htmlcontent){
      this.url=url;
      this.htmlcontent=htmlcontent;
}

@Override
public boolean search(String keyword){
      return htmlcontent.contains(keyword);
      }
      }
      
public class ProjectInterface{
public static void main(String args[]){
     Searchable search = new Document("Java is a such amazing language,easy to learn,very interesting language");
      System.out.println("========your searching it contains true is return not false should be return===============");
      System.out.println("your searching word in Document class:"+search.search("such"));
    
     Searchable web = new WebPage("https://www.w3resource.com", "This is a sample webpage.");
     System.out.println("your searching word in webpage class:"+web.search("sample"));
     }
     } 
      
      
      
 

     
