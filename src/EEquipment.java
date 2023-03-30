public enum EEquipment {
    КУПАЛЬНЫЙКОСТЮМ(0),
    КОСМИЧЕСКИЙКОСТЮМ(90),
    ПРОФЕССИОНАЛЬНЫЙКОСТЮМ(100);

    protected int levelOfProtection;
    EEquipment(int levelOfProtection) {
        this.levelOfProtection = levelOfProtection;
    }
}
