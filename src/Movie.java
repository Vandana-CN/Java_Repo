public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }

    public Movie (String t, String s) {
        title = t;
        studio = s;
        rating = "PG";
    }

    public static Movie[] getPG(Movie[] mov) {
        Movie[] PGMov = new Movie[mov.length];
        int ArrIndex = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                PGMov[ArrIndex] = mov[i];
                ArrIndex++;
            }
        }
        return PGMov;
    }


    public static void main(String[] args) {

        Movie obj = new Movie("Casino Royale","Eon Productions","PG");
        Movie obj1 = new Movie("Casino", "Eon Productions","PG");
        Movie obj2 = new Movie("Royale","Eon Productions","PG-12");

        Movie[] list = new Movie[3];
        list[0] = obj;
        list[1] = obj1;
        list[2] = obj2;
        Movie[] lists = getPG(list);
        for(int i=0; i<=1;i++)
        {
            System.out.println(lists[i].title+"\n"+lists[i].studio+"\n"+lists[i].rating);
            System.out.println();
        }


    }

}
