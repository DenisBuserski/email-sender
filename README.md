# Email sender 

The simple service email-sender reads a text file(Log), depending on the user's command, processes the file content and sends an email for the specified log. 

The files are read from [FileReader](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/FileReader.java), from there depending on the file, the log is processеd following a specific criteria. After a file is processed, a custom message is prepared and sent to the recipient email. All the email configuration(sender, recipient, host and etc.) can be seen [here](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/email/EmailConfiguration.java). In my case I used Outlook, so if you want to configure a different email supplier, you have to change that.

The service can be extended by adding more cases, for other different log files. For each one of them you would need to have the file path, how the log will be processed, what message needs to be prepared and sent.

Below you can find information for the 2 logs the service currently processes:


### Log 1
[Log file 1](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-1.txt)

[Log 1 manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log1.java)

[Log 1 message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log1Message.java)

![Output](https://github.com/DenisBuserski/email-sender/blob/main/log-1.png)


### Log 2
[Log file 2](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-2.txt)

[Log 2 manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log2.java)

[Log 2 message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log2Message.java)

![Output](https://github.com/DenisBuserski/email-sender/blob/main/log-2.png)
