# HomaPay-Project

In this project, I have tried to implement the object oriented version of shopping cart using Java programming language.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

I used an in-memory database named H2 which is really simple to install and run.
You can find a good description of it here:
https://en.wikipedia.org/wiki/In-memory_database
for further toturials and installation manual, visit here:
https://www.tutorialspoint.com/h2_database/index.htm

Also you need Java JDK to be installed on your machine.
use these commands to verify java and javac instalation:
```
java -version
javac -version
```
Oterwise, follow the instruction here to install them.
* [JDK Installation](https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html)

## Running the tests

First the program shows the options which the customer can choose from.
```
Welcome to our shop. Please choose the product that you want to buy:
1. Monitor	350$
2. Television	800$
3. Keyboard	100$
4. Mouse	50$
5. Laptop	1000$
```
He only needs to enter number of the product that he wants.
```
1
```
then another question will pop up and will ask the customer to enter the amount of that product.
```
How many Monitor do you want?
```
the user should input the amount:
```
2
```
after this, the product that was chosen will be eliminated from products list and menu containing the other products will show up again and will ask for user input.
Finally, when a user choose option 0 which is "finish", the summary of user purchases beside tha total cost will be shown. It is worth mentioning that discount or tax will decrease or increase the final cost that the user needs to pay. 

```
Summary of the purchase is:
-------------------------------------------
Name     In      Amount     Cost
Monitor     350$     2     700
Keyboard     100$     3     300
The total cost is: 900.0
```

## Built With

* [eclipse](https://www.eclipse.org/) - IDE used
* [H2](http://www.h2database.com/html/main.html) - Database


## Authors

* **Mehrdadscomputer** - *Initial work*


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* to the interviewer
