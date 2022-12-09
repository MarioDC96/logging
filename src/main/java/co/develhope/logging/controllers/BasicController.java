package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    BasicServer basicServer;
    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public void getDebug(){
        logger.debug("BENVENUTO");
    }

    @GetMapping("/exp")
    public String getInfo(){
        logger.debug("This is a INFO Logging");
        return basicServer.getPower(basicServer.getN1(), basicServer.getN2());
    }

    @GetMapping("/get-errors")
    public void gerError(){
        Error error = new Error("Errore personalizzato");
        logger.error("this is the ERROR Logger",error);



    }
}
