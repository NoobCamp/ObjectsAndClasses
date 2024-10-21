//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author tolstoiL = new Author("Лев", "Толстой");
        Author colferE = new Author("Йон", "Колфер");
        Book warAndPeace = new Book("Война и Мир",  tolstoiL, 1865);
        Book artemisFowl = new Book("Артемис Фаул",  colferE, 2003);

        System.out.println("artemisFowl.getName() = " + artemisFowl.getName());
        System.out.println("artemisFowl.getAuthor() = " + artemisFowl.getAuthor());
        System.out.println("artemisFowl.getPublicationYear() = " + artemisFowl.getPublicationYear());
        System.out.println("colferE.getName() = " + colferE.getName());
        System.out.println("colferE.getSurname() = " + colferE.getSurname());
        System.out.println(" ");
        System.out.println("warAndPeace.getName() = " + warAndPeace.getName());
        System.out.println("warAndPeace.getAuthor() = " + warAndPeace.getAuthor());
        System.out.println("tolstoiL.getName() = " + tolstoiL.getName());
        System.out.println("tolstoiL.getSurname() = " + tolstoiL.getSurname());
        System.out.println(" ");
        artemisFowl.setPublicationYear(2004);
        System.out.println("artemisFowl.getPublicationYear() = " + artemisFowl.getPublicationYear());
        System.out.println(tolstoiL.equals(colferE));
        System.out.println(warAndPeace.equals(artemisFowl));
        System.out.println(warAndPeace);
        System.out.println(artemisFowl);
    }
}