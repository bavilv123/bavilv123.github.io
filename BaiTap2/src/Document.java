public class Document {
    protected String ID;
    protected String nxb;
    protected int number;
    public Document(String ID , String nxb, int number){
        this.ID  = ID;
        this.nxb = nxb;
        this.number=  number;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return this.ID;
    }
    public void setNxb(String  nxb){
        this.nxb = nxb;
    }
    public String setNxb(){
        return this.nxb;
    }
    public void setNumber(int number){
        this.number = number;

    }
    public int getNumber(){
        return this.number;
    }

}
