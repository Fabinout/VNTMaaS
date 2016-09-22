package r.france.controller;

import org.springframework.beans.factory.annotation.Autowired;
import r.france.controller.exceptions.MamanDOracleException;
import r.france.services.NiquageDeMere;

public class VaNiquerTaMereController {

    private NiquageDeMere niquageDeMere;

    @Autowired
    public VaNiquerTaMereController(NiquageDeMere niquageDeMere) {
        this.niquageDeMere = niquageDeMere;
    }

    public String niquageDeMereProcessing(String name) {
        String entityBody;
        try {
            entityBody = niquageDeMere.niqueLuiSaMere(name);
        } catch (MamanDOracleException mamanDOracleException) {
            entityBody = mamanDOracleException.getMessage();
        }
        return entityBody;
    }
}
