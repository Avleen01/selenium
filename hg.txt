set ProjectPath=D:\Eclipse Marse2\eclipseWorkspace\TestProject
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\Lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml
pause 