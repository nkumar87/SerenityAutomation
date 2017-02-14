Automated Web Tests Using Serenity, Junit, Maven

Automated test case which covers the scenario wherein user visits main wikipedia page, clicks on 'English' and is being redirected to some wikipedia page which should contain text in English. Validation is performed using 'Main page' link which appears on the left hand side of the English Wikipedia page.

Steps in Execution:-

1) User visits main wikipedia page in the first step written in UserStep.java
2) Subsequent to page opens, wait for 'English' link to appear and then click 'English'
3) After clicking 'English', English wikipedia page should open up. This page contains 'Main page' link on the left side. Henceforth, wait for this link to appear first and then validate the text contained in this link. If the text matches 'Main page', then test case is passed successfully

Getting Started

1) Download and Install Eclipse. Also, download and install mavel plugin for eclipse
2) Download and install Maven, if you  wish to run tests using maven command line options
2) Open Eclipse -> Select Import -> Maven -> Existing Maven Projects
3) Choose 'serenity-test' from the folder in which you have downloaded the project and import the respective project

Prerequisites

1) Download and install Eclipse. Also install Maven plugin for Eclipse (Download and install latest version of Maven if you wish to run tests using maven command line options)
2) Download and install latest version of chromedriver.exe for webdriver to run properly if you wish execute tests on chrome browser
3) Download and install latest version of IEDriverServer.exe for webdriver to run properly if you wish execute tests on IE browser

Running the tests

Using Eclipse:-

1) Open VerifyEnglishTest.java. Inside the @Managed annotation, put driver name as firefox, chrome or iexplorer based on which browser you want the tests to run on. By default, tests will run on Firefox browser
2) Right click -> Select 'Run as' -> 'Run Configurations' -> Open 'Arguments' tab -> Provide the following parameters in VM Arguments box :-
a) For running the tests on Firefox browser -> no arguments need to be specified
b) For running the tests on Chrome browser -> Type -Dwebdriver.chrome.driver="C:\drivers\chromedriver.exe". Note that this should be the path where you installed the chromedriver.exe file in previous steps
b) For running the tests on IE browser -> Type -Dwebdriver.ie.driver="C:\drivers\IEDriverServer.exe". Note that this should be the path where you installed the IEDriverServer.exe file in previous steps

3) Click on 'Apply' and then 'Run'. Tests will get executed based on whatever argument you specified in driver parameter inside @Managed annotation and whatever driver you specified. If you don't specify driver path in VM Arguments, tests will produce an error and will not execute

Using command Line:-

1) Navigate to the location of folder 'serenity-test' i.e. where you downloaded the project
2) Type the desired driver name as firefox, chrome, iexplorer in driver parameter inside @Managed annotation specified in VerfiyEnglishTest.java
2) Type 'mvn clean' to compile the code
3) Type the following commands based on choice of different browsers. Note -> you need to compile the code first whenever you are changing the browser name inside @Managed annotation in code
a) For Firefox -> 'mvn verify -Dwebdriver.driver=firefox'
b) For Chrome -> 'mvn verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=C:\drivers\chromedriver.exe' (Give your path where you installed the respective driver)
c) For Firefox -> 'mvn verify -Dwebdriver.driver=iexploer -Dwebdriver.ie.driver=C:\drivers\IEDriverServer.exe' (Give your path where you installed the respective driver)
4) Tests will execute on your choice of browser. Note-> If you don't specify the correct path of respective driver of a browser you have chosen, it will produce an error due to incompatibility of webdriver with certain newer browser versions

Results

1) Check the results on Eclipse Console or statements executed on Command Line. For more thorough analysis, navigate to 'serenity-test->target->site' directory and visualize the test case execution results through index.html and results.csv file generated at that location


Acknowledgements

http://serenity-bdd.info/docs/serenity/

