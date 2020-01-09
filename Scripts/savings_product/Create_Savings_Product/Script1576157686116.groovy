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
import groovy.time.TimeCategory as TimeCategory
import java.util.Random as Random
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Date today = new Date()

String todaysDay = today.format('d')

String todaysDate = today.format('dd-MM-yyyy')

Integer todayPlusThree = Integer.parseInt(todaysDay) + 3

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

String xpath = ('(.//*[normalize-space(text()) and normalize-space(.)=\'Sa\'])[1]/following::div[' + todayPlusThree) + ']'

TestObject daySelect = new TestObject('obj')

daySelect.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.callTestCase(findTestCase('login/login_default'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('others/open_products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/a_Savings'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/button_Create Savings Product'))

WebUI.setText(findTestObject('Object Repository/Savings_Product/Page_icon-app/input_Product Code_ant-input'), 'SAV' + randomNum)

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Product Name_ant-input'), 'SAVINGS SME DEFAULT RETAIL' + 
    randomNum)

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Product Short Name_ant-input'), 'TESTDEF' + randomNum)

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/input_Effective Date_ant-calendar-picker-in_3e0d53'))

WebUI.click(daySelect)

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/div_'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_ALL - ALL BRANCHES'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/li_YINKASH'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (2)'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/li_RETAIL - Retail customer'))

not_run: WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/div_Select'))

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Object Repository/Savings_Product/Page_icon-app/input_Select_ant-select-search__field'), 
    'sav')

not_run: WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/li_29290 - OGBONGE SAVINGS ACCOUNT'))

not_run: WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/li_29100 - SAVINGS - CHILDREN'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/button_Auto Generate Account Number_ant-switch'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (3)'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/li_TDGOV'))

WebUI.setText(findTestObject('Object Repository/Savings_Product/Page_icon-app/input_Minimum Age_ant-input ant-input'), '16')

WebUI.setText(findTestObject('Object Repository/Savings_Product/Page_icon-app/input_Number Of Withdrawals_ant-input ant-input'), 
    '4')

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (6)'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/li_NSC101'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (4)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_AED (1)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Add Limit'))

WebUI.click(findTestObject('Object Repository/Savings_Product/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (4)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_GBP'))

WebUI.setText(findTestObject('Object Repository/Savings_Product/Page_icon-app/input_Credit Balance Limit_ant-input ant-input'), 
    '99999999999')

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Debit Balance Limit_ant-input ant-input'), '999999999999999')

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Credit Cash Limit_ant-input ant-input'), '1500000')

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Debit Cash Limit_ant-input ant-input'), '1000000')

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Single Transaction Limit Cr_ant-input ant-input'), '2000000')

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Single Transaction Limit Dr_ant-input ant-input'), '1500000')

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (5)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_CBN BUYING RATE'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (6)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_NSC101'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Add Limit'))

WebUI.delay(3)

WebUI.click(findTestObject('Savings_Product/Page_icon-app/a'))

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Dormant Account Transaction Limit_ant-input ant-input'), 
    '1')

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Inactive Account Transactions Limit_ant-input ant-input'), 
    '1')

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Debit Cash Limit_ant-input ant-input'), '1000')

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Edit Limit'))

WebUI.delay(3)

WebUI.click(findTestObject('Savings_Product/Page_icon-app/a (2)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Yes'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (7)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_EOD - End of day'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (8)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_MONTHLY - Monthly'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (9)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_MONTHLY - Monthly (1)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (10)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_SIMPLE'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/svg'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/svg (2)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Search (1)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Select (1)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (12)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_UBSECURED - Unsecured'))

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Duration(In Days)_ant-input ant-input'), '30')

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (13)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_RUNNING - Running'))

WebUI.setText(findTestObject('Savings_Product/Page_icon-app/input_Tod Reused Max Number_ant-input ant-input'), '5')

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (14)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_INTEREST_CALCULATION - Interest calculation'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Add TOD'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_CERT'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Is Mandatory_ant-switch'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Add Document'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_TAX'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Add Document'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_IDENTITIES'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Add Document'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_DRIVER_LICENSE'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Add Document'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/a (4)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Yes (1)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (17)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_GF1 - ACCOUNT FROZEN'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/div_ (18)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/li_IC3 - VALUE DATED NOTICE'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_CREATE SAVINGS PRODUCT (2)'))

WebUI.click(findTestObject('Savings_Product/Page_icon-app/button_Yes (3)'))

WebUI.verifyTextPresent('Success!', false, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

