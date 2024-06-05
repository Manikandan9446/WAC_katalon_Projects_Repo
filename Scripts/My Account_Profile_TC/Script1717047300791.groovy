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
	
	WebUI.callTestCase(findTestCase('LOGIN_TCB_TC'), [('Email') : 'manikandanr.r+14@webandcrafts.com', ('Password') : 'Tester008'], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.delay(3)
	
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/svg'))
	
	def oldemail = WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/div_aswathi.s22webandcrafts.com'))
	
	 WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/a_Profile'))
	
	def profile = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/h4_Profile'))
	
	if(profile.equals("Profile"))
	{
		def profileinfo = WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/h2_Profile Info'))
		
		profileinfo.equals("Profile Info")
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_First Name')), 10)
		
		def oldfistname = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_First Name_firstname'))
		
		oldfistname.equals("Test WaC")
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_Last Name')), 10)
		
		def oldlastname = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Last Name_lastname'))
		
		oldlastname.equals("Aswathi")
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_Date of Birth')), 10)
		
		def DOB = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/label_Date of Birth'))
		
		DOB.equals("16 / 05 / 1990")
		
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Custom xpath/gender')), 10)
		
		WebUI.check(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/gender'))
	
	    WebUI.verifyElementChecked(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/gender'), 30)
	
	    WebUI.check(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/gender'))
		
		
	}
	else 
	{
		println("The displied Profile Info is wrong ")
	}
	
	
	
	WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_First Name_firstname'), Keys.chord(Keys.CONTROL, "a"))
	
	WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_First Name_firstname'), Keys.chord(Keys.BACK_SPACE))
	
	
	WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_First Name_firstname'), 'Testeditname')
	
	WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Last Name_lastname'), Keys.chord(Keys.CONTROL, "a"))
	
	WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Last Name_lastname'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Last Name_lastname'), 'Aedit')
	
	WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_text'), '')
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/input_text'))
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/div_May 2024'))
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/MyAccount_Profile/Page_/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
	    '10', true)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/MyAccount_Profile/Page_/select_190019011902190319041905190619071908_246ee1'), 
	    '1998', true)
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/div_21'))
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/label_Male'))
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Gender_gender'))
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Update'))
	
	def changedmessage = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/div_Successfully Changed'))
	
	changedmessage.equals("Successfully Changed")
	
	if(changedmessage.equals("Successfully Changed"))
	{
		def profileinfo = WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/h2_Profile Info'))
		
		profileinfo.equals("Profile Info")
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_First Name')), 10)
		
		def oldfistname = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_First Name_firstname'))
		
		oldfistname.equals("Testeditname")
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_Last Name')), 10)
		
		def oldlastname = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Last Name_lastname'))
		
		oldlastname.equals("Aedit")
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_Date of Birth')), 10)
		
		def DOB = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/label_Date of Birth'))
		
		DOB.equals("21 / 10 / 1998")
		
		
		WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Gender2_after edit')), 10)
		
		WebUI.check(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Gender2_after edit'))
	
	    WebUI.verifyElementChecked(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Gender2_after edit'), 30)
	
	    WebUI.check(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Gender2_after edit'))
		
		
	}
	else 
	{
		println("The displied Profile Info is wrong after edit ")
	}
	
	def abovetext = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Page_/div_Hello Testnew'))
	if(abovetext.equalsIgnoreCase("Testnew"))
	{
		println("The text was changed on above as well ")
	}
	else 
		{
			println("The text was not changed on above as well ")
		}
	
	
	WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_Email Address')), 10)
	
	def oldemail1 = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/emailid'))
	
	oldemail1.equals("aswathi.s+22@webandcrafts.com")
	
	oldemail1.equals(oldemail)
	
	
	WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/label_Phone Number')), 10)
	
	def oldmobile = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Mobilenumber'))
	
	oldmobile.equals("+97457557562")
	
	
	if(WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/button_Edit')), 10 ))
			{
			WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Edit'))
			
			WebUI.delay(3)
			
			WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Email Address_user_name'), Keys.chord(Keys.CONTROL, "a"))
			
			WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Email Address_user_name'), Keys.chord(Keys.BACK_SPACE))
	
			WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Email Address_user_name'), 'testnewaccount001@yopmail.com')
	
			WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Save'))
			
			WebUI.delay(5)
			
			def otptext = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/OTP popup'))
				
			if(otptext.equals("OTP Verification"))
			{
//				WebUI.navigateToUrl("https://yopmail.com/en/")
//				
//				WebUI.delay(3)
//				
//				WebUI.setText((findTestObject('Object Repository/MyAccount_Profile/Custom xpath/YOP_emailenter')), "testnewaccount001@yopmail.com")
//				
//				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Click_login_YOP'))
//				
//				WebUI.delay(2)
//				
//				def OTP = WebUI.getText((findTestObject('Object Repository/MyAccount_Profile/Custom xpath/OTP frm email')))
//				
//				println("The OTP is : " + OTP)
//				
//				WebUI.delay(3)
//				
//				WebUI.switchToWindowIndex(0)
//				
//				WebUI.delay(3)
//				
//				WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Enter OTP'), OTP)
//				
////				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Click_verify'))
				
				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Close icon OTP'))
				
				
			}else 
			{
				println("The OTP verifaction is not found ")
			}
			
			WebUI.delay(3)
			
			def oldemail2 = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/emailid'))
			
			if(oldemail2.equals("testnewaccount001@yopmail.com"))
			{
				println("The email is updated ")
			}	else 
			{
				println("The email is not updated ")
			}
			
			WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Edit'))
			
			WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Email Address_user_name'), Keys.chord(Keys.CONTROL, "a"))
			
			WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Email Address_user_name'), Keys.chord(Keys.BACK_SPACE))
			
			WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Email Address_user_name'), 'aswathi.s+2235@webandcrafts.com')
			
			WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Cancel'))
			
			def oldemail3 = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/emailid'))
			
			if(oldemail3.equals("aswathi.s+223@webandcrafts.com"))
			{
				println("The email is not updated after click on cancel ")
			}else 
			{
				println("The mobile number is updated after click on cancel ")
			}
			
			def oldemail4 = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Aboveprofileemailid'))
			
			oldemail4.equals("testnewaccount001@yopmail.com")
			
			}else
			{
				println("The email address is not updated ")
			}
	
			
	
	if(WebUI.verifyElementPresent((findTestObject('Object Repository/MyAccount_Profile/Page_/button_Edit')), 10 ))
			{
				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Edit'))
				
				WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Phone Number_user_name'), Keys.chord(Keys.CONTROL, "a"))
				
				WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Phone Number_user_name'), Keys.chord(Keys.BACK_SPACE))
				
				WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Phone Number_user_name'), '+974 5755 7571')
				
				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Save'))
				
				WebUI.delay(2)
				
				def otptext2 = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/OTP popup'))
				
			if(otptext2.equals("OTP Verification"))
			{
				
				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Close icon OTP'))
			
				//note : OTP verification part need to be done 
			
		}else
		{
			
			println("The OTP verifaction is not found ")
		}
			
				
				
				def newmobile  = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Mobileonfield'))
				
				if(newmobile.equals("+974 5755 7571"))
				{
					println("The mobile number is updated ")
				}else 
				{
					println("The mobile number is not updated ")
				}
				
				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Edit'))
				
				WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Phone Number_user_name'), Keys.chord(Keys.CONTROL, "a"))
				
				WebUI.sendKeys(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Phone Number_user_name'), Keys.chord(Keys.BACK_SPACE))
				
				WebUI.setText(findTestObject('Object Repository/MyAccount_Profile/Page_/input_Phone Number_user_name'), '+99446672572')
				
				WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/button_Cancel'))
				
				def newmobile2  = WebUI.getText(findTestObject('Object Repository/MyAccount_Profile/Custom xpath/Mobileonfield'))
				
				if(newmobile2.equals("+974 5755 7571"))
				{
					println("The mobile number is not updated after click on cancel ")
				}else 
				{
					println("The mobile number is updated after click on cancel ")
				}
				
			}else 
			{
				println("The email Mobile number  is not updated ")
			}
	
	
	WebUI.click(findTestObject('Object Repository/MyAccount_Profile/Page_/img_What are you looking for_loaded image'))
	
	WebUI.acceptAlert()
	
