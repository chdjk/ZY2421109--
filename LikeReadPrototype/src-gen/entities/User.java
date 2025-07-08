package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class User implements Serializable {
	
	/* all primary attributes */
	private int Userid;
	private String Password;
	private String Name;
	
	/* all references */
	
	/* all get and set functions */
	public int getUserid() {
		return Userid;
	}	
	
	public void setUserid(int userid) {
		this.Userid = userid;
	}
	public String getPassword() {
		return Password;
	}	
	
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getName() {
		return Name;
	}	
	
	public void setName(String name) {
		this.Name = name;
	}
	
	/* all functions for reference*/
	


}
