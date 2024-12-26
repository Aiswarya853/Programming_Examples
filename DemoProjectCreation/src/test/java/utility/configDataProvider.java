package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class configDataProvider {
	Properties pro;
	public  configDataProvider() {
		File src = new File("C:/Users/Administrator/git/NewMavenProject/MavenProject/DemoProjectCreation/Configuration/Config.properties");
		try {
			FileInputStream readFile =new FileInputStream(src);
			pro =new Properties();
			pro.load(readFile);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not able to load file"+ e.getMessage());}}
			
	public String getBrowser() {
				return pro.getProperty("browser");
			}
			
	public  String getUrl() {
				return pro.getProperty("testurl");
			}
		
	

}
