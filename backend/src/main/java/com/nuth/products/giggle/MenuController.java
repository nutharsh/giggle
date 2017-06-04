package com.nuth.products.giggle;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by a0t00gz on 03/06/17.
 */
@RestController
@RequestMapping("/api")
public class MenuController {

    @RequestMapping(path = "/menus", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listMenus() {
        String[] menus = {"Employee", "Client", "Retirals"};
        return new ResponseEntity<List<String>> (Arrays.asList(menus),HttpStatus.OK);
    }

}
