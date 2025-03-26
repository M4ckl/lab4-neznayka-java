import java.util.Random;

public class APerson implements IMove, IGetters, ICheckTruth {
    public String name;
    public String status;

    public APerson(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFeature() {
        return status;
    }

    @Override
    public void changeLocation() {
        if (getFeature().equals("Other")) {
            System.out.println(getName() + " will remain in " + ELocation.CAVE + ".");
        }
        else {
            System.out.println(getName() + " will go to " + ELocation.RETURNJOURNEY + ".");
        }
    }

    @Override
    public void talk() {
        System.out.println("says. ");
    }

    @Override
    public void seeAbout() { System.out.print(name + "looked at it. "); }

    @Override
    public void checkTruth(ACosmicThings planet1, ACosmicThings planet2) {
        if (Integer.parseInt(planet1.getFeature()) > Integer.parseInt(planet2.getFeature())){
            System.out.println("All the facts are true.");
            System.out.println("There is a possibility to " + EAbilities.READ + ", " + EAbilities.WRITE + ", " + EAbilities.DRAW + ", " + EAbilities.D0OTHERTHINGS + ".");
        }
        else {
            System.out.println("All the facts are lies.");
        }
    }
    //статичный класс определяющий правла или ложь чувтсва
    static class TrueFalseFeelings {
        public String setFeeling(String feeling) {
            return feeling;
        }
    }
    TrueFalseFeelings tff = new TrueFalseFeelings();
    public void checkProtectionOfEquipment() {

        //локальный класс с методом рандом выбирает костюм
        class LocalClassRandom {
            EEquipment randomSuit() {
                EEquipment [] suits = {EEquipment.PROFESSIONALCOSTUME, EEquipment.SPACESUIT , EEquipment.BATHINGSUIT};
                Random rand = new Random();
                EEquipment result = suits[rand.nextInt(3)];
                return result;
            }

        }
        LocalClassRandom resultEquipment = new LocalClassRandom();
        EEquipment CurrentProtection = resultEquipment.randomSuit();

        //выдача ошибки если купальный костюм
        if (CurrentProtection == EEquipment.BATHINGSUIT) {
            throw new DeathError("It is impossible to survive in " + EEquipment.BATHINGSUIT + " due to exposure to cosmic rays. ");
        }
        else {
            System.out.println(tff.setFeeling("According to my feelings ")+ getName() + " felt like he was in " + CurrentProtection + " very safe. ");
        }
    }

}
