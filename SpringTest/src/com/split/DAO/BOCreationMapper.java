package com.split.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.split.bean.BOCreation;

public class BOCreationMapper implements RowMapper<BOCreation> {
	
	public BOCreation mapRow(ResultSet rs, int rowNum) throws SQLException {
		BOCreation bo = new BOCreation();
	      bo.setBO_ID(rs.getInt("BO_ID"));
	      bo.setBO_FORM(rs.getDate("BO_FROM"));
	      bo.setBO_TO(rs.getDate("BO_TO"));
		
		/*bo.setHAS_PRIVILAGES(rs.getString("HAS_PRIVILEGES"));
		bo.setSCHEMA_NAME(rs.getString("SCHEMA_NAME"));
		bo.setSCHEMA_OWNER(rs.getString("SCHEMA_OWNER"));*/
	      
	      return bo;
	   }
}
