package notes;
//Download tomcat server and jenkins.war
//Copy jenkins.war in webapps folder of tomcat server
//In command prompt go to the bin folder of tomcat server and type startup and enter
//Once server starts verify by entering URL: http://localhost:8080/
//Start jenkins using: http://localhost:8080/jenkins
//Login to jenkins and go to manage jenkins>>Global tool configuration
//Configure path of java jdk, maven and git
//Go to jenkins>>plugin manager and install these plugins: testng results, selenium HTML report and HTML publisher 
//Create a new job and in source code management field insert the git hub project URL (Skip this step if running in local system and follow steps after this setup)
//In additional behaviour section enter timeout as 30 minutes.
//In build section select invoke top level maven targets and select maven version=MAVEN HOME, enter POM as POM.xml and goals as clean test.
//In post build actions select publish testng results.
//Click apply and save.
//Configure testng.xml with proper test scripts.
//Configure pom.xml to include testng.xml and its proper path in suitable tag.
//Right click on testng.xml and Run as testng to make sure scripts are running fine through testng.xml
//Right click on pom.xml and run as maven install or maven test to make sure scripts are running fine through pom.xml
//In dashboard page click on build now and go to console output to see the log and results.

//Running from local system: Create new item, select use custom workspace and enter path of workspace till src.
//In build section select invoke top level maven targets and select maven version=MAVEN HOME, enter POM as POM.xml and goals as clean test.
//In post build actions select publish testng results.
//Click apply and save.

//Go to project>>Configure. In build triggers section, check the box - Build periodically.
//In schedule text box, write the CRON job expression - 
//H H 1,15 1-11 *. i.e. Run once a day on the 1st and 15th of every month except December
//H/15 * * * * i.e. Run every 15 minutes.
//@daily, @midnight - Every day at midnight.

//Trigger builds automatically when there is a push in Git hub. (Jenkins Config4.PNG and Jenkins Config5.PNG)
//Webhooks allow external services to be notified when certain events happen. When the specified events happen, we’ll send a POST request to each of the URLs
//you provide. 
//https://www.edureka.co/community/47943/schedule-jenkins-compile-build-when-there-commit-source-code#:~:text=To%20specify%20which%20project%20builds,hook%20trigger%20for%20GITScm%20Polling'.&text=Save%20your%20project.
//Cannot do this in local Jenkins setup as Git hub requires a URL which is reachable over public Internet.
//Go to: Manage Jenkins > Configure System
//Under GitHub Plugin Configuration, Click on ‘Advanced' tab.
//Check 'Specify another hook url' for GitHub configuration.
//A textbox will appear with a hook URL. This is the Hook URL at which Jenkins will listen for POST requests. Copy this URL and go to the next step.
//Open your repository on GitHub.
//Click ‘Settings’ on the navigation bar on the right-hand side of the screen.
//Click ‘Webhooks ’ on the navigation bar on the left-hand side of the screen.
//Click ‘Add webhook’ to add the webhook.
//Paste the URL you copied in the previous step as the ‘Payload URL’.
//You can select the events for which you want the Jenkins build to be triggered. We will select ‘Just the push event’ because we want to run the build when we push our code to the repository.
//Click ‘Add webhook’.
//In Jenkins, go to the project configuration of the project for which you want to run an automated build.
//In the ‘Build Triggers’ section, select 'Github hook trigger for GITScm Polling'.
//Save your project


//To pass parameters from Jenkin to test script: (Jenkins Config1.PNG, Jenkins Config2.PNG and Jenkins Config3.PNG)
//In pom.xml make these changes;
//<systemPropertyVariables> <implicitWait>${DimplicitWait}</implicitWait> 
//</systemPropertyVariables>
//<!-- <suiteXmlFiles>testng.xml</suiteXmlFiles> -->
//<suiteXmlFiles>${suiteXmlFile}</suiteXmlFiles>
//In jenkins in configure section add string parameters for test scripts parameters like implicit, explicit wait, url etc.
//Check the box - This project is parameterized
//Add one choice parameter for testng.xml. Give a name and in choices write the path of all xml files. This will serve as a drop down.
//In build section change the goal to clean test -DsuiteXmlFile=$testSuite where -D is syntax for system property variable, suiteXmlFile is the tag specified
//in pom.xml and $testSuite is the name given in previous step for choice parameter.
//We can also specify the goal - clean install -DsuiteXmlFile=$testSuite
//CLick on advanced and check the box Inject build variables
//Now build the project and in next page select string parameters and choice parameter(testng.xml options)


//Notes on CI/CD pipeline automation - https://dzone.com/articles/learn-how-to-setup-a-cicd-pipeline-from-scratch

public class Jenkins {

}
