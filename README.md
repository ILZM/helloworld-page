# helloworld-page

Download the project on your machine

- git clone https://github.com/ILZM/helloworld-page.git <br/>
or <br/>
- download and unzip manually

Go the project folder </br>
- cd helloworld-page

To run the project
- gradle bootRun <br/>
or <br/>
- gradlew bootRun

Proceed to *http://localhost:8080* in a browser and you can see the text taken from database

To change the text go to *src/main/resources/data.sql* and change the first tuple

To pack into a jar file
- gradle bootRepackage
or
- gradlew bootRepackage

You can find the executable file in *../helloworld-page\build\libs* 