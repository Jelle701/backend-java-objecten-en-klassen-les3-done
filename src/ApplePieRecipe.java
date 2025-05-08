public class ApplePieRecipe {
    Ingredient roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient suiker = new Ingredient(200, "gram", "suiker");
    Ingredient bakmeel = new Ingredient(400, "gram", "bakmeel");
    Ingredient ei = new Ingredient(1, "stuk", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1500, "gram", "appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristalSuiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneerMeel = new Ingredient(15, "gram", "paneerMeel");

public void printIngredients(){
    System.out.println("Ingredienten nodig voor dit recept: ");
    System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
    System.out.println(suiker.getAmount() + " " + suiker.getUnit() + " " + suiker.getName());
    System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
    System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
    System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
    System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
    System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
    System.out.println(kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName());
    System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
    System.out.println(paneerMeel.getAmount() + " " + paneerMeel.getUnit() + " " + paneerMeel.getName());
}

public void printRecept(){
    s1VerwarmOver();
    s2Ei();
    s3Meng();
    s4Schil();
    s5Vorm();
    s6Deeg();
    s7Kaneel();
    s8Snijden();
    s9Deco();
    s10Oven();

}

public void s1VerwarmOver() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        }
public void s2Ei() {
    System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
}
public void s3Meng() {
    System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
}
public void s4Schil() {
    System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
}
public void s5Vorm() {
    System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
}
public void s6Deeg() {
    System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
}
public void s7Kaneel() {
    System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
}
public void s8Snijden() {
    System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
}
public void s9Deco() {
    System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
}
public void s10Oven() {
    System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
}
}




//










