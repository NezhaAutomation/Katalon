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

WebUI.callTestCase(findTestCase('Etape2/Création projet'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/div_1474169Projet  Emelie02042020 AchatHabi_9dbb01'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/div_Filtres_iad-list-item-title'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/i_Parking_iad-nav-item-icon business_indica_151f79'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/button_Indication daffaires'))

SeqAcq = (Math.random() * (9 - 6))

seqAcq1 = (SeqAcq * 1000)

jdAcq = ((seqAcq1) as int)

String jdAcquereur = "$jdAcq"

not_run: WebUI.getText(findTestObject('Acquereur/verif-modif/Page_IAD/div_Monsieur'))

GlobalVariable.Nom = ('Acquereur1' + jdAcquereur)

WebUI.setText(findTestObject('Acquereur/verif-modif/Page_IAD/input_concat(Prnom de l  acqureur)_mat-input-3'), GlobalVariable.Nom)

GlobalVariable.Prenom = ('Acquereur2' + jdAcquereur)

WebUI.setText(findTestObject('Acquereur/verif-modif/Page_IAD/input_Genre_mat-input-2'), GlobalVariable.Prenom)

WebUI.setText(findTestObject('Acquereur/verif-modif/Page_IAD/input_ADRESSE_mat-input-7'), 'FRANCE')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Acquereur/verif-modif/Page_IAD/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Acquereur/verif-modif/Page_IAD/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Acquereur/verif-modif/Page_IAD/input_Pays_1589990366660'), 'a')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Acquereur/verif-modif/Page_IAD/input_Pays_1589990366660'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Acquereur/verif-modif/Page_IAD/input_Pays_1589990366660'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

GlobalVariable.emailAcq = (('Acquereur3' + jdAcquereur) + '@gmail.com')

WebUI.setText(findTestObject('Acquereur/verif-modif/Page_IAD/input_INFORMATIONS COMPLMENTAIRES_mat-input-9'), GlobalVariable.emailAcq)

SeqphoneAcq = (Math.random() * (9 - 6))

ifseq1 = ((SeqphoneAcq) as int)

if (ifseq1 == 0) {
    SeqphoneAcq1 = (SeqphoneAcq * 100000000)
} else {
    SeqphoneAcq1 = (SeqphoneAcq * 10000000)
}

phone6 = ((SeqphoneAcq1) as int)

println(phone6)

WebUI.setText(findTestObject('Acquereur/verif-modif/Page_IAD/input_E-mail invalide_mat-input-10'), '01' + phone6)

if (WebUI.click(findTestObject('Acquereur/Page_IAD/mat-icon_Test255_bi-avatar-icon mat-icon notranslate fas fa-plus-circle mat-icon-no-color'))) {
    new_btn = WebUI.modifyObjectProperty(findTestObject('Acquereur/Page_IAD/mat-icon_Test255_bi-avatar-icon mat-icon notranslate fas fa-plus-circle mat-icon-no-color'), 
        'class', 'equals', 'bi-avatar-icon mat-icon notranslate fas fa-plus-circle mat-icon-no-color active', false)

    WebUI.click(new_btn)
}

WebUI.click(findTestObject('Acquereur/verif-modif/Page_IAD/span_Confirmer'))

WebUI.click(findTestObject('Acquereur/Page_IAD/span_Genre'))

WebUI.click(findTestObject('Acquereur/Page_IAD/span_Madame'))

GlobalVariable.NomAcq2 = ('AcquAdd1' + jdAcquereur)

WebUI.setText(findTestObject('Acquereur/Page_IAD/input_Genre_mat-input-2'), GlobalVariable.NomAcq2)

GlobalVariable.PrenomAcq2 = ('AcquAdd2' + jdAcquereur)

WebUI.setText(findTestObject('Acquereur/Page_IAD/input_concat(Prnom de l  acqureur)_mat-input-3'), GlobalVariable.PrenomAcq2)

WebUI.setText(findTestObject('Acquereur/Page_IAD/input_ADRESSE_mat-input-7'), 'France')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Acquereur/Page_IAD/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Acquereur/Page_IAD/input_ADRESSE_mat-input-7'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Acquereur/Page_IAD/input_Pays_1589984400648'), 'a')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Acquereur/Page_IAD/input_Pays_1589984400648'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Acquereur/Page_IAD/input_Pays_1589984400648'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

emailAcq1 = (('Acquereur4' + jdAcquereur) + '@gmail.com')

WebUI.setText(findTestObject('Acquereur/Page_IAD/input_INFORMATIONS COMPLMENTAIRES_mat-input-9'), emailAcq1)

WebUI.setText(findTestObject('Acquereur/Page_IAD/input_E-mail invalide_mat-input-10'), '06' + phone6)

WebUI.click(findTestObject('Acquereur/Page_IAD/span_Suivant'))

M = (Math.random() * (9 - 6))

M1 = ((M) as int)

if (M1 == 0) {
    M1 = (M1 + 1)

    M2 = (M1 * 1000000)
} else {
    M2 = (M1 * 1000000)
}

String MontantRet = "$M2"

GlobalVariable.MontantRetro = MontantRet

println(GlobalVariable.MontantRetro)

WebUI.setText(findTestObject('Object Repository/Creation IA/Page_IAD/input_MONTANT DU PRT_mat-input-0'), GlobalVariable.MontantRetro)

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/span_Suivant'))

WebUI.delay(6)

WebUI.setText(findTestObject('Creation IA/Page_IAD/Page_IAD/input_Entrer un CP ou une ville_mat-input-12'), '@ZIMUT')

WebUI.check(findTestObject('Creation IA/Page_IAD/Page_IAD/div_Entrer un nom_mat-checkbox-inner-container'))

WebUI.verifyElementText(findTestObject('Creation IA/Page_IAD/Page_IAD/h3_BANK 19089275'), '@ZIMUT')

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/span_Choisir un contact'))

WebUI.click(findTestObject('Creation IA/Page_IAD/Page_IAD/span_En Najjary 39851439 Nezha39851439  (Angers France )'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/span_Valider'))

WebUI.verifyElementPresent(findTestObject('Creation IA/Page_IAD/span_Confirmer'), 0)

WebUI.verifyElementClickable(findTestObject('Creation IA/Page_IAD/span_Confirmer'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/span_Confirmer'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/i_Parking_iad-nav-item-icon business_indica_151f79'))

WebUI.click(findTestObject('Creation IA/Page_IAD/strong_Test106 Nezha - 16888 - 05052020'))

test2 = WebUI.getText(findTestObject('Creation IA/Page_IAD/strong_Test106 Nezha - 16888 - 05052020'))

WebUI.verifyElementText(findTestObject('Creation IA/Page_IAD/Page_IAD/strong_Statut En cours'), 'Statut: En cours')

WebUI.closeBrowser()

