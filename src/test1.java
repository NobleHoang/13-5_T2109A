import java.sql.*;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String CategoryName;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter CategoryName:");
        CategoryName = input.nextLine();
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind","root","");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from categories where CategoryName like '%Beverages%'";
            System.out.println("The SQL Statement is: "+ strSelect+ "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("the records selected are: ");
            int rowCount = 0;
            while (rset.next()){
                int CategoryID = rset.getInt("CategoryID");
                String Description = rset.getString("Description");
                System.out.println(CategoryID+ ", "+ Description);
            }
            System.out.println("Total number of records = "+ rowCount);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
