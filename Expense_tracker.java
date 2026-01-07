package Basic_projects;
import java.io.*;
import java.util.Scanner;

class Expenses{
    static double totalExpenses = 0;

    void menu(Scanner sc){
        System.out.println("1. Add Expense\n2. View All expense\n3. Total expense\n4. Exit");
        String menu = sc.next();
        switch (menu){
            case "1":
                addExpense(sc);
                break;
            case "2":
                viewExpense(sc);
                break;
            case "3":
                totalExpenses(sc);
                break;
            case "4":
                System.out.println("exiting....");
                System.exit(0);
        }
    }
    private void viewExpense(Scanner sc) {
        totalex(true);
        menu(sc);
    }

    private double totalex(boolean print) {
        totalExpenses = 0;
        try ( BufferedReader br = new BufferedReader(new FileReader("expense.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                if(print){
                    System.out.println(line);
                }
                String[] data = line.split(",");
                totalExpenses = totalExpenses + Double.parseDouble(data[0].trim());
            }
        }

        catch(Exception e){
            System.out.println("error while reading");
        }
        return totalExpenses;
    }

    private void totalExpenses(Scanner sc) {
        System.out.println(totalex(false));
        menu(sc);
    }

    private void addExpense(Scanner sc) {
        System.out.println("Enter amount : ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter category : ");
        String category = sc.nextLine();
        System.out.println("Enter date : ");
        String date = sc.nextLine();
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter("expense.txt", true));
            wr.write(amount + ", " + category + ", " + date);
            wr.newLine();
            wr.close();
        }
        catch (Exception e){
            System.out.println("error adding expense");
        }
        menu(sc);

    }
}
public class Expense_tracker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Expenses exp = new Expenses();
        exp.menu(sc);
    }
}
