package servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class BateauRepo {
	  public static List<String> findAll(){
	        MysqlDataSource mds = new MysqlDataSource();
	        String url = "jdbc:mysql://localhost:3306/bateau";
	        mds .setUrl(url);
	        mds.setUser("bat");
	        mds.setPassword("password");
	        try (
	            Connection co = mds.getConnection();
	            Statement st = co.createStatement();
	            ResultSet res = st.executeQuery("select * from bateau");
	            ){
	            List<String> bateaux = new ArrayList<String>();
	            while (res.next()) {
	                bateaux.add(res.getString("nom"));
	            }
	            return bateaux;
	            }
	        catch (SQLException e) {
	            System.err.println("Erreur MySql" + e.getMessage());
	        }
	        return null;
	    }
}
