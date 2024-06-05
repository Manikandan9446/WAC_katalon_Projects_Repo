import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.ctc.wstx.api.InvalidCharHandler.FailingHandler
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

WebUI.callTestCase(findTestCase('LOGIN_TCB_TC'), [('Email') : 'manikandanr.r+14@webandcrafts.com', ('Password') : 'Tester007'], FailureHandling.STOP_ON_FAILURE)

// Navigate to Change password page

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/svg'))

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/a_Change Password'))

//Verify the all headings in the page 

def changepassword = WebUI.getText(findTestObject('Object Repository/My account_Change_password/Page_/h2_Reset your Password'))

changepassword.contentEquals("Reset your Password")

def currentpswd_text = WebUI.getText(findTestObject('Object Repository/My account_Change_password/Page_/label_Current Password'))

currentpswd_text.contentEquals("Current Password")

def newpaswd_text = WebUI.getText(findTestObject('Object Repository/My account_Change_password/Page_/label_New Password'))

newpaswd_text.contentEquals("New Password")

def confrmnewpwsd_text = WebUI.getText(findTestObject('Object Repository/My account_Change_password/Page_/label_Confirm New Password'))

confrmnewpwsd_text.contentEquals("Confirm New Password")

//Verify the clear form functionality 

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/div_ClearSave'))

WebUI.setEncryptedText(findTestObject('Object Repository/My account_Change_password/Page_/input_Current Password_currentpassword'), 
    'rD2bE49Jl/U=')

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/path'))

WebUI.setEncryptedText(findTestObject('Object Repository/My account_Change_password/Page_/input_New Password_newpassword'), 
    'c0qwclwlG2/jpnxNISlVIQ==')

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/svg'))

WebUI.setEncryptedText(findTestObject('Object Repository/My account_Change_password/Page_/input_Confirm New Password_confirmnewpassword'), 
    'c0qwclwlG2/jpnxNISlVIQ==')

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/svg'))

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/button_Clear'))

WebUI.delay(3)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/My account_Change_password/Page_/input_Current Password_currentpassword'), 'value', '', 20)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/My account_Change_password/Page_/input_Current Password_currentpassword'), 'value', '', 20)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/My account_Change_password/Page_/input_Current Password_currentpassword'), 'value', '', 20)

WebUI.delay(3)

//Add all required passwords in the field 

WebUI.setText(findTestObject('Object Repository/My account_Change_password/Page_/input_Current Password_currentpassword'), 
    'Tester007')

WebUI.setText(findTestObject('Object Repository/My account_Change_password/Page_/input_New Password_newpassword_1'), 'Tester008')

WebUI.setText(findTestObject('Object Repository/My account_Change_password/Page_/input_Confirm New Password_confirmnewpassword_1'), 
    'Tester008')

//Click on the save button 

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/div_Your password has been changed successfully'))

//Logout the current account 

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/button_Logout'))

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/button_Yes'))

//Verify login with previous password 

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/path'))

WebUI.setText(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/input_EmailPhone number_username'), 
    'manikandanr.r+14@webandcrafts.com')

WebUI.setEncryptedText(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/input_Password_password'), 
    'rD2bE49Jl/U=')

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/svg_1'))

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/button_Sign In'))

WebUI.delay(5)

def Invalid_credentials =  WebUI.getText(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/div_Invalid credentials')), FailureHandling

println(Invalid_credentials) 

//Add the Valid (Latest password ) data on form 

WebUI.sendKeys(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/input_Password_password_1'), Keys.chord(Keys.CONTROL, "a"))

WebUI.sendKeys(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/input_Password_password_1'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/input_Password_password_1'), 
    'Tester008')

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/button_Sign In'))

//Verify the Login success message 

def loginsucces = WebUI.getText(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/div_Login Successful')), FailingHandler

println(loginsucces)

if(loginsucces.contentEquals("Login Successful"))
{
	println("The Login sucessful")
}else
{
	println("The Login is not sucessful , Please check ")
}

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/path_1'))

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/div_aswathi.s22webandcrafts.com'))

WebUI.click(findTestObject('Object Repository/My account_Change_password/Page_/img_What are you looking for_loaded image'))

WebUI.closeBrowser()

