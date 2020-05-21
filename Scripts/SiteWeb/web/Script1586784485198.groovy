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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.click(findTestObject('annonce2/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Object Repository/web/Page_iad - Comprar vender e arrendar casas _879721/a_Encontrar um consultor'))

x = WebUI.click(findTestObject('Object Repository/web/Page_iad - IAD - Encontre o seu consultor i_479ad1/span_51'))

x = WebUI.getText(findTestObject('Object Repository/web/Page_iad - IAD - Encontre o seu consultor i_479ad1/span_51'))

println(x)

WebUI.click(findTestObject('Object Repository/web/Page_iad - IAD - Encontre o seu consultor i_479ad1/a_PT'))

WebUI.click(findTestObject('Object Repository/web/Page_iad - IAD - Encontre o seu consultor i_479ad1/a_EN'))

WebUI.click(findTestObject('Object Repository/web/Page_iad - IAD - Find an agent A real estat_d9d06c/span_51'))

y = WebUI.getText(findTestObject('Object Repository/web/Page_iad - IAD - Find an agent A real estat_d9d06c/span_51'))

WebUI.click(findTestObject('web/Page_iad - IAD - Encontre o seu consultor i_479ad1/a_PT'))

WebUI.click(findTestObject('web/Page_iad - IAD - Find an agent A real estate service tailored to your needs/a_FR'))

WebUI.click(findTestObject('web/Page_iad - IAD - Encontre o seu consultor i_479ad1/span_51'))

z = WebUI.getText(findTestObject('web/Page_iad - IAD - Encontre o seu consultor i_479ad1/span_51'))

CustomKeywords.'com.logkaywords.exception.afficherException2'(x, y, z)

WebUI.closeBrowser()

