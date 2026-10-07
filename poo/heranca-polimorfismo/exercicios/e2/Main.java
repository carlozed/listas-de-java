package e2;

import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Pato());
        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}
