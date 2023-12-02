package zoo.entities.animals;

import zoo.common.ExceptionMessages;

public abstract class BaseAnimal implements Animal{
    private String name;
    private String kind;
    private double kg;
    private double price;

    public BaseAnimal(String name, String kind, double kg, double price) {
        this.setName(name);
        this.setKind(kind);
        this.setKg(kg);
        this.setPrice(price);
    }
    public void setName(String name) {
        if(name == null || name.equals("")){
            throw new NullPointerException(ExceptionMessages.ANIMAL_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        if(kind == null || kind.equals("")){
            throw new NullPointerException(ExceptionMessages.ANIMAL_KIND_NULL_OR_EMPTY);
        }
        this.kind = kind;
    }

    @Override
    public double getKg() {
        return this.kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException(ExceptionMessages.ANIMAL_PRICE_BELOW_OR_EQUAL_ZERO);
        }
        this.price = price;
    }

    @Override
    public abstract void eat();
}

