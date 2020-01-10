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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Date today = new Date()

String currentDateTime = today.format('yyyy-mm-dd hh:mm:ss.a')

WebUI.callTestCase(findTestCase('login/login_approver'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('others/open_products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Savings_Product/Page_icon-app/a_Savings'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/div_Pending Verification'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (23)'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/li_Create savings product'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/button_YINKASH_table__btn ant-btn ant-btn-p_238afb'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/a_Products Pending Verification Fetched Successfully_ant-notification-notice-close'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Reject'))

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/textarea_Reason_ant-input'), 'THERE IS A REASON FOR EVERYTHING')

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Reject (1)'))

if (WebUI.verifyTextPresent('Success!', false, FailureHandling.OPTIONAL)) {
	WebUI.closeBrowser()
} else {
	WebUI.takeScreenshot('errors/'+currentDateTime + '_reject_savings_product.png')
}


