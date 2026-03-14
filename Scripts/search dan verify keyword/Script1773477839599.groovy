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

// Open browser & navigate
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Urlabookstore)

// Klik search bar
WebUI.click(findTestObject('ElementABookStore/Page_Automation Bookstore/input_Automation Bookstore_searchBar'))

// Input keyword Agile
WebUI.setText(findTestObject('ElementABookStore/Page_Automation Bookstore/input_Automation Bookstore_searchBar'), 'Agile')

// Tekan Enter
WebUI.sendKeys(findTestObject('ElementABookStore/Page_Automation Bookstore/input_Automation Bookstore_searchBar'), Keys.chord(
        Keys.ENTER))

// Tunggu hasil muncul
WebUI.delay(2)

// Verifikasi hasil mengandung kata Agile
WebUI.verifyTextPresent('Agile', false)

// Atau cek elemen spesifik judul buku
WebUI.verifyElementText(findTestObject('ElementABookStore/Page_Automation Bookstore/h2_Agile Testing'), 'Agile Testing')

// Close browser
WebUI.closeBrowser()

