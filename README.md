# Email sender 

The simple service email-sender reads a text file(Log), depending on the user's command, processes the file content and sends an email for the select log. 

The files are read from [FileReader](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/FileReader.java), from there depending on the log file, the logs are processеd depending on the criteria for the specific file. After a file is processed, a custom message is prepared and sent to the recipient email. All the email configuration(sender, recipient, host and etc.) can be seen [here](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/email/EmailConfiguration.java)






## Log 1
[Log file 1](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-1.txt)

[Log 1 manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log1.java)

[Log 1 message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log1Message.java)



## Log 2
[Log file 2](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-2.txt)

[Log 2 manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log2.java)

[Log 2 message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log2Message.java)
