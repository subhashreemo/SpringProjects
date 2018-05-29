package com.pgx.java.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMethod;


import com.pgx.java.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.split.DAO.BOCreationJDBCTemplate;
import java.util.List;
import com.split.bean.BOCreation;
import org.json.simple.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class BOController {
	@GetMapping("/Hello")
    public String helloView(Model model) {
        
        Person p = new Person();
        p.setTitle("Ms.");
        p.setFirstName("Subhashree");
        p.setLastName("Mohanty");
        
        model.addAttribute("person", p);
    
        return "HelloWorld";
    }
	
	@ResponseBody
	@GetMapping("/getBO")
	//public String BOCreation(){
	public List<BOCreation> getBOCreation(){
		
		/* ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 BOCreationJDBCTemplate boJDBCTemplate = 
	         (BOCreationJDBCTemplate)context.getBean("boJDBCTemplate");*/
		 
		BOCreationJDBCTemplate boJDBCTemplate = new BOCreationJDBCTemplate();
		boJDBCTemplate.setDataSource();
		 List<BOCreation> bos = boJDBCTemplate.listBOs();
		 System.out.println("bos returned" +bos.size());
	      
	     
	      return bos;
	}
	
	//@ResponseBody
	@RequestMapping(value = "/createBO/{region}", method=RequestMethod.GET )
	
	public @ResponseBody String createBOs(@PathVariable("region") String region) {
		BOCreation bocreation=new BOCreation();
		bocreation.setRegion(region);
		System.out.print("region : " + bocreation.getRegion() );
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		 BOCreationJDBCTemplate boJDBCTemplate = 
	         (BOCreationJDBCTemplate)context.getBean("boJDBCTemplate");
		 
		 List<BOCreation> bos = boJDBCTemplate.listBOs();*/
		
		BOCreationJDBCTemplate boJDBCTemplate = new BOCreationJDBCTemplate();
		boJDBCTemplate.setDataSource();
		 String boresponse = boJDBCTemplate.createBOs();
	      
		return boresponse;
	     
	}
	
/*	
	@ResponseBody
	@RequestMapping(value="/split/{bo_id}",method=RequestMethod.GET)
	public List<BOCreation> getBOCreation(@PathVariable("bo_id") Integer BO_ID)
	{
		BOCreation bocreation=new BOCreation();
		bocreation.setBO_ID(BO_ID);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		 BOCreationJDBCTemplate boJDBCTemplate = 
	         (BOCreationJDBCTemplate)context.getBean("boJDBCTemplate");
		 
		 List<BOCreation> bos = boJDBCTemplate.listBOs();
	      
	      for (BOCreation record : bos) {
	         System.out.print("ID : " + record.getBO_ID() );
	         System.out.print(", From Date : " + record.getBO_FORM() );
	         System.out.println(", ToDate : " + record.getBO_TO());
	      }
		
	      return bos; 
	}*/
	}
	

