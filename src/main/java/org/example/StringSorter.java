package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {
        if (unsortedStrings.isEmpty()) {
            return unsortedStrings;
        }

        List<String> doesNotStartWithPrefix = new ArrayList<>();
        List<String> startsWithPrefix = new ArrayList<>();

        for (int i = 0; i < unsortedStrings.size(); i++) {
            if (unsortedStrings.get(i).startsWith(exceptionChar)) {
                startsWithPrefix.add(unsortedStrings.get(i));
            } else {
                doesNotStartWithPrefix.add(unsortedStrings.get(i));
            }
        }

        Collections.sort(doesNotStartWithPrefix);
        startsWithPrefix.sort(Collections.reverseOrder());
        doesNotStartWithPrefix.addAll(startsWithPrefix);

        return doesNotStartWithPrefix;
    }
}
