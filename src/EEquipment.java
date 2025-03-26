public enum EEquipment {
    BATHINGSUIT(0),
    SPACESUIT(90),
    PROFESSIONALCOSTUME(100);

    protected int levelOfProtection;
    EEquipment(int levelOfProtection) {
        this.levelOfProtection = levelOfProtection;
    }
}
