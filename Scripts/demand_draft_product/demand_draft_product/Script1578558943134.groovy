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

// =======Some useful Variable==============
Date today = new Date()

String todaysDay = today.format('d')

String todaysDate = today.format('dd-MM-yyyy')

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

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/a_Demand Draft'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Create Demand Draft Product'))

WebUI.setText(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Product Code_ant-input'), 'DDRAFTPRODUCT' + 
    randomNum)

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Product Name_ant-input'), 'DEMAND DRAFT AUTOMATION TEST PRODUCT')

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_ALL'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Effective Date_ant-calendar-picker-in_3e0d53'))

WebUI.click(daySelect)

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Expiry Date_ant-calendar-picker-input_dd0e97'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/a_Jan_ant-calendar-next-month-btn'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/a_Jan_ant-calendar-next-month-btn'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/a_Mar_ant-calendar-next-year-btn'))

WebUI.doubleClick(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/a_Mar_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/a_Mar_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/a_Mar_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/div_8'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_BOTH'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (2)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_DEBIT'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (3)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_4545200001 - DEMAND DRAFT-NGN'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (4)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_DDNUM - ACCOUNT_NO'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/div_Demand Draft Details'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (5)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_SELF_BRANCH'))

not_run: WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (6)'))

not_run: WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Inventory Type_ant-select-search__field'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (7)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_ALL'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (8)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_MONTHLY'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (9)'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/li_0020032035 - FIXED DEPOSIT INTEREST UPFRONT-CORP'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/div_Product Limits'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Limit'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (10)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_NGN'))

WebUI.setText(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Credit Cash Limit_ant-input ant-input'), 
    '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Credit Transfer Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Credit Clearing Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Balance Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Cash Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Clearing Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Transfer Limit_ant-input ant-input'), '10,000,000.00')

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/button_Add Limit (1)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Limit'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (10)'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/li_USD'))

WebUI.setText(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Credit Cash Limit_ant-input ant-input'), 
    '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Credit Transfer Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Credit Clearing Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Balance Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Cash Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Clearing Limit_ant-input ant-input'), '10,000,000.00')

WebUI.setText(findTestObject('Demand_Draft_Product/Page_icon-app/input_Debit Transfer Limit_ant-input ant-input'), '10,000,000.00')

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/button_Add Limit (1)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Instrument'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (11)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_CREDIT'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_DD - DEMAND DRAFT'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/button_Add Instrument (1)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Instrument'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (11)'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/li_DEBIT (1)'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_DDS - DEMAND DRAFTS IN LOCAL CURRENCY'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/button_Add Instrument (1)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Tran Report Code'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (13)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_DEFAULT_DEPOSIT - deposits'))

not_run: WebUI.setText(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Debit Amount Limit_ant-input ant-input'), 
    '50,000.00')

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/button_Add Code'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Tran Report Code'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (13)'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/li_DEFAULT_WITHDRAWAL - withdrawals'))

not_run: WebUI.setText(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/input_Credit Amount Limit_ant-input ant-input'), 
    '1,000,000.00')

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Code'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add DD Charge'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (14)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_435000 - GENERAL CHARGE FEE'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (15)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_SBAOP - SAVINGS ACCOUNT OPENING CHARGE'))

WebUI.click(findTestObject('Demand_Draft_Product/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/li_HOME_CCY'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Add Charge'))

WebUI.click(findTestObject('Object Repository/Demand_Draft_Product/Page_icon-app/button_Create Product'))

