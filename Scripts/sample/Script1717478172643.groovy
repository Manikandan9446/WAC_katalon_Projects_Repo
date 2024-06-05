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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open browser
WebUI.openBrowser('')

// Log in to the application
WebUI.callTestCase(findTestCase('LOGIN_TCB_TC'), [
    ('Email') : 'manikandanr.r+14@webandcrafts.com', 
    ('Password') : 'Tester008'
], FailureHandling.STOP_ON_FAILURE)

// Navigate to Addresses page
WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_Online Shopping Site in Qatar  Buy Ele_5051e5/svg'))
WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/a_Addresses'))

// Handle Empty Address Scenario and Click on add address
if (WebUI.verifyElementPresent(findTestObject('Object Repository/My account_Addresses/Page_/h2_Empty Address'), 10)) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/My account_Addresses/Page_/h3_No addresses to show'), 10)
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/button_Add New Address'))
} else if (WebUI.verifyElementPresent(findTestObject('Object Repository/My account_Addresses/Address text'), 10)) {
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/button_Add New Address'))
} else {
    KeywordUtil.markFailed("The address page is not found")
}

// Add a new address
if (WebUI.verifyElementPresent(findTestObject('Object Repository/My account_Addresses/Page_/div_Webandcrafts_modal-header'), 10)) {
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/div_Add New Address6H6HPJP, Doha, QatarLoca_a2b9c3'))

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/My account_Addresses/Page_/label_First Name'), 10)) {
        WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_First Name_firstname'), 'Arun')
        WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Last Name_lastname'), 'KP')
        WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Phone Number_phone_number'), '+974 5645 23')
        WebUI.delay(4)
        WebUI.click(findTestObject('Object Repository/My account_Addresses/Click arrow'))
        WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/div_74 -  Al Jeryan'))
        WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Building Number_building_number'), '12')
        WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Unit Number_unit_number'), '36')
        WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Alternate Number_alternate_number'), '+974 6398 52')
        WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/a_Morning'))
        WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/button_Evening'))
        WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/input_Home_typeofaddress'))
    } else {
        KeywordUtil.markFailed("The details are not updated")
    }
}

// Save the address
WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/button_Save Address'))

// Verify the added address
if (WebUI.verifyElementPresent(findTestObject('Object Repository/My account_Addresses/Page_/div_New Address Added'), 10)) {
    def name = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/h4_Arun KPOffice'))
    def phonenumber = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_974564523,974639852'))
    def preferredTime = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_Evening'))
    def address = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_36,12, Al Jeryan,'))
    def place = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_Unnamed Road,Doha,Qatar'))

    if (name.contains("Arun KP") && name.contains("Office") && 
        phonenumber.contains("+974 5645 23") && phonenumber.contains("+974 6398 52") && 
        preferredTime.contains("Evening") && 
        address.contains("36") && address.contains("12") && address.contains("Al Jeryan") && 
        place.contains("Unnamed Road") && place.contains("Doha") && place.contains("Qatar")) {
        KeywordUtil.markPassed('Pass')
    } else {
        KeywordUtil.markFailed('Verification failed')
    }
}

// Edit the address
if (WebUI.verifyElementPresent(findTestObject('Object Repository/My account_Addresses/Page_/button_Edit'), 10)) {
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/button_Edit'))
    WebUI.delay(3)
    WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_First Name_firstname'), 'Arun edit')
    WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Last Name_lastname'), 'KP edit')
    WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Phone Number_phone_number_1'), '+974 5645 24')
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/div_Al Jeryan_custom-select__input-containe_e504ed'))
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/div_78 - Abu Dhalouf'))
    WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Building Number_building_number'), '37')
    WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Unit Number_unit_number'), '48')
    WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_City_city'), 'Doha')
    WebUI.setText(findTestObject('Object Repository/My account_Addresses/Page_/input_Alternate Number_alternate_number_1'), '+974 6398 89')
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/button_Morning'))
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/input_Office_90b6fe6b-569f-42aa-9c8e-9867d698897c'))
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/button_Update Address'))
    WebUI.click(findTestObject('Object Repository/My account_Addresses/Page_/div_Successfully Updated'))
} else {
    KeywordUtil.markFailed("The Edit option is not showing")
}

// Verify the Edited the address
def editedName = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/h4_Arun edit KP editHome'))
def editedAddress = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_48,37,Abu Dhalouf ,'))
def editedPlace = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_Unnamed Road,Doha,Qatar'))
def editedPhoneNumber = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_974564524,974639889'))
def editedPreferred = WebUI.getText(findTestObject('Object Repository/My account_Addresses/Page_/p_Morning'))

if (editedName.contains("Arun edit KP edit") && editedAddress.contains("48") && editedAddress.contains("37") && 
    editedAddress.contains("Abu Dhalouf") && editedPlace.contains("Unnamed Road") && editedPlace.contains("Doha"))
{
	println("The addres was matched ")
}else 
{
	println("The addres was not matched ")
}
