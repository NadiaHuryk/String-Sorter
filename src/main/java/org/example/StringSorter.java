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

        for (String unsortedString : unsortedStrings) {
            if (unsortedString.startsWith(exceptionChar)) {
                startsWithPrefix.add(unsortedString);
            } else {
                doesNotStartWithPrefix.add(unsortedString);
            }
        }

        Collections.sort(doesNotStartWithPrefix);
        startsWithPrefix.sort(Collections.reverseOrder());
        doesNotStartWithPrefix.addAll(startsWithPrefix);

        return doesNotStartWithPrefix;
    }
}
