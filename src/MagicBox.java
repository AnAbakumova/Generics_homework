import java.util.Random;

public class MagicBox<T> {
    protected int numberOfCells;
    protected int numberOfObjects;
    protected T[] array;

    public MagicBox(int numberOfCells) {
        this.numberOfCells = numberOfCells;
        array = (T[]) new Object[numberOfCells];
    }

    public boolean add(T item) {
        if (numberOfObjects < numberOfCells) {
            array[numberOfObjects] = item;
            numberOfObjects++;
            return true;
        } else return false;
    }

    public T pick() {
        if (numberOfObjects == numberOfCells) {
            Random random = new Random();
            int randomInt = random.nextInt(numberOfCells); //случайное число от 0 до numberOfCells невключительно
            return array[randomInt];
        } else {
            RuntimeException e = new RuntimeException("Коробка не полна. Осталось заполнить ячеек: " + (numberOfCells - numberOfObjects));
            throw e;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            stringBuilder.append(array[i] + ", ");
        }
        stringBuilder.append(array[array.length - 1]);
        return stringBuilder.toString();
    }
}