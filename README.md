# Email sender 

## What does the service do?
The simple service email-sender reads a text file(Log), depending on the user's command, processes the file content and sends an email for the specified log. 

The files are read from [FileReader](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/FileReader.java), from there depending on the file, the log is processеd following a specific criteria. After a file is processed, a custom message is prepared and sent to the recipient email. All the email configuration(sender, recipient, host and etc.) can be seen [here](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/email/EmailConfiguration.java). In my case I used Outlook, so if you want to configure a different email supplier, you have to change that.

The service can be extended by adding more cases, for other different log files. For each one of them you would need to have the file path, how the log will be processed, what message needs to be prepared and sent.

Below you can find information for the 2 logs the service currently processes:


### Log 1
[Log file](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-1.txt)

[Log manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log1.java)

[Log message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log1Message.java)

![Output](https://github.com/DenisBuserski/email-sender/blob/main/log-1.png)


### Log 2
[Log file](https://github.com/DenisBuserski/email-sender/blob/main/src/main/resources/logs-2.txt)

[Log manipulator](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/logmanipulator/Log2.java)

[Log message](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/messagepreparation/Log2Message.java)

![Output](https://github.com/DenisBuserski/email-sender/blob/main/log-2.png)

##


## How to run it on my machine?
To run the service on your machine you would need to clone the repository on you PC and run it via IntelliJ. When this part is done, start the service from [here](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/Application.java). When the program starts you can type "1" or "2" depending on the case you want to check. Keep in mind that in order for the service to send an email you have to modify the [email configuration](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/email/EmailConfiguration.java). If you still have issues receving the email, you might want to check the [properties](https://github.com/DenisBuserski/email-sender/blob/main/src/main/java/org/example/Application.java).
