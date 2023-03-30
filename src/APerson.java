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
        if (getFeature().equals("Другие")) {
            System.out.println(getName() + " остануться в " + ELocation.ПЕЩЕРЕ + ".");
        }
        else {
            System.out.println(getName() + " пойдет в " + ELocation.ОБРАТНЫЙПУТЬ + ".");
        }
    }

    @Override
    public void talk() {
        System.out.println("говорит. ");
    }

    @Override
    public void seeAbout() { System.out.print(name + " посмотрел. "); }

    @Override
    public void checkTruth(ACosmicThings planet1, ACosmicThings planet2) {
        if (Integer.parseInt(planet1.getFeature()) > Integer.parseInt(planet2.getFeature())){
            System.out.println("Все факты-правда.");
            System.out.println("Есть возможность " + EAbilities.ЧИТАТЬ + ", " + EAbilities.ПИСАТЬ + ", " + EAbilities.РИСОВАТЬ + ", " + EAbilities.ДЕЛАТЬДРУГИЕДЕЛА + ".");
        }
        else {
            System.out.println("Все факты-ложь.");
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
                EEquipment [] suits = {EEquipment.ПРОФЕССИОНАЛЬНЫЙКОСТЮМ, EEquipment.КОСМИЧЕСКИЙКОСТЮМ , EEquipment.КУПАЛЬНЫЙКОСТЮМ};
                Random rand = new Random();
                EEquipment result = suits[rand.nextInt(3)];
                return result;
            }

        }
        LocalClassRandom resultEquipment = new LocalClassRandom();
        EEquipment CurrentProtection = resultEquipment.randomSuit();

        //выдача ошибки если купальный костюм
        if (CurrentProtection == EEquipment.КУПАЛЬНЫЙКОСТЮМ) {
            throw new DeathError("Невозможно выжить в " + EEquipment.КУПАЛЬНЫЙКОСТЮМ + " из-за облучения космическими лучами. ");
        }
        else {
            System.out.println(tff.setFeeling("По своим ощущениям ")+ getName() + " чувствовал себя в " + CurrentProtection + " очень безопасно. ");
        }
    }

}
