public class TrackerMain {

    public static void main(String[] args) {
        User user1 = new User("Daria","D",53.2, 10000, 100.85, 21, 8,1996, "ggg@gmail.com", 675471121);
        user1.printAccountInfo();
        user1.getAge();

        User user2 = new User("Masha", "L",65.2,9500,120.87,29,8,1997,"ka@gmail.com", 986512515);
        user2.printAccountInfo();

        User user3 = new User("Irene", "I", 75.5, 6500, 110.95, 15,9,1980, "ll@gmail.com", 966542133);
        user3.printAccountInfo();

    user1.setWeight(50.1);
    user1.setStepsPerDay(5000);
    user1.printAccountInfo();
    user2.setSurname("Hamilton");
    user2.printAccountInfo();
    user3.setStepsPerDay(3050);
    user3.setPressure(100.89);
    }
}
