package com.pgx.java.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pgx.java.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.split.DAO.BOCreationJDBCTemplate;
import java.util.List;
import com.split.bean.BOCreation;
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
	
	@GetMapping("/Split")
	public String BOCreation(){
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		 BOCreationJDBCTemplate boJDBCTemplate = 
	         (BOCreationJDBCTemplate)context.getBean("boJDBCTemplate");
		 
		 List<BOCreation> bos = boJDBCTemplate.listBOs();
	      
	      for (BOCreation record : bos) {
	         System.out.print("ID : " + record.getBO_ID() );
	         System.out.print(", From Date : " + record.getBO_FORM() );
	         System.out.println(", ToDate : " + record.getBO_TO());
	      }
		return "s";
	}
}
