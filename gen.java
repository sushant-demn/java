import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Generic_pract_7<T> {
   private List<Integer> integerList = new ArrayList();
   private List<String> stringList = new ArrayList();

   public Generic_pract_7() {
   }

   public void addInt(Integer var1) {
      this.integerList.add(var1);
   }

   public void addString(String var1) {
      this.stringList.add(var1);
   }

   public int countEven() {
      int var1 = 0;
      Iterator var2 = this.integerList.iterator();

      while(var2.hasNext()) {
         Integer var3 = (Integer)var2.next();
         if (var3 % 2 == 0) {
            ++var1;
         }
      }

      return var1;
   }

   public int countOdd() {
      int var1 = 0;
      Iterator var2 = this.integerList.iterator();

      while(var2.hasNext()) {
         Integer var3 = (Integer)var2.next();
         if (var3 % 2 != 0) {
            ++var1;
         }
      }

      return var1;
   }

   public int count_palindromes() {
      int var1 = 0;
      Iterator var2 = this.stringList.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         if (this.ispalindrome(var3)) {
            ++var1;
         }
      }

      return var1;
   }

   private boolean ispalindrome(String var1) {
      StringBuilder var2 = new StringBuilder(var1);
      return var1.equals(var2.reverse().toString());
   }

   public void displayInt() {
      System.out.println("Integer List: " + this.integerList);
   }

   public void displaystr() {
      System.out.println("String List: " + this.stringList);
   }

   public static void main(String[] args) {
      Generic_pract_7 var1 = new Generic_pract_7();
      Scanner var2 = new Scanner(System.in);
      int var3 = 0;

      while(true) {
         label44:
         while(var3 != 10) {
            System.out.println("Select from the choices below: \n 1. Enter Integer list: \n 2. Enter String List: \n 3. Display numbers in the integers list:\n 4. Display Strings in the StringList: \n 5. count Even numbers in the Intlist \n 6. Count Odd numbers in the Intlist \n 7. count Number of Palindromes in the StringList \n10. Exit\n");
            var3 = var2.nextInt();
            String var4;
            switch (var3) {
               case 1:
                  System.out.println("Enter Integers (Type 'done' to finish): ");

                  while(true) {
                     var4 = var2.nextLine();
                     if (var4.equalsIgnoreCase("done")) {
                        continue label44;
                     }

                     try {
                        int var5 = Integer.parseInt(var4);
                        var1.addInt(var5);
                     } catch (NumberFormatException var6) {
                        System.out.println("Invalid input, Please enter a valid number. ");
                     }
                  }
               case 2:
                  System.out.println("Enter Strings (Type 'done' to finish): ");

                  while(true) {
                     var4 = var2.nextLine();
                     if (var4.equalsIgnoreCase("done")) {
                        continue label44;
                     }

                     var1.addString(var4);
                  }
               case 3:
                  var1.displayInt();
                  break;
               case 4:
                  var1.displaystr();
                  break;
               case 5:
                  System.out.println("The count of the Even numbers is: " + var1.countEven());
                  break;
               case 6:
                  System.out.println("The count of the Odd numbers is: " + var1.countOdd());
                  break;
               case 7:
                  System.out.println("The count of the Palindromes is: " + var1.count_palindromes());
            }
         }

         return;
      }
   }
}
