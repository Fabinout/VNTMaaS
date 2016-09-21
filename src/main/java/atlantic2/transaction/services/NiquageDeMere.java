package atlantic2.transaction.services;

import atlantic2.transaction.controller.exceptions.MamanDOracleException;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.regex.Pattern;

@Service
public class NiquageDeMere implements INiquageDeMere {

    private static final String MAMAN_PATTERN = "Va niquer ta mère %s";
    private static final String FABINOU_REGEX = "([oO]racle[Jj][Dd][bB][Cc])";

    @Override
    public String niqueLuiSaMere(@NotNull String name) {

        if (Pattern.matches(FABINOU_REGEX, name)) {
            throw new MamanDOracleException(MamanDOracleException.WESH_ALORS);
        }

        return String.format(MAMAN_PATTERN, name);
    }
}
