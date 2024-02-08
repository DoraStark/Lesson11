public class User {

   public final String NAME;
    public final int DAY;
    public final int MONTH;
    public final int YEAR;
    public final String EMAIL;

    public final String PCODE="+380";
    public final long PHONENUMBER;


    public String surname;
    public double weight;
    public int stepsPerDay;
    public double pressure;

    public int currentYear=2020;

   private int age;


    public User(String name, String surname, double weight, int stepsPerDay, double pressure, int day, int month, int year, String email, long phoneNumber) {
        this.NAME = name;
        this.surname = surname;
        this.DAY = day;
        this.MONTH = month;
        this.YEAR = year;
        this.age=currentYear-year;
        this.weight = weight;
        this.stepsPerDay = stepsPerDay;
        this.pressure = pressure;
        this.EMAIL = email;
        this.PHONENUMBER = phoneNumber;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public void setStepsPerDay(int stepsPerDay) {

        this.stepsPerDay = stepsPerDay;
    }

    public void setPressure(double pressure) {

        this.pressure = pressure;
    }

    public int getAge() {

        return age;
    }

    public void printAccountInfo() {
        System.out.println("Ім'я: " + NAME + "\n" +
                "Прізвище: " + surname + "\n" +
                "Дата народження: " + DAY + "." + MONTH + "." + YEAR + "\n" +
                "Вік: " + getAge() + "\n" +
                "Емейл: " + EMAIL + "\n" +
                "Телефон: " + PCODE + PHONENUMBER + "\n" +
                "Вага: " + weight + "\n" +
                "Тиск: " + pressure + "\n" +
                "Пройдено кроків за день: " + stepsPerDay + "\n");
    }

}





