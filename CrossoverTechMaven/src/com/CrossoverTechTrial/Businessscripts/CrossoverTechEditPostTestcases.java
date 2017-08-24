package com.CrossoverTechTrial.Businessscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;



import com.CrossoverTechTrial.PageObjects.CrossoverTechTrialContentPage;
import com.CrossoverTechTrial.PageObjects.CrossoverTechTrialEditContentPage;
import com.CrossoverTechTrial.PageObjects.CrossoverTechTrialNewPostPage;
import com.CrossoverTechTrial.Reusables.Configurations.Configurator;


public class CrossoverTechEditPostTestcases extends Configurator {
	
	@Test(priority = 1)
	public void EditPostscriptExecution() throws Exception {
		
	
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickContentTab(driver);
			Reporter.log("Clicked on Content Tab");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickEditIcon(driver);
			Reporter.log("Click on Edit Post");
			
			Thread.sleep(2000);
			CrossoverTechTrialEditContentPage.editTitle(driver);
			Reporter.log("Post Title is Edited");
			
			Thread.sleep(2000);
			CrossoverTechTrialEditContentPage.editDescription(driver);
			Reporter.log("Click on Content to Edit Post");
			
			Thread.sleep(2000);
			CrossoverTechTrialEditContentPage.editImage(driver);
			Reporter.log("Click on image to Edit Post");
									
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickSettingsMenuDropdown(driver); 
			Reporter.log("Click on Settings Menu Dropdown");
			
			Thread.sleep(2000);
			CrossoverTechTrialNewPostPage.clickPublishNowOption(driver);
			Reporter.log("Click on Publish Now in Settings Menu Dropdown");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.clickContentTab(driver);
			Reporter.log("Click on Content Tab");
			
			Thread.sleep(2000);
			CrossoverTechTrialContentPage.verifyPost(driver);
			Reporter.log("Click on Content Tab");
			
			
	}
	

}
