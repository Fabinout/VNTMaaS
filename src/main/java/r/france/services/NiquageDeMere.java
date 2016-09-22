package r.france.services;

import org.springframework.stereotype.Service;
import r.france.controller.exceptions.MamanDOracleException;

import javax.validation.constraints.NotNull;

import static java.util.regex.Pattern.matches;

@Service
public class NiquageDeMere implements INiquageDeMere {

    private static final String MAMAN_PATTERN = "Va niquer ta mère %s";
    private static final String FABINOU_REGEX = "([oO]racle[Jj][Dd][bB][Cc])";

    @Override
    public String niqueLuiSaMere(@NotNull String name) {

        if (matches(FABINOU_REGEX, name)) {
            throw new MamanDOracleException(MamanDOracleException.WESH_ALORS);
        }

        return String.format(MAMAN_PATTERN, name);
    }
}
