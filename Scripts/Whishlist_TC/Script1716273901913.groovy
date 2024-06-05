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
	
	WebUI.navigateToUrl('https://uat.electronyat.qa/en')
	
	WebUI.maximizeWindow()
	
	WebUI.delay(3)
	
	// To click the mobile phones from the header 
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/a_Mobile Phones'))
	
	WebUI.delay(5)
	
	WebUI.scrollToPosition(500, 500)
	
	WebUI.delay(5)
	
	// To fetch the text from product name and price on listing page 
	def prodctname_listing = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Productname_list'))
	
	def productprice_list = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/ProductPrice_listing'))
	
	//To check add wishlist without login (Verify the signup/signin popup heading )
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/svg'))
	
	def signuppopupheaidng = WebUI.getText(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_Webandcrafts_modal-header'))
	
	signuppopupheaidng.equals('Sign in to your account')
	
	//To check add wishlist with login (Verify the signup/signin popup heading and enter the cred )
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/button_Webandcrafts_btn-close'))
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/svg_1'))
	
	def signuppopupheaidng2 = WebUI.getText(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_Webandcrafts_modal-header'))
	
	signuppopupheaidng2.equals('Sign in to your account')
	
	WebUI.setText(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/input_EmailPhone number_username'), 
	    email)
	
	WebUI.setText(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/input_Password_password'), 
	    Password)
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/path'))
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/button_Sign In'))
	
	//To verify the Product added to wishlist and Login Successful toasted messages 
	def addedmessage = WebUI.getText(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_Product added to wishlist'))
	
	addedmessage.equals('Product added to wishlist')
	
	def Loginmessage = WebUI.getText(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_Login Successful'))
	
	Loginmessage.equals('Login Successful')
	
	//To click the whishlist icon from the header 
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/svg_1_2'))
	
	//To validate the product name and price from the wishlist page with text from product name and price on listing page 
	def productname_wihslist = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Productname_Whishlist'))
	
	def productprice_whislist = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Productprice_whishlist'))
	
	productname_wihslist.equals(prodctname_listing)
	
	productprice_whislist.equals(productprice_list)
	
	//To click on the Product and redirect to product inner page from whishlist page 
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/h4_Samsung Galaxy A35 5G 256GB Mobile Phone_942eac'))
	
	//To validate the product name and price from the product inner page with text from product name and price on listing page
	def productname_PDP = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Productname_PDP'))
	
	def productname2PDP = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Productname_pdp2'))
	
	productname_PDP && productname2PDP.equals(prodctname_listing)
	
	def Productprice = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Producprice_PDP'))
	
	Productprice.equals(productprice_list)
	
	//To return back to whislist page from product inner page 
	DriverFactory.getWebDriver().executeScript('javascript:history.back()')
	
	WebUI.delay(4)
	
	//To check the cart button is avaialable on whishlist page or View product button 
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/add to cart'), 10)) {
	    // To click on the add to cart button 
	    WebUI.click(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/add to cart'))
	
	    //To verify the Item added successfully message 
	    def carttext = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Add to cart_sucess'))
	
	    println(carttext)
	
	    if (carttext.equals('Item added successfully.')) {
	        println('The product added successfully')
	    } else {
	        println('The product is not added successfully , Please check the quantity of the product ')
	    }
	} else {
	    WebUI.verifyElementPresent(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Viewmore_btny'), 10)
	}
	
	//To click on the cart icon on header 
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/svg'))
	
	// To verify the cart page with cart heading 
	def carttext = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Carttext'))
	
	carttext.equals('Cart')
	
	//To verify product name from cart page to product name from listing page 
	def cartinnerproductname = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Cart_innerpage_Product name'))
	
	cartinnerproductname.equals(prodctname_listing)
	
	//To verify the add from whishlist button on cart page 
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/add_from_whishlist_btn'))) {
	    WebUI.click(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/add_from_whishlist_btn'))
	
	    WebUI.delay(3)
	
	    // To verify the whsihkist page with heading 
	    def whishlisttext = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Whishlist_text'))
	
	    whishlisttext.equals('Wishlist')
	} else {
	    println('The product is not from the Whishlist ')
	}
	
	//To validate the remove functionality from whishlist page 
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/button_View Product_wishList_close_btn__tkxTZ'))
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/div_Webandcrafts_modal-header'))
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/p_Are you sure you want to remove this item'))
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/button_Yes'))
	
	def removedtext = WebUI.getText(findTestObject('Object Repository/Add_to_cart_TC/Page_/div_Removed from the Wishlist'))
	
	removedtext.equals('Removed from the Wishlist')
	
	// To Click on wishlist icon on mobile page 
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_/a_Mobile Phones'))
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/svg_1_2_3'))
	
	def addedtext = WebUI.getText(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_Product added to wishlist'))
	
	println(addedmessage)
	
	// To verify remove function on mobile page , after click on whishlist icon 
	WebUI.click(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Whishlist_icon_filled'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/div_Removed from the Wishlist'))
	
	WebUI.click(findTestObject('Object Repository/Add_to_cart_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/img_Get it now_loaded image'))
	
	WebUI.closeBrowser()
	
