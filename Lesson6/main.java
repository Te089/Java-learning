import java.util.*;


public class main {

    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
            sc.close();
        }
        return inputStr;
    }
    public static String userSInput(String msg){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
            sc.close();
        }
        return inputStr;
    }


    public static void main(String[] args) {
        notebooks Apple = new notebooks("Apple","32", "256", "Mac OS", "Silver");
        notebooks Samsung = new notebooks("Samsung","8", "512", "Windows", "White");
        notebooks Dell = new notebooks("Dell", "8", "128", "Ubuntu", "Red");
        notebooks Lenovo = new notebooks("Lenovo", "16", "1024", "Windows", "Black");

        ArrayList<notebooks> notebookss = new ArrayList<>();
        notebookss.add(Apple);
        notebookss.add(Samsung);
        notebookss.add(Dell);
        notebookss.add(Lenovo);

        int numSearch = userInput("Выберите критерии параметры сортировки:\n 1 - сортировка по марке, \n 2 - сортировка по оперативной памяти," +
                " \n 3 - сортировка по размеру hdd, \n 4 - сортировка по операционной системе, \n 5 - сортировка по цвету, \n 6 - показать весь список ");

        if (numSearch == 6){
            for (notebooks notebooks: notebookss) {
                notebooks.printInfo();
                System.out.println();
            }
        }

        else if (numSearch == 1){
            String numParametr = userSInput("Укажите интересующий бренд (Apple, Samsung, Dell, Lenovo):");
            for (notebooks brand : notebookss) {
                if (brand.getBrand().equalsIgnoreCase(numParametr)) {
                    System.out.println(brand.printInfo());
                }
            }
        }

        else if (numSearch == 2){
            String numParametr = userSInput("Укажите размер ram(8, 16, 32): ");
            for (notebooks ram : notebookss) {
                if (ram.getRam().equalsIgnoreCase(numParametr)) {
                    System.out.println(ram.printInfo());
                }
            }
        }

        else if (numSearch == 3){
            String numParametr = userSInput("Укажите размер hdd(128, 256, 512, 1024): ");
            for (notebooks hdd : notebookss) {
                if (hdd.gethdd().equalsIgnoreCase(numParametr)) {
                    System.out.println(hdd.printInfo());
                }
            }
        }

        else if (numSearch == 4){
            String numParametr = userSInput("Укажите операционную систему(Windows, Ubuntu, Mac OS): ");
            for (notebooks os : notebookss) {
                if (os.getOs().equalsIgnoreCase(numParametr)) {
                    System.out.println(os.printInfo());
                }
            }
        }

        else if (numSearch == 5){
            String numParametr = userSInput("Укажите цвет(Black, Silver, White, Red): ");
            for (notebooks colour : notebookss) {
                if (colour.getColour().equalsIgnoreCase(numParametr)) {
                    System.out.println(colour.printInfo());
                }
            }
        }
        
    }
}