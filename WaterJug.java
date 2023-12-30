//Java Program to implement Water Jug Problem
import java.util.HashSet;

public class WaterJug 
{
    static int jug1 = 4;
    static int jug2 = 3;
    static int aim = 2;
    static HashSet<String> visited = new HashSet<>();

    static boolean waterJugSolver(int amt1, int amt2) 
     {
        if ((amt1 == aim && amt2 == 0)
                || (amt2 == aim && amt1 == 0)) {
            System.out.println(amt1 + " " + amt2);
            return true;
        }
        String state = amt1 + " " + amt2;
        if (!visited.contains(state)) {
            System.out.println(state);
            visited.add(state);
            return (waterJugSolver(0, amt2) || waterJugSolver(amt1, 0) || waterJugSolver(jug1, amt2)
                    || waterJugSolver(amt1, jug2)
                    || waterJugSolver(amt1 + Math.min(amt2, (jug1 - amt1)), amt2 - Math.min(amt2, (jug1 - amt1)))
                    || waterJugSolver(amt1 - Math.min(amt1, (jug2 - amt2)),
                            amt2 + Math.min(amt1, (jug2 - amt2))));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Steps: ");
        waterJugSolver(0, 0);
    }
}
