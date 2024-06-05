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

// Open browser

WebUI.openBrowser('')

// Log in to the application

WebUI.callTestCase(findTestCase('LOGIN_TCB_TC'), [('Email') : 'manikandanr.r+14@webandcrafts.com', ('Password') : 'Tester008'], FailureHandling.STOP_ON_FAILURE)

// Navigate to Leave a Feedback page

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/path'))

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/a_Leave a Feedback'))

//Verify the contact us heading 

def contactustext = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/li_Contact Us'))

contactustext.contentEquals("Contact Us")

//Verify each heading and redirection 

def whatsapptext = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/p_WhatsApp'))

whatsapptext.contentEquals("WhatsApp")

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/a_97431579577'))

WebUI.switchToWindowTitle('Share on WhatsApp')

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_Share on WhatsApp/p_Chat on WhatsApp with 974 3322 9569'))

WebUI.switchToWindowTitle('')

def landlinetext = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/p_Landline'))

landlinetext.contentEquals("Landline")

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/a_97444233650'))

//Verify the client Email on the page 

def emailtext = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/p_Email'))

def emailid = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/a_Infoelectronyat.qa'))

emailtext.equals("Email") && emailid.contentEquals("Info@electronyat.qa")

//WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/a_Infoelectronyat.qa'))
//
//WebUI.delay(3)
//
//WebUI.clickOffset((findTestObject('Object Repository/Myaccount_ContactUS/Page_/h1_Lets get in touch')), 500, 200)

//Verify the page heading and form heading 

def heading_letsget = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/h1_Lets get in touch'))

def subheading_sendmessage = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/p_Send us a message'))

heading_letsget.contentEquals("Lets get in touch") && subheading_sendmessage.contentEquals("Send us a message")       

//Verify the prefilled firstname and heading

WebUI.verifyElementPresent((findTestObject('Object Repository/Myaccount_ContactUS/Page_/label_First Name')), 10)

def firstname_value = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_First Name_first_name'))

firstname_value.contentEquals("Test WaC")

//Verify the prefilled Last Name and heading

WebUI.verifyElementPresent((findTestObject('Object Repository/Myaccount_ContactUS/Page_/label_Last Name')), 10)

def lastnamevalue = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_Last Name_last_name'))

lastnamevalue.contentEquals("Aswathi")

//Verify the prefilled Email Address and heading

WebUI.verifyElementPresent((findTestObject('Object Repository/Myaccount_ContactUS/Page_/label_Email Address')) , 10)

def emailidvalue = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Emailvalue'))

println(emailidvalue)

emailidvalue.contentEquals("aswathi.s@webandcrafts.com")

//Verify the prefilled Phone Number and heading

WebUI.verifyElementPresent((findTestObject('Object Repository/Myaccount_ContactUS/Page_/label_Phone Number')), 10)

def phonenumber = WebUI.getText(findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Phonenumber'))

println(phonenumber)

emailidvalue.contentEquals("+974 5755756222")

// Add a new message 

WebUI.verifyElementPresent((findTestObject('Object Repository/Myaccount_ContactUS/Page_/label_Message')), 10)

WebUI.setText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/textarea_Message_message'), 'Testing purpose ')

//Click on the submit button 

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/button_Submit'))

//Verify the submitted succes message . 

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/div_Successfully Submitted'))

//Enter all new data and submit the form .

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_First Name_first_name'), Keys.chord(Keys.CONTROL, "a"))

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_First Name_first_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText((findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_First Name_first_name')) , 'Manikandan')

//Enter last name 

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_Last Name_last_name'), Keys.chord(Keys.CONTROL, "a"))

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_Last Name_last_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText((findTestObject('Object Repository/Myaccount_ContactUS/Page_/input_Last Name_last_name')) , 'raj')

//Enter Email 

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Emailvalue'), Keys.chord(Keys.CONTROL, "a"))

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Emailvalue'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText((findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Emailvalue')) , 'manikandan4419@yopmail.com')

//Enter Phonenumber

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Phonenumber'), Keys.chord(Keys.CONTROL, "a"))

WebUI.sendKeys(findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Phonenumber'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText((findTestObject('Object Repository/Myaccount_ContactUS/Customk xpath/Phonenumber')) , '+974 753951')

//Enter message 

WebUI.setText(findTestObject('Object Repository/Myaccount_ContactUS/Page_/textarea_Message_message'), 'Testing purpose ')

//Click on the submit button 

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/button_Submit'))

//Verify the submitted succes message . 

WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/div_Successfully Submitted'))


WebUI.click(findTestObject('Object Repository/Myaccount_ContactUS/Page_/img_Get it now_loaded image'))

WebUI.closeBrowser()

