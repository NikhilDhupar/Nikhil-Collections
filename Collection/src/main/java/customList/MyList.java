package customList;

import java.util.AbstractList;
import java.util.Arrays;


public class MyList<E> extends AbstractList<E> {

    private int mSize = 0;
    private Object mValues[];
    private int mCounter = 0;

    public MyList() {
        mValues = new Object[10];
        mCounter = 0;
    }

    @SuppressWarnings("unchecked")

    public E get(int index) {

        return (E) mValues[index];
    }

    public boolean add(E e) {

        mValues[mCounter] = e;
        mCounter++;
        if (mCounter >= mSize)
            increaseSize();
        return true;
    }

    public E remove(int index) {

        if (mSize < index)
            return null;
        Object x = mValues[index];
        for (int j = index; j < mSize - 1; j++)
            mValues[j] = mValues[j + 1];
        mCounter--;
        mSize--;
        return (E) x;
    }

    public int size() {

        return mSize;
    }

    private void increaseSize() {

        mSize = mValues.length * 2;
        mValues = Arrays.copyOf(mValues, mSize);
    }

    public String toString() {

        String str = "";
        for (int x = 0; x < this.mCounter; x++)
            str = str + mValues[x] + " ";
        return str;
    }
}