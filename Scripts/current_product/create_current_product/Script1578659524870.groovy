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

Date today = new Date()

String currentDateTime = today.format('yyyy-mm-dd hh:mm:ss.a')

String todaysDay = today.format('d')

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

WebUI.click(findTestObject('Current_Product/Page_icon-app/a_Current'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/button_Create Current Product'))

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Product Code_ant-input'), 'CURRPRODUCT' + randomNum)

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Product Name_ant-input'), 'AUTOMATED TEST CURRENT PRODUCT' + 
    randomNum)

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Product Short Name_ant-input'), 'CURR' + randomNum)

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_ALL - ALL BRANCHES'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/input_Effective Date_ant-calendar-picker-in_3e0d53'))

WebUI.click(daySelect)

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/div_ (1) (1)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_CORPORATE - Corporate customer'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (2)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_YINKASH'))

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Minimum Age_ant-input ant-input'), '2')

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Maximum Age_ant-input ant-input'), '999')

not_run: WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (3)'))

not_run: WebUI.click(findTestObject(null))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (4)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_MAIL'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (5)'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_MONTHLY - Monthly (2)'))

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Days To Inactive_ant-input'), '45')

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Minimum Balance With Cheque_ant-input_08249c'), '10000')

WebUI.doubleClick(findTestObject('Current_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_Currency Details'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (9)'))

WebUI.doubleClick(findTestObject('Current_Product/Page_icon-app/li_NGN'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (6)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_CUR015'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (8)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_CBN SELLING RATE'))

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Credit Balance Limit_ant-input'), '10,000,000,000')

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Single Transaction Limit Cr_ant-input'), '10,000,000,000')

WebUI.click(findTestObject('Current_Product/Page_icon-app/button_Add Limit (1)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (10)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_EOD - End of day'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (11)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_MONTHLY - Monthly (2)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (12)'))

WebUI.doubleClick(findTestObject('Current_Product/Page_icon-app/li_QUARTERLY - Quarterly'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (13)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_COMPOUND'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (14)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/li_SECURED - Secured'))

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Duration(In Days)_ant-input ant-input'), '5')

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Penal Grace Period_ant-input ant-input'), '2')

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (15)'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_RUNNING - Running (1)'))

WebUI.setText(findTestObject('Current_Product/Page_icon-app/input_Tod Reused Max Number_ant-input ant-input'), '12')

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_INTEREST_CALCULATION - Interest calculation (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Current_Product/Page_icon-app/input_Remarks_ant-input (1)'), 'GOOD REMARK')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Next (1)'))

WebUI.click(findTestObject('Current_Product/Page_icon-app/div_ (17)'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Is Mandatory_ant-switch (1)'))

WebUI.click(findTestObject('null'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CURRENT ACCOUNT OPENING'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_INACTIVE CURRENT ACCOUNT CHARGE'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Add Fee Information'))

WebUI.click(findTestObject('null'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/input_Fee Type_ant-select-search__field (1)'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CURRENT ACCOUNT MAINTENANCE'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CURRENT ACCOUNT MAINTENANCE'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CURRENT ACCOUNT MAINTENANCE'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Add Fee Information'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/div_Add Fee Information'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CURRENT ACCOUNT CLOSURE'))

WebUI.click(findTestObject('null'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/input_Fee Type_ant-select-search__field (1)'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CURRENT ACCOUNT OPENING CHARGE'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/div_Fee TypeCURRENT ACCOUNT CLOSURE        _33b4e8'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Add Fee Information'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/div_Add Fee Information'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CURRENT ACCOUNT STATEMENT'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/li_REGULAR STATEMENT'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Add Fee Information'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/div_Add Fee Information'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Next (1)'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/li_TAX'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/div_TAX'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/input_TAX_ant-select-search__field'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_UTILITIES'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/div_UTILITIES'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/input_TAX_ant-select-search__field'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Next (1)'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/input_Account frozen_ant-select-search__field'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/body_AA ADEYINKA ADEBIYI Username          _141544'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_CF2 - ACCOUNT FROZEN'))

WebUI.click(findTestObject('null'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/input_Account frozen_ant-select-search__field'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/li_HS1 - SANCTION LIMIT COMPLETELY UTILISED'))

WebUI.doubleClick(findTestObject('Object Repository/Current_Product/Page_icon-app/li_HS1 - SANCTION LIMIT COMPLETELY UTILISED'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_CREATE CURRENT PRODUCT (2)'))

WebUI.click(findTestObject('Object Repository/Current_Product/Page_icon-app/button_Yes'))

