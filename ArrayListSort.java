import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
class ArrayListSort{
public static ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> arr) {
    Collections.sort(arr, Collections.reverseOrder());
    return arr;
}

public static void main(String[] args) {
    ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
    arr.add(new BigInteger("24"));
    arr.add(new BigInteger("543534"));
    arr.add(new BigInteger("545"));
    arr.add(new BigInteger("2342"));
    arr.add(new BigInteger("9"));
    System.out.println(arrayListSortDesc(arr));
}
}