# Secure_Pseudo_Queue


Clone the Application from : https://github.com/adityaraj111/Secure_Pseudo_Queue.git


## Create Database in MySQL

Database name : fakeQueue
SQL Query : `create database fakeQueue`

## Instruction for Setting up the Application

* Launch the eclipse and import the provided project. Now you can see a project in your Eclipse Project explorer.
* Right click on project → Maven → Update Project… → Check the box “Force Update of Snapshots/Releases” → Click on OK.
* Modify database credentials and connection url in application.properties file if required.
* Execute the provided table scripts in src/main/resources folder.
* Run the application.  
* Sender API: http://localhost:8080/transaction/sender
* Receiver API: http://localhost:8080/transaction/receiver



![testing_api](https://user-images.githubusercontent.com/44642169/160917670-b647a282-beae-47ad-8676-7f636a2b57cc.png)
