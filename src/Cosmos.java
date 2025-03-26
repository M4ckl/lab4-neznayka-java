public class Cosmos implements ISky{
    private String skyColor;
    private String stars;
    private String earthShape;

    public Cosmos(ISky sky) {
        this.skyColor = sky.getSkyColor();
        this.stars = sky.getStars();
        this.earthShape = String.valueOf(EForm.FULLCIRCLE);
    }

    @Override
    public String getSkyColor() {
        return skyColor;
    }

    @Override
    public String getStars() {
        return stars;
    }
}
