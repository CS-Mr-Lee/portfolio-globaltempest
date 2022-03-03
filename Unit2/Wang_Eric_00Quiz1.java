/**
 * Name: Eric
 * Class: ICS4U1-1A
 * Date: Mar 3, 2022
 * Description: Creates 3 cookies, 1 vegetable, 1 human
 * Human tries to eat wrapped cookie, eat too much vegetable, and eat unwrapped cookie and gain energy
 */
public class Wang_Eric_00Quiz1 {

    public static void main(String[] args) {

        Human person = new Human("yao", 71, 45);
        Vegetable veg = new Vegetable("carrot", 10, 10);
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie("cookie2", 100, 100);
        Cookie cookie3 = new Cookie("cookie3", 12, 20, true);


        System.out.println("Eating " + cookie3.getName() + ": ");
        person.eat(cookie3, 34);

        System.out.println("\nEating " + veg.getName() + ": ");
        person.eat(veg, 100);

        System.out.println("\nBefore eating " + cookie2.getName() + ": ");
        System.out.println(person.toString());
        System.out.println("\n"+cookie2.toString());

        person.eat(cookie2, 18);

        System.out.println("\nAfter eating " + cookie2.getName() + ": ");
        System.out.println("\n"+person.toString());
        System.out.println("\n"+cookie2.toString());





    }


}

