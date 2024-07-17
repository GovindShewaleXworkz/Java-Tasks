public class RedChilliesEntertainment {
    static String[] movieActors = {null, null, null, null, null, null, null, null, null};
    static int index = 0;

    public static boolean addMovieActors(String actor) {
        if (actor == null) {
            System.out.println("Actor name cannot be null");
            return false;
        }
        if (index >= movieActors.length) {
            System.out.println("Cannot add more movie actors. Array is full.");
            return false;
        } else {
            movieActors[index] = actor;
            index++;
            return true;
        }
    }

    public static void getMovieActors() {
        System.out.println("The available movie actors are:");
        for (int i = 0; i < movieActors.length; i++) {
            System.out.println(i + ") " + movieActors[i]);
        }
    }
}
