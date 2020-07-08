package com.amit.web.testscripts;
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
 * In POM.xml:
 * Project is root element
 * Model Version is sub element
 * Group ID will identify the project uniquely across all projects
 * Artifact ID is project name
 * 
 * Maven life cycle:
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
 */

public class MavenNotes {

}
