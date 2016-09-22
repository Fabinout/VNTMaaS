package r.france.services;

import java.util.regex.Pattern;

public class FoutageDeGueuleFinder {


    public boolean process(String name) {
        final String FABINOU_REGEX = "([oO]racle[Jj][Dd][bB][Cc])";

        return Pattern.matches(FABINOU_REGEX, name)
                || name.toLowerCase().contains("oracle")
                || name.toLowerCase().contains("fabinou")
                || name.toLowerCase().contains("fabien")
                || name.toLowerCase().contains("java");
    }
}
