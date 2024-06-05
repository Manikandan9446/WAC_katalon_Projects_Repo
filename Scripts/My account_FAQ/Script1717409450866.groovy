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

WebUI.callTestCase(findTestCase('LOGIN_TCB_TC'), [('Email') : 'shine.j+3@webandcrafts.com', ('Password') : '123456'], FailureHandling.STOP_ON_FAILURE)

// Navigate to FAQ page

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/svg'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/a_Help  FAQs'))

//Verify the headings in the page

def helpfaqtext = WebUI.getText(findTestObject('Object Repository/My account_FAQ/Page_/h1_Help  FAQs'))

helpfaqtext.contentEquals("Help & FAQs")

// Select the filter dropdown 

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/div_Help  FAQs_customDropDown_dropdown_main_94d872'))


WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_All'))

// Click on FAQ que and verify the below content 

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How can I change my shipping address'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_By default, the last used shipping addres_2ccf28')), 10)

//Verify the email address is apeared 

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_supportelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What are all the checkout limits'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_By default, the last used shipping addres_2ccf28_1')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How can I track my orders  payments'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/desc4')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What is the delivery fee'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_Sellers generally cant change the shippin_6f6eb8')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What is the delivery fee'))

WebUI.delay(3)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_Sellers generally cant change the shippin_6f6eb8')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)



WebUI.click(findTestObject('Object Repository/My account_FAQ/option1'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/pera')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Can I modify or cancel my order afte_a6141d'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc5')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How can I track my order'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc6')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What is your return policy'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc7')) , 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Are your products covered by a warranty'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc8')), 10)

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/a_infoelectronyat.qa')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Why should I order online'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/ol_Fast.Online ordering and check-out gets _43c978')), 10)


WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Why should I order online'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/button_What information do I need to provid_588491')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What information do I need to provid_588491'))



WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How much does shipping cost'))
WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Description')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How much does shipping cost'))
WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_Shipping charges vary based on your locat_e248ae')), 10)


//Select another filter (Shipping)


WebUI.delay(3)
WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/div_Help  FAQs_customDropDown_dropdown_main_94d872'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Shipping'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How can I change my shipping address'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_By default, the last used shipping addres_2ccf28')), 10)


WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How can I track my orders  payments'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc10')), 10)


//Select another filter (Customer)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/div_Help  FAQs_customDropDown_dropdown_main_94d872'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Customer'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What are all the checkout limits'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_By default, the last used shipping addres_2ccf28_1')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What is the delivery fee'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_Sellers generally cant change the shippin_6f6eb8')), 10)

//Select another filter (Orders)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/div_Help  FAQs_customDropDown_dropdown_main_94d872'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Orders'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Why should I order online'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/ol_Fast.Online ordering and check-out gets _43c978')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What information do I need to provid_588491'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/div_To process your order, we require the f_260df2')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How much does shipping cost'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/p_Shipping charges vary based on your locat_e248ae')), 10)


//Select another filter (Orders)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/div_Help  FAQs_customDropDown_dropdown_main_94d872'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Store-Pickup'))


//Select another filter (Return  Refunds)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/div_Help  FAQs_customDropDown_dropdown_main_94d872'))

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Return  Refunds'))


WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What are the payment methods Available'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc11')), 10)


WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_I want to return my purchase What i do'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/Desc2')), 10)


WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Can I modify or cancel my order afte_a6141d'))

WebUI.verifyElementPresent(findTestObject('Object Repository/My account_FAQ/another description'), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_How can I track my order'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc12')), 10)


WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_What is your return policy'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Page_/newdesc')), 10)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/button_Are your products covered by a warranty'))

WebUI.verifyElementPresent((findTestObject('Object Repository/My account_FAQ/Desc13')), 10)

WebUI.click(findTestObject('Object Repository/My account_FAQ/Page_/img_Get it now_loaded image'))

WebUI.closeBrowser()

