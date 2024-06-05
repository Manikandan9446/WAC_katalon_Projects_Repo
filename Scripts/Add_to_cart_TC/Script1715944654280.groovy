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
		import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
		import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
		import internal.GlobalVariable as GlobalVariable
		import org.openqa.selenium.Keys as Keys
		import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://electronyat.qa/en')
		
		WebUI.maximizeWindow();
		
		WebUI.click(findTestObject('Object Repository/Add to cart/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/a_Smart Phones'))
		
		WebUI.delay(5)
		
		WebUI.scrollToPosition(500, 500)
		
		WebUI.delay(5)
		
		def productnamelistingpage = WebUI.getText(findTestObject('Object Repository/Add to cart/Custome_Xpath/Product_name'))
		
		def Productpricelistingpage = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/Product_price_listing'))
		
		WebUI.click(findTestObject('Object Repository/Add to cart/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/button_Add to Cart'))
		
		def sucess = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_Item added successfully'))
		
		sucess.equals("Item added successfully.")
		
		WebUI.click(findTestObject('Object Repository/Add to cart/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/span_1'))
		
		def cartext1 = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/Cart_text1'))
		
		def cartext2 = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/Cart_text2'))
		
		cartext1.equals("Cart") && cartext2.equals("Cart")
		
		def productname_cartpage = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/Product_name_Cartpage'))
		
		def Productprice_cartpage = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/Product_price_Cartpage'))
		
		productname_cartpage.equals(productnamelistingpage)
		
		Productprice_cartpage.equals(Productpricelistingpage)
		
		
		def itemcount = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/h2_Cart(1 item)'))
		
		String[] splitedtext = itemcount.split(" ")
		
		def nextcount = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/item_count_2'))
		
		splitedtext.equals('nextcount')
		
		
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Add to cart/Page_/h4_Price Details'), 10)) {
		    println("Price Details section is present ")
			def Subtotal = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/span_QAR1,029'))
			def PriceTotal = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/span_QAR1,029'))
			
			Subtotal && PriceTotal.equals(Productpricelistingpage)
			
			def deleverycharge = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/Delevery_charge'))
			
			deleverycharge.equals("Free")
			
			
		} else {
		    println("Price Details section is not present.")
		}
		
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Add to cart/Custome_Xpath/termsandcond_checkbox'), 10)) {
		    println("Checkbox is present")
		    
		    // Click the checkbox
		    WebUI.click(findTestObject('Object Repository/Add to cart/Custome_Xpath/termsandcond_checkbox'))
		    
		    try {
		        // Verify if the button is clickable
		        WebUI.verifyElementClickable(findTestObject('Object Repository/Add to cart/Page_/button_Checkout'), 10)
		        println("Checkbox is enabled. Button should be clickable.")
		    } catch (Exception e) {
		        println("Checkbox is disabled. Button may not be clickable.")
			
		    }
			
			
		} else {
		    println("Checkbox is not present")
		   
		}
		
		
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Add to cart/Page_/button_Checkout'), 10))
					{
						WebUI.click(findTestObject('Object Repository/Add to cart/Custome_Xpath/termsandcond_checkbox'))
						
						WebUI.delay(3)
						
						WebUI.click(findTestObject('Object Repository/Add to cart/Page_/button_Checkout'))
						
						WebUI.delay(3)
						
						def signinheading =  WebUI.getText(findTestObject('Object Repository/Add to cart/Custome_Xpath/Sign popup_name'))
						
						if (signinheading.equals("Sign in to your account"))
								{
									WebUI.setText(findTestObject('Object Repository/Login_TCB/Page_/input_EmailPhone number_username'), 'aswathi.s@webandcrafts.com')
									
									WebUI.setText(findTestObject('Object Repository/Login_TCB/Page_/input_Password_password'), 'Tester')
									
									WebUI.click(findTestObject('Object Repository/Login_TCB/Page_/button_Sign In'))
										
									WebUI.delay(3)
									
									WebUI.mouseOver(findTestObject('Object Repository/Login_TCB/Page_/svg'))
									
									def email_verifcation = WebUI.getText(findTestObject('Object Repository/Add to cart/Custome_Xpath/Email_id_on popup'))
									
									
									
										if(email_verifcation.equals("aswathi.s@webandcrafts.com"))
										{
											WebUI.click(findTestObject('Object Repository/Add to cart/Page_/button_Checkout'))
											
											WebUI.delay(3)
											
											def shipping = WebUI.getText(findTestObject('Object Repository/Add to cart/Custome_Xpath/Shipping_text'))
											
											shipping.equals("Shipping")
										}
										else
										{
											 println("The shipping page is not redirected")
										}
								}
								else
								{
									println("The User is already Login")
								}
								
					
					}
					else
					{
						println("The Checkout button is not presented")
					}
					
					
		DriverFactory.getWebDriver().executeScript("javascript:history.back()")
		
		WebUI.delay(4)
		
		TestObject to = findTestObject('Object Repository/Add to cart/Page_/h2_Recommended Products')
		int timeout = 10
		
		WebUI.verifyElementPresent(to, timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		
		WebUI.click(findTestObject('Object Repository/Add to cart/Page_/button_Remove'))
		
		def removetext = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/div_Webandcrafts_modal-header_1'))
		
		removetext.equals("Remove Product")
		
		def removedesctext = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/p_Are you sure you want to remove this item'))
		
		removedesctext.equals("Are you sure you want to remove this item")
		
		
		WebUI.click(findTestObject('Object Repository/Add to cart/Page_/button_Yes'))
		
		def removesuccess = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/div_Item removed successfully'))
		
		removesuccess.equals("Item removed successfully")
		
		
	
			def cartemty = WebUI.getText(findTestObject('Object Repository/Add to cart/Page_/h1_Your cart is empty'))
			
			cartemty.equals("Your cart is empty")
			
	//			println("The cart is empty , Continue on shopping ....")
				WebUI.click(findTestObject('Object Repository/Add to cart/Page_/a_Start Shopping'))
	
	//			println("Cart is not empty , other products has inside the cart ")
	//			WebUI.verifyElementPresent('Object Repository/Add to cart/Page_/Product_name_Cartpage', 10)
					
	//	WebUI.click(findTestObject('Object Repository/Add to cart/Custome_Xpath/Click_logo'))
		
		WebUI.delay(2)
		
		
		WebUI.closeBrowser()