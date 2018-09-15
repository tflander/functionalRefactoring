package basics.supplier.example;

import org.junit.Test;

import java.util.function.Supplier;

import static you.Todo.showToDo;
import static org.assertj.core.api.Assertions.assertThat;

public class AnimalSpeak {

    @Test
    public void cow() {
        showToDo("modify class Animal to use speakSupplier get the string to return");
        Animal cow = new Animal(() -> "moo");
        assertThat(cow.speak()).isEqualTo("moo");

        Animal excitedCow = new Animal(() -> {
            double random = Math.random();
            if(random < .1) return "moo!";
            else if(random < .3) return "moo moo!";
            else if(random < .5) return "MOO!";
            else if(random < .7) return "MOO MOO!";
            else return "MOOOOO!!";
        });

        assertThat(excitedCow.speak()).matches("moo!|moo moo!|MOO!|MOO MOO!|MOOOOO!!");
    }
}

class Animal {
    private final Supplier<String> speakSupplier;

    Animal(Supplier<String> speakSupplier) {
        this.speakSupplier = speakSupplier;
    }

    public String speak() {
        return "TODO: use speakSupplier get the string to return";
    }

}


