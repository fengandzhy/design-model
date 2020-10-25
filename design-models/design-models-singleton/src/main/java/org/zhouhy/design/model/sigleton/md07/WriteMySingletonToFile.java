package org.zhouhy.design.model.sigleton.md07;

import java.io.*;

public class WriteMySingletonToFile {

    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();
        System.out.println(singleton.hashCode());
        File file = new File("a.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(singleton);
            os.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            MySingleton mySingleton = (MySingleton) ois.readObject();
            System.out.println(mySingleton.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
