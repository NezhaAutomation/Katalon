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
import ch.qos.logback.core.util.CharSequenceState as CharSequenceState
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Partenaire/Page_Welcome page/button_Accder'))

WebUI.setText(findTestObject('Partenaire/Page_IAD/input_Identifiant_username'), GlobalVariable.compteAD)

WebUI.setEncryptedText(findTestObject('Partenaire/Page_IAD/input_Mot de passe_password'), GlobalVariable.mp)

WebUI.click(findTestObject('Partenaire/Page_IAD/input_Mot de passe_submit'))

WebUI.click(findTestObject('Partenaire/Page_IAD/a_Production'))

WebUI.click(findTestObject('Partenaire/Page_IAD/a_Financia BO'))

WebUI.click(findTestObject('Partenaire/Page_IAD/button_Ajouter'))

rondteest = (Math.random() * (9 - 6))

ifrond = ((rondteest) as int)

if (ifrond == 0) {
    nameP = (rondteest * 100000000)
} else {
    nameP = (rondteest * 10000000)
}

println(ifrond)

println(rondteest)

GlobalVariable.namepar = ((nameP) as int)

svar = GlobalVariable.namepar

String searchvar = "$svar"

WebUI.delay(4)

url1 = 'https://p13.demo.iadholding.com/wis/headquarter/production/business-indication/partner/list?type=bi'

WebUI.setText(findTestObject('Partenaire/Page_IAD/input__partnerName'), 'BANK ' + GlobalVariable.namepar)

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Slectionner un type de partenaire'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Banques'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Slectionner une forme juridique'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_SARL'))

CustomKeywords.'com.keywords.katalon.uploadfilKatalon.uploadFile'(findTestObject('Partenaire/Page_IAD/span_Parcourir'), 
    'C:\\Users\\nezha.e\\Desktop\\test.png')

WebUI.setText(findTestObject('Partenaire/Page_IAD/input__address1'), 'a')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Partenaire/Page_IAD/input__address1'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Partenaire/Page_IAD/input__address1'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

adress = WebUI.getAttribute(findTestObject('Partenaire/Page_IAD/input__address1'), 'value')
GlobalVariable.adressValue = adress

WebUI.click(findTestObject('Partenaire/Page_IAD/Page_IAD/span_Accords'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Slectionner une nature de convention'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Nationale'))

WebUI.click(findTestObject('Partenaire/Page_IAD/Page_IAD/Page_IAD/input_Date de signature_form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-date'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_10'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Slectionner un type de convention'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Indtermin'))

WebUI.click(findTestObject('Partenaire/Page_IAD/Page_IAD/Page_IAD/input_Date de fin de convention_form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-date'))

WebUI.click(findTestObject('Partenaire/Page_IAD/Page_IAD/Page_IAD/button_next'))

WebUI.click(findTestObject('Partenaire/Page_IAD/Page_IAD/Page_IAD/button_08'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Choisir'))

GlobalVariable.pourcentage = WebUI.getText(findTestObject('Partenaire/Page_IAD/span_05'))

println(GlobalVariable.pourcentage)

WebUI.click(findTestObject('Partenaire/Page_IAD/span_05'))

CustomKeywords.'com.keywords.katalon.UploadPdfFile.uploadPDF'(findTestObject('Partenaire/Page_IAD/span_Glisser un fichier ici ou cliquer pour_5320bf'), 
    'C:\\Users\\nezha.e\\Desktop\\test.pdf')

WebUI.delay(10)

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Sauvegarder'))

WebUI.delay(5)

WebUI.click(findTestObject('Partenaire/contact/Page_IAD/span_Nouveau contact'))

WebUI.delay(5)

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input__firstName'), 'Nezha' + GlobalVariable.namepar)

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input__lastName'), 'EN NAJJARY ' + GlobalVariable.namepar)

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input__mobilePhone'), '06' + GlobalVariable.namepar)

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input__phone'), '01' + GlobalVariable.namepar)

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input__email'), ('nezha.' + GlobalVariable.namepar) + '1@gmail.com')

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input_Secteur_email'), ('nezha.' + GlobalVariable.namepar) + '@gmail.com')

WebUI.click(findTestObject('Partenaire/contact/Page_IAD/span_FRANCE'))

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input_FRANCE_form-control ui-select-search ng-pristine ng-untouched ng-valid ng-empty'), 
    'France')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Partenaire/contact/Page_IAD/input_FRANCE_form-control ui-select-search ng-pristine ng-untouched ng-valid ng-empty'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Partenaire/contact/Page_IAD/input_FRANCE_form-control ui-select-search ng-pristine ng-untouched ng-valid ng-empty'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Partenaire/contact/Page_IAD/input__address1'), 'q')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Partenaire/contact/Page_IAD/input__address1'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Partenaire/contact/Page_IAD/input__address1'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Partenaire/contact/Page_IAD/span_Enregistrer le contact'))

WebUI.click(findTestObject('Partenaire/Page_IAD/span_Sauvegarder'))

WebUI.delay(10)

url = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(url1, url)

WebUI.delay(1)

WebUI.click(findTestObject('Partenaire/Page_IAD/Page_IAD/Page_IAD/input_Afficher_search'))

WebUI.setText(findTestObject('Partenaire/Page_IAD/Page_IAD/Page_IAD/input_Afficher_search'), searchvar)

WebUI.delay(4)

val = WebUI.getText(findTestObject('Partenaire/Page_IAD/Page_IAD/Page_IAD/p_Valid'))

WebUI.delay(1)

WebUI.verifyEqual(val, 'Validé')

WebUI.delay(1)

WebUI.closeBrowser()

