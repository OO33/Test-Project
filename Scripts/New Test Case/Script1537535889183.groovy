import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), 'oo@yahoo.fr')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), 'rcAepFCwgHI=')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My addresses'))

WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/span_Add a new address'))

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__address1'), 'dfer')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__city'), 'rrzz')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Address - My Store/select_-AlabamaAlaskaArizonaAr'), '9', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__postcode'), '33600')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone'), '12458')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone_mobile'), '45875')

WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__alias'), 'My address78')

WebUI.click(findTestObject('Object Repository/Page_Address - My Store/span_Save'))

