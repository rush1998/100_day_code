# 100_day_code

*There are two types of datatypes*

1. primitive : The one which is already define in java

    - byte : 1 byte
        - ex:byte a = 5
    - short : 2 bytes
    - char : 2 bytes
        - ex:char b = 'A'
    - boolen : 1 byte  
        - ex:boolean c = true    
    - int : 4 bytes
    - long : 8 bytes
    - float : 4 bytes
    - double : 8 bytes
    
2. non-premitive : The one is made by us.
    
    - String
    - Array
    - Class
    - Object
    - Interface
---------------------------------------------------------------------
*Type Conversion*

Conversion happen when:

1. type compatible
2. destination type > source type

- Example: byte>short>int>float>long>double

---------------------------------------------------------------------
*Type casting*
When we forcefully convert any number into any other datatype
    - float a = 19.0;
    - int b = (int) a;

---------------------------------------------------------------------
*Operators*

1. Arithmetic operators
    - Binary : + - * / %
    - Unary : ++ --
2. Relational operators
    - == != > < >= <=
3. logical operators
    - && || !
4. Bitwise operators
5. Assignment operators
    - = += -= *= /=
---------------------------------------------------------------------
*Conditional Statement*

1. if
2. else if
3. ternary operator
    - ex: int a = (5>4)?5:4;
4. Switch statement
    - ex: switch(condition){
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
    - ex: public static void cal(int a int b)

2. When we define a function the parameters are know as formal parameters. 

3. When we call the function the parameters are known as actual parameters.

4. Java always calls by value.

5. There are two types of function in Java 
    -  Inbuilt 
        - ex: Math, nextInt(),...
    -  Userdefined 
        - ex: factor, sum,..

6. how can we do function overloadin in Java.
   -  We can have to different formal parameters.
   -  We can more formal parameters in different functions.

7. There are different types of scope in java
    - Function/method scope
        - ex: 
        public static void sum(int a int b){
            int sum= a+b;
        }
        public static void main(String args[]){
            int a =10;
        }
    - block scope
        - ex: 
        public static void main(String args[]){
            for(int a=1; a<=2; a++){
                System.out.println(a);
            }
            System.out.println(a); // THIS IS WRONG
        }
---------------------------------------------------------------------
*Binary to Decimal* 

- Ex: 101 to 5

1 0 1                          //Binary number
1(2*2) + 0(2*1) + 1(2*0) = 5   // This is how we can convert to Decimal number

while(bin<0){
    int pow = 0;
    int dec = 0;
    last=bin%10;
    int dec = dec + (last*((Int)Math.Pow(2,pow)));
    pow++;

    bin=bin/10;
}

---------------------------------------------------------------------
*Decimal to Binary*

- Ex: 7 to 111

2|7 - 1 //remainder 
2|3 - 1 //remainder
2|1 - 1 //remainder
2|0

while(num<0){
    int pow = 0;
    int dec= 0;

    last = num%2;
    int bin = dec + (last * ((int)Math.pow(10,pow)));
    pow++;

    num = num/2;
}

---------------------------------------------------------------------
*Array in JAVA*

List of element of same type which is placed in contiguous memeory is know as array.

1. Operation in Arrays
    - Create 
        - ex: int example[] = new int[10];
        - ex: int example[] = {1,2,3};
    -  Input
    -  Output
    -  Update
     - ex: input, output and update <br>
                int marks[] = new int [50];
                Scanner sc= new Scanner(System.in);

                marks[0] = sc.nextInt();
                marks[1] = sc.nextInt();
                marks[2] = sc.nextInt();

                System.out.println("length is" + marks.length);
                System.out.println("Phy " + marks[0]);
                System.out.println("Chem " + marks[1]);
                System.out.println("Math " + marks[2]);

                marks[2] = 98;
                System.out.println("Updated Math marks is " + marks[2]);

                int per = (marks[0]+marks[1]+marks[2])/3;
                System.out.println("Per is " + per + "%");

2. Linear search : 
- Time complexicity in this algorithm is O(n). =>> **Linear.java**

3. Binary Search : 
- Remeber the dictionary 
- There is a mid, start and end which goes into a loop and finds out the key.
- The time complexity is log n. =>> **Binary.java**

4. prefix array: 
- Take an example of max subarray sum 
- Where in we need to create a prefix array rather then creatind a sub loops as a traditional method.
- formula: prefix[end]-prefix[start-1] =>> **Subarrpre.java**

5. Kadanes algorithm: 
- When there is a negetive number in an Array and we need to find a sum of max subarray then suppose that all negetive numbers in the arrag are **0**. =>> **Kadanes.java** 

6. Trapping Rainwater algorithm: 
- Find the total area of water trapped in the bar.
- Formula 1 : area = (waterlevel-barheight)*width
- Formula 2 : Waterlevel = min(maxL,maxR) =>> **Tr.java**

---------------------------------------------------------------------
*Sorting algorithm*

1. Bubble sort: 
- The largest number in the array will come to the end by swapping the other element in the array. =>> **Bubble.java** 
2. Selection sort: 
- Pick the smallest element in from the array amnd push it to the beginning. =>> **Selection.java**
3. Insertion sort: 
- Pick an element from unsorted part and put it in the right position in sorted part. =>> **Insertion.java**
4. Counting sort : 
- We can use this shorting algo for small numbers where the array range can be big but the numbers in the array are small for example arr[] = {1,3,4,6,2,3,4,7,4,5}; arr[10] but range is 1 to 7; **Count.java**
5. Inbuilt sort function: 
- Array.sort.(arr); also Array.sort.(arr,0,3); also is you want to convert into decending order then you need to use Array.sort(arr,Collection.reverseOrder());

---------------------------------------------------------------------
*2D array*

- There are rows and columns in 2D arrays. 
- rows= horizontal direction and column= vertical direction.

1. Spiral matrix: **Spiral.java**
2. Diagonal sum: **Diagonal.java**
3. Sorted matrix: **Sorted2d.java**
---------------------------------------------------------------------
*Strings*

- Strigs are **immutable**.
- How do define string in Java 
    - String str = "abc";
    - String str2 = new String("abc");
- If you want to compare two string we can have an object name Sting1.equals.Sting2
    - Ex: **compstr.java**
- There is a inbuilt sumction to find out the substring of any string *variablename.substring(Start,End);*
    - Ex: **substr.java**
- How to find largest string Lexicographically Ex: **largeststr.java**
- StringBuilder is a tool in Java that allows you to build and modify strings (words or sentences) efficiently. It’s like a set of building blocks where you can add, change, or remove pieces easily without creating a new set of blocks every time(Strings).
---------------------------------------------------------------------
*Bit-wise operators*

we need to remember the decimal to binary of  **1 to 7**
which is 
<tr>dec</tr>
<tr>bin</tr>
<td>0 - 000</td>
<td>1 - 001</td>
<td>2 - 010</td>
<td>3 - 0011</td>
<td>4 - 100</td>
<td>5 - 101</td>
<td>6 - 110</td>
<td>7 - 111</td>

- Binary AND & 
    - 1 0 - 0
    - 0 1 - 0
    - 0 0 - 0
    - 1 1 - 1
- Binary OR |
- Bitwise XOR ^
- Bitwise one's complement ~
- Bitwise left shift <<
- Bitwise right shift >>
- 