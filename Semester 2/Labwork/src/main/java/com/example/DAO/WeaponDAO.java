package com.example.DAO;

import com.example.Labwork.Gun;
import com.example.Labwork.Sword;
import com.example.Labwork.Wand;
import com.example.Labwork.Weapon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WeaponDAO {
    private static int COUNT_WEAPONS;
    public List<Weapon> weapons;
    public WeaponDAO()
    {
        COUNT_WEAPONS = 0;
        weapons = new ArrayList<>();

        weapons.add(new Gun("testGun", 6, 5, 10, 0.75f));
        COUNT_WEAPONS++;
        weapons.add(new Sword("testSword", 10, 5));
        COUNT_WEAPONS++;
        weapons.add(new Wand("testWand",20, 10, 7,5));
        COUNT_WEAPONS++;
    }

    public List<Weapon> index(){
        return weapons;
    }

    public Weapon show(String name)
    {
        return weapons.stream()
                .filter(weapon -> weapon.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public void save(Weapon weapon)
    {
        weapons.add(weapon);
        COUNT_WEAPONS++;
    }

    public Weapon getObject(String name)
    {
        for (Weapon weapon : weapons)
        {
            if (weapon.getName().equals(name))
                return weapon;
        }
        return null;
    }

    public int getIndex(Weapon weapon)
    {
        for (int i = 0; i < weapons.size(); i++)
        {
            if (weapons.get(i).getName().equals(weapon.getName()))
                return i;
        }
        return -1;
    }

    public void remove(Weapon weapon)
    {
        weapons.remove(weapon);
        COUNT_WEAPONS--;
    }

    public void update(Weapon oldWeapon, Weapon newWeapon)
    {
        if (this.getIndex(oldWeapon) != -1)
            weapons.set(this.getIndex(oldWeapon), newWeapon);
    }
}
