package org.example;

import customList.MyList;

import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger((org.example.App.class.getName()));

    public static void main(String[] args) {

        MyList<Integer> l = new MyList<>();

        logger.severe("Initiating List");
        for (int a = 0; a < 20; a += 2)
            l.add(a);

        logger.info("list : " + l.toString());
        logger.info("removing 2 and 4 from list");
        logger.info("element removed " + l.remove(1));
        logger.info("element removed " + l.remove(1));
        logger.info("size of list : " + l.size());
        logger.info("list : " + l.toString());

    }
}
