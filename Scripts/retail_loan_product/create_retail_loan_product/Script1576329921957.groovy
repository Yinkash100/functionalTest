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

String todaysMonth = today.format('m')

String todaysYear = today.format('yy')

String todaysDate = today.format('dd-MM-yyyy')

// ==========Create a Random number generator==========
int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

// Create a custom xpath for selecting todays date from date dropdown
String xpath = ('(.//*[normalize-space(text()) and normalize-space(.)=\'Sa\'])[1]/following::div[' + todaysDay) + ']'

TestObject daySelect = new TestObject('obj')

daySelect.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.callTestCase(findTestCase('login/login_default'), [('variable') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('others/open_products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/a_Retail Loans'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Product Code_ant-input'), 
    'LOANTEST' + randomNum)

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Product Name_ant-input'), 'RETAIL LOAN DEFAULT TEST PRODUCT' + 
    randomNum)

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Short Name_ant-input'), 'RET-LOAN' + 
    randomNum)

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_BOTH - Both resident and non-resident'))

not_run: WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_CORPORATE - Corporate customer'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Minimum Age_ant-input ant-input'), 
    '5')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Effective Date_ant-calendar-picker-in_3e0d53'))

WebUI.click(daySelect)

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (3)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_ALL - ALL BRANCHES'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_15925 - STRUCTURED TERM LOAN CORPORATE'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (4)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_HOME_CURRENCY - Home currency'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (5)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_END_OF_DAY - End of day'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (6)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_MONTHLY - Monthly'))

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Interest Receivable Spacer_ant-input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Code_ant-input'), 'LOAN')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Search (4)'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Select (1)'))

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Discount On Upfront Percent_ant-input ant-input'), 
    '0')

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Penal Interest Receivable Spacer_ant-input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Code_ant-input (4)'), 'PENAL')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Search (5)'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Select (2)'))

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_PL Interest Spacer_ant-input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Code_ant-input (5)'), 'INTEREST')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Search (8)'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Select (3)'))

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Past Due Interest Receivable Spacer_ant-input'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Code_ant-input (8)'), 'INTEREST')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Search (9)'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Select (4)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Max Repayment Count_ant-input ant-input'), 
    '10')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (9)'))

not_run: WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_PastDue SubGL Code_ant-select-search__field'), 
    '15785')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/li_15785 - TERM LOAN-CLASSIFIED-180 DAYS'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/button_Multiple Disbursement Allowed_ant-switch ant-switch-checked'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (8)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (7)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LN011'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Minimum Loan Amount_ant-input ant-input'), 
    '500000')

WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Maximum Loan Amount_ant-input ant-input'), 
    '10000000')

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Minimum Loan Period (YMD)_ant-input'), 
    '19')

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Minimum Loan Period (YMD)_ant-input (2)'), 
    '12')

WebUI.sendKeys(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Minimum Loan Period (YMD)_ant-input (3)'), 
    '30')

not_run: WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Maximum Loan Period (YMD)_ant-input'), 
    '30')

not_run: WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Maximum Loan Period (YMD)_ant-input (1)'), 
    '12')

not_run: WebUI.setText(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/input_Maximum Loan Period (YMD)_ant-input (2)'), 
    '5')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (10)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_CBN BUYING RATE'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add            Currency'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (11)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LAACL - LOAN ACCOUNT CLOSURE'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LAACL LOAN ACCOUNT CLOSURE CHARGE'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (13)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_DEMAND Demand'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (14)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_DEFAULT - DEFAULT'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (15)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LOAN_AMOUNT Loan amount'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Is Mandatory_ant-switch'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Charges'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (11)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LAAOP - LOAN ACCOUNT OPENING'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LAAOP MANDATORY LOAN ACCOUNT OPENING CHARGE'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (13)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_DEMAND Demand'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (14)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_DEFAULT - DEFAULT'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (15)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LOAN_AMOUNT Loan amount'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Is Mandatory_ant-switch'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Charges'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (11)'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/li_LAAMA - LOAN ACCOUNT MAINTENANCE'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_LAAMA MONTHLY LOAN ACCOUNT MAINTENANCE CHARGE'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (13)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_ASSESSMENT Assessment'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (14)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_FLW001 - LOAN FLOW'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Is Mandatory_ant-switch'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Maximum Number Of Assessments_ant-inp_3439f4'), 
    '12')

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (16)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_MONTHLY - Monthly'))

WebUI.click(findTestObject('Retail_Loan_Product/Page_Retail Loan  Icon App/div_ (15)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_SCHEDULE_BALANCE Schedule balance'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Is Mandatory_ant-switch'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Maximum Number Of Assessments_ant-inp_3439f4_1'), 
    '12')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Charges'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Maximum Number Of Assessments_ant-inp_3439f4_1_2'), 
    '0')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_P - PERFORMING'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_Good - GOOD'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Product Code_ant-input'), 
    'PENAL INTEREST')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Search'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Select'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Product            Asset'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Document Type_ant-select-search__field'), 
    'inc')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_COIN - CERTIFICATE OF INCORPORATION'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Document Type_ant-select-search__field'), 
    'inc')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Is Mandatory_ant-switch'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add              Documents'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_TAX - TAX ID'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Is Mandatory_ant-switch'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add              Documents'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_BIOQ - BILL OF QUANTITY (IF TO BUILD)'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add              Documents'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_PASL - PAY SLIPS'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add              Documents'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Types'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_PENAL_INTEREST_DEMAND - Penal interest'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Code'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_DEFAULT - DEFAULT'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Flow'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Loan maturity date greater than highe_44cce6'), 
    'date')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_IC3 - VALUE DATED NOTICE'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Loan maturity date greater than highe_44cce6'), 
    'date')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_IC3 - VALUE DATED NOTICE'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_IC3 - VALUE DATED NOTICE'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_General Info'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Minimum Age_ant-input ant-input'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Types'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_PENAL_INTEREST_DEMAND - Penal interest'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow TypesPENAL_INTEREST_DEMAND - Penal_b59054'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_OVERDUE_PRINCIPAL_DEMAND - Overdue principal'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Code'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_FLW001 - LOAN FLOW'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.doubleClick(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Flow'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Yes'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Yes'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Types'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Flow Types_ant-select-search__field'), 
    'demand')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Code'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Flow Types_ant-select-search__field'), 
    'demand')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_DEFAULT - DEFAULT'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Types'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Flow Types_ant-select-search__field'), 
    'demand')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_PRINCIPAL_DEMAND - Principal'))

WebUI.setText(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/input_Flow Types_ant-select-search__field'), 
    'demand')

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Flow'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow TypesFlow Types'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_INTEREST_DEMAND - Normal Interest'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/div_Flow Code'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/li_FLW001 - LOAN FLOW'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Add Flow'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/button_Create Loan Product'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/a_Demand flow code must be attached to flow_4791b2'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/path_1_2'))

WebUI.click(findTestObject('Object Repository/Retail_Loan_Product/Page_Retail Loan  Icon App/svg_1_2_3_4'))

WebUI.closeBrowser()

