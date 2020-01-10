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
import java.util.Random as Random
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// =======Some useful Variable==============
Date today = new Date()

String currentDateTime = today.format('dd-MM-yyyy-hh:mm-a')

String todaysDay = today.format('d')

Integer todayPlusThree = Integer.parseInt(todaysDay) + 3

// ==========Create a Random number generator==========
int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

// Create a custom xpath for selecting todays date from date dropdown
String xpath = ('(.//*[normalize-space(text()) and normalize-space(.)=\'Sa\'])[1]/following::div[' + todayPlusThree) + ']'

TestObject daySelect = new TestObject('obj')

daySelect.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.callTestCase(findTestCase('login/login_default'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('others/open_products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('office_products/Page_icon-app/a_Office'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Create Product'))

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Product Code_ant-input'), 'OFFICE' + randomNum)

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Product Name_ant-input'), 'OFFICE DEFAULT TEST PRODUCT' + 
    randomNum)

WebUI.click(findTestObject('office_products/Page_icon-app/div_'))

WebUI.click(findTestObject('office_products/Page_icon-app/li_ALL - ALL BRANCHES'))

WebUI.click(findTestObject('office_products/Page_icon-app/input_Effective Dates_ant-calendar-picker-i_946311'))

WebUI.click(daySelect)

WebUI.click(findTestObject('office_products/Page_icon-app/div_ (1)'))

WebUI.click(findTestObject('office_products/Page_icon-app/div_Multiple Select (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('office_products/Page_icon-app/div_Multiple Select'))

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Description_ant-input'), 'OFFICE')

WebUI.click(findTestObject('office_products/Page_icon-app/div_ (7)'))

WebUI.click(findTestObject('office_products/Page_icon-app/li_NGN - NIGERIAN NAIRA (1)'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Search'))

//As at when writing this test case, the GL-lookup search is extremely slow
not_run: WebUI.delay(40)

WebUI.click(findTestObject('office_products/Page_icon-app/input_Reset_ant-checkbox-input'))

WebUI.click(findTestObject('office_products/Page_icon-app/span_GL Look Up_ant-drawer-close-x'))

WebUI.click(findTestObject('office_products/Page_icon-app/div_ (2)'))

WebUI.click(findTestObject('office_products/Page_icon-app/li_BOTH - Both'))

WebUI.click(findTestObject('office_products/Page_icon-app/div_ (3)'))

WebUI.click(findTestObject('office_products/Page_icon-app/li_NON_PARTITION - Non partition'))

WebUI.click(findTestObject('office_products/Page_icon-app/div_ (4)'))

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Code_ant-input'), 'OFFICE')

WebUI.click(findTestObject('office_products/Page_icon-app/button_Search (1)'))

WebUI.click(findTestObject('office_products/Page_icon-app/input_OFFICE_ant-checkbox-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('office_products/Page_icon-app/span_Spacer Code Look Up_ant-drawer-close-x'))

WebUI.click(findTestObject('office_products/Page_icon-app/div_ (5)'))

WebUI.click(findTestObject('office_products/Page_icon-app/li_OFACT - ACCOUNT_NO'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Next'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Add Limit'))

WebUI.click(findTestObject('office_products/Page_icon-app/div_ (8)'))

WebUI.click(findTestObject('office_products/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Credit Balance Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Credit Cash Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Credit Clearing Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Credit Transfer Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Debit Balance Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Debit Cash Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Debit Clearing Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.setText(findTestObject('office_products/Page_icon-app/input_Debit Transfer Limit_ant-input ant-input'), '1,000,000,000,000,000.13')

WebUI.click(findTestObject('office_products/Page_icon-app/button_Create Product (1)'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Add Limit (1)'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Next'))

WebUI.click(findTestObject('office_products/Page_icon-app/button_Create Product (1)'))

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
    WebUI.closeBrowser()
} else {
    WebUI.takeScreenshot(('errors/create_office_product' + currentDateTime) + '.png')
}

