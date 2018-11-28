public class ImportDemoTest {
    public static void main(String[] args) {
        ImportDemo iD = new ImportDemo();
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);

	ImportDemo berkelydate = new ImportDemo();
        String bkDate= berkelydate.getCurrentDate();
        System.out.println(bkDate);
    }
}
    