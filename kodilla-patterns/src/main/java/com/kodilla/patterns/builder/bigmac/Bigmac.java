package com.kodilla.patterns.builder.bigmac;

import java.util.*;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String souce;
    private final List<String> ingredients;

    private Bigmac(String bun, int burgers, String souce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.souce = souce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSouce() {
        return souce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", souce='" + souce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String souce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals("sezam") || bun.equals("bez sezamu")) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Nie będzie bułki");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers == 0) {
                throw new IllegalStateException("Burger musi zawierać kotleta");
            } else {
                this.burgers = burgers;
                return this;
            }
        }

        public BigmacBuilder souce(String souce) {


            if (souce.equals("standard") || souce.equals("1000 wysp")
                    || souce.equals("barbecue")) {
                this.souce = souce;
                return this;
            } else {
                throw new IllegalStateException("Podales zle sosy");
            }
        }

        public BigmacBuilder ingredient(String... list) {
            String allowed[] = {"sałata", "bekon", "cebula", "ogórek", "papryczki chilli", "pieczarki", "krewetki", "ser"};
            Set<String> menu = new HashSet<>(Arrays.asList(allowed));

            for (String l : list) {
                if (menu.contains(l)) {
                    ingredients.add(l);
                }
            }
            return this;
        }


        public Bigmac build() {

            if (bun == null) {
                bun = "bez sezamu";
            } else if (souce == null) {
                souce = " bez sosu";
            } else if (ingredients.isEmpty()) {
                ingredients.add("bez dodatków");
            }
            return new Bigmac(bun, burgers, souce, ingredients);
        }
    }
}
