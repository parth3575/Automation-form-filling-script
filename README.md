# Selenium WebDriver Practice Form Automation

This Java project demonstrates the automation of a web form using Selenium WebDriver. The script interacts with the web form on the "http://demoqa.com/automation-practice-form/" page and fills in various input fields with predefined data.

## Prerequisites

Before running this Selenium WebDriver automation script, ensure you have the following set up:

1. **Java Development Kit (JDK)**: Install JDK on your system.

2. **Selenium WebDriver**: Download and set up Selenium WebDriver. In this script, Chrome WebDriver is used, so make sure to have the Chrome WebDriver executable (`chromedriver.exe`) and set its path appropriately.

3. **Integrated Development Environment (IDE)**: Use an IDE such as Eclipse or IntelliJ IDEA to write and execute Java code.

4. **Web Browser**: Ensure Google Chrome is installed on your system as this script is configured to work with Chrome.

## How to Run

Follow these steps to run the Selenium WebDriver automation script:

1. Clone this repository or download the Java file (`PracticeForm.java`) from this project.

2. Open the Java file in your preferred IDE.

3. Ensure the correct path to the Chrome WebDriver executable is set in the `System.setProperty` method:

   ```java
   System.setProperty("webdriver.chrome.driver", "E:\\ToolsQA\\SQA_drivers\\chromedriver.exe");
   ```

   Replace `"E:\\ToolsQA\\SQA_drivers\\chromedriver.exe"` with the path to your `chromedriver.exe` file.

4. Run the `main` method within the `PracticeForm` class.

5. The automation script will open a Chrome browser, navigate to the web form, and automatically fill in the form fields.

6. Observe the script's execution in the browser.

7. Once the script completes, it will close the browser window.

## Features

- Fills out a web form with predefined data.
- Interacts with input fields, radio buttons, checkboxes, file upload, and dropdowns.
- Demonstrates different methods for interacting with web elements using Selenium WebDriver.
- Provides a practical example of automating form submissions for testing or data entry purposes.

## Web Form Elements Covered

The automation script interacts with various web form elements:

- Text fields for entering first name, last name, and email.
- Radio buttons for selecting gender.
- A phone number field.
- A date of birth field.
- An input field for subjects.
- Checkboxes for selecting hobbies.
- A file upload field.
- A text area for entering the address.
- Dropdowns for selecting state and city.
- A submit button to submit the form.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

Feel free to adapt and modify the script to automate other web forms as needed for your testing or automation purposes.
