import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");
            String input = scanner.nextLine();
            String[] data = input.split(" ");
            if (data.length != 6) {
                throw new IllegalArgumentException("Введено неверное количество данных. Ожидается 6 полей.");
            }

            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String dateOfBirth = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);
    

            if (!isValidDate(dateOfBirth)) {
                throw new IllegalArgumentException("Неверный формат даты рождения. Ожидается dd.MM.yyyy.");
            }
            if (!isValidGender(gender)) {
                throw new IllegalArgumentException("Неверный формат пола. Ожидается символ 'm' или 'f'.");
            }

            String fileName = surname + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(surname + " " + name + " " + patronymic + " " + dateOfBirth + " " + phoneNumber + " " + gender);
            writer.newLine();
            writer.close();

            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат номера телефона. Ожидается целое число без форматирования.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }    

        private static boolean isValidDate(String date) {
            // Проверка формата даты рождения (dd.mm.yyyy)
            String[] parts = date.split("\\.");
            if (parts.length != 3) {
                return false;
            }
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            return day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1800 && year <= 9999;
        }
    
        private static boolean isValidGender(char gender) {
            // Проверка формата пола (f или m)
            return gender == 'f' || gender == 'm';
        }
                
}
