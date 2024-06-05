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
		import org.openqa.selenium.Keys
		import org.openqa.selenium.remote.server.handler.FindElement as Keys
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://uat.electronyat.qa/en')
		
		WebUI.maximizeWindow();
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/a_Mobile Phones'))
		
		WebUI.delay(7)
		
		WebUI.scrollToPosition(900, 900)
		
		WebUI.delay(5)

		
		
		def prodctname_listing = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/Productname_list'))
		
		println(prodctname_listing)
		
		def productprice_list = WebUI.getText(findTestObject('Object Repository/Whishlist_TC/Custom_Xpath/ProductPrice_listing'))
		
		
		WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_Online Mobile Shopping in Qatar  Buy S_9d70b0/a_OfferSamsung Galaxy A35 5G 256GB Mobile P_7245a5'))
		
		
		
		def prrdt_name_pdp1 = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/li_Samsung Galaxy A35 5G 256GB Mobile Phone_b158a5'))
		
		def prrdt_name_pdp2 = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h1_Samsung Galaxy A35 5G 256GB Mobile Phone_69aef2'))
		
		prrdt_name_pdp1 && prrdt_name_pdp2.equals(prodctname_listing)
		
		
		def prdt_price_pdp1 = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_QAR1,199'))
		
		def prdt_price_pdp2 = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_QAR1,199'))
		
		prdt_price_pdp1 && prdt_price_pdp2.equals(productprice_list)
		
		def instocktext = WebUI.getText(findTestObject('Object Repository/Product_innerpage_2/Page_Samsung Galaxy A05S, 128GB, Series (4GB Ram)/span_In stock'))
		
		System.out.println(instocktext)
		
		if (instocktext.equals("In stock"))
		{
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/button_Quick Buy'))
		}else 
		{
			System.out.println("The product is outofstock , Please Go with another stocked product ")
		}
		
		
		def redirected_pgname = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/p_Shipping'))
		
		System.out.println(redirected_pgname)
		
		
		if(redirected_pgname.equals("Shipping"))
		{
			
			def ordersummery = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h3_Order Summary'))
			
			
			
			if(ordersummery.equals("Order Summary")) 
					{
						def Productname_shipping = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Custom_xpath/Productname_shipping'))
						
						Productname_shipping.equals(prodctname_listing)
						
						def productprice_shipping =  WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Custom_xpath/Productprice_shipping'))
						
						productprice_shipping.equals(productprice_list)
						
						WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout_Quickpay_TC/Custom_xpath/Editcart'), 10)
						
						def price_details = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Custom_xpath/pricedetails_shipping'))
						
						if(price_details.equals("Price Details"))
						{
							def subtotal_verify = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Custom_xpath/subtotal_text'))
							
							def subtotal_price = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_QAR1,199'))
							
							subtotal_verify.equals("Subtotal") && subtotal_price.equals(productprice_list)
							
							def pricetotal_verify = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Custom_xpath/pricetotal_text'))
							
							def pricetotal = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_QAR1,199'))
							
							pricetotal_verify.equals("Price Total") && pricetotal.equals(productprice_list)
							
						}
						else 
						{
							System.out.println("The Order Summary is not apeared ")
						}
		
		
			
			
		}else
		{
		    System.out.println("The Order Summary is not apeared ")
		}
		
		def shipping_method = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h3_Select Shipping Method'))
		
		if(shipping_method.equals("Select Shipping Method"))
		{
			def homedelevery = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_Home Delivery'))
			
			homedelevery.equals("Home Delivery")
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_First Name'))
			
			WebUI.setText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/input_First Name_firstname'), 'Manikandan')
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Last Name'))
			
			WebUI.setText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/input_Last Name_lastname'), 'raj')
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Email'))
			
			WebUI.setText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/input_Email_email'), 'mnaikandan456@yopmail.com')
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Phone Number'))
			
			WebUI.setText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/input_Phone Number_phone_number'), '+974 984127')
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Country'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_City'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Street'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Zone Number'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/div_Select  zone  number_custom-select__inp_25ea20'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/div_78 - Abu Dhalouf'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Building Number'))
			
			WebUI.setText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/input_Building Number_building_number'), '25')
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Unit Number'))
			
			WebUI.setText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/input_Unit Number_unit_number'), '36')
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Alternate Number'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Preferred delivery time'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Type of Address'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/label_Home'))
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/button_Submit'))
			
		}
		else 
		{
			System.out.println("The shipping method is not apeared ")
		}
		
		WebUI.delay(3)
		
		def shipping_text = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/p_Shipping'))
		
		if(shipping_text.equals("Shipping"))
		{
			def slectshipping_text = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h3_Select Shipping Method'))
			
			slectshipping_text.equals("Select Shipping Method")
			
			def homedelevery_text = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_Home Delivery'))
			
			homedelevery_text.equals("Home Delivery")
			
			def emailvalidation =WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_mnaikandan456yopmail.com'))
			
			emailvalidation.equals("mnaikandan456@yopmail.com")
			
			def username = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h4_Manikandan rajHome'))
			
			
			username.equals("Manikandan raj")
			
			def delevery_type = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Custom_xpath/dlevery_type'))
			
			delevery_type.equals("HOME")
			
			def phone_number = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/p_974984127'))
			
			phone_number.equals("+974 984127")
			
			
			
			
		}
		else 
		{
			System.out.println("The entered address is not added ")
		}
		
		def ordersummer2 = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h3_Order Summary'))
		
		println(ordersummer2)
		
		if(ordersummer2.equals("Order Summary"))
				{
					def subprice1= WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_QAR1,199'))
						
					def pricetotal = WebUI.getText(('Object Repository/Checkout_Quickpay_TC/Page_/span_QAR1,199'))
					
					subprice1 && pricetotal.equals(productprice_list)
					
					
					WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/button_Go to payment'))
				
					
		
				}
				else
				{
					System.out.println("The Order Summary is not apeared ")
				}
		
		
		
		def shipping_text2 = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/p_Shipping'))
		
		if(shipping_text2.equals('Shipping'))
		{
			def payment_info = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h2_Payment Info'))
			
			payment_info.equals("Payment Info")
			
			def payement_method = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/h2_Payment Methods'))
			
			payement_method.equals("Payment Methods")
			
			def payement_method1 =  WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/p_Cash  Card On Delivery'))
			
			payement_method1.equals("Cash  Card On Delivery")
			
			
			WebUI.verifyElementChecked((findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/span_Payment Methods_paymentMethods_radio_i_843a61')), 10)   
			
			
			WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/button_Confirm Order'))
			
			
			
		}
		else
			{
				System.out.println("The Shipping details  is not apeared ")
			}
		
		
		
		def sucessfull = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_Payment Receipt/h1_Order Placed Successfully'))
		
		sucessfull.equals("Order Placed Successfully")
		
		def email_succespage = WebUI.getText(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_Payment Receipt/span_mnaikandan456yopmail.com'))
		
		email_succespage.equals('mnaikandan456yopmail.com')
		
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/Checkout_Quickpay_TC/Page_Payment Receipt/p_ORDER ID  220520240132')), 10)
		
		
		
		WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_Payment Receipt/a_Continue Shopping'))
		
		WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/svg'))
		
		WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/button_Webandcrafts_btn-close'))
		
		WebUI.click(findTestObject('Object Repository/Checkout_Quickpay_TC/Page_/img_Get it now_loaded image'))
		
		WebUI.closeBrowser()
		}
		
