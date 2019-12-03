set projectLocation=D:\selenium_practice\Debasish_Modular_Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocaton%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml