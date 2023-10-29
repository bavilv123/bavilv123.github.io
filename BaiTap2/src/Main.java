import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ManagerDocument  ls  = new ManagerDocument();
        while(true){
            System.out.println("1.Insert new document.");
            System.out.println("2. Delete follow ID");
            System.out.println("3. Show infor");
            System.out.println("4. Search more information ");
            System.out.println("5. Exit");
            System.out.print("Enter your number: ");
            String n = sc.nextLine();
            switch (n){
                case "1":{
                    System.out.println("1.Enter a  to enter a book ");
                    System.out.println("2. Enter b to enter a journal");
                    System.out.print("3. Enter c to enter a newspaper");
                    System.out.println("Enter your choice: ");
                    String type = sc.nextLine();
                    switch (type){
                        case "a":
                            System.out.print("Enter ID: ");
                            String ID = sc.nextLine();
                            System.out.print("Enter nxb: ");
                            String nxb  = sc.nextLine();
                            System.out.printf("Enter number: ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            System.out.printf("Enter author: ");
                            String author = sc.nextLine();
                            System.out.printf("Enter numberPage: ");
                            int numberPage = sc.nextInt();
                            Book  book= new Book(ID,nxb,number,author,numberPage);
                            ls.addDocument(book);
                            break;
                        case "b": {
                            System.out.print("Enter ID: ");
                            String Id = sc.nextLine();
                            System.out.print("Enter nxb: ");
                            String Nxb = sc.nextLine();
                            System.out.printf("Enter number: ");
                            int Number = sc.nextInt();
                            System.out.printf("Enter Day issue: ");
                            int dayIssue = sc.nextInt();
                            System.out.printf("Enter Issue Month: ");
                            int issueMonth = sc.nextInt();
                            Journal js = new Journal(Id, Nxb, Number, dayIssue, issueMonth);
                            ls.addDocument(js);
                            break;
                        }
                        case "c": {
                            System.out.print("Enter ID: ");
                            String Id = sc.nextLine();
                            System.out.print("Enter nxb: ");
                            String Nxb = sc.nextLine();
                            System.out.printf("Enter number: ");
                            int Number = sc.nextInt();
                            System.out.printf("Enter day release: ");
                            int dayRelease = sc.nextInt();
                            Newspaper np = new Newspaper(Id, Nxb, Number, dayRelease);
                            ls.addDocument(np);
                            break;

                        }
                        default:
                            System.out.println("Invalid");
                    }
                }
                case "2":{
                    System.out.println("1. Enter a to search book.");
                    System.out.println("2. Enter b to search journal");
                    System.out.println("3. Enter c to searhc newspaper");
                    String type = sc.nextLine();
                    switch (type){
                        case "a":{
                            ls.searchBook();
                            break;
                        }
                        case "b":{
                            ls.searchJournal();
                            break;

                        }
                        case "c":{
                            ls.searchNewspaper();
                            break;
                        }
                        default:
                            break;

                    }
                }
                case "3":{
                    ls.showList();
                    break;
                }
                case "4":{
                    System.out.printf("Enter Id to remove: ");
                    String id = sc.nextLine();
                    System.out.println(ls.deleteDocument(id)?"Sucess":"Fail");
                    break;
                }
                case "5":{
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }
}