/*
 Реализовать сохранение данных в csv файл; Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:
Строка заголовок с набором столбцов
Набор строк с целочисленными значениями
Разделитель между столбцами - символ точка с запятой (;)

(Пример см. на скриншоте)
Для хранения данных использовать класс вида:
public class AppData {
   private String[] header;
   private int[][] data;
   // ...
}
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
*/

import java.io.*;

public class ReadCVS {
  private final String[] header;
  private final int[][] data;

  public ReadCVS(String[] header, int[][] data) {
    this.header = header;
    this.data = data;
  }

  public static ReadCVS load(String filePath) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String headerLine = reader.readLine();
      String[] header = headerLine.split(";");

      int numColumns = header.length;

      String line;
      int numRows = 0;

      while ((line = reader.readLine()) != null) {
        numRows++;
      }

      try (BufferedReader dataReader = new BufferedReader(new FileReader(filePath))) {
        dataReader.readLine();

        int[][] data = new int[numRows][numColumns];
        int rowIndex = 0;

        while ((line = dataReader.readLine()) != null) {
          String[] values = line.split(";");
          for (int i = 0; i < numColumns; i++) {
            data[rowIndex][i] = Integer.parseInt(values[i]);
          }
          rowIndex++;
        }

        return new ReadCVS(header, data);
      }

    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static void main(String[] args) {
    // Пример использования
    String[] header = {"Value 1", "Value 2", "Value 3"};
    int[][] data = {
            {100, 200, 123},
            {300, 400, 500}
    };

    ReadCVS appData = new ReadCVS(header, data);

    appData.save("data.csv");

    ReadCVS loadedData = ReadCVS.load("data.csv");

    for (String columnHeader : loadedData.header) {
      System.out.print(columnHeader + "\t");
    }
    System.out.println();

    for (int[] rowData : loadedData.data) {
      for (int cellData : rowData) {
        System.out.print(cellData + "\t");
      }
      System.out.println();
    }
  }

  public void save(String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
      // Записываем заголовок
      for (String columnHeader : header) {
        writer.write(columnHeader + ";");
      }
      writer.newLine();

      for (int[] rowData : data) {
        for (int cellData : rowData) {
          writer.write(cellData + ";");
        }
        writer.newLine();
      }

      System.out.println("Данные успешно сохранены в файл: " + filePath);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
