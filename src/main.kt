fun main(){
    nums()
    var t = names(arrayOf("jane","Vero","Crispus","Janitah"))
    println(t)
    drink(4)
    drink(20)
    drink(6)
    numbers()
}
//create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun nums(){
    for (num in  1..100){
        if(num %2!=0)
            println(num)
    }


    }

//2.Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)

   fun names(name:Array<String>):Int{
     var w= 0
       for (v in name){
           if (v.length >5){
               w++
           }
       }
       return  w
   }

//3.You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these decisions,
//printing out the name of the drink each person gets according to their age.
//(2pts)
   fun drink(age:Int){
       if (age < 6){
           println("milk")
       }
    else if (age in 6..15){
        println("fanta")
    }
    if (age > 15){
        println("coca-cola")
    }
   }

//4.Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
  fun numbers(){
      for (nums in 1..100){
          if (nums%3==0 && nums%5==0)
              println("FizzBuzz")
             else if (nums%3==0){
                 println("Fizz")
             }
          else if (nums%5==0){
              println("Buzz")
          }
          else{
              println(nums)
          }


      }
  }