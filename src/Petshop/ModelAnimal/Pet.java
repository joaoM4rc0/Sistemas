package Petshop.dominio;

public class Pet {
    private String name;
    private String raca;


    public static final class PetBuilder {
        private String name;
        private String raca;

        public static PetBuilder Pet() {
            return new PetBuilder();
        }

        public PetBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PetBuilder raca(String raca) {
            this.raca = raca;
            return this;
        }

        public Pet build() {
            Pet pet = new Pet();
            pet.name = this.name;
            pet.raca = this.raca;
            return pet;
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}