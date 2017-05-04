package forgedemo;

public class References {
	
	/*
	 * CONSTANTS
	 * */
	
	//mod ids
	public static final String MODID = "forge_demo";
	public static final String NAME = "James's test mod for demo. useless.";
	public static final String VERSION= "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	//proxy
	public static final String CLIENT_PROXY_CLASS = "forgedemo.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "forgedemo.proxy.ServerProxy";
	
	//items
	public static enum ForgeDemoItems {
		SCHOOLBUTTON("School Button", "SchoolButton");
		
		private String unlocalizedName;
		private String registryName;
		
		ForgeDemoItems(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
		
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}

}
