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

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

String xpath = ('(.//*[normalize-space(text()) and normalize-space(.)=\'Sa\'])[1]/following::div[' + todaysDay) + ']'

TestObject daySelect = new TestObject('obj')

daySelect.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.callTestCase(findTestCase('login/login_default'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('others/open_products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/a_Term Deposit'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Create Term Deposit Product'))

WebUI.setText(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Product Code_ant-input'), 'TermDeposit' + 
    randomNum)

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Product Name_ant-input'), 'Term Deposit Default Test Product' + 
    randomNum)

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Short Name_ant-input'), 'TDP' + randomNum)

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_BOTH'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Effective Date_ant-calendar-picker-in_3e0d53'))

WebUI.click(daySelect)

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Group Branch Code_ant-select-search__field'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_ALL'))

WebUI.setText(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Minimum Age_ant-input ant-input'), 
    '21')

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Maximum Age_ant-input ant-input'), '99')

WebUI.sendKeys(findTestObject('Term_Deposit_Product/Page_icon-app/input_Product Supervisor ID_ant-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Employee Id_ant-input'), 'YINKASH')

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Search'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Select'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (2)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_BOTH (1)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/div_Multiple Select'))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Description_ant-input'), 'TERM DEPOSIT')

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (3)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Search (1)'))

WebUI.delay(50)

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_NGN_ant-checkbox-input'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/span_GL Look Up_ant-drawer-close-x'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/span_Auto Generate Account Number_ant-switch-inner'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (4)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_TDGOV - NUMBER TABLE (TDGOV)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (5)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_FIXED'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (6)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_NGN - NIGERIAN NAIRA (1)'))

WebUI.setText(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Minimum Deposit Amount_ant-input ant-input'), 
    '15,000.00')

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Maximum Deposit Amount_ant-input ant-input'), '1,500,000.00')

WebUI.setText(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Minimum Deposit Period (DDMMYY)_ant-i_82fb1f'), 
    '30')

WebUI.setText(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Minimum Deposit Period (DDMMYY)_ant-i_82fb1f_1'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Minimum Deposit Period (DDMMYY)_ant-i_82fb1f_1_2'), 
    '19')

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Maximum Deposit Period (DDMMYY)_ant-input ant-input'), 
    '30')

WebUI.setText(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/input_Maximum Deposit Period (DDMMYY)_ant-i_28e313'), 
    '12')

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Maximum Deposit Period (DDMMYY)_ant-input ant-input (1)'), 
    '30')

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Interest Rate Code_ant-input (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (7)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_TERM_DEPOSIT (1)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Search (2)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Select (1)'))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Part Closure Interest Rate Code_ant-input (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (10)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_TERM_DEPOSIT (3)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Search (5)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Select (5)'))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Pre Closure Interest Rate Code_ant-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (11)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_TERM_DEPOSIT (5)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Search (6)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Select (6)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Add Currency (1)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_TD001 - A TEST TO DESCRIBE'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (13)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_TD9'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Add Fee'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_5600 - DESCRIPTION'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (13)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_FEESD'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Add Fee'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Next'))

WebUI.sendKeys(findTestObject('Term_Deposit_Product/Page_icon-app/input_Interest Payable Spacer_ant-input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Code_ant-input'), 'INTEREST')

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Search (7)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Select (7)'))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Sundry Account Spacer_ant-input (1)'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Code_ant-input (6)'), 'INTEREST RE')

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Search (11)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Select (10)'))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Expense Account spacer_ant-input (1)'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Code_ant-input (7)'), 'EXPENSE')

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Search (12)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Select (11)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (23)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_SIMPLE_INTEREST'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (14)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_PRINCIPAL_INFLOW'))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Flow Frequency_ant-input ant-input'), '30')

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Flow Frequency_ant-input ant-input (1)'), '0')

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (15)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_START_DATE'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_MATURITY_DATE'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Add Flow'))

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (14)'))

not_run: WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_INTEREST_INFLOW'))

not_run: WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Flow Frequency_ant-input ant-input'), '0')

not_run: WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Flow Frequency_ant-input ant-input (1)'), 
    '1')

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (16)'))

not_run: WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_MATURITY_DATE'))

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (15)'))

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_START_DATE (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Add Flow'))

not_run: WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Flow Frequency_ant-input ant-input'), '180')

not_run: WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Flow Frequency_ant-input ant-input (1)'), 
    '0')

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (14)'))

not_run: WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_TOTAL_OUTFLOW'))

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (15)'))

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_START_DATE (2)'))

not_run: WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (16)'))

not_run: WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_MATURITY_DATE'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (17)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_BOTH (2)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (18)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_HOME_CURRENCY'))

WebUI.setText(findTestObject('Term_Deposit_Product/Page_icon-app/input_Maturity Due Date Reminder_ant-input ant-input'), 
    '5')

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (19)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_SAOF - SAVINGS ACCOUNT OPENING FORM'))

not_run: WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/div_Is Mandatory_ant-form-item-control'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/span_Is Mandatory_ant-switch-inner'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Add            Documents'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (19)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_TAX - TAX ID'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Add            Documents'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (19)'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/li_IDEN - IDENTITY PROOF'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Add            Documents'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (24)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_BK1 - DEFAULT INTEREST PARAMETER CHANGED EXCEPTION'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/div_ (25)'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/li_LC3 - DP CONTRIBUTION EXCEED EXCEPTION'))

WebUI.click(findTestObject('Object Repository/Term_Deposit_Product/Page_icon-app/button_CREATE TERM DEPOSIT'))

WebUI.click(findTestObject('Term_Deposit_Product/Page_icon-app/button_Yes (1)'))

WebUI.verifyTextPresent('Success', false, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

