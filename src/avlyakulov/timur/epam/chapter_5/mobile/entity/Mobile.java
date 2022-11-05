package avlyakulov.timur.epam.chapter_5.mobile.entity;
/*
Создать класс Mobile с внутренним классом, с помощью объектов которого
можно хранить информацию о моделях телефонов и их свойствах.
 */
public class Mobile {
    private Model[] models;
    private int current;

    public Mobile () {
        models = new Model[4];
    }

    public void addModelToMobile (Model model) {
        if (current == models.length) {
            Model[] models1 = new Model[models.length + 1];
            System.arraycopy(models,0,models1,0,models.length);
            models = models1;
        }
        models[current] = model;
        ++current;
    }

    public Model[] getModels () {
        return models;
    }


    public class Model {
        private Company name;
        private int price;
        private int capacityOfBattery;

        public Model (Company name,int price,int capacityOfBattery) {
            this.name = name;
            this.price = price;
            this.capacityOfBattery = capacityOfBattery;
        }

        @Override
        public String toString() {
            return "Model{" +
                    "name=" + name.toString().toLowerCase() +
                    ", price=" + price +
                    ", capacityOfBattery=" + capacityOfBattery + " mAh" +
                    '}' + '\n';
        }
    }
}
