package pl.madison.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/czyRowne/{slowo1}/{slowo2}")
    public String czyRowne(@PathVariable("slowo1") String slowo1, @PathVariable("slowo2") String slowo2) {
        if (slowo1.equals(slowo2)) {
            return "te same slowa";
        } else {
            return "to nie sa te same slowa";
        }
    }

    @RequestMapping(value = "/czyPierwszyZawieraDrugi/{slowo1}/{slowo2}")
    public String czyZawiera(@PathVariable("slowo1") String slowo1, @PathVariable("slowo2") String slowo2) {
        if (slowo1.contains(slowo2)) {
            return "tak zawiera";
        } else {
            return "nie zawiera";
        }
    }

    @RequestMapping(value = "/czyRozpoczyna/{slowo1}/{slowo2}")
    public String czyRozpoczyna(@PathVariable("slowo1") String slowo1, @PathVariable("slowo2") String slowo2) {
        if (slowo1.startsWith(slowo2)) {
            return "tak zaczyna sie slowem drugim";
        } else {
            return "niestety nie zaczyna sie drugim slowem";
        }
    }

    @RequestMapping(value = "/drugaLiteraTakaSama/{slowo1}/{slowo2}")
    public String drugaLiteraTakaSama(@PathVariable("slowo1") String slowo1, @PathVariable("slowo2") String slowo2) {
        if (slowo1.charAt(1) == slowo2.charAt(1)) {
            return "druga litera taka sama";
        } else {
            return "druga litera nie jest taka sama";
        }
    }

    @RequestMapping(value = "/sprawdzamyParzysteMiejsca/{slowo1}/{slowo2}")
    public Boolean parzysteMiejsca(@PathVariable("slowo1") String slowo1, @PathVariable("slowo2") String slowo2) {
        char[] tab1 = slowo1.toCharArray();
        char[] tab2 = slowo2.toCharArray();

        boolean czyTakieSame = false;

        for (int i = 0; i < tab1.length; i++) {
            if(i%2==0){
                if(tab1[i]==tab2[i]){
                    czyTakieSame = true;
                }else{
                    czyTakieSame = false;
                }
            }
        }

        return czyTakieSame;

    }
}
