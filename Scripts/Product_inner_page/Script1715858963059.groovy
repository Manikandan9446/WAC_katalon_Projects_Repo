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
	
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://uat.electronyat.qa/en')
	
	WebUI.maximizeWindow()
	
	// To Click on mobile phone on header 
	
	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_/a_Mobile Phones'))
	
	// To velidate the smartphone heading on listing page 
	
	def smartphonetext = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/span_Smart Phones'))
	
	smartphonetext.equals('Smart Phones')
	
	// To fetch the product name and price on listing page 
	
	def smartph_name = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_OfferSamsung Galaxy A05S, 128GB, Series_12327c'))
	
	def smartph_price = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/Price obj'))
	
	//To click on the view product button 
	
	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/a_View Product'))
	
	WebUI.delay(2)
	
	// To fetch the product name and price on product inner page 
	
	def phonename_inner = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/Heading tab name'))
	
	def phonename2_inner = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/headingmain name'))
	
	// To assert the product name and price from product inner page to listing page .
	
	phonename_inner.equals(smartph_name)
	
	phonename2_inner.equals(smartph_name)
	
	def price = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/span_QAR419'))
	
	price.equals(smartph_price)
	
	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/p_General'))
	
	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/p_Specifications'))
	
	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/p_Specifications'))
	
	// To verify the subheading the price details section 
	
	def subheading = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/h2_You may also like this'))
	
	subheading.equals('You may also like this')
	
	WebUI.delay(3)
	WebUI.executeJavaScript('window.scrollTo(0, 0);', null)
	
	// To fetch the instock or out of the stock status 
	
	def instocktext = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/span_In stock'))
	
	System.out.println(instocktext)
	
	//To check the price details if the product in stock 
	
	if (instocktext.equals('In stock')) {
	    WebUI.verifyElementPresent(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/div_QAR419128GBBlackQuantity -1Add to Cart _684182'), 
	        10)
	
	    def sideprice = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/span_QAR419'))
	
	    sideprice.equals(smartph_price)
		
		//To verify the all sub headings 
	
	    WebUI.verifyElementPresent(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/span_Quantity'), 
	        10)
	
	    WebUI.verifyElementPresent(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/span_1'), 
	        10)
	
	    WebUI.verifyElementPresent(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/button_Add to Cart'), 
	        10)
	
	    WebUI.verifyElementPresent(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/button_Quick Buy'), 
	        10)
	
	    WebUI.verifyElementPresent(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/a_Order by Whatsapp'), 
	        10)
	} else {
		
		// To intimate the user , if the product is in out of the stock 
		
	    WebUI.verifyElementPresent('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/Notifyview_obj', 
	        0)
	
	    System.out.println('The product is in Out of stock ')
	}
	
	
//	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/div'))
	
//	WebUI.verifyImagePresent(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/img_Webandcrafts_yarl__slide_image'))
	
//	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/path'))
	
	WebUI.click(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/img_Get it now_loaded image'))
	
	WebUI.closeBrowser()
	
