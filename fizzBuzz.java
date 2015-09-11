public class fizzBuzz {
  public static void main(String[] args) {

    // Ett program som skriver ut heltalen 1-100,
    // - men när talet är jämnt delbart med 3: skriv bara ut Fizz
    // - men när talet är jämnt delbart med 5: skriv bara ut Buzz
    // - men när talet är jämnt delbart med 3 och 5: skriv bara ut FizzBuzz

    // Exempel
    /*
    1
    2
    Fizz
    4
    Buzz
    Fizz
    7
    8
    Fizz
    Buzz
    ...
    */


    // Skriv ut talen 1-100
    for(int i = 1; i <= 100; i++) {

      // Alternativ 1: Börja baklänges...

      // if(i % 15 == 0) {  // i % 3 == 0 && i % 5 == 0
      //   System.out.println("FizzBuzz");
      // } else if (i % 3 == 0) {
      //   System.out.println("Fizz");
      // } else if (i % 5 == 0) {
      //   System.out.println("Buzz");
      // } else {
      //   System.out.println(i);
      // }




      // Alternativ 2: Se på fallen var för sig

      if(i % 3 == 0) {
        System.out.print("Fizz");
      } else

      if (i % 5 == 0) {
        System.out.print("Buzz");
      }

      if( (i % 3 != 0) && (i % 5 != 0) ) {
        System.out.print(i);
      }

      System.out.print("\n");
    }

  }
}
