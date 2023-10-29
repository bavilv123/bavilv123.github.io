public class Book extends Document{
    private String author;
    private int  numberPage;
     public Book(String ID, String nxb, int number ,String author, int numberPage){
         super(ID, nxb,number);
         this.author  = author;
         this.numberPage =  numberPage;
     }
     public void setAuthor(String author){
         this.author = author;
     }
     public void setNumberPage(int numberPage){
         this.numberPage = numberPage;
     }
     public String getAuthor(){
         return this.author;
     }
     public int getNumberPage(){
         return this.numberPage;
     }
     @Override
    public String toString(){
         return "ID: "+this.ID
                 + "\nNXB: "+this.nxb
                 + "\nNumber: "+this.number
                 + "\nAuthor: "+this.author
                 + "\nNumberPage: "+this.numberPage;

     }

}
