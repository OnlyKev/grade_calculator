
# Grade Calculator

---
This is a simple Java console application that calculates the final grade based on user inputs for homework, quizzes, and exam scores. The user is required to input the weights and percentages for each category, and the application will calculate and display the final grade.

## Features
- Allows users to input weights for homework, quizzes, and exams.
- Allows users to input the percentage scores achieved in homework, quizzes, and exams.
- Computes the final grade based on the weighted percentages.
- Displays all inputs and the calculated final grade.

## Installation & Setup

1. Clone or download the repository to your local machine.
2. Ensure you have Java JDK installed (version 8 or higher).
3. Navigate to the directory of the project.

## Running the Application

1. Open a terminal and navigate to the project directory.
2. Compile the application:
   ```bash
   javac com/example/calculator/Calculator/Main.java
   ```
3. Run the application:
   ```bash
   java com.example.calculator.Calculator.Main
   ```

## Usage

Once the application is running, follow the instructions provided by the console:

1. Enter the weight for homework (1-100).
2. Enter the weight for quizzes (1-100).
3. Enter the weight for exams (1-100).
4. Enter the percentage score for homework.
5. Enter the percentage score for quizzes.
6. Enter the percentage score for exams.

After entering all the values, the application will process and display:
- Homework weight, quizzes weight, and exam weight.
- Homework percentage, quizzes percentage, and exam percentage.
- The final grade based on the inputs.

### Example

```plaintext
Hello Client, please follow the instructions displayed below to correctly calculate your grade :]

Enter weight for homework (1-100) (eg. %1 - %100 of total weight)
65
Enter weight for quizzes (1-100) (eg. %1 - %100 of total weight)
10
Enter weight for exams (1-100) (eg. %1 - %100 of total weight)
25
-------------------------------------------------------------------
Enter percentage for homework (1-100) (eg. %1 - %100 of total weight)
47
Enter percentage for quizzes (1-100) (eg. %1 - %100 of total weight)
15
Enter percentage for exams (1-100) (eg. %1 - %100 of total weight)
72
-------------------------------------------------------------------

--------------------------33%-PROCESSED-----------------------------

--------------------------66%-PROCESSED-----------------------------

Homework Weight: 0.65
Quizzes Weight: 0.1
Exam Weight: 0.25

Homework percentages: 47.0
Quizzes percentages: 15.0
Exam percentages: 72.0

Final grade: 50.05

--------------------------100%-PROCESSED-----------------------------
```

## Code Structure

- **Calculator.java**: Contains the core logic for weight assignment, grade calculation, and displaying results.
- **Main.java**: Handles user interaction, input collection, and calls the methods from the `Calculator` class to perform the necessary calculations.

## License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Authors

- **Kevin Wahome** - UMass Lowell, Computer Science

---