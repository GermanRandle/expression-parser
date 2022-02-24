# expression-parser
Given some text --- mathematical expression that contains some numbers, variables, arithmetic operations, brackets, etc. Parser uses "recursive descent" method to disassemble the expression. Program has an error handling system. 

## Information
This is a solution for 3 homeworks of "Introduction to programming" course in CT ITMO. Solution was developed by me. Tests were developed by my teacher Georgiy Korneev.

## For running tests
To run test, do these commands:

javac expression/ExpressionTest.java

javac expression/parser/ParserTest.java

javac expression/exceptions/ExceptionsTest.java

java -ea expression/ExpressionTest hard BigDecimal

java -ea expression/parser/ParserTest hard Base Shifts Zeroes

java -ea expression/exceptions/ExceptionsTest hard Shifts PowLog Abs
