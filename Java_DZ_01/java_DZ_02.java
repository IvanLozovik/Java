// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
// каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.
public class java_DZ_02{ 
    public static void main(String[] args) { 
      
        for (int index = 1; index < 1000; index++) {
            int count =0;
            for (int j = 1; j <= index; j++) {
                if (index % j == 0) count++; 
            }
            if (count==2) System.out.println(index);
        }
    }
}