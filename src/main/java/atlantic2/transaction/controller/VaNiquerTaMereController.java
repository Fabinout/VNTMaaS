package atlantic2.transaction.controller;

import atlantic2.transaction.controller.exceptions.MamanDOracleException;
import atlantic2.transaction.services.NiquageDeMere;
import org.springframework.beans.factory.annotation.Autowired;

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
