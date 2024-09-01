public class TryCatch1 {
    public static void main(String[] args) {
        try {
            throw new Integer(null);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
            return;
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
            return;
        }
        catch(Integer e){
            System.out.println("Integer");
            return;
        }
    }
}
