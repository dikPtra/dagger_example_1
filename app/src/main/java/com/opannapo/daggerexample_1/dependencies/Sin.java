package com.opannapo.daggerexample_1.dependencies;

import javax.inject.Inject;

/**
 * Created by napouser on 21,June,2020
 */
public class Sin {
    @Inject
    public Sin() {
    }

    public double hitung(double a) {
        return Math.sin(a);
    }
}
