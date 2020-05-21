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

WebUI.click(findTestObject('CreationContact/Page_IAD/a_Myiad acqureurs'))

WebUI.delay(3)

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/span_Crer'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Achat'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Habitation'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Traditionnel'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Maison'))

WebUI.setText(findTestObject('Creation_projet/Page_Welcome page/Page_IAD/input_Lier  un contact_search'), GlobalVariable.firstname)

WebUI.delay(2)

WebUI.click(findTestObject('Creation_projet/Page_Welcome page/Page_IAD/a_Chabanne AFGOUN DAMMARIE-LES-LYS'))

WebUI.delay(6)

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/span_tape suivante'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Enregistrer et quitter'))

WebUI.verifyElementPresent(findTestObject('Creation_projet/Page_IAD/div_Projet cr avec succs'), 0)

