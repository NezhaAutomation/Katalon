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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://preprod.iadportugal.pt/')

WebUI.click(findTestObject('Object Repository/coherence/Page_iad - Comprar vender e arrendar casas _879721/span_FECHAR'))

WebUI.click(findTestObject('Object Repository/coherence/Page_iad - Comprar vender e arrendar casas _879721/a_Comprar'))

x = WebUI.getText(findTestObject('Object Repository/coherence/Page_iad - Comprar vender e arrendar casas _879721/p_8393 resultados de 8393 imveis  venda em _6f360c'))

x1 = x.split(" ")
x2 = x1[0]
println(x2)
WebUI.click(findTestObject('Object Repository/coherence/Page_iad - Comprar vender e arrendar casas _879721/li_PT                                      _226f7e'))

WebUI.click(findTestObject('Object Repository/coherence/Page_iad - Comprar vender e arrendar casas _879721/a_FR'))

y = WebUI.getText(findTestObject('Object Repository/coherence/Page_iad - Vente achat location maison appa_3091d3/p_8393 rsultats sur 8393 biens  vendre au Portugal'))
y1 = y.split(" ")
y2 = y1[0]
println(y2)

WebUI.click(findTestObject('Object Repository/coherence/Page_iad - Comprar vender e arrendar casas _879721/li_PT                                      _226f7e'))

WebUI.click(findTestObject('Object Repository/coherence/Page_iad - Comprar vender e arrendar casas _879721/a_EN'))

z = WebUI.getText(findTestObject('Object Repository/coherence/Page_iad - Buy Sell and Rent a house or a a_9b90bb/p_8393 results of 8393 properties to sell i_ed80de'))
z1 = z.split(" ")
z2= z1[0]
println(z2)

WebUI.closeBrowser()

