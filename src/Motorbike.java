public class Motorbike {

    int age = 7;

    int power = 12;

    int turbo = 20;

    int getAge() {
        return age;
    }

        int calculateIndex() { return power * 10 + turbo; }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }

}
