package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        Scanner scan = new Scanner(query);
        if (query.contains("name")) {
            return "Djekss";
        }
        if (query.contains("plus")) {
            int i1 = scan.nextInt();
            int i2 = scan.nextInt();
            return String.valueOf(i1+i2);
        }
        else if(query.contains("largest")) {
            int i1 = scan.nextInt();
            int i2 = scan.nextInt();
            int i3 = scan.nextInt();
            return "null";
        } else {
            return "null";
        }

    }

    public int findeGross(int var1, int var2) {
        return var1 > var2 ? var1 : var2;
    }
}
