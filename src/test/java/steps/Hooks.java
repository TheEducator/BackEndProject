package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Common;

public class Hooks extends Common {
	
	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario "+scenario.getName());
		setUp();
		initializeAllPage();
	}
	
	@After
	public void end(Scenario scenario) {
		System.out.println("Ending scenario "+scenario.getName());
		/*if(scenario.isFailed()) {
			byte[] picture=takeScreenshot("/failed/"+scenario.getName());
		//	scenario.embed(picture, "image/png");
		}else {
			byte[] picture=takeScreenshot("/passed/"+scenario.getName());
		//	scenario.embed(picture, "image/png");
		}*/
		tearDown();
	}

}
