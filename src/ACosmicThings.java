

public abstract class ACosmicThings implements IGetters {
    private final String name;
    private final int size;

    protected ACosmicThings(String name, int size) {
        this.name = name;
        this.size = size;
    }




   public void lookLike() {
       if (Integer.parseInt(getFeature()) < 50 ) {
            System.out.println(getName() + " it looks like " + EForm.SMALLPLATE + ".");
   }
        else {
            System.out.println(getName() + " it looks like " + EForm.LARGEROUNDTRAY + ".");
        }
   }

    public void conditionOfBrightness() {}












    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFeature() {
        return toString();
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

}
