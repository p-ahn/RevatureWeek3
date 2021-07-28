package Day3;

public class demo22 {
    public static void main(String[] args) {
        //Case 1: exception not occur
        try{
            int c = 10/5;
            System.out.println(c);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("finally called");
        }

        //case 2: exception occur but not handled
        try{
            int c = 20/0;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Case 2: finally called");
        }

        //case 3: exception occur and handled
        try{
            int c = 10/0;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Case 3: occurred");
        }
    }
}
