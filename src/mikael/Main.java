
package mikael;

import java.sql.*;
public class Main {

    public static void main(String[] args) throws SQLException {
       
   Customer c = new Customer(2, "sss", "ddd", "aaa", 3, 1);
 
   CustomerDAO dao = new CustomerDAO();
   
   dao.showCustomers();
   dao.insertCustomer(c);
   dao.deleteCustomer(1);
   dao.updateCustomer(1);
   

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}