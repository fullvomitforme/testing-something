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

Mobile.startApplication('C:\\Users\\ondel\\OneDrive\\Documents\\TAZKIYA MUJAHID\\APPS\\OnApps Demo.apk', true)

Mobile.tap(findTestObject('Object Repository/android.view.View'), 0)

Mobile.verifyElementVisible(findTestObject('android.widget.EditText - Usernameemail (1)'), 10)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Usernameemail (1)'), 'keozhtesting', 0)

Mobile.verifyElementVisible(findTestObject('android.widget.EditText - Password'), 10)

Mobile.setEncryptedText(findTestObject('Object Repository/android.widget.EditText - Password'), 'PdN4lLrKSMdW8eHXhXNsDQ==', 
    0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - keozhtesting, Usernameemail'), 'keozhtesting', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button'), 10)

Mobile.verifyElementExist(findTestObject('android.widget.Button'), 10)

Mobile.tap(findTestObject('android.widget.Button (1)'), 10)

Mobile.closeApplication()

