		import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
		import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
		import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
		import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
		import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
		import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
		import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
		import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
		import com.kms.katalon.core.model.FailureHandling as FailureHandling
		import com.kms.katalon.core.testcase.TestCase as TestCase
		import com.kms.katalon.core.testdata.TestData as TestData
		import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
		import com.kms.katalon.core.testobject.TestObject as TestObject
		import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
		import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
		import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
		import internal.GlobalVariable as GlobalVariable
		import org.openqa.selenium.Keys as Keys
		import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
		
		WebUI.openBrowser('')
		
		//Import the Login testcase to here 
				
		WebUI.callTestCase(findTestCase('LOGIN_TCB_TC'), [('Email') : 'manikandanr.r+14@webandcrafts.com', ('Password') : 'Tester008'], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(3)
		
		//To Click on account dashbaord 
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/svg_1_2'))
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/h4_Welcome to your Account'))
		
		
		//To Validate the whishlist text and click on wishlist 
		
		def whishlisttext = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Custom_Xpath/Whish list'))
		
		if(whishlisttext.equals("Whishlist"))
		{
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/p_Wishlist'))
			
			def whishlist = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Page_/p_Wishlist'))
			
			whishlist.equals("whishlist")
			
			DriverFactory.getWebDriver().executeScript('javascript:history.back()')
			
		}else 
		{
			println('The whishlist section is not avaialble on the page ')
		}
		
		//To Validate the Buy Again text and click on Buy Again
		
		def buyagain = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Page_/p_Buy Again'))
		
		if(buyagain.equals('Buy Again'))
		{
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/p_Buy Again'))
			
			def ordertext = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Custom_Xpath/Order text'))
			
			ordertext.equals("Orders")
			
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/a_Dashboard'))
			
			
			
		}else 
		{
			println('The Buynow section is not avaialble on the page ')
		}
		
		
		//To Validate the Addresses text and click on Addresses
		
		def address = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Page_/p_Addresses'))
		
		if(address.equals("Addresses"))
			
		{
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/p_Addresses'))
			
			def currentUrl = WebUI.getUrl()
			
			if (currentUrl.equals("https://uat.electronyat.qa/en/account/address") )
				{
			println ('OK')
			} else 
				{
			println ('Not ')
			}
			
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/a_Dashboard'))
		}else
		{
			println("The address section is not showing ")
		}
		
		//To Validate the FAQ  text and click on each FAQ and verify the expand fun and text 
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/My account _ Dashboard/Page_/h2_Frequently Asked Questions')) , 10)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/button_Why should I order online'))
		
		WebUI.delay(3)
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/My account _ Dashboard/Page_/ol_Fast.Online ordering and check-out gets _43c978')), 10)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/button_Why should I order online'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/button_What information do I need to provid_588491'))
		
		WebUI.delay(2)
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/My account _ Dashboard/Page_/div_To process your order, we require the f_260df2')), 10)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/button_What information do I need to provid_588491'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/button_How much does shipping cost'))
		
		WebUI.delay(2)
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/My account _ Dashboard/Page_/p_Shipping charges vary based on your locat_e248ae')), 10)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/button_How much does shipping cost'))
		
		WebUI.delay(2)
		
		//To click on view all and velidate the redirection page heading 
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/a_View All'))
		
		def helpheading = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Page_/h1_Help  FAQs'))
		
		helpheading.equals("Help  FAQs")
		
		WebUI.delay(2)
		
		DriverFactory.getWebDriver().executeScript('javascript:history.back()')
		
		WebUI.delay(3)
		
		// To verify Terms  Conditions of Use section and Click on the each option under that section 
		
		def termsheading = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Page_/h2_Terms  Conditions of Use'))
		
		if(termsheading.equals("Terms & Conditions of Use"))
		{ 
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Custom_Xpath/terms_condition'))
			
			
			def termsheading1 = WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/a_Terms  Conditions'))
			
			termsheading1.equals("Terms & Conditions")
			
			DriverFactory.getWebDriver().executeScript('javascript:history.back()')
			
			WebUI.delay(3)
			
			WebUI.verifyElementPresent((findTestObject('Object Repository/My account _ Dashboard/Page_Terms  Conditions of Use - Electronyat.qa/div_Terms  ConditionsELECTRONYAT.QAReturn  _df680c')), 10)
			
			WebUI.delay(2)

			
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/a_Refund  Exchange Policy'))
			
			def refundtext = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Page_Refund  Exchange Policy - Electronyat.qa/h1_Refund  Exchange Policy'))
			
			refundtext.equals("Refund & Exchange Policy")
			
			DriverFactory.getWebDriver().executeScript('javascript:history.back()')
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/a_Shipping  Returns'))
			
			def shippingtext = WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_Shipping  Returns - Electronyat.qa/div_Shipping  ReturnsRefund Exchange of the_e2d672'))
			
			shippingtext.equals("Shipping & Returns")
			
			DriverFactory.getWebDriver().executeScript('javascript:history.back()')
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/a_Warranty Terms  Conditions'))
			
			def warranty = WebUI.getText(findTestObject('Object Repository/My account _ Dashboard/Page_Warranty Terms  Conditions - Electronyat.qa/div_Warranty Terms  ConditionsAll Electrony_0be8b0'))
			
			warranty.equals("Warranty Terms & Conditions")
			
			DriverFactory.getWebDriver().executeScript('javascript:history.back()')
			
		}else
		{
			println("The terms of use section is not avaliable ")
		}
		
		
		WebUI.click(findTestObject('Object Repository/My account _ Dashboard/Page_/img_What are you looking for_loaded image'))
		
		WebUI.closeBrowser()
		
