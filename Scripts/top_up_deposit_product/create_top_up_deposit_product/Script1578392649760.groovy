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

String todaysDay = today.format('d')

String currentDateTime = today.format('yyyy-mm-dd hh:mm:ss.a')

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

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/a_Top-up Deposit'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Create Top-up Deposit Product'))

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Product Code_ant-input'), 'TOPUPDEP' + 
    randomNum)

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Product Name_ant-input'), 'TOP UP DEFAULT  AUTOMATED TEST DEPOSIT' + 
    randomNum)

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Product Short Name_ant-input'), 'TESTTOPUP')

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Effective Date_ant-calendar-picker-in_3e0d53'))

WebUI.click(daySelect)

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (10)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_ALL'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (1)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_BOTH'))

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Minimum Age_ant-input ant-input'), '21')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Age_ant-input ant-input'), '1000')

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (2)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_YINKASH - ADEYINKA ADEBIYI'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (3)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_BOTH (1)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/span_Auto Generate Account Number_ant-switch-inner'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (4)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_CAHNI - CURRENT ACCOUNT - PRIVATE'))

not_run: WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/div_Multiple Select_1'))

not_run: WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/div_Multiple Select_1'))

not_run: WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/div_Multiple Select'))

not_run: WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/div_'))

not_run: WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/div_Product DetailsCurrency  FeeSpacer  Int_b824a2'))

not_run: WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/div_Multiple Select_1'))

not_run: WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/div_'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (9)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Minimum Target Amount_ant-input ant-input'), 
    '100000')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Target Amount_ant-input ant-input'), '100000000')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Minimum Initial Deposit Amount_ant-input ant-input'), '20000')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Incremental Target Amount_ant-input ant-input'), '50000')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Minimum Deposit Period (YYMMDD)_ant-i_13c59d'), 
    '20')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Minimum Deposit Period (YYMMDD)_ant-i_13c59d_1'), 
    '1')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Minimum Deposit Period (YYMMDD)_ant-i_13c59d_1_2'), '1')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Deposit Period_ant-input ant-input (1)'), '25')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Maximum Deposit Period_ant-input ant-input'), 
    '12')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Deposit Period_ant-input ant-input (2)'), '30')

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (5)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_DPT001'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (6)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_DPT001 (2)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/button_Add Currency (1)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/span_Currency Information_ant-drawer-close-x'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (9)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_USD - US DOLLAR'))

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Minimum Target Amount_ant-input ant-input'), 
    '100000')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Target Amount_ant-input ant-input'), '100000000')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Minimum Initial Deposit Amount_ant-input ant-input'), '20000')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Incremental Target Amount_ant-input ant-input'), '50000')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Minimum Deposit Period (YYMMDD)_ant-i_13c59d'), 
    '20')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Minimum Deposit Period (YYMMDD)_ant-i_13c59d_1'), 
    '1')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Minimum Deposit Period (YYMMDD)_ant-i_13c59d_1_2'), '1')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Deposit Period_ant-input ant-input (1)'), '25')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Maximum Deposit Period_ant-input ant-input'), 
    '12')

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Deposit Period_ant-input ant-input (2)'), '30')

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (5)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_DPT001'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (6)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_DPT001 (2)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/button_Add Currency (1)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/span_Currency Information_ant-drawer-close-x'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (7)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_TDACLOP - TD ACCOUNT OPENING'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (8)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_TDACLOP'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Fee'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (7)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_TDACLSR - TD ACCOUNT CLOSURE'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (8)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_TDACLSR'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Fee'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (7)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_TDABOOK - TD ACCOUNT BOOKING'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (8)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_TDABOOK'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Fee'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (11)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_0010029300'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (12)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_1010004017'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (13)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_COMPOUND_INTEREST'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (14)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_MONTHLY'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (15)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_FORTH_NIGHTLY'))

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Installment due date reminder_ant-input ant-input'), '10')

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maximum Number of Missed Installment_ant-input ant-input'), 
    '1')

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (16)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_NON_CONSECUTIVE'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.setText(findTestObject('Top_Up_Deposit/Page_icon-app/input_Maturity Due Date Reminder_ant-input ant-input'), '5')

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (17)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_PRINCIPAL_INFLOW'))

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Flow Frequency_ant-input'), '1')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Flow Frequency_ant-input_1'), '0')

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (18)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_START_DATE'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (19)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_MATURITY_DATE'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Flow Details'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (17)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_INTEREST_INFLOW'))

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Flow Frequency_ant-input'), '30')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Flow Frequency_ant-input_1'), '0')

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (18)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_MATURITY_DATE (1)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (19)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_START_DATE (1)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Flow Details'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (17)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_PRINCIPAL_OUTFLOW'))

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Flow Frequency_ant-input'), '1')

WebUI.setText(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/input_Flow Frequency_ant-input_1'), '0')

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (18)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_START_DATE (2)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (19)'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/li_MATURITY_DATE (2)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add Flow Details'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (20)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_NEXT'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (21)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_PRE_CLOSURE'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (22)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_BICE - BIRTH CERTIFICATE'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add              Documents'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (22)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_DRIVER_LICENSE - DRIVER LICENSE'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add              Documents'))

WebUI.click(findTestObject('Top_Up_Deposit/Page_icon-app/div_ (22)'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/li_TAX - TAX ID'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Is Mandatory_ant-switch'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Add              Documents'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Next'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_CREATE TOP-UP DEPOSIT'))

WebUI.click(findTestObject('Object Repository/Top_Up_Deposit/Page_icon-app/button_Yes'))

if (WebUI.verifyTextPresent('Success', false, FailureHandling.OPTIONAL)) {
	WebUI.closeBrowser()
} else {
	WebUI.takeScreenshot('errors/'+currentDateTime + '_create_top_up_deposit_product.png')
}