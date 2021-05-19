public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){

        if((temperature >= 25 && temperature <=35) || (summer && temperature <= 45 && temperature >=25))
            return true;
        else return false;
    }
}
