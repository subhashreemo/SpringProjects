package com.split.DAO;
import java.util.List;
import javax.sql.DataSource;
import com.split.bean.BOCreation;

public interface BOCreationDAO {
	/** 
     * This is the method to be used to initialize
     * database resources ie. connection.
  */
  public void setDataSource(DataSource ds);
  
  /** 
     * This is the method to be used to create
     * a record in the BO table.
  */
 // public void create(String name, Integer BO_ID);
  
  /** 
     * This is the method to be used to list down
     * a record from the BO table corresponding
     * to a passed BO id.
  */
  public BOCreation getBOCreation(Integer BO_ID);
  
  /** 
     * This is the method to be used to list down
     * all the records from the BO table.
  */
  public List<BOCreation> listBOs();
  
  
  /** 
     * This is the method to be used to update
     * a record into the BO table.
  */
 // public void update(Integer BO_ID, Integer CLUSTER);
}
