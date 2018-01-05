import scala.io.StdIn
object Loops  {

  def main(args: Array[String]){
    //---------------------------------------------------
    println("1.---------------------------------------------------")
    var age=18
    if((age>18) && (age<24))
      println("ELDER")
    else if(age<=18)
      println("YOUNGER")
    println("---------------------------------------------------")
    //---------------------------------------------------

    println("2.---------------------------------------------------")
    var i=0
    do{
      println(i)
      i+=1

    }while(i<10)
    for(i<-1 to 10)
    {
      println(i)
    }
    println("---------------------------------------------------")
    //---------------------------------------------------
    println("3.---------------------------------------------------")

    var RandString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for(i<-0 until RandString.length)
      {
        println(RandString(i))
      }

    println("---------------------------------------------------")
    //---------------------------------------------------

    println("4.---------------------------------------------------")

    var mylist=List(1,2,3,4)
    for(i<-mylist)
      {
        println(i+"th List Item is "+i)
      }

    println("---------------------------------------------------")
    //---------------------------------------------------


    println("5.---------------------------------------------------")

    def printprimes(){
      var list=List(1,2,3,5,7)
      for(i<-list)
        {
          if(i==7)
            return //alternative to break statement
          if(i!=1)
            print(i)// alternative to continue statement
        }


    }
    println("---------------------------------------------------")
    //---------------------------------------------------

    println("6.---------------------------------------------------")

    var no_guests=0
    do{
      //no_guests=readLine.toInt
      no_guests=StdIn.readLine().toInt
    }while(no_guests!=15)


    println("---------------------------------------------------")
    //---------------------------------------------------
    println("7.---------------------------------------------------")

    def getSum(num1:Int=1 , num2:Int=2) :Int={
      return num1+num2

    }
    println(getSum(1,2))

    println("---------------------------------------------------")
    //---------------------------------------------------

    println("8.---------------------------------------------------")

   def factorial(num:BigInt):BigInt={
   if(num<=1)
    return 1
   else
   return num *factorial(num-1)
   }
    println("FACTORIAL OF 3 IS "+factorial(3))

    println("---------------------------------------------------")
    //---------------------------------------------------






  }














}
