
Basic template for a Cucumber - Selenium - Eclipse project


I wanted to test drive selenium with cucumber. In the process I installed plugins, configured POM and thought I can document it all to share it along. 

## Getting Started


### Prerequisites

- Eclipse IDE 
- Knowledge to install plugins in Eclipse 


### Installing

#### Cucumber Plugin For Eclipse

```
Install Cucumber plugin from : https://cucumber.io/cucumber-eclipse/update-site
```

And Clone this project and open it in Eclipse.

## Running the tests

Once you have the project in your Eclipse IDE with no errors, Select Menu :

```
  Run -> Run Configurations -> Cucumber Feature
```
Double click on Cucumber Feature on the left, it will create a default Run configuration with the 'ClonesSimpleFeature'
that you can run.

- It will open the CLONES website
- It will click open the 'Training' link.
- And Click the training material
- Display the PDF.

## How to follow the code

### Start with the Features/ClonesSimple.feature

In ClonesSimple.feature, you can see that the steps of the tests are captured in simple English. The words in quotes are parameters and they are parsed using reg-exp.

### Next : ClonesSimpleSteps.java

In here, all the simple English sentences in the above feature is annotated and matched to a java function. (Regular expressions determine what are parameters in the those sentences ) . 

This class uses the Selenium functions defined in the WebSeleniumFunctions class.

Do not worry about reg-exp. When you define these sentences, run them without implementing them, cucumber will spit out the method you have to implement.


### Next : WebSeleniumFunctions.java

Here it is purely Selenium functionality. I downloaded the chrome driver and put it in seleniumdrivers directory.

Please go through the comments I have in the code.






