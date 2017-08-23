package com.CrossoverTechTrial.Businessscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.CrossoverTechTrial.PageObjects.CrossoverTechTrialContentPage;
import com.CrossoverTechTrial.PageObjects.CrossoverTechTrialNewPostPage;
import com.CrossoverTechTrial.Reusables.Configurations.Configurator;


public class CrossoverTechCreateNewPostTestcases extends Configurator {
	
	@Test(priority = 0)
	public void CreateNewPostscriptExecution() throws Exception {
		
		
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.clickNewPostOption(driver);
			Reporter.log("Clicked on Post");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.enterPostTitle(driver);
			Reporter.log("Enter post title");
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.enterPostDescription(driver);
			Reporter.log("Post Description given");
				
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.enterImageDescription(driver);
			Reporter.log(" Image Added to post");

			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickSettingsMenuDropdown(driver); 
			Reporter.log("Settings Menu Dropdown clicked");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.selectPublishOption(driver);
			Reporter.log("Click on Publish");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.clickPublishNowOption(driver);
			Reporter.log("Click on Publish Now");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickContentTab(driver);
			Reporter.log("Click on Content Tab");
			
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.verifyPostTitle(driver);
			Reporter.log("Verify post");
			
			
	}
}
