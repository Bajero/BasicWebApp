package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        Scanner scanner = new Scanner(query);
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Djsadjas";
        } else if (query.contains("plus")){
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            return String.valueOf(i1+i2);
        } else if (query.contains("largest")) {
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            return i1 > i2 ? String.valueOf(i1) : String.valueOf(i2);
        } else
            return "";
    }
}
