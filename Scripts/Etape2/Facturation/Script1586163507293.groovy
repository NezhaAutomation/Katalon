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

not_run: WebUI.callTestCase(findTestCase('Etape2/Création IA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Facturation/Page_Welcome page/button_Accder'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Facturation/Page_IAD/input_Identifiant_username'), GlobalVariable.usernameGestionnaire)

WebUI.setEncryptedText(findTestObject('Object Repository/Facturation/Page_IAD/input_Mot de passe_password'), GlobalVariable.mp)

WebUI.click(findTestObject('Object Repository/Facturation/Page_IAD/input_Mot de passe_submit'))

not_run: WebUI.click(findTestObject('Facturation/Page_IAD/button_Dmarrer'))

not_run: WebUI.click(findTestObject('Object Repository/Facturation/Page_IAD/div_Quitter'))

WebUI.click(findTestObject('Object Repository/Facturation/Page_IAD/a_Factures  Paiement'))

WebUI.click(findTestObject('Object Repository/Facturation/Page_IAD/a_Facturation Indication daffaire'))

println(GlobalVariable.p)

WebUI.delay(5)

WebUI.click(findTestObject('Facturation/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'))

WebUI.setText(findTestObject('Facturation/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'), GlobalVariable.p)

WebUI.delay(3)

WebUI.click(findTestObject('Facturation/Page_IAD/span_Rechercher'))

WebUI.verifyElementText(findTestObject('Facturation/Page_IAD/p_En cours'), 'En cours')

WebUI.delay(4)

WebUI.click(findTestObject('Facturation/Page_IAD/div_Gestionnaire  TANNEUX Johanna (15547)_myiad-burger-useful-width dropdown-toggle'))

WebUI.click(findTestObject('Facturation/Page_IAD/a_Facturer'))

WebUI.delay(6)

Montant1 = WebUI.getAttribute(findTestObject('Facturation/IA1/Page_IAD/input__form-control ng-pristine ng-not-empty ng-valid ng-valid-required ng-touched'), 
    'value')

println(Montant1)


println(GlobalVariable.MontantRetro)

Montantglobal = GlobalVariable.MontantRetro

Double d1 = Double.parseDouble(Montantglobal)

println(d1)

println(GlobalVariable.pourcentage)

pouctg1 = GlobalVariable.pourcentage

Double d = Double.parseDouble(pouctg1)

println(d)

montantRetrocession = ((d1 * d) / 100)

println(montantRetrocession)

WebUI.verifyEqual(Montant1, montantRetrocession)

WebUI.click(findTestObject('Facturation/IA1/Page_IAD/button_Confirmer'))

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Facturation/IA1/Page_IAD Intranet/div_Angers France'), GlobalVariable.adressValue)

WebUI.verifyElementText(findTestObject('Facturation/IA1/Page_IAD Intranet/div_ZIMUT'), 'BANK ' + GlobalVariable.namepar)

Date1IA = GlobalVariable.dateIA

Date2IA = Date1IA.split(' :')

Date3IA = (Date2IA[0])

println(Date3IA)

WebUI.verifyElementText(findTestObject('Facturation/IA1/Page_IAD Intranet/div_Lieusaintle 05052020'), 'Lieusaint,le ' + 
    Date3IA)

trbalise = WebUI.getText(findTestObject('Facturation/IA1/Page_IAD Intranet/tr'))

println(trbalise)

trb = trbalise.split('affaire ')

println(trb)

trba = (trb[1])

trbal = trba.split('%')

println(trbal)

trbal1 = (trbal[0])

trbal11 = trbal1.split('€')

println(trbal11)

trbal2 = (trbal[1])

trbal22 = trbal2.split('€')

println(trbal22)

montantFactureIAHT = (trbal11[0])

println(montantFactureIAHT)

montantFactureIAHT1 = montantFactureIAHT.replaceAll(' ', '')

montantFactureIAHT2 = montantFactureIAHT1.replaceAll(',00', '')

println(montantFactureIAHT2)

Double montantFactureIAHT3 = Double.parseDouble(montantFactureIAHT2)

println(montantFactureIAHT3)

WebUI.verifyEqual(Montant1, montantFactureIAHT3)

prcntgTVA = (trbal11[1])

prcntgTVA1 = prcntgTVA.replaceAll(' ', '')

prcntgTVA2 = prcntgTVA1.replaceAll(',00', '')

Double prcntgTVA3 = Double.parseDouble(prcntgTVA2)

println(prcntgTVA3)

montantTVAC = ((prcntgTVA3 * montantFactureIAHT3) / 100)

montantTVA = (trbal22[0])

montantTVA1 = montantTVA.replaceAll(' ', '')

montantTVA2 = montantTVA1.replaceAll(',00', '')

Double montantTVA3 = Double.parseDouble(montantTVA2)

println(montantTVA3)

WebUI.verifyEqual(montantTVAC, montantTVA3)

montantTTC = (trbal22[1])

montantTTC1 = montantTTC.replaceAll(' ', '')

montantTTC2 = montantTTC1.replaceAll(',00', '')

Double montantTTC3 = Double.parseDouble(montantTTC2)

println(montantTTC3)

MontantTTCF = (montantTVA3 + montantFactureIAHT3)

println(MontantTTCF)

WebUI.verifyEqual(MontantTTCF, montantTTC3)

WebUI.check(findTestObject('Facturation/IA1/Page_IAD Intranet/div_Carr Hausmann III - CS10476_mat-checkbox-inner-container'))

WebUI.delay(2)

WebUI.click(findTestObject('Facturation/IA1/Page_IAD Intranet/button_Emettre une facture'))

WebUI.delay(5)

WebUI.click(findTestObject('Facturation/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'))

WebUI.setText(findTestObject('Facturation/Page_IAD/input_concat(N de l  indication d  affaire)_biNumber'), GlobalVariable.p)

WebUI.delay(3)

WebUI.click(findTestObject('Facturation/Page_IAD/span_Rechercher'))

WebUI.verifyElementText(findTestObject('Facturation/Page_IAD/p_Facture'), 'Facturée')

not_run: WebUI.click(findTestObject('IA1/Page_IAD/i_Partenaire_fa fa-times fa-2x iad-cb-modal-close'))

WebUI.closeBrowser()

