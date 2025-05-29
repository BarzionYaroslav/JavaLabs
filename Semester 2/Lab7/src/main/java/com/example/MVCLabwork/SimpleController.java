package com.example.MVCLabwork;

import com.example.Labwork.Gun;
import com.example.Labwork.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class SimpleController {
    @Autowired
    @Qualifier("gun")
    Gun gun;
    @GetMapping("/simple")
    public String showForm(Model model)
    {
        model.addAttribute("bul", gun.getBullets());
        model.addAttribute("dmg", gun.getDmg());
        model.addAttribute("range", gun.getRange());
        model.addAttribute("aim", gun.getAim());
        model.addAttribute("totalDmg", gun.totalDamage());
        model.addAttribute("perfectDmg", gun.totalDamagePerfect());
        model.addAttribute("dmgPerBul", gun.damagePerBul());
        return "simple";
    }

    @GetMapping("/math")
    public String doMath(Model model, @RequestParam(name = "num1", defaultValue = "0") String num1,
                         @RequestParam(name = "num2", defaultValue = "0") String num2,
                         @RequestParam(name = "oper", defaultValue = "sum") String operation){
        float num_1 = Float.valueOf(num1);
        float num_2 = Float.valueOf(num2);
        String result;
        switch (operation){
            case "sum":
                result=String.valueOf(num_1+num_2);
                break;
            case "sub":
                result=String.valueOf(num_1-num_2);
                break;
            case "div":
                result=String.valueOf(num_1/num_2);
                break;
            case "mult":
                result=String.valueOf(num_1*num_2);
                break;
            default:
                result="NOT SCIENTIFICALLY POSSIBLE";
                break;
        }
        model.addAttribute("num1", num_1);
        model.addAttribute("num2", num_2);
        model.addAttribute("oper", operation);
        model.addAttribute("result", result);
        return "math";
    }
}
