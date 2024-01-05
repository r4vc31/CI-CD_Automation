# CI/CD Automation for SauceDemo Web Application

This project is designed to automate the web application SauceDemo. A new project has been created using Selenium, Java, and TestNG, and it has been configured to launch and test the required webpage on the Chrome browser.

## Test Scenarios

The framework implements the following scenarios, each one as a different test:

1. **Product Purchase**: This scenario follows the complete purchase flow of the page, selecting a random product, adding it to the cart, adding personal data, and verifying that you successfully arrive at the "Thank you for your purchase" page.

2. **Removing items from the shopping cart**: This scenario adds 3 different items to the shopping cart, enters the cart page, removes them, and checks that the shopping cart is empty.

3. **Logout**: This scenario attempts to log out and checks if you are correctly redirected to the login page.

## Test Execution

The tests can be executed using the .xml files available in the `resources` folder. The folder contains four files:

1. Three files for executing each test individually.
2. One file for executing all tests together.

Follow these steps to execute the tests:

1. Navigate to the `resources` folder.
2. To run a specific test, use the corresponding .xml file.
3. To run all tests together, use the .xml file designed for executing all tests.

Please ensure that the appropriate environment and dependencies are set up correctly before running the tests.

## Jenkins Integration

This project includes a `Jenkinsfile` which is ready to be used for pipeline testing on a Jenkins server. This allows for continuous integration and continuous delivery (CI/CD) processes, making it easier to integrate changes to the project, and making it easier to catch bugs and issues early.

To use the Jenkins pipeline:

1. Ensure you have a Jenkins server set up and running.
2. In your Jenkins server, create a new item and select 'Pipeline'.
3. In the 'Pipeline' section of the configuration page, choose 'Pipeline script from SCM'.
4. In the 'SCM' field, choose 'Git'.
5. In the 'Repository URL' field, enter the URL of this project: [https://github.com/r4vc31/CI-CD_Automation.git]
6. Save your changes.
7. Build Now and See the report.

Please note that you may need to adjust these instructions based on your specific Jenkins setup.

![Web capture_5-1-2024_21534_localhost](https://github.com/r4vc31/CI-CD_Automation/assets/114179022/3540f511-c50b-43a1-9c90-f17714ecb8c9)
