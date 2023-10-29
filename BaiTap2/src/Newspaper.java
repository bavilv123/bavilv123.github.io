public class Newspaper extends  Document{
    private int releaseDay;

    public Newspaper(String ID,String nxb,int number,int releaseDay){
        super(ID, nxb, number);
        this.releaseDay =releaseDay;
    }
    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }
    @Override
    public String toString(){
        return "ID: "+this.ID
                + "\nNXB: "+this.nxb
                + "\nNumber: "+this.number
                + "\nReleaseDay: "+this.releaseDay;
    }
}
