package r.france.services;

import org.springframework.stereotype.Service;
import r.france.controller.exceptions.FamilleDOracleException;
import r.france.controller.exceptions.MamanDOracleException;

import javax.validation.constraints.NotNull;

@Service
public class NiquageDeMere implements INiquageDeMere {

    private static final String MAMAN_PATTERN = "Va niquer ta mère %s";

    @Override
    public String niqueLuiSaMere(@NotNull String name) {

        final FoutageDeGueuleFinder foutageDeGueuleFinder = new FoutageDeGueuleFinder();

        if (foutageDeGueuleFinder.process(name)) {
            throw new FamilleDOracleException(MamanDOracleException.WESH_ALORS);
        }
        return String.format(MAMAN_PATTERN, name);
    }
}
