# Caesar Cipher

#### The following is an implementation of the Caesar Cipher named after the famous Julius Caesar. It is a type of substitution cipher in which each letter in the plaintext is replaced by some other letter some fixed number of positions down the alphabet. For example, with a right shift of 3, A would be replaced by D, B would become E, and so on. 

#### By Shadrack Adwera

## Description

The [ASCII code](http://www.asciitable.com/) was used to find the position of a letter in the alphabet by taking its ASCII position and subtracting the position of letter 'a'(97) from it then shifting the character, applying a modulus of 26 then adding the ASCII value of 'a' to find positioning of the new character. A StringBuilder object has been used as opposed to a String object due to the ability of a StringBuilder to be modified.

## Setup/Installation Requirements

* You need to install the [Java SDK](https://sdkman.io/install) in order to create Java applications and the [Java Runtime Environment](https://sdkman.io/usage) which provides the requirements for executing a Java application.
* The code can be run on any java IDE: NetBeans, IntelliJ IDEA, Eclipse etc
* An online Java editor and IDE can also be used such as: [REPL it](https://repl.it/languages/java10)

## Coded Specs

|   TEST                                                   | RESULT                     |
|:--------------------------------------------------------:| :-------------------------:|
| Constructor instantiates correctly                       | True                       |
| Getter method defined stores the plain text              | Returns a String value     |
| Getter method defined stores the shift value             | Returns an integer value   |
| Method shifts text forward: input "hello"                | Returns "khoor"            |
| Method to shift text backwards(decipher): input "khoor"  | Returns "hello"            |

 

## Known Bugs

* The program terminates on submission of a value that is not an integer when prompted to enter a shift value.

## Technologies Used

* IntelliJ IDEA

## Support and contact details

Feel free to contribute to the project by:

* Forking the repo
* Create a new branch (git branch my-contribution)
* Move to your branch (git checkout my-contribution)
* Make the changes in the files
* Add changes to reflect the changes made
* Commit your changes (git commit -m "Added features")
* Push to the branch (git push origin my-contriution)
* Create a Pull Request

Incase of any feedback/comments feel free to contact me at adweshshaddie@gmail.com

### License

#### Copyright (c) 2019 Shadrack Adwera

#### Licenced under the [MIT License](LICENSE)  