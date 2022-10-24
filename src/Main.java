public class Main {

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph 1");
        discoTitanic.createNewParagraph("Paragraph 2");
        discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph 4");
        discoTitanic.createNewTable("Table 1");
        discoTitanic.createNewParagraph("Paragraph 5");

        discoTitanic.print();
    }

//    public static void main(String[] args) {
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//
//        System.out.println(cmmdc(a,b));
//    }
//
//    public static int cmmdc(int a, int b) {
//        if(a*b==0)
//            return a+b;
//
//        while (a != b) {
//            if (a > b)
//                a = a - b;
//            else
//                b = b - a;
//        }
//
//        return a;
//    }
}