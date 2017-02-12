# RyanTest

Environment:
* Win10
* Chrome 56
* Chromedriver 2.27
* Selenium java 3.0.1
* jre 1.8
* junit 4.1.0

Following test is not complete. It fails at the last step as due to the problems with cookies it is not possible to log in. I haven't found a good solution to this problem in reasonable time so I decided to leave it as it is. I must admit I have lost too much time simply because of lack of knowledge of web technologies. For the same reason m.ryanair.com site was used instead of the www.ryanair.com/ie/en it was unclear to me how to locate elements there. Please have in my mind I have never written web page automation or manually tested web applications before and this was my first try. The task doesn't really cover my experience with mobile domain / appium.

What should be changed (If I had some more time):
* Separate class to handle configurations, there should be config file parsed with login, password, browser, cookies path etc.
* Xpath usage should be as minimized or completely avoided- this is because of my poor knowledge of web technologies and available selectors
* Some methods should be done in more generic way- in some places there are hardcoded values
* ArrayList should be used here and there to be more elegant
* Use maven surefire / TestNG / ant/ junit plugin for jenkins or some other tool for xml/html test reports 
