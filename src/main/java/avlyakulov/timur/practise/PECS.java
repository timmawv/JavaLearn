package avlyakulov.timur.practise;

import java.util.List;

public class PECS {

    public static void main(String[] args) {
        List<? super Husky> list = List.of(new Animal(), new Husky());
        list.add(new HuskyUpgrade());
    }

    void method(List<? extends Husky> list) {

    }
}

class Animal {

}

class Dog extends Animal {

}

class Husky extends Dog {

}

class HuskyUpgrade extends Husky {

}