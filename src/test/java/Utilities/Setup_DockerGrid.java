package Utilities;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_DockerGrid {
	
	//this class is needed to start and stop docker grid automatically
	
	String [] cmd = {
			"/bin/bash",
			"docker-compose -f docker-compose.yaml up -d"
	};
	
	
	@BeforeTest
	public void startDockerGrid() throws IOException, InterruptedException {
		//("cmd /c start start_dockergrid.bat")
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(15000);
		
	}
	
	@AfterTest
	public void stopDockerGrid() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(5000);
		//close all command prompt
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		
	}
	
	
	
	

}
