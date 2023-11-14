# Email sender 

The simple service email-sender reads text files(Logs) and manipulates them depending on the selected command and sends an email depending on the specific command selected by the user.

The files are read from [FileReader](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/FileReader.java), from there depending on the log file you the logs are processеd depending on the criteria for the specific file. After the files in processed it prepares a custom message and sends it to the select email.




## Log 1
[Log file 1](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-1.txt)

[Log 1 manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log1.java)

[Log 1 message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log1Message.java)



## Log 2
[Log file 2](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-2.txt)

[Log 2 manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log2.java)

[Log 2 message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log2Message.java)
