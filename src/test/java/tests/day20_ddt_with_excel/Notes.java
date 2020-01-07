package tests.day20_ddt_with_excel;

public class Notes {
    /*
    Todays is 12/10/2019
Agenda: DDT or Data Driven Testing with Data Provider and Apache POI
    Apache POI it's a java library that helps to work with excel files.
    Why it's important to know this library?
    Excel file is very popular way to store data. It can contains thousands of rows and columns with data. In order to retrieve and inject that data with java we use Apache POI library.
    In testing, excel files are very common for storing test data.
    Excel file can be used as a source of test data in automation.
    ############################
    DDT Data-driven testing is a software testing methodology. The idea is to retrieve test data from outside. We don't want to store test data in variables. Instead, we want to be able to change test data without affecting test script. When application requires testing with multiple data inputs we can use Data Driven Framework.
    What does it mean "Test data hard coded?"
    loginPage.login("storemanager85", "UserUser123");
    instead of this
    loginPage.login(excel.getUsername("storemanager"), excel.getPassword("storemanager"));
    Data Driven Testing - test data drives test
    Test and test data is separately
    Changes in test data shouldn't require changes in code.
####If file name is red, that means file is not staged in git.
In TestNG we can run same test multiple times with @DataProvider. IF we combine data provider with excel file, then we can run same test multiple times with data that is coming from excel file.
If you see "?" next to excel file, probably you don't have any excel program on computer,
or Intellij cannot recognize it yet.
$ - means temp file. When you open excel file, excel will create temp file automatically.
     */



    /*
    	Operations with excel files:
To connect java code with excel files we use Apache POI library. It's an open source library, means that it's free.
Since we cannot open excel file without special decoding, we have to use library that can do it for us.
#To open excel file, we need to do few things:
#first of all, open file through FileInputStream
FileInputStream instream = new FileInputStream("path/to/the/file.xlsx");
#Then, we have to use workbook, to create object of excel file.
Workbook workbook = WorkbookFactory.create(instream);
* Creates the appropriate HSSFWorkbook / XSSFWorkbook from the given InputStream.
We use WorkbookFactory, because it can open both type of excel files .xls (old) and .xlsx (new).
workbook = excel file
# Next step is to open spread sheet, because excel file can have multiple spreadsheets. It's like book can have many pages.
Sheet workSheet = workbook.getSheet("name_off_sheet");
#Then, since excel file it's a table, and table consists of rows and cells, we need open Row first.
Row row = workSheet.getRow(0);
#Every row consists of cells, to get data from row, we need to use Cell
Cell cell = row.getCell(1);
#######################
Because it was my interview question, that's why I started from this.
workbook -> worksheet -> row -> cell
#######################
In test automation, excel files are very popular for storing test data. If we combine excel file with data provider we can do data driven testing. To do so, we have open some file, and return info as 2D array.
We use DataProvider only to execute same test many times with different data sets.
DataProvider is not required to use along with apache poi. It was our tests case, that requires to login many times with different credentials. As many rows in excel spreadsheet, as many times same test will be executed.
java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
If you are trying to read data from map, and key name is wrong, you will get null.
Then, if you are trying to use sendKeys() with null, you will get:
java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
#######################################
One of interview questions is:
Tell me about your framework?
- tools that I use
- design patterns (Page Object Model)
- packages that I have
For TestNG we have video, and for cucumber framework we will have later another story. Since in your resume you will have cucumber or protractor or appium as current project, I don't concentrate on testng framework.
###How to create framework from scratch?
IT's all about tools and design patterns that you want to apply.
Tools: Java, Maven, Selenium WebDriver (for mobile it's appium, for angular applications people use Protractor)
Design Patterns: Page Object Model, Singleton Driver
How do you report: as of now, we use extent report
What type of framework would you choose:
Data Driven + Page Object (Modular) = Hybrid framework.
To start:
- We create maven project
- then we create packages like: pages, tests, utilities, db
- add dependencies
- add driver class, browser utils, config reader...
- add configuration.properties file
- create test base and page base classes
- create login page class
- create smoke test.xml file
Everything complex consists of simple things. Don't be scared of big and complex frameworks.
Most popular questions:
Tell me about yourself
Tell me about your project
Tell me about your day-to-day activity
Tell me about your role and responsibilities
Tell me about your framework
Tell me about your team
Tell me about tools that you use
Usually people ask based on your answers
If you don't know answer: Sorry but I didn't have a chance to work with this, but I am willing to learn!!!
I am super quick learner
Positive thinker
Team player
Cross-functional
     */
}
