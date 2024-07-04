# 100_day_code

*There are two types of datatypes*

1. primitive : The one which is already define in java

    a. byte : 1 byte
        byte a = 5
    b. short : 2 bytes
    c. char : 2 bytes
        char b = 'A'
    d. boolen : 1 byte  
        boolean c = true    
    e. int : 4 bytes
    f. long : 8 bytes
    g. float : 4 bytes
    h. double : 8 bytes
    
2. non-premitive : The one is made by us.
    
    a. String
    b. Array
    c. Class
    d. Object
    e. Interface
---------------------------------------------------------------------
*Type Conversion*

Conversion happen when:

1. type compatible
2. destination type > source type

Example: byte>short>int>float>long>double

*Type casting*
When we forcefully convert any number into any other datatype
    float a = 19.0;
    int b = (int) a;

---------------------------------------------------------------------
*Operators*
1. Arithmetic operators
    Binary : + - * / %
    Unary : ++ --
2. Relational operators
    == != > < >= <=
3. logical operators
    && || !
4. Bitwise operators
5. Assignment operators
    = += -= *= /=
---------------------------------------------------------------------
*Conditional Statement*
1. if
2. else if
3. ternary operator
    ex: int a = (5>4)?5:4;
4. Switch statement
    ex: switch(condition){
        case 1 : System.out.println("x");
            break;
        case 2 : System.out.println("y");
            break;
        case 3 : System.out.println("z");
            break;
        default : System.out.ptintln("xyz");
    }
---------------------------------------------------------------------
*Loops*
1. while
2. for loop
3. do while loop
---------------------------------------------------------------------
*Functions in Java*
1. parameters are after function name inside the ().
    ex: public static void cal(int a int b)

2. When we define a function the parameters are know as formal parameters. 

3. When we call the function the parameters are known as actual parameters.

4. Java always calls by value.

5. There are two types of function in Java 
    a. Inbuilt 
        ex: Math, nextInt(),...
    b. Userdefined 
        ex: factor, sum,..

6. how can we do function overloadin in Java.
   a. We can have to different formal parameters.
   b. We can more formal parameters in different functions.

7. There are different types of scope in java
    a. Function/method scope
        ex: 
        public static void sum(int a int b){
            int sum= a+b;
        }
        public static void main(String args[]){
            int a =10;
        }
    b. block scope
        ex: 
        public ststic void main(String args[]){
            for(int a=1; a<=2; a++){
                System.out.println(a);
            }
            System.out.println(a); // THIS IS WRONG
        }
