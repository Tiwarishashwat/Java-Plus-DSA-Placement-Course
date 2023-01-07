
# Data Types ->
# Primitive data types - includes byte, short, int, long, float, double, boolean and char.
A primitive data type specifies the size and type of variable values, 
and it has no additional methods.

Data Type	Size	Range
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values

Non-primitive data types - such as String, Arrays and Classes 
we will take about it as course progresses!

Java Packages?
A java package is a group of similar types of classes, interfaces and sub-packages.
Package in java can be categorized in two form, built-in package and user-defined package.
There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

To create a class file in same package
javac -d . Shashwat.java  

To create a class file in different package

javac -d ../bin Shashwat.java

More on java packages after we discuss OOPs concepts!