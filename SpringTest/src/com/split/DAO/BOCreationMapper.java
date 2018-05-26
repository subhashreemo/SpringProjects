package com.split.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.split.bean.BOCreation;

public class BOCreationMapper implements RowMapper<BOCreation> {
	public BOCreation mapRow(ResultSet rs, int rowNum) throws SQLException {
		BOCreation bo = new BOCreation();
	      bo.setBO_ID(rs.getInt("BO_ID"));
	      bo.setBO_FORM(rs.getDate("BO_FORM"));
	      bo.setBO_TO(rs.getDate("BO_TO"));
	      
	      return bo;
	   }
}
