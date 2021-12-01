package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.zoo;

public class Zoo {
int lenght = 0;
int weight = 0;
String Name;

    public ZooAnimal(int lenght, int weight, String name) {
        this.lenght = lenght;
        this.weight = weight;
        Name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public addAnimal (ZooAnimal animal){
        new add(ZooAnimal);
    }
}
