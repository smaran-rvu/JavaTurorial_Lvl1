## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
    - mulltiple packages will be present within `src`
    - JavaTutorial: the source code for all java basic syntaxes
    - Projects: a set of off-side mini programs related to using concepts from JavaTutorial 
- `lib`: the folder to maintain dependencies
- `bin`: the folder to maintain all compiled binaries of `.java` programs

## Compilation and Execution

To compile the java file, run the following command on the terminal <br>
`javac <filePath>\<MainClass>.java` <br>
For example: `javac ".\src\Projects\MortgageCalculator\App.java"`

- The compiled output `.class` file will be generated in the `bin` folder by default.

To execute your code, run the following commands on the terminal <br>
`cd src`<br>
`java <Package>.<MainClass>` <br>
For example: `java Projects.MortgageCalculator.App  `

## Distribution

Most java applications are distributed using `.jar` (Java Archive) files <br>
Make sure you have a Main class within the application

To buld a `.jar` file
- Compile your project <br> `javac <filePath>\<MainClass>.java`
- Create a JAR file <br> `jar cvfe <jarName>.jar <MainClass> <MainClass>.class`

To execute the `.jar` file <br>
`java -jar <jarName>.jar`

## Extras (VSCode Specifics)

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
