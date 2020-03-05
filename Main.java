package GeekBrains.Lesson2.HW;

import org.w3c.dom.ls.LSOutput;

public class Main {

    static int sumArray ( String[][]  incArray ) {
        int arrSize = 4;
        int resSum = 0;
        String[][] chckArray = new String[arrSize][arrSize];


            for (int i = 0; i < incArray.length; i++) {
                for (int j = 0; j < incArray.length; j++) {

                    try {
                        chckArray[i][j] = incArray[i][j];
                    }
                    catch (ArrayIndexOutOfBoundsException e1) {
                          throw new MyArraySizeException();
                    }

                    try {
                            resSum = resSum + Integer.parseInt(incArray[i][j]);
                    }
                    catch (NumberFormatException e2) {
                            throw new MyArrayDataException();
                    }
                }
            }
        return resSum;
    }

    public static void main(String[] args)   {
        int num = 0;
        int res = 0;
        int incSIze = 4; // 6  Для тестирования исключения  MyArraySizeException
        int a , b ;
        String[][] myArray = new String[incSIze][incSIze];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j <  myArray.length; j++) {
                myArray[i][j] = String.valueOf (num + 1);
                num++;
            }
        }
         myArray [1][1] = "Проверка алгоритма"; // Для тестирования исключения  MyArrayDataException

        try {
             res = sumArray(myArray);
        }

        catch (MyArraySizeException e1) {
            System.out.println(e1.getMessage());

        }
        catch (MyArrayDataException e2) {
            System.out.println(e2.getMessage());
        }
        finally {
            System.out.println("Посчитанный результат:  " + res );
        }

        }

}
