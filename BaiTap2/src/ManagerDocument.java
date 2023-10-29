import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
    private List<Document> ls ;

    public ManagerDocument(){
        this.ls = new ArrayList<>();
    }
    public void addDocument(Document document){
        this.ls.add(document);
    }
    public Boolean deleteDocument(String ID){
        Document doc = this.ls.stream().filter(document -> document.getID().equals(ID)).findFirst().orElse(null);
        if(doc ==  null){
            return false;
        }
        this.ls.remove(doc);
        return true;
    }
    public void showList(){
        this.ls.forEach(ls-> System.out.println(ls.toString()));
    }
    public void searchBook(){
        this.ls.stream().filter(o->o instanceof Book).forEach(o-> System.out.println(o.toString()));
    }
    public void searchJournal(){
        this.ls.stream().filter(o->o instanceof Journal).forEach(o-> System.out.println(o.toString()));
    }
    public  void searchNewspaper(){
        this.ls.stream().filter(o->o instanceof Newspaper).forEach(o-> System.out.println(o.toString()));
    }

}
