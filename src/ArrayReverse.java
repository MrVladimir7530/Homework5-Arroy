public class ArrayReverse {
    private char[] array;

    public ArrayReverse(char[] array) {
        this.array = array;
    }

    public char[] reverse() {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}
