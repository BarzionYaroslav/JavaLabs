package com.example.MVCLabwork;

import com.example.DAO.WeaponDAO;
import com.example.Labwork.Gun;
import com.example.Labwork.Sword;
import com.example.Labwork.Wand;
import com.example.Labwork.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/weapons")
public class WeaponController {
    private final WeaponDAO weaponDAO;

    @Autowired
    public WeaponController(WeaponDAO weaponDAO)
    {
        this.weaponDAO=weaponDAO;
    }

    @GetMapping()
    public String index(Model model)
    {
        model.addAttribute("weapons",weaponDAO.index());
        return "weapons/index";
    }

    @GetMapping("/{name}")
    public  String show(@PathVariable("name") String name, Model model)
    {
        model.addAttribute("weapon", weaponDAO.show(name));
        int flag=0;
        if (weaponDAO.show(name) instanceof Sword)
            flag=0;
        if (weaponDAO.show(name) instanceof Wand)
            flag=1;
        if (weaponDAO.show(name) instanceof Gun)
            flag=2;
        model.addAttribute("flag", flag);
        return "weapons/show";
    }

    @GetMapping("/sword")
    public String getSwordForm(Model model)
    {
        model.addAttribute("sword", new Sword());
        return "sword/form";
    }

    @PostMapping("/sword")
    public String create(@ModelAttribute("sword") Sword sword)
    {
        weaponDAO.save(sword);
        return "redirect:/weapons";
    }

    @GetMapping("/wand")
    public String getWandForm(Model model)
    {
        model.addAttribute("wand", new Wand());
        return "wand/form";
    }

    @PostMapping("/wand")
    public String create(@ModelAttribute("wand") Wand wand)
    {
        weaponDAO.save(wand);
        return "redirect:/weapons";
    }

    @GetMapping("/gun")
    public String getGunForm(Model model)
    {
        model.addAttribute("gun", new Gun());
        return "gun/form";
    }

    @PostMapping("/gun")
    public String create(@ModelAttribute("gun") Gun gun)
    {
        weaponDAO.save(gun);
        return "redirect:/weapons";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name)
    {
        Weapon tmp = weaponDAO.getObject(name);
        if (tmp != null)
            weaponDAO.remove(tmp);
        return "redirect:/weapons";
    }

    @GetMapping("/update/{name}")
    public String getUpdateForm(@PathVariable("name") String name, Model model)
    {
        Weapon tmp = weaponDAO.getObject(name);
        if (tmp != null)
        {
            switch (tmp) {
                case Sword sword -> {
                    model.addAttribute("sword", tmp);
                    return "sword/updateForm";
                }
                case Wand wand -> {
                    model.addAttribute("wand", tmp);
                    return "wand/updateForm";
                }
                case Gun gun -> {
                    model.addAttribute("gun", tmp);
                    return "gun/updateForm";
                }
                default -> {
                }
            }
        }
        return "redirect:/weapons";
    }

    @PatchMapping("/update/sword/{name}")
    public String updateSword(
            @PathVariable String name,
            @ModelAttribute Sword weapon) {  // Используем конкретный класс
        Weapon tmp = weaponDAO.getObject(name);
        weaponDAO.update(tmp, weapon);
        return "redirect:/weapons";
    }

    @PatchMapping("/update/wand/{name}")
    public String updateWand(
            @PathVariable String name,
            @ModelAttribute Wand weapon) {  // Используем конкретный класс
        Weapon tmp = weaponDAO.getObject(name);
        weaponDAO.update(tmp, weapon);
        return "redirect:/weapons";
    }

    @PatchMapping("/update/gun/{name}")
    public String updateGun(
            @PathVariable String name,
            @ModelAttribute Gun weapon) {  // Используем конкретный класс
        Weapon tmp = weaponDAO.getObject(name);
        weaponDAO.update(tmp, weapon);
        return "redirect:/weapons";
    }
}
