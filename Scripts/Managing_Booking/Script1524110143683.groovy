import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cebupacificair.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/input_optradio'))

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/input_FromStation'))

WebUI.setText(findTestObject('Page_Cebu Pacific Air - Just go/input_FromStation'), 'Manila')

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/a_Manila'))

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/input_ToStation'))

WebUI.setText(findTestObject('Page_Cebu Pacific Air - Just go/input_ToStation'), 'Nagoya')

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/a_Nagoya'))

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/input_StartDate'))

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/span_20'))

WebUI.click(findTestObject('Page_Cebu Pacific Air - Just go/button_FIND FLIGHTS'))

WebUI.verifyElementPresent(findTestObject('Page_Cebu Pacific - Select Flight/div_The following applies to Y'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Cebu Pacific - Select Flight/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Page_Cebu Pacific - Passengers/h4_Important Reminder'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Cebu Pacific - Passengers/button_Close'))

WebUI.verifyElementPresent(findTestObject('Page_Cebu Pacific - Passengers/h2_Now enter your details'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

