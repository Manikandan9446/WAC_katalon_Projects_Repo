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
import com.kms.katalon.core.exception.StepFailedException  // Add this import statement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.electronyat.qa/en')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login _TCB/Page_/svg'))

WebUI.delay(2)

//To validate popup heading 

try {
    def sigintext = WebUI.getText(findTestObject('Object Repository/Login _TCB/Page_/Signintext'))
    if(sigintext.equals("Sign in to your account")) {
		WebUI.takeScreenshot('C:\\Users\\wac\\Desktop\\Automation_Bug_screenshot\\Loginpopup_heading_is-matched.png')
		println("Login popup heading is matched ")
    } else {
        println("Login popup heading is not matched ")
    }
} catch (StepFailedException a) {
    WebUI.takeScreenshot('Screenshots/PopupHeadingFailure.png')
    KeywordUtil.markFailedAndStop('validate popup heading fetching is failed')
}

// Enter Username and password 
try {
    WebUI.setText(findTestObject('Object Repository/Login _TCB/Page_/input_EmailPhone number_username'), Email)
    WebUI.setText(findTestObject('Object Repository/Login _TCB/Page_/input_Password_password'), Password)
    WebUI.click(findTestObject('Object Repository/Login _TCB/Page_/svg_1'))
    WebUI.click(findTestObject('Object Repository/Login _TCB/Page_/button_Sign In'))
    WebUI.delay(2)
} catch (StepFailedException b) {
    WebUI.takeScreenshot('Screenshots/LoginFailure.png')
    KeywordUtil.markFailedAndStop('Entering Username and Password failed')
}

// To validate success toasted message 
try {
    def loginsucess = WebUI.getText(findTestObject('Object Repository/Login _TCB/Page_/div_Login Successful'))
    if(loginsucess.equals('Login Successful')) {
		WebUI.takeScreenshot('C:\\Users\\wac\\Desktop\\Automation_Bug_screenshot\\LoginSuccessMessageFailure.png')
        println("The login success message is found ")
    } else {
		WebUI.takeScreenshot('C:\\Users\\wac\\Desktop\\Automation_Bug_screenshot\\LoginSuccessMessageFailure.png')
        println("The login success message is not found ")
    }
} catch (StepFailedException c) {
    WebUI.takeScreenshot('Screenshots/LoginSuccessMessageFailure.png')
    KeywordUtil.markFailedAndStop('Validating login success message failed')
}

try {
    WebUI.click(findTestObject('Object Repository/Login _TCB/Page_/svg_1_2'))

    // To assert the email address on my profile page 
    def email1 = WebUI.getText(findTestObject('Object Repository/Login _TCB/Page_/div_aswathi.swebandcrafts.com'))
    email1.equals('aswathi.swebandcrafts.com')

    // To assert the email address on inner profile page
    WebUI.click(findTestObject('Object Repository/Login _TCB/Page_/a_Profile'))
    def email2 = WebUI.getText(findTestObject('Object Repository/Login _TCB/Page_/div_aswathi.swebandcrafts.comEdit'))
    email2.equals('aswathi.swebandcrafts.com')

    WebUI.click(findTestObject('Object Repository/Login _TCB/Page_/Click logo'))
	//check captch
} catch (StepFailedException d) {
    WebUI.takeScreenshot('Screenshots/ProfileValidationFailure.png')
    KeywordUtil.markFailedAndStop('Validating email address on profile page failed')
}
