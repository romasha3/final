public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int random = (int) ((Math.random() * 41) - 20);
        System.out.println(random);

        System.out.println("Завдання 2");
        int katet1 = 3;
        int katet2 = 4;
        int area;
        int perimeter;
        if (katet1 == 3 && katet2 == 4) {
            area = 5;
            System.out.println("Площа прямокутного трикутника: " + area);
            perimeter = katet1 + katet2 + area;
            System.out.println("Периметр прямокутного трикутника: " + perimeter);
        } else {
            System.out.println("Введені неправильні катети.");

        }
        System.out.println("Завдання 3");
        int num = (int) (Math.random() * 101);
        String numString = String.valueOf(num);
        int count = numString.length();
        System.out.println("Число: " + num);
        System.out.println("Кількість цифр у числі: " + count);
    }
}