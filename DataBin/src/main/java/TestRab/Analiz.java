package TestRab;

public class Analiz {
    private static String fam;
    public static String[] analizator(String[] str){
        if (str.length != 6) {
            throw new IllegalArgumentException("Ошибка! Неверное количество данных. Введите все требуемые данные.");
        }
        try {
            String Fam = str[0];
            String name = str[1];
            String Otch = str[2];
            String date = str[3];
            long phoneNumber = Long.parseLong(str[4]);
            char gender = str[5].charAt(0);

            // Проверка формата даты рождения
            if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                throw new IllegalArgumentException("Неверный формат даты рождения. Используйте dd.mm.yyyy");
            }

            // Проверка формата номера телефона
            if (phoneNumber < 0) {
                throw new IllegalArgumentException("Неверный формат номера телефона. Введите целое положительное число.");
            }

            // Проверка пола
            if (gender != 'm' && gender != 'f') {
                throw new IllegalArgumentException("Неверный формат пола. Используйте 'm' или 'f'.");
            }
            setFam(Fam);
            return new String[]{name, Otch, date, String.valueOf(phoneNumber), String.valueOf(gender)};

        } catch (NumberFormatException e){
            System.out.println("Ошибка! Неверный формат номера телефона. Введите целое положительное число.");
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return null;
        }
    }

    public static String getFam() {
        return fam;
    }

    public static void setFam(String fam) {
        Analiz.fam = fam;
    }
}
