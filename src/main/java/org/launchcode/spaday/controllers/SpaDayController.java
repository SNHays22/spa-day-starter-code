package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
public class SpaDayController {


    @GetMapping
    public String customerForm(){
        return "serviceSelection";
    }

//    }
//
//    @GetMapping(value="")
//    @ResponseBody
//    public String customerForm () {
//        String html = "<form method = 'post'>" +
//                "Name: <br>" +
//                "<input type = 'text' name = 'name'>" +
//                "<br>Skin type: <br>" +
//                "<select name = 'skintype'>" +
//                "<option value = 'oily'>Oily</option>" +
//                "<option value = 'combination'>Combination</option>" +
//                "<option value = 'normal'>Normal</option>" +
//                "<option value = 'dry'>Dry</option>" +
//                "</select><br>" +
//                "Manicure or Pedicure? <br>" +
//                "<select name = 'manipedi'>" +
//                "<option value = 'manicure'>Manicure</option>" +
//                "<option value = 'pedicure'>Pedicure</option>" +
//                "</select><br>" +
//                "<input type = 'submit' value = 'Submit'>" +
//                "</form>";
//        return html;
//    }

    @PostMapping(value="")
    public String spaMenu(@RequestParam String skinType, @RequestParam String manipedi, Model model) {

        Client newClient = new Client(skinType, manipedi);
        newClient.setAppropriateFacials(skinType);
        model.addAttribute("client", newClient);

        return "menu";
    }
}
