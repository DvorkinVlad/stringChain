package stringCahin.stringCahin;



//מחלקת הפעלה
public class ChainMain {
public static void main(String[] args) {
   A start = new A();
   String result = start.process(""); // מתחילים ממחרוזת ריקה
   System.out.println("Final result: " + result);
}
}