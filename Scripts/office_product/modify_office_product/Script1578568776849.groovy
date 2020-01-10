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

// =======Some useful Variable==============
Date today = new Date()

String currentDateTime = today.format('yyyy-mm-dd hh:mm:ss.a')

WebUI.callTestCase(findTestCase('login/login_default'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('others/open_products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/office_products/Page_icon-app/a_Office'))

WebUI.click(findTestObject('Object Repository/office_products/Page_icon-app/button_Pending Verification_ant-btn ant-btn_992078'))

not_run: WebUI.click(findTestObject('office_products/Page_icon-app/button_No data_ant-btn ant-btn-primary (1)'))

not_run: WebUI.click(findTestObject('office_products/Page_icon-app/i_Initiating Branch_ant-select-arrow-icon anticon anticon-down'))

not_run: WebUI.click(findTestObject('office_products/Page_icon-app/button_Search Request (1)'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/office_products/Page_icon-app/button_Search Product'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_ACTIVE_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('Object Repository/office_products/Page_icon-app/a_ View'))

WebUI.click(findTestObject('office_products/Page_icon-app/a_Product successfully fetched_ant-notification-notice-close'))

WebUI.click(findTestObject('Object Repository/office_products/Page_icon-app/button_EDIT'))

WebUI.click(findTestObject('Object Repository/office_products/Page_icon-app/div_PARTITION - Partition'))

WebUI.click(findTestObject('office_products/Page_icon-app/li_PARTITION - Partition'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Update (1)'))

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot('errors/'+currentDateTime + '_modify_office_product.png')
}

