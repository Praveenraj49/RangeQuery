package com.workday.implementations;

import com.workday.interfaces.RangeContainer;
import com.workday.interfaces.RangeContainerFactory;

/**
 * Created by Praveen on 12/27/2018.
 * Immutable Container Factory , Creates  Range Container object
 */

public final class RangeContainerFactoryImpl implements RangeContainerFactory {

    public RangeContainer createContainer(long[] data) {
        return  new RangeContainerImpl(data);
    }
}
