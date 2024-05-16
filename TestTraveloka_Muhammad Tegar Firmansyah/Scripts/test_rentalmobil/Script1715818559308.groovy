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

WebUI.maximizeWindow()

'Visit traveloka.com\r\n'
WebUI.navigateToUrl('https://www.traveloka.com/id-id')

'Click rental navbar rental mobil\r\n'
WebUI.click(findTestObject('Traveloka homepage/navbar_rentalmobil'))

'Click caritempat\r\n'
WebUI.click(findTestObject('Page_rentalmobil/caritempat_placeholder'))

'Click lokasi rekomendasi paling atas\r\n'
WebUI.doubleClick(findTestObject('Page_rentalmobil/CKG_pollaceholder'))

'Click date start\r\n'
WebUI.click(findTestObject('Page_rentalmobil/Datestart_'))

'Set date to 10 june\r\n'
WebUI.click(findTestObject('Page_rentalmobil/Setdate_10june'))

'Click tombol search mobil\r\n'
WebUI.click(findTestObject('Page_rentalmobil/Search_mobil'))

'Click tombol lanjutkan for toyota grand new avanza manual\r\n'
WebUI.click(findTestObject('Page_rentalmobil/Toyotanewavanza_manual'))

'klick lanjutkan lagi\r\n'
WebUI.click(findTestObject('Page_rentalmobil/Lanjutkan lagi'))

'klik lanjutkan lagi'
WebUI.click(findTestObject('Page_rentalmobil/lanjutkan lagilagi'))

'Verify detail rental \r\n'
WebUI.verifyElementText(findTestObject('Page_rentalmobil/Detail rental'), 'Detail Rental')

'input nama pemesan\r\n'
WebUI.click(findTestObject('Page_rentalmobil/input nama 1'))

'isi data dan ceklis\r\n'
WebUI.setText(findTestObject('Page_rentalmobil/input nama 1'), 'Tegar firmansyah')

WebUI.setText(findTestObject('Page_rentalmobil/nomor telpon pemesan'), '89123413333')

WebUI.setText(findTestObject('Page_rentalmobil/emailpemesan'), 'tegar.tergiur@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/select_TuanNyonyaNona'), 
    'MR', true)

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Tr_13aaf0/canvas-orm-abc-71e'))

WebUI.setText(findTestObject('Page_rentalmobil/input nama pengemudi'), 'tegar firmansyah')

WebUI.setText(findTestObject('Page_rentalmobil/nomor pengemudi'), '089123413333')

WebUI.click(findTestObject('Page_rentalmobil/tombol lanjutkan lagi_detail pengemudidanpemesan'))

WebUI.click(findTestObject('Page_rentalmobil/ketukcentang'))

WebUI.click(findTestObject('Page_rentalmobil/centangsemua'))

WebUI.click(findTestObject('Page_rentalmobil/tombol simpanj'))

WebUI.click(findTestObject('Page_rentalmobil/Xbutton'))

'Lanjut page pembayaran\r\n'
WebUI.click(findTestObject('Page_rentalmobil/Lanjutkan pembayaran'))

'tombol konfirmasi\r\n'
WebUI.click(findTestObject('Page_rentalmobil/lanjutkanbiru'))

'pilih payment VA\r\n'
WebUI.click(findTestObject('Page_rentalmobil/virtual account'))

'Payment button\r\n'
WebUI.click(findTestObject('Page_rentalmobil/VA'))

WebUI.verifyElementText(findTestObject('Page_rentalmobil/verify payment page'), 'How to Transfer')

WebUI.closeBrowser()

