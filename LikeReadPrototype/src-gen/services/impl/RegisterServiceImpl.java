package services.impl;

import services.*;
import entities.*;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Arrays;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import org.apache.commons.lang3.SerializationUtils;
import java.util.Iterator;

public class RegisterServiceImpl implements RegisterService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public RegisterServiceImpl() {
		services = new ThirdPartyServicesImpl();
	}

	
	//Shared variable from system services
	
	/* Shared variable from system services and get()/set() methods */
			
	/* all get and set functions for temp property*/
				
	
	
	/* Generate inject for sharing temp variables between use cases in system service */
	public void refresh() {
		LikeReadSystem likereadsystem_service = (LikeReadSystem) ServiceManager.getAllInstancesOf("LikeReadSystem").get(0);
	}
	
	/* Generate buiness logic according to functional requirement */
	@SuppressWarnings("unchecked")
	public boolean createUser(int userid, String name, String password) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get user
		User user = null;
		//no nested iterator --  iterator: any previous:any
		for (User use : (List<User>)EntityManager.getAllInstancesOf("User"))
		{
			if (use.getUserid() == userid)
			{
				user = use;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(user) == true) 
		{ 
			/* Logic here */
			User use = null;
			use = (User) EntityManager.createObject("User");
			use.setUserid(userid);
			use.setName(name);
			use.setPassword(password);
			EntityManager.addObject("User", use);
			
			
			refresh();
			// post-condition checking
			if (!(true && 
			use.getUserid() == userid
			 && 
			use.getName() == name
			 && 
			use.getPassword() == password
			 && 
			StandardOPs.includes(((List<User>)EntityManager.getAllInstancesOf("User")), use)
			 && 
			true)) {
				throw new PostconditionException();
			}
			
		
			//return primitive type
			refresh();				
			return true;
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [name, password] 
		//all relevant vars : use
		//all relevant entities : User
	}  
	
	static {opINVRelatedEntity.put("createUser", Arrays.asList("User"));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
