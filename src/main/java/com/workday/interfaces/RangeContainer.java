package com.workday.interfaces;

/**
 * Created by Praveen on 12/27/2018.
 */
public interface RangeContainer {
    /**
     * @return the Ids of all instances found in the container that
     * have data value between fromValue and toValue with optional
     * inclusivity.
     */
    Ids findIdsInRange(long fromValue,
                       long toValue,
                       boolean fromInclusive,
                       boolean toInclusive);
}
