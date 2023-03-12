public class Main {
    public static void splitOffers(){
        System.out.println("########################");
    }
    public static void main(String[] args) {

        splitOffers();
        Author alexander = new Author("Александр"," Пушкин");
        Book kingSalnan = new Book("О Царе Салтане", alexander, 1831);
        kingSalnan.setYearPrint(1832);
        System.out.println("Автор: "+kingSalnan.getAuthor().getName()+kingSalnan.getAuthor().getLastName()+"\nКнига: "+kingSalnan.getNameBook() +"\nГод издания: "+kingSalnan.getYearPrint()+" год.");
        splitOffers();
        Author ivan = new Author("Иван", " Крылов");
        Book fable = new Book("Басни Крылова", ivan, 1808);
        fable.setYearPrint(1844);
        System.out.println("Автор: "+fable.getAuthor().getName()+fable.getAuthor().getLastName()+"\nКнига: "+fable.getNameBook()+"\nГод издания: "+fable.getYearPrint()+" год.");
        splitOffers();

//toString
        System.out.println(alexander+"\n"+kingSalnan);
        splitOffers();
        System.out.println(ivan + "\n" + fable);
        splitOffers();
//equals
        Author alexander2 = new Author("Александр"," Пушкинc");
        Author alexander3 = alexander;
        System.out.println(alexander.equals(alexander2));
        System.out.println(alexander.equals(alexander3));
        splitOffers();
        Book fable2 = new Book("Басни Крылова", ivan, 2023);
        fable2.setYearPrint(1844);
        System.out.println(fable.equals(fable2));
        splitOffers();
//hashCode
        alexander.hashCode();
        System.out.println(alexander.hashCode());
        System.out.println(alexander2.hashCode());
        System.out.println(alexander3.hashCode());
        System.out.println();
        System.out.println(fable.hashCode());
        System.out.println(fable2.hashCode());
    }
}