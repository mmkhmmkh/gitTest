package ir.mmkh.aptest;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        ToSerialize test = new ToSerialize();
//        test.setA("A");
//        test.setB(2);
//        test.setC(5);
//        try {
//            ObjectOutputStream a =
//                    new ObjectOutputStream(
//                            new FileOutputStream("a.test"));
//            a.writeObject(test);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            ObjectInputStream a = new ObjectInputStream(
                    new FileInputStream("a.test")
            );

            ToSerialize test4 = (ToSerialize)  a.readObject();



            int c = test4.getC();
            System.out.println(c);

            int b = test4.getB();
            System.out.println(b);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
