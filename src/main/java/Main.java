/**
 * 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
 * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
 * MyArrayDataException и вывести результат расчета.
 */
public class Main {

  public static void main(String[] args) {

    String[][] twoDimArray = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"8", "7", "6", "5"}, {"4", "3", "2", "1"}};
    // int [][] twoDimArray = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}, {4,5,6,7}};
    try {
      try {
        int result = calculateSum(twoDimArray);
        System.out.println("Сумма: " + result);
      } catch (MyArraySizeException e) {
        System.out.println("Размер массива превышен!");
      }
    } catch (MyArrayDataException e) {
      e.printStackTrace();
    }
  }


  public static int calculateSum(String[][] twoDimArray) throws MyArraySizeException, MyArrayDataException {
    int sum = 0;
    int desiredArrLength = 4;
    int outerArrayLength = twoDimArray.length;
    if (outerArrayLength != desiredArrLength) {
      throw new MyArraySizeException();
    }
    for (int i = 0; i < outerArrayLength; i++) {
      int innerArrayLength = twoDimArray[i].length;
      if (innerArrayLength != desiredArrLength) {
        throw new MyArraySizeException();
      }
      for (int j = 0; j < innerArrayLength; j++) {
        try {
          sum += Integer.parseInt(twoDimArray[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException(String.format("Не удалось преобразовать элемент в ячейке (%d;%d)", i, j));
        }
      }
    }
    return sum;
  }

}