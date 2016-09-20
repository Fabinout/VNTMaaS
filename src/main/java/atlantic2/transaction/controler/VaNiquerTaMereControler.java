package atlantic2.transaction.controler;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.HttpStatus.OK;

@Controller
@RequestMapping("/vaniquertamereAsAService")
@SuppressWarnings(value = "unused")
@CrossOrigin
public class VaNiquerTaMereControler {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getBatard(@RequestParam(value="name", defaultValue="batard") String name) {
        return new ResponseEntity<>(String.format("Va niquer ta mère %s", name), OK);
    }

}
