package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void add(Animal animal) {
        if (this.data.size() < this.capacity) {
            this.data.add(animal);
        }
    }
    public boolean remove(String name) {
        for (Animal animal: this.data) {
            if (animal.getName().equals(name)){
                this.data.remove(animal);
                return true;
            }
        }
        return false;
    }
    public Animal getAnimal(String name, String caretaker){
        for (Animal animal : this.data) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)) {
                return animal;
            }
        }
        return null;
    }
    public Animal getOldestAnimal(){
        return this.data.stream().max(Comparator.comparing(Animal::getAge)).get();
    }
    public int getCount(){
        return this.data.size();
    }
    public String getStatistics(){
        StringBuilder sB = new StringBuilder();
        sB.append("The shelter has the following animals:").append(System.lineSeparator());
        for (Animal animal : this.data) {
            sB.append(String.format("%s %s", animal.getName(), animal.getCaretaker()))
                    .append(System.lineSeparator());
        }
        return sB.toString().trim();
    }
}

