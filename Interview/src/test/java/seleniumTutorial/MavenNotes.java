package seleniumTutorial;
/*Maven
 * Maven is a project management tool that is based on POM-Project object model
 * Used to build project, dependency.
 * Maven limits the adding of jar files to the project
 * It helps to create project structure
 * Building and deploying is simple
 * Build does the following:
 * Generates source code
 * Compiles source code
 * Packages compiled source code into jar file
 * Installs the packaged code in local repository, remote repository or central repository
 * mvn --version to check if maven in installed properly
 * Maven repositories - 
 * Local repository: .m2 folder is local repository. C:\Users\AMIT\.m2\repository
 * Central repository: Maven community - https://mvnrepository.com/
 * Remote repository: Company specific repository. Inside .m2 folder we need to have setting.xml where we have company specific jar files to download.
 * In POM.xml:
 * Project is root element
 * Model Version is sub element
 * Group ID will identify the project uniquely across all projects
 * Artifact ID is project name.
 * Packaging: Defines packaging type such as jar,war etc.
 * Dependencies: Defines dependencies for this project.
 * Dependency: Defines a dependency. It is used inside dependencies.
 * Scope: Defines scope for this maven project. It can be compile, provided, runtime, test and system.
 * 
 * Maven life cycle: (VCTPVID)
 * Validate: Validate if project is correct and all necessary info is available
 * Compile: Compile source code
 * Test: Test the compiled source code using a suitable unit testing framework
 * Package: Take compiled code and package in distributable format such as jar
 * Verify: Run checks on integration test to ensure quality
 * Install: Install the package in local repository for use as a dependency in other project locally
 * Deploy: Copy final package in remote repository for sharing with other developers and projects
 * Commands:
 * Right click on POM.xml. Run as Maven install. Will download all dependencies from Google.
 * Right click on project and do Maven>>Update Project. This will update the entire project components with the dependencies downloaded.
 * For all mvn commands: https://www.journaldev.com/33645/maven-commands-options-cheat-sheet#4-mvn-package
 */

public class MavenNotes {

}
