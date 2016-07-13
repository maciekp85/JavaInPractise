package object_oriented_programming.initiations_and_singletons.singleton;

import java.util.HashMap;

/**
 * Created by nishi on 2016-07-13.
 */
public final class PriceList extends HashMap<String, Double> {

    public static final PriceList INSTANCE = new PriceList();

    private PriceList() {};
}
