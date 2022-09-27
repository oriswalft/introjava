package intro.java;

import java.util.Scanner;



public class App {
    
    public static void main(String[] args) {
    //     System.out.println("Bonjour !"); 
    //   //Récupérer le nombre d’heure travaillées
    //   Scanner clavier = new Scanner(System.in);  //créer une entrée un scanner sur le clavier
    //   System.out.print("Entre votre nombre d'heures travaillées:");
    //   int heuresTravaillees = clavier.nextInt(); //utiliser les entrées du clavier
      
    //   //Récupérer le taux horaire 
    //   // double tauxHoraire = 10.5; 
    //   System.out.print("Entrez votre taux horaire:");
    //   double tauxHoraire = clavier.nextDouble(); 
    //   //Multiplier le nombre d’heures par le taux horaire
    //   double salaireBrut = heuresTravaillees * tauxHoraire;
    //   //Afficher le résultat
    //   // System.out.print("Le salaire brut est: ");
    //   // System.out.println(salaire);
    //   System.out.println("Le salaire brut est de : " + salaireBrut);

    Scanner clavier =  new Scanner(System.in);

    System.out.print("Entrez un premier nom commun:");
    String premierNom = clavier.next();

    System.out.print("Entrez un nombre: ");
    int nombre = clavier.nextInt();
    
    System.out.print("Entrez un deuxième nom commun: ");
    String deuxiemeNom = clavier.next();

    System.out.print("Entrez un adjectif: ");
    String adjectif = clavier.next();
    clavier.close();

    System.out.println("Il était une fois un" + premierNom + "qui avait" + nombre + deuxiemeNom +". Cela le rendait très" + adjectif +".");



        
    }
    
}
