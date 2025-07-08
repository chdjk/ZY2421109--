package services.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import services.*;
	
public class ServiceManager {
	
	private static Map<String, List> AllServiceInstance = new HashMap<String, List>();
	
	private static List<LikeReadSystem> LikeReadSystemInstances = new LinkedList<LikeReadSystem>();
	private static List<ThirdPartyServices> ThirdPartyServicesInstances = new LinkedList<ThirdPartyServices>();
	private static List<RegisterService> RegisterServiceInstances = new LinkedList<RegisterService>();
	
	static {
		AllServiceInstance.put("LikeReadSystem", LikeReadSystemInstances);
		AllServiceInstance.put("ThirdPartyServices", ThirdPartyServicesInstances);
		AllServiceInstance.put("RegisterService", RegisterServiceInstances);
	} 
	
	public static List getAllInstancesOf(String ClassName) {
			 return AllServiceInstance.get(ClassName);
	}	
	
	public static LikeReadSystem createLikeReadSystem() {
		LikeReadSystem s = new LikeReadSystemImpl();
		LikeReadSystemInstances.add(s);
		return s;
	}
	public static ThirdPartyServices createThirdPartyServices() {
		ThirdPartyServices s = new ThirdPartyServicesImpl();
		ThirdPartyServicesInstances.add(s);
		return s;
	}
	public static RegisterService createRegisterService() {
		RegisterService s = new RegisterServiceImpl();
		RegisterServiceInstances.add(s);
		return s;
	}
}	
