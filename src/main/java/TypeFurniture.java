public enum TypeFurniture {
    TABLE("стол"),
    CLOSET("шкаф"),
    BED("кровать"),
    CHAIR("стул");

    private String type;

    TypeFurniture(String type) {
        this.type = type;
    }

    /**
     * Перебор и сравнение значений в enum c тем, что ввел пользователь
     * @param typeCustomer тип мебели, который ввел пользователь
     * @return тип мебели
     */
    public static String compareTypes(String typeCustomer) {
        TypeFurniture[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].type.equals(typeCustomer)) {
                ConstructorFurniture.type = values[i].type;
            }
        }
        return ConstructorFurniture.type;
    }
}
