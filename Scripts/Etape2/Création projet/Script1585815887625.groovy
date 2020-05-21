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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Creation_projet/Page_Welcome page/button_Accder'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/div_Identifiant'))

WebUI.setText(findTestObject('Creation_projet/Page_IAD (1)/input_Identifiant_username'), GlobalVariable.usernameConseiller)

WebUI.setEncryptedText(findTestObject('Creation_projet/Page_IAD (1)/input_Mot de passe_password'), GlobalVariable.mp)

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/input_Mot de passe_submit'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Dmarrer'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/div_Quitter'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/a_Production'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/a_Myiad acqureurs'))

WebUI.delay(3)

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/span_Crer'))

WebUI.delay(4)

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Achat'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Habitation'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Traditionnel'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Maison'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/span_Nouveau contact'))

Seq = (Math.random() * (9 - 6))

seq1 = (Seq * 100)

jdProjet = ((seq1) as int)

String jdPr = "$jdProjet"

GlobalVariable.NameContact = jdPr

WebUI.setText(findTestObject('Creation_projet/Page_IAD (1)/input_Nom_lastName'), 'Test' + GlobalVariable.NameContact)

WebUI.setText(findTestObject('Creation_projet/Page_IAD (1)/input_Prnom_firstName'), 'Nezha')

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/span_Enregistrer le contact'))

WebUI.verifyElementPresent(findTestObject('Creation_projet/Page_IAD/div_Contact cr avec succs'), 0)

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/span_tape suivante'))

WebUI.click(findTestObject('Creation_projet/Page_IAD (1)/button_Enregistrer et quitter'))

WebUI.verifyElementPresent(findTestObject('Creation_projet/Page_IAD/div_Projet cr avec succs'), 0)

