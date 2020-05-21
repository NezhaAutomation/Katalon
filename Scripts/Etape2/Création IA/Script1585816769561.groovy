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

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/div_1474169Projet  Emelie02042020 AchatHabi_9dbb01'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/div_Filtres_iad-list-item-title'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/i_Parking_iad-nav-item-icon business_indica_151f79'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/button_Indication daffaires'))

WebUI.click(findTestObject('Object Repository/Creation IA/Page_IAD/span_2'))

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

println(GlobalVariable.namepar)

st = GlobalVariable.namepar

String str = "$st"

WebUI.setText(findTestObject('Creation IA/Page_IAD/Page_IAD/input_Entrer un CP ou une ville_mat-input-12'), str)

WebUI.check(findTestObject('Creation IA/Page_IAD/Page_IAD/div_Entrer un nom_mat-checkbox-inner-container'))

WebUI.verifyElementText(findTestObject('Creation IA/Page_IAD/Page_IAD/h3_BANK 19089275'), 'BANK ' + GlobalVariable.namepar)

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

WebUI.click(findTestObject('Creation IA/Page_IAD/Page_IAD/span_diter'))

WebUI.click(findTestObject('Creation IA/Page_IAD/Page_IAD/span_3'))

WebUI.delay(2)

WebUI.check(findTestObject('Creation IA/Page_IAD/Page_IAD/label_ Accepter'))

not_run: WebUI.verifyElementChecked(findTestObject('Creation IA/Page_IAD/mat-radio-button_ Refuser - Copy'), 0)

not_run: WebUI.check(findTestObject('Creation IA/Page_IAD/mat-radio-button_ Refuser'))

WebUI.delay(4)

WebUI.click(findTestObject('Creation IA/Page_IAD/Page_IAD/span_Valider'))

WebUI.delay(3)

url = WebUI.getUrl()

U = test2.split(' - ')

println(U)

GlobalVariable.p = (U[1])

println(GlobalVariable.p)

GlobalVariable.dateIA = (U[2])

WebUI.closeBrowser()

