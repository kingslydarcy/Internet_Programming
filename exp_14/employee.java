/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
/**
 *
 * @author admin
 */
@WebService(serviceName = "product1")
public class employee {

        @WebMethod(operationName = "getDetails")
    public String getDetails(@WebParam(name = "id") int id) {
        String s="";
        int p=0;
        String d="";
        try{
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/employee");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from employeedetails where empid="+id);
            while(rs.next()){
                if(rs.getInt(1)==id){
                    s=rs.getString(2);
                     p=rs.getInt(3);
                      d=rs.getString(4);
                    break;
                            }
                
            }
            
        }
        catch(Exception e){
            
        }
        if(s!=null && p!=0 && d!=null){
                return s +"  "  + "  "  + Integer.toString(p)+ " " +   d ;
            }
            else{
                return "no data found";
            }
    }
}
