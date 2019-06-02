fun main(args: Array<String>)
{

    //variables
    var someVar = "Eric"
    var num1 = 10;
    //type is inferred and cannot swap around

    //dataypes:
    //numbers: byte short int and long
    //float, double
    //strings, boolean, strings
    //arrays, etc

    //specifying datatypes
    var num3: Float = 5.5f; //has to have the f at the end
    var num4: Float; //if not assigning value to var, must init

    num4 = 4.5f;


    //val - another way to init a variable (constant/immutable)
    val num2 = 67;



    //printing a variable
    println(someVar);
    println(num1);
    println(num2);
    println(num3);





    //strings
    var someString = "what up";
    println(someString.length);
    println(someString.get(4)); //returns char at position 4
    println(someString.compareTo("Hello World"));
    //returns changes

    var result = someString.plus(". Go away.");
    //concatenates








}