package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cenec
 */
public class Pokemon extends LivingBeing {
    private int id;
    private PokemonType type;
    private String species;
    private byte level;
    private short lifePoints;
    private int experiencePoints;

    public enum PokemonType{
        FIRE,
        WATER,
        PLANT
    };

    public Pokemon(int id,String n, boolean g, String d,PokemonType type, short lifePoints,String sp) {
        super(n, g, d);
        this.id=id;
        this.species=sp;
        this.type = type;
        this.level = 1;
        this.experiencePoints=0;
        this.lifePoints = lifePoints;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public short getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(short lifePoints) {
        this.lifePoints = lifePoints;
    }
    
    
    
            }
