package com.example.MVCLabwork;

import com.example.Labwork.Gun;
import com.example.Labwork.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
