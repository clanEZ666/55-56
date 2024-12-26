package Baza;

public class Passwords {
    public static void main(String[] args) {

        String[] passwords = {
                "MyPassword123",
                "ffffff66",
                "ShlechtPass",
                "aSdf33",
                "avalanche gt2020"
        };


        for (String password : passwords) {
            String result = validatePas(password);
            System.out.println(result);
        }

    }

    public static String validatePas(String password) {
        StringBuilder examination = new StringBuilder();

        if (password.length() < 8 || password.length() > 20) {
            examination.append("длина должна быть от 8 до 20 символов, ");
        }

        if (!password.matches(".*[A-Z].*")) {
            examination.append("должен содержать хотя бы одну заглавную букву, ");
        }

        if (!password.matches(".*[a-z].*")) {
            examination.append("должен содержать хотя бы одну строчную букву, ");
        }

        if (!password.matches(".*\\d.*")) {
            examination.append("должен содержать хотя бы одну цифру, ");
        }

        if (password.contains(" ")) {
            examination.append("не должен содержать пробелов, ");
        }

        if (examination.length() == 0) {
            return "Пароль \"" + password + "\" соответствует всем требованиям.";
        } else {
            return "Пароль \"" + password + "\" – " + examination.substring(0, examination.length() - 2) + ".";
        }
    }
}
