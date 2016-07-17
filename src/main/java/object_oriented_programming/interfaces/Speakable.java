package object_oriented_programming.interfaces;

/**
 * Created by nishi on 2016-07-16.
 */
public interface Speakable {

    int QUIET = 0;  // public static constant
    int LOUD = 1;   // default: public static final

    static String getAvailableVoiceForce() {
        return "Speekable.QUIET, Speakable.LOUD";
    }

    default String getVoice() {
        return getVoice(QUIET);
    }

    String getVoice(int voice);     // abstract method, because in interface can be only public abstract method,
                                    // public and abstract specifiers are not necessary.
}
