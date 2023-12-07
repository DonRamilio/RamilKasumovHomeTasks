import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * 4. Создай класс со следующим содержимым: (СМ. СКРИНШОТ)
 * 4.1. Необходимо узнать средний возраст студентов мужского пола;
 * 4.2. Кому из студентов грозит получение повестки в этом году при условии, что призывной возраст установлен в диапазоне от 18 до 27 лет;
 */
public class Students {
  private static Collection<Student> students = Arrays.asList(
          new Student("Дмитрий", 17, Gender.MAN),
          new Student("Максим", 20, Gender.MAN),
          new Student("Екатерина", 20, Gender.WOMAN),
          new Student("Михаил", 28, Gender.MAN));

  public static void main(String[] args) {
    var avgManAge = students.stream().filter(s -> s.gender == Gender.MAN).mapToInt(s -> s.age).average().orElse(0);
    var militaryConscriptionStudents = students.stream()
            .filter(s -> s.gender == Gender.MAN && s.age >= 18 && s.age < 27)
            .collect(Collectors.toList());
  }

  private enum Gender {
    MAN,
    WOMAN
  }

  private static class Student {
    private final String name;
    private final Integer age;
    private final Gender gender;

    public Student(String name, Integer age, Gender gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
    }

    public String getName() {
      return name;
    }

    public Integer getAge() {
      return age;
    }

    public Gender getGender() {
      return gender;
    }

    @Override
    public String toString() {
      return "{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Student)) {
        return false;
      }
      Student student = (Student) o;
      return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, age, gender);
    }
  }
}
