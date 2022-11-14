import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/class?characterEncoding=UTF-8";
        String password = "DATAbase@123";
        String username = "root";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate("INSERT INTO worker VALUES(7,'Patrick', 'NDAYAMBAJE', 50000,'2018-02-22','HR')");
            if(result == 1){
                System.out.println("Data added successfully");
            }else {
                System.out.println("Failed");
            }
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt(1));
//            }
            connection.close();
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
};