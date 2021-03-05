# BasicDockerExecution WITHOUT any docker.bat file
We have 2 commands to setup docker:
1. Creating a hub container: 
## docker run -d -p 4444:4444 --name selenium-hub selenium/hub:latest
2. Linking a chrome container to the hub container:
## docker run -d --link selenium-hub:hub selenium/node-chrome-debug


When the docker has been setup, 
we pass argument "remote" in config.properties file to execute test script in remote.
PS: If we want to runthe script in the remote machine, 
we need to pass the oject of the remotewebDriver(Class) to the Webdriver(Interface).
Webdriver driver= new RemoteWebDriver(new URL(""),cap);

This test script fetches the page title of the website: http://olx.in/

Additional Info:
To check all Containers: docker ps -a 
To remove container : docker system prune -a


