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
import java.util.ArrayList;
import java.util.List;

public class AppData {
  private final String[] header;
  private final int[][] data;

  public AppData(String[] header, int[][] data) {
    this.header = header;
    this.data = data;
  }

  public static AppData load(String filePath) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String[] headers = reader.readLine().split(";");

      List<String> lines = new ArrayList<>();
      String currentLine;
      while ((currentLine = reader.readLine()) != null) {
        if (!currentLine.isEmpty()) {
          lines.add(currentLine);
        }
      }

      int numColumns = headers.length;
      int numLines = lines.size();
      int[][] data = new int[numLines][numColumns];
      for (int i = 0; i < numLines; i++) {
        int[] numbers = new int[numColumns];
        String[] splitLine = lines.get(i).split(";");
        for (int j = 0; j < splitLine.length; j++) {
          numbers[j] = Integer.parseInt(splitLine[j]);
        }
        data[i] = numbers;
      }

      return new AppData(headers, data);
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static void main(String[] args) {
    // Пример использования
    String[] header = {"Value 1", "Value 2", "Value 3"};
    int[][] data = {{100, 200, 123}, {300, 400, 500}};

    AppData appData = new AppData(header, data);

    appData.save("data.csv");

    AppData loadedData = AppData.load("data.csv");
  }

  public void save(String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
      writer.write(String.join(";", this.header) + ";");
      writer.newLine();

      for (int[] rowData : this.data) {
        if (rowData.length > 0) {
          for (int cellData : rowData) {
            writer.write(cellData + ";");
          }
          writer.newLine();
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
