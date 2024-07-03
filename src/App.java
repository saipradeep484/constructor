import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name");
       String s1 = sc.nextLine();
       System.out.println("Enter ID");
       int i1 = sc.nextInt();
       System.out.println("Enter account no");
       int i2 = sc.nextInt();
       System.out.println("Enter your mobile no");
       sc.nextLine();
      String s2 = sc.nextLine();
      System.out.println("Enter your address");
      String s3 = sc.nextLine();
      System.out.println("Enter your pan no");
      String s4 = sc.next();
      
       A clint1 = new A(s1,i1,i2,s2,s3,s4); 
       //A clint2 = new A(s1,i1,i2,s2,s3,s4);   
    //   A clint3 = new A(s1,i1,i2,s2,s3,s4);
    //   A clint4 = new A(s1,i1,i2,s2,s3,s4);
    //   A clint5 = new A(s1,i1,i2,s2,s3,s4);
    //   A clint6 = new A(s1,i1,i2,s2,s3,s4);
    //   A clint7 = new A(s1,i1,i2,s2,s3,s4);
      System.out.print(clint1.getAccountNumber()+" "+clint1.getCustomerName()+" "+clint1.getCustomerID()+" "+clint1.getMobileNumber()+" "+clint1.getAddress()+" "+clint1.getPan());
        // clint2.setAccountNumber(8585);
        // clint2.setAddress("plot.no:12-2-4533 Ameerpet");

      

    }

}
