package com.split.DAO;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.split.bean.BOCreation;

public class BOCreationJDBCTemplate implements BOCreationDAO {
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
		      this.dataSource = dataSource;
		      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		   }
	   
	   public BOCreation getBOCreation(Integer id) {
		      String SQL = "select * from \"RB_SCH_TGBL\".\"tgbl.data.application::TGBL_DDL_APPLICATION.T_TG_BO_HEADER\" where BO_ID = ?";
		      BOCreation bo = jdbcTemplateObject.queryForObject(SQL, 
		         new Object[]{id}, new BOCreationMapper());
		      
		      return bo;
		   }
	   public List<BOCreation> listBOs() {
		      String SQL = "select * from \"RB_SCH_TGBL\".\"tgbl.data.application::TGBL_DDL_APPLICATION.T_TG_BO_HEADER";
		      List <BOCreation> bos = jdbcTemplateObject.query(SQL, new BOCreationMapper());
		      return bos;
		   }
}
