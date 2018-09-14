package basics.supplier.exercise;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class RefactorPolymorphism {

    @Test
    @Ignore
    public void cow() {

        Cow cow = new Cow();
        assertThat(cow.speak()).isEqualTo("moo");

        ExcitedCow excitedCow = new ExcitedCow();
        assertThat(excitedCow.speak()).matches("moo!|moo moo!|MOO!|MOO MOO!|MOOOOO!!");

        fail("TODO: refactor object model to use Supplier.  Make Animal not abstract and delete the specific cow classes");
    }
}

abstract class Animal {
    public abstract String speak();
}

class Cow extends Animal {

    @Override
    public String speak() {
        return "moo";
    }
}

class ExcitedCow extends Animal {

    @Override
    public String speak() {
        double random = Math.random();
        if(random < .1) return "moo!";
        else if(random < .3) return "moo moo!";
        else if(random < .5) return "MOO!";
        else if(random < .7) return "MOO MOO!";
        else return "MOOOOO!!";
    }
}