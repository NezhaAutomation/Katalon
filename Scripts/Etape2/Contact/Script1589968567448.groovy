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
import com.sun.media.sound.SoftReverb.Delay as Delay
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/CreationContact/Page_Welcome page/button_Accder'))

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Identifiant_username'), GlobalVariable.usernameConseiller)

WebUI.setEncryptedText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Mot de passe_password'), GlobalVariable.mp)

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/input_Mot de passe_submit'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/button_Dmarrer'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/div_Quitter'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/a_Production'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/a_Myiad contacts'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/button_Crer'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/div_Nouveau contact_myiad-avatar'))

Seq5 = (Math.random() * (9 - 6))

seq55 = (Seq5 * 100)

jdcontact = ((seq55) as int)

String jdcont = "$jdcontact"

GlobalVariable.firstname = ('test' + jdcont)

println(GlobalVariable.firstname)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Prnom_firstName'), GlobalVariable.firstname)

GlobalVariable.lastname = ('test1' + jdcont)

println(GlobalVariable.lastname)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Nom_lastName'), GlobalVariable.lastname)

GlobalVariable.usedname = ('test3' + jdcont)

println(GlobalVariable.usedname)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_concat(Nom d  usage)_usageName'), GlobalVariable.usedname)

GlobalVariable.jeunefille = ('test4' + jdcont)

println(GlobalVariable.jeunefille)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Nom de jeune fille_birthName'), GlobalVariable.jeunefille)

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/input_Date de naissance_birthDate'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/span_13'))

datebirth = WebUI.getAttribute(findTestObject('CreationContact/Page_IAD/input_Date de naissance_birthDate'), 'value')

GlobalVariable.DateNaissance = datebirth

println(GlobalVariable.DateNaissance)

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/span_Lieu de naissance_btn btn-default form_bf2c5d'))

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/span_02'))

GlobalVariable.lieuBirth = ('test5' + jdcont)

println(GlobalVariable.lieuBirth)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Lieu de naissance_birthPlace'), GlobalVariable.lieuBirth)

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/span_Choisir'))

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Choisir_form-control ui-select-search_780576'), 
    'France')

pays1 = WebUI.getText(findTestObject('CreationContact/Page_IAD/span_FRANCE'))

WebUI.click(findTestObject('CreationContact/Page_IAD/span_FRANCE'))

GlobalVariable.pays = pays1

println(GlobalVariable.pays)

GlobalVariable.profession = ('test8' + jdcont)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Profession_job'), GlobalVariable.profession)

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/span_Contact  Adresse'))

Seqphone = (Math.random() * (9 - 6))

ifseq = ((Seqphone) as int)

if (ifseq == 0) {
    phoneseq1 = (Seqphone * 100000000)
} else {
    phoneseq1 = (Seqphone * 10000000)
}

phone = ((phoneseq1) as int)

println(phone)

GlobalVariable.phone1 = ('06' + phone)

println(GlobalVariable.phone1)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Tlphone_phone2'), GlobalVariable.phone1)

WebUI.click(findTestObject('Object Repository/CreationContact/Page_IAD/span_Ajouter un tlphone_fa fa-plus'))

GlobalVariable.phone2 = ('01' + phone)

println(GlobalVariable.phone2)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Tlphone_phone4'), GlobalVariable.phone2)

GlobalVariable.email1 = (('test6.' + phone) + '@gmail.com')

println(GlobalVariable.email1)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_E-mail personnel_emailPersonal-3'), GlobalVariable.email1)

WebUI.click(findTestObject('CreationContact/Page_IAD/button_Ajouter un email_btn btn-primary btn-add'))

GlobalVariable.email2 = (('test7.' + phone) + '@gmail.com')

println(GlobalVariable.email2)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_E-mail personnel_emailPersonal-5'), GlobalVariable.email2)

WebUI.click(findTestObject('CreationContact/Page_Welcome page/Page_IAD/span_FRANCE'))

WebUI.setText(findTestObject('CreationContact/Page_IAD/input_FRANCE_form-control ui-select-search _8034ae'), 'France')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('CreationContact/Page_IAD/input_FRANCE_form-control ui-select-search _8034ae'), Keys.chord(
        Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('CreationContact/Page_IAD/input_FRANCE_form-control ui-select-search _8034ae'), Keys.chord(
        Keys.INSERT))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/CreationContact/Page_IAD/input_Adresse_address1'), 'a')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('CreationContact/Page_IAD/input_Adresse_address1'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('CreationContact/Page_IAD/input_Adresse_address1'), Keys.chord(Keys.INSERT))

WebUI.delay(5)

adressContac = WebUI.getAttribute(findTestObject('Object Repository/CreationContact/Page_IAD/input_Adresse_address1'), 'value')

GlobalVariable.adressContact = adressContac

println(GlobalVariable.adressContact)

WebUI.click(findTestObject('CreationContact/Page_IAD/span_Enregistrer le contact'))

WebUI.delay(8)

