package com.split.DAO;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.split.bean.BOCreation;
import java.sql.ResultSet;
import java.sql.Connection;

public class BOCreationJDBCTemplate implements BOCreationDAO {
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   public static final String DATA_SOURCE_NAME = "java:comp/env/jdbc/DefaultDB";
	   Connection connection = null;
	   
	   //public void setDataSource(DataSource dataSource) {
	   public void setDataSource() {
		  // this.dataSource = dataSource;
		// Connection connection;
			try {
				InitialContext ctx = new InitialContext();
				dataSource = (DataSource) ctx.lookup(DATA_SOURCE_NAME);
				connection = dataSource.getConnection();
				System.out.println("Connection success");
				
				this.jdbcTemplateObject = new JdbcTemplate(dataSource);
			}
			catch (Exception e) {
				System.out.println("DBconnection fail");
				e.printStackTrace();
			}
		      
		   }
	   
	   
	   public List<BOCreation> listBOs() {
		      String SQL = "select * from \"RB_SCH_TGBL\".\"tgbl.data.application::TGBL_DDL_APPLICATION.T_TG_BO_HEADER\"";
		  // String SQL = "select * from SYS.SCHEMAS";
		     // List <BOCreation> bos = jdbcTemplateObject.query(SQL, new BOCreationMapper());
		   List <BOCreation> bos = jdbcTemplateObject.query(SQL, new BOCreationMapper());
		      System.out.println("JDBCTemplate-----bos returned" +bos.size());
		      return bos;
		   }
	   
	   public String createBOs()
	   {
		   String createSQL="";
		  
		  // String boresponse=jdbcTemplateObject.query(createSQL, new BOCreationMapper());
		  //System.out.println("JDBCTemplate-----bos returned" +boresponse);
		   return "";
	   }
}
