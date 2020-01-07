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

WebUI.callTestCase(findTestCase('login/login_approver'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('others/open_products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('office_products/Page_icon-app/a_Office'))

WebUI.click(findTestObject('office_products/Page_icon-app/div_Pending Verification'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_No data_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('office_products/Page_icon-app/i_Iniatiating Branch_ant-select-arrow-icon anticon anticon-down'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Search Request'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('office_products/Page_icon-app/button_insert_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Approve'))

WebUI.verifyTextPresent("Success!",false, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

